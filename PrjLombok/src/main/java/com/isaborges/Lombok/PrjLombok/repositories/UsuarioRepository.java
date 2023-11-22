package com.isaborges.Lombok.PrjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaborges.Lombok.PrjLombok.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
