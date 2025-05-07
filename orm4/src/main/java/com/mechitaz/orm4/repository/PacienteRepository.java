package com.mechitaz.orm4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mechitaz.orm4.model.Paciente;

@Repository //para que sepa que es el repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
    List<Paciente> findAll();
}
