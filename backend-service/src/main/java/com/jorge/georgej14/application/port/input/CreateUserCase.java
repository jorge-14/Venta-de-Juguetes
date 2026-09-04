package com.jorge.georgej14.application.port.input;

import com.jorge.georgej14.domain.model.UserModel;

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
public interface CreateUserCase {

    UserModel createUser(UserModel userModel);
}
