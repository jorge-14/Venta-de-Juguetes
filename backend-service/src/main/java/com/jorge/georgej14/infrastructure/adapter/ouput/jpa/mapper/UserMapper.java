package com.jorge.georgej14.infrastructure.adapter.ouput.jpa.mapper;

import com.jorge.georgej14.domain.model.UserModel;
import com.jorge.georgej14.infrastructure.adapter.ouput.jpa.entity.UserEntity;

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
public class UserMapper {

    public static UserModel toModel(UserEntity userEntity) {
        return new UserModel(
                userEntity.getId(),
                userEntity.getName(),
                userEntity.getEmail()
        );
    }

    public static UserEntity toEntity(UserModel userModel) {
        UserEntity entity = new UserEntity();
        entity.setId(userModel.getId());
        entity.setName(userModel.getName());
        entity.setEmail(userModel.getEmail());
        return entity;
    }



}
