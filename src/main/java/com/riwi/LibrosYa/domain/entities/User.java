package com.riwi.LibrosYa.domain.entities;




import java.util.List;

import com.riwi.LibrosYa.utils.enums.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;
    @Column(length = 100, nullable = false )
    private String email;
    @Column(length = 100,nullable = false)
    private String full_name;
    @Enumerated(EnumType.STRING)
    private Role role;


    @OneToMany(mappedBy = "user",
    fetch = FetchType.EAGER,
    cascade = CascadeType.ALL,
    orphanRemoval = false)
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "user",
    fetch = FetchType.EAGER,
    cascade = CascadeType.ALL,
    orphanRemoval = false)
    private List<Loan> loans;
}
