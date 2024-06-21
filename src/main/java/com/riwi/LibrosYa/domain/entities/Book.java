package com.riwi.LibrosYa.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String title;
    @Column(length = 100, nullable = false)
    private String author;
    @Column(nullable = false)
    private Long  publication_year;
    @Column(length = 50, nullable = false)
    private String genre;
    @Column(nullable = false)
    private String isbn;

    @OneToMany(mappedBy = "book",
    fetch = FetchType.EAGER,
    cascade = CascadeType.ALL,
    orphanRemoval = false)
    private List<Loan> loans;

    @OneToMany(mappedBy = "book",
    fetch = FetchType.EAGER,
    cascade = CascadeType.ALL,
    orphanRemoval = false)
    private List<Reservation> reservations;
}
