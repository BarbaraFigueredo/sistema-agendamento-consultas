package com.bfigueredo.agendamentos_consultas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório.")
    private String nomeCompleto;

    @NotBlank(message = "O CPF é obrigatório.")
    @Column(unique = true, nullable = false)
    private String cpf;

    @NotBlank(message = "O email é obrigatório")
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
}
