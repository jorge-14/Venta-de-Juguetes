package com.jorge.georgej14.infrastructure.adapter.input.rest;

import com.jorge.georgej14.application.port.input.CrudUserUseCase;
import com.jorge.georgej14.domain.model.UserModel;
import com.jorge.georgej14.infrastructure.adapter.input.rest.mapper.UserRestMapper;
import com.jorge.georgej14.infrastructure.adapter.input.rest.request.UpdateUserRequestDto;
import com.jorge.georgej14.infrastructure.adapter.input.rest.request.UserRequestDto;
import com.jorge.georgej14.infrastructure.adapter.input.rest.response.UserResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final CrudUserUseCase crudUserUseCase;
    private final UserRestMapper mapper;

    public UserController(CrudUserUseCase crudUserUseCase, UserRestMapper mapper) {
        this.crudUserUseCase = crudUserUseCase;
        this.mapper = mapper;
    }

    @PostMapping("/create-user")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDto create(@RequestBody UserRequestDto request) {
        UserModel model = mapper.toModel(request);
        UserModel created = crudUserUseCase.createUser(model);
        return mapper.toResponse(created);
    }

    @GetMapping("/list-user")
    public ResponseEntity<List<UserResponseDto>> listUser() {
        List<UserResponseDto> response = crudUserUseCase.listAll().stream()
                .map(mapper::toResponse)
                .toList();
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update-user/{id}")
    public ResponseEntity<UserResponseDto> update(@PathVariable Long id,
                                                  @RequestBody UpdateUserRequestDto request) {
        UserModel model = mapper.toModel(request);
        UserModel updated = crudUserUseCase.updateUser(id, model);
        return ResponseEntity.ok(mapper.toResponse(updated));
    }

    @DeleteMapping("/deleted-user/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletedUser(@PathVariable Long id) {
        crudUserUseCase.deleteById(id);
    }
}
