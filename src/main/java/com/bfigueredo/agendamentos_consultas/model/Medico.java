package com.bfigueredo.agendamentos_consultas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do médico é obrigatório.")
    private String nomeCompleto;

    @NotBlank(message = "O CRM é obrigatório.")
    @Column(unique = true, nullable = false)
    private String crm;

    @NotBlank
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank
    @Column(unique = true, nullable = false)
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "especialidade_id")
    private Especialidade especialidade;
}
