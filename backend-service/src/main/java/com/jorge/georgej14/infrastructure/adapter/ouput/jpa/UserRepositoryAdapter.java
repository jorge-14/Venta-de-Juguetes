package com.jorge.georgej14.infrastructure.adapter.ouput.jpa;

import com.jorge.georgej14.domain.model.UserModel;
import com.jorge.georgej14.application.port.output.UserRepositoryPort;
import com.jorge.georgej14.infrastructure.adapter.ouput.jpa.entity.UserEntity;

import com.jorge.georgej14.infrastructure.adapter.ouput.jpa.mapper.UserMapper;
import com.jorge.georgej14.infrastructure.adapter.ouput.jpa.repository.UserRepository;
import org.springframework.stereotype.Component;

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
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserRepository userRepository;

    public UserRepositoryAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserModel saveUser(UserModel userModel) {
        UserEntity entity = UserMapper.toEntity(userModel);
        UserEntity saved = userRepository.save(entity);
        return UserMapper.toModel(saved);
    }
}
