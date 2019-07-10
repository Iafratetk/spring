package com.example.exemploSpring.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exemploSpring.modelos.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmail(String email);

}
