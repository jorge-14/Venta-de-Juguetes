package com.jorge.georgej14.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

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

@Getter
@Setter
@Builder
public class UserModel {

    private Long id;
    private String name;
    private String email;

    public UserModel() {

    }

    public UserModel(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email =  email;
    }
}
