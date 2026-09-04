package com.jorge.georgej14.application.port.output;

import com.jorge.georgej14.domain.model.UserModel;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

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

@Component
public interface UserRepositoryPort {

    UserModel saveUser(UserModel userModel);
    List<UserModel> listAllUser();
    void deleteUserById(Long id);
    Optional<UserModel> getUserById(Long id);
}
