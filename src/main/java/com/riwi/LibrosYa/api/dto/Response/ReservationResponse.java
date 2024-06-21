package com.riwi.LibrosYa.api.dto.Response;

import java.time.LocalDate;
import java.util.List;

import com.riwi.LibrosYa.utils.enums.ReservationStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservationResponse {
    private Long id;
    private LocalDate  reservation_date;
    private ReservationStatus status;
    private String book_title;
    private String user_name;
}
