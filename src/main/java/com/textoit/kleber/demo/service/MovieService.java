package com.textoit.kleber.demo.service;

import com.textoit.kleber.demo.model.entity.Movie;
import com.textoit.kleber.demo.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }
    
    public Movie saveMovie(Movie movie) {
        return repository.save(movie);
    }

    public Movie deleteMovie(Movie movie) {
        return repository.save(movie);
    }
    
}
