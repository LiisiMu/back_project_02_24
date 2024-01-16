package com.example.back_project_02_24.domain.contact;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "full_name", nullable = false, length = 50)
    private String fullName;

    @Size(max = 20)
    @NotNull
    @Column(name = "code_name", nullable = false, length = 20)
    private String codeName;

    @NotNull
    @Column(name = "phone_number", nullable = false)
    private Integer phoneNumber;

}