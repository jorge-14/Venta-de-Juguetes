package com.jorge.georgej14.infrastructure.adapter.input.rest.mapper;

import com.jorge.georgej14.domain.model.UserModel;
import com.jorge.georgej14.infrastructure.adapter.input.rest.request.UpdateUserRequestDto;
import com.jorge.georgej14.infrastructure.adapter.input.rest.request.UserRequestDto;
import com.jorge.georgej14.infrastructure.adapter.input.rest.response.UserResponseDto;
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
public class UserRestMapper {

    public UserModel toModel(UserRequestDto dto) {
        UserModel model = new UserModel();
        model.setName(dto.getName());
        model.setEmail(dto.getEmail());
        return model;
    }

    public UserResponseDto toResponse(UserModel model) {
        return UserResponseDto.builder()
                .id(model.getId())
                .name(model.getName())
                .email(model.getEmail())
                .build();
    }

    public UserModel toModel(UpdateUserRequestDto dto) {
        UserModel model = new UserModel();
        model.setName(dto.getName());
        model.setEmail(dto.getEmail());
        return model;
    }

}
