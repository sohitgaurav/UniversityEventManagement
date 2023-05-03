package com.geekster.UniversityEventManagenet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer studentId;

    @Column(name="first_Name")
    private String firstName;

    @Column(name="last_Name")
    private String LastName;

    @Column(name="age")
    private Integer age;

    @Column(name="department")
    @Enumerated(EnumType.STRING)
    private Department department;
}
