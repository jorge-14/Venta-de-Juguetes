package com.jorge.georgej14.application.port.input;

import com.jorge.georgej14.domain.model.UserModel;
import java.util.List;

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
public interface CrudUserUseCase {

    UserModel createUser(UserModel userModel);
    UserModel updateUser(Long id, UserModel user);
    void deleteById(Long id);
    List<UserModel> listAll();
}
