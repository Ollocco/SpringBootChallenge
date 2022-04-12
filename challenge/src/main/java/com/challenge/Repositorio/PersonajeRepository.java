package com.challenge.Repositorio;

import java.util.List;

import com.challenge.Pelicula_Serie;
import com.challenge.Personaje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonajeRepository extends JpaRepository<Personaje,Integer>{
    
}
/*
@Query(value= "SELECT p FROM Personaje p WHERE p.nombre LIKE %?1%")
List<Personaje> search(String nombre,Integer edad, Double Peso, Pelicula_Serie peliculaSerie);
*/