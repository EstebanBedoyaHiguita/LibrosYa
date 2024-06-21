package com.riwi.LibrosYa.api.dto.Request;



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
public class BookRequest {
    
    @NotBlank(message = "The title of book is required")
    private String title;
    @NotBlank(message = "The author is required")
    private String author;
    @NotNull(message = "The publication year is required")
    private Long  publication_year;
    @NotBlank(message = "The genre is required")
    private String genre;
    @NotBlank(message = "The isbn is required")
    private String isbn;
}
