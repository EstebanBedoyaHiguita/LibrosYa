package com.riwi.LibrosYa.api.dto.Request;

import java.time.LocalDate;



import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanRequest {
    
    @NotNull(message = "The user id is required")
    private Long user_id;
    @NotNull(message = "The book id is required")
    private Long book_id;
    @NotNull(message = "The loan date is required")
    private LocalDate loan_date;
    @NotNull(message = "the return date is required")
    private LocalDate return_date;
}
