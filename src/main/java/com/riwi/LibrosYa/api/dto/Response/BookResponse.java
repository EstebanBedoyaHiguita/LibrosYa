package com.riwi.LibrosYa.api.dto.Response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponse {
    private Long id;
    private String title;
    private String author;
    private Long  publication_year;
    private String genre;
    private String isbn;

    private List<ReservationResponse> reservations;
    private List<LoanResponse> loans;
}
