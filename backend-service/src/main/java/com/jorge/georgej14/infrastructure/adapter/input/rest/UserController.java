package com.jorge.georgej14.infrastructure.adapter.input.rest;

import com.jorge.georgej14.application.port.input.CreateUserCase;
import com.jorge.georgej14.domain.model.UserModel;
import com.jorge.georgej14.infrastructure.adapter.input.rest.mapper.UserRestMapper;
import com.jorge.georgej14.infrastructure.adapter.input.rest.request.CreateUserRequestDto;
import com.jorge.georgej14.infrastructure.adapter.input.rest.response.CreateUserResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final CreateUserCase createUserCase;
    private final UserRestMapper mapper;

    public UserController(CreateUserCase createUserCase, UserRestMapper mapper) {
        this.createUserCase = createUserCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateUserResponseDto create(@RequestBody CreateUserRequestDto request) {
        UserModel model = mapper.toModel(request);
        UserModel created = createUserCase.createUser(model);
        return mapper.toResponse(created);
    }
}
