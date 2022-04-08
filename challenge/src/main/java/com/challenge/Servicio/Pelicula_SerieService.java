package com.challenge.Servicio;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import com.challenge.Pelicula_Serie;
import com.challenge.Repositorio.Pelicula_SerieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

@Service
public class Pelicula_SerieService implements Pelicula_SerieRepository{
    
    @Autowired
    private Pelicula_SerieRepository pelicula_serieRepository;

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllInBatch(Iterable<Pelicula_Serie> entities) {
        // TODO Auto-generated method stub
        
    }

    //IMPLEMENTADO
    @Override
    public List<Pelicula_Serie> findAll() {
        return pelicula_serieRepository.findAll();
    }

    @Override
    public List<Pelicula_Serie> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pelicula_Serie> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pelicula_Serie> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Pelicula_Serie> findAllById(Iterable<Integer> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Pelicula_Serie getById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pelicula_Serie getOne(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pelicula_Serie> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pelicula_Serie> List<S> saveAllAndFlush(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pelicula_Serie> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Pelicula_Serie> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(Pelicula_Serie entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends Pelicula_Serie> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean existsById(Integer id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<Pelicula_Serie> findById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pelicula_Serie> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pelicula_Serie> long count(Example<S> example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends Pelicula_Serie> boolean exists(Example<S> example) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends Pelicula_Serie> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pelicula_Serie, R> R findBy(Example<S> example,
            Function<FetchableFluentQuery<S>, R> queryFunction) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Pelicula_Serie> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }
}
