package com.riwi.LibrosYa.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import com.riwi.LibrosYa.api.dto.Request.UserRequest;
import com.riwi.LibrosYa.api.dto.Response.UserResponse;
import com.riwi.LibrosYa.domain.entities.User;

@Mapper(componentModel = "spring")
public interface UserMaper {
    
    // UserMaper INSTANCE = Mappers.getMapper(UserMaper.class);

    public UserResponse userToUserResponse(User user);

    @Mapping(target="id",ignore=true)
    @Mapping(target="loans",ignore=true)
    @Mapping(target="reservations",ignore=true)
    User userRequestToUser (UserRequest userRequest);

    
}
