package com.riwi.LibrosYa.api.dto.Response;

import java.time.LocalDate;

import com.riwi.LibrosYa.utils.enums.LoanStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanResponse {
    private Long id;
    private LocalDate loan_date;
    private LocalDate return_date;
    private LoanStatus status;
}
