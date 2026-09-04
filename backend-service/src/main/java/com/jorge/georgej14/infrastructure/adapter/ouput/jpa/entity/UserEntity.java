package com.jorge.georgej14.infrastructure.adapter.ouput.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

/*
 *----------------------------------------
 *   Código de Aplicación:
 *   Código de Objeto:
 *   Descripción:
 *   Author Prog: Jorge Luis Choque Callizaya
 *----------------------------------------
 *   Fecha | Autor | Comentario
 *   03.09.2026 | Jorge Luis Choque Callizaya | Creación Inicial
 *----------------------------------------
 */

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER_ENTITY")
public class UserEntity {

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "SEQ_USER_ID_GENERATOR", sequenceName = "SEQ_USER_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER_ID_GENERATOR")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "EMAIL", nullable = false)
    private String email;
}
