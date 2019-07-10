package com.example.exemploSpring.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exemploSpring.modelos.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa,Long>{
	
}
