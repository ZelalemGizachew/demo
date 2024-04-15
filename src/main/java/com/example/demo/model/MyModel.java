package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "MyModel")
@Table(name = "test")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "is_old")
    private Boolean isOld;
}
