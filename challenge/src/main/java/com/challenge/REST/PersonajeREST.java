package com.challenge.REST;

import java.util.List;
import java.util.Optional;

import com.challenge.Personaje;
import com.challenge.Servicio.PersonajeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personajes")
public class PersonajeREST {
    
    @Autowired
    private PersonajeService personajeService;

    //CREAR PERSONAJE
    @PostMapping("/guardar")
    public Personaje createPersonaje(@RequestBody Personaje personaje) {
       return personajeService.save(personaje);
    }

    //LISTAR TODOS PERSONAJES
    @GetMapping("/listar")
    public ResponseEntity<List<Personaje>> getAllPersonajes(){
        return ResponseEntity.ok(personajeService.findAll());
    }

    @GetMapping("/leer/{id}")
    private ResponseEntity<Optional<Personaje>> getPersonaje(@PathVariable("id") Integer id){
        return ResponseEntity.ok(personajeService.findById(id));
    }

    //ELIMINAR PERSONAJE
    @DeleteMapping("/eliminar/{id}")
    public void deletePersonaje(@PathVariable("id") Integer id){
        personajeService.deleteById(id);
    }

    //ACTUALIZAR
    @PutMapping("/actualizar")
    public Personaje updatePersonaje(@RequestBody Personaje personaje){
      return personajeService.save(personaje);
    }
}
