package com.riwi.LibrosYa.api.dto.Response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String email;
    private String full_name;
    private List<ReservationResponse> resevations;
    private List<LoanResponse> loans;
    
}
