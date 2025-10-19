package com.bfigueredo.agendamentos_consultas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// área médica (cardiologia, dermatologia, etc)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "especialidades")
@Data
public class Especialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome da especialidade é obrigatório")
    @Column(unique = true, nullable = false) //torna o nome unico
    private String nome;
    private String descricao;
}
