package com.riwi.LibrosYa.infreastructure.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.LibrosYa.api.dto.Request.UserRequest;
import com.riwi.LibrosYa.api.dto.Response.UserResponse;
import com.riwi.LibrosYa.domain.entities.User;
import com.riwi.LibrosYa.domain.repositories.UserRepository;
import com.riwi.LibrosYa.infreastructure.abtrac_service.IUserService;
import com.riwi.LibrosYa.mappers.UserMaper;
import com.riwi.LibrosYa.utils.exceptions.IdNotFoundExcepcion;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class UserService implements IUserService {

    @Autowired
    private final UserMaper userMaper;

    @Autowired
    private final UserRepository userRepository;

    @Override
    public Page<UserResponse> getAll(int page, int size) {
        if(page < 0){
            page = 0;
        }
        

        PageRequest pagination = PageRequest.of(page, size);

        return  this.userRepository.findAll(pagination).map(user -> userMaper.userToUserResponse(user));
    }

    @Override
    public UserResponse finById(Long id) {
        User user = this.find(null);
        return userMaper.userToUserResponse(user);
    }

    @Override
    public UserResponse create(UserRequest request) {
        User user = userMaper.userRequestToUser(request);

        return userMaper.userToUserResponse(userRepository.save(user));
        
    }

    @Override
    public UserResponse update(UserRequest request, Long id) {
        User userUpdate = this.find(id);

        userUpdate = userMaper.userRequestToUser(request);

        return userMaper.userToUserResponse(userRepository.save(userUpdate));
    }

    @Override
    public void delete(Long id) {
        User user = find(id);

        this.userRepository.delete(user);
    }

    private User find(Long id){
        return this.userRepository.findById(id).orElseThrow(()-> new IdNotFoundExcepcion("User"));
    }
    
}
