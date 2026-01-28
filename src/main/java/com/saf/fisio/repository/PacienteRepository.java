package com.saf.fisio.repository;

import com.saf.fisio.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    @Query("SELECT p FROM Paciente p LEFT JOIN FETCH p.avaliacoesPediatria WHERE p.id = :id")
    Optional<Paciente> findByIdWithAvaliacoes(@Param("id") Long id);
}