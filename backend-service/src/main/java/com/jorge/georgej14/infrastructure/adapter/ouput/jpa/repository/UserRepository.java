package com.jorge.georgej14.infrastructure.adapter.ouput.jpa.repository;

import com.jorge.georgej14.infrastructure.adapter.ouput.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

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
public interface UserRepository extends JpaRepository <UserEntity, Long> {

}
