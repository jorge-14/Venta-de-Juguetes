package com.jorge.georgej14.application.usecase;

import com.jorge.georgej14.application.port.input.CrudUserUseCase;
import com.jorge.georgej14.domain.exception.UserNotFoundException;
import com.jorge.georgej14.domain.model.UserModel;
import com.jorge.georgej14.application.port.output.UserRepositoryPort;
import org.springframework.stereotype.Service;
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

@Service
public class CrudUserUserUseCaseImpl implements CrudUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public CrudUserUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public UserModel createUser(UserModel userModel) {
        return userRepositoryPort.saveUser(userModel);
    }

    @Override
    public UserModel updateUser(Long id, UserModel user) {
        UserModel userModel = userRepositoryPort.getUserById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
        userModel.setName(user.getName());
        userModel.setEmail(user.getEmail());
        return userRepositoryPort.saveUser(userModel);
    }

    @Override
    public void deleteById(Long id) {
        userRepositoryPort.deleteUserById(id);
    }

    @Override
    public List<UserModel> listAll() {
        return userRepositoryPort.listAllUser();
    }
}
