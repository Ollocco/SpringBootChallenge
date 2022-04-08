package com.challenge.REST;

import java.util.List;

import com.challenge.Personaje;
import com.challenge.Repositorio.PersonajeRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personajes")
public class PersonajeREST {
    
    @Autowired
    private PersonajeRepository personajeRepository;

    //CREAR PERSONAJE
    @PostMapping("/guardar")
    public void guardar(@RequestBody Personaje personaje) {
        personajeRepository.save(personaje);
    }

    //LEER PERSONAJE
    @GetMapping("/listar")
    public List<Personaje> listar(){
        return personajeRepository.findAll();
    }

    //ELIMINAR PERSONAJE
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        personajeRepository.deleteById(id);
    }

    //ACTUALIZAR
    @PutMapping("/actualizar")
    public void actualizar(@RequestBody Personaje personaje){
        personajeRepository.save(personaje);
    }
}
