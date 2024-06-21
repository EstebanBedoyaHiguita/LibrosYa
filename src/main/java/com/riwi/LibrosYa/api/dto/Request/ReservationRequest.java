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
public class ReservationRequest {
    
    @NotNull(message = "The book id is required")
    private Long book_id;
    @NotNull (message = "The user id is required")
    private Long user_id;
    @NotNull (message = "The reservation date is required")
    private LocalDate  reservation_date;
    
}
