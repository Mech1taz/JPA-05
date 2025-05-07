package com.mechitaz.orm4.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //todo para generar el Id
    private int id;
    @Column(length = 13,nullable = false,unique = true)//todo para el rut
    private String rut;
    @Column(length = 50,nullable = false)//para el nombre
    private String nombre;
    @Column(length = 50,nullable = false)//para el apellido
    private String apellido;
    @Column(nullable = false)//para fechaNacimiento
    private LocalDate fechaNacimiento;
    @Column(length = 250)
    private String correo;
}
