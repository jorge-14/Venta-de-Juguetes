package com.jorge.georgej14.infrastructure.adapter.ouput.jpa.mapper;

import com.jorge.georgej14.domain.model.UserModel;
import com.jorge.georgej14.infrastructure.adapter.ouput.jpa.entity.UserEntity;
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
public class UserMapper {

    public UserModel toModel(UserEntity userEntity) {
        return new UserModel(
                userEntity.getId(),
                userEntity.getName(),
                userEntity.getEmail()
        );
    }

    public UserEntity toEntity(UserModel userModel) {
        UserEntity entity = new UserEntity();
        entity.setId(userModel.getId());
        entity.setName(userModel.getName());
        entity.setEmail(userModel.getEmail());
        return entity;
    }
}
