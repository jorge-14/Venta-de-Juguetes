package com.jorge.georgej14.infrastructure.adapter.input.rest.mapper;

import com.jorge.georgej14.domain.model.UserModel;
import com.jorge.georgej14.infrastructure.adapter.input.rest.request.CreateUserRequestDto;
import com.jorge.georgej14.infrastructure.adapter.input.rest.response.CreateUserResponseDto;
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

    public UserModel toModel(CreateUserRequestDto dto) {
        UserModel model = new UserModel();
        model.setName(dto.getName());
        model.setEmail(dto.getEmail());
        return model;
    }

    public CreateUserResponseDto toResponse(UserModel model) {
        return CreateUserResponseDto.builder()
                .id(model.getId())
                .name(model.getName())
                .email(model.getEmail())
                .build();
    }

}
