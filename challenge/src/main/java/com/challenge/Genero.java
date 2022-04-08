package com.challenge;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Generos")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGenero;
    
    @Column(name="imagen", length= 150)
    private String imagen;

    @Column(name= "nombre", length = 25)
    private String nombre;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "genero_fk")
    private List<Pelicula_Serie> peliculasSeries;

    //constructor
    public Genero() {
   
    }
    public Genero(String imagen, String nombre, List<Pelicula_Serie> peliculasSeries) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.peliculasSeries = peliculasSeries;
    }


    
    //getters and setters
    
    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pelicula_Serie> getPeliculasSeries() {
        return peliculasSeries;
    }

    public void setPeliculasSeries(List<Pelicula_Serie> peliculasSeries) {
        this.peliculasSeries = peliculasSeries;
    }
}
