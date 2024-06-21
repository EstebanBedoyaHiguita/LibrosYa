package com.riwi.LibrosYa.api.dto.Request;

import com.riwi.LibrosYa.utils.enums.Role;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {

    @NotBlank(message = "the user name is required")
    private String username;
    @NotNull(message = "the password is requires")
    private String password;
    @NotBlank(message = "the email is required")
    private String email;
    @NotBlank(message="The full name is required")
    private String full_name;
    private Role role;
}
