package com.jorge.georgej14.application.usecase;

import com.jorge.georgej14.application.port.input.CreateUserCase;
import com.jorge.georgej14.domain.model.UserModel;
import com.jorge.georgej14.application.port.output.UserRepositoryPort;
import org.springframework.stereotype.Service;

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

@Service
public class UserUseCaseImplCase implements CreateUserCase {

    private final UserRepositoryPort userRepositoryPort;

    public UserUseCaseImplCase(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public UserModel createUser(UserModel userModel) {
        return userRepositoryPort.saveUser(userModel);
    }
}
