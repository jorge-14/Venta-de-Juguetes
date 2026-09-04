package com.jorge.georgej14.infrastructure.adapter.ouput.jpa;

import com.jorge.georgej14.domain.model.UserModel;
import com.jorge.georgej14.application.port.output.UserRepositoryPort;
import com.jorge.georgej14.infrastructure.adapter.ouput.jpa.entity.UserEntity;
import com.jorge.georgej14.infrastructure.adapter.ouput.jpa.mapper.UserMapper;
import com.jorge.georgej14.infrastructure.adapter.ouput.jpa.repository.UserRepository;
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
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserRepositoryAdapter(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserModel saveUser(UserModel userModel) {
        UserEntity entity = userMapper.toEntity(userModel);
        UserEntity saved = userRepository.save(entity);
        return userMapper.toModel(saved);
    }

    @Override
    public List<UserModel> listAllUser() {
        return userRepository.listUser()
                .stream()
                .map(userMapper::toModel)
                .toList();
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id).map(userMapper::toModel);
    }
}
