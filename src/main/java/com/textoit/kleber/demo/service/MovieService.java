package com.textoit.kleber.demo.service;

import com.textoit.kleber.demo.model.entity.Movie;
import com.textoit.kleber.demo.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final String WINNER_YES = "yes";

    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public Movie saveMovie(Movie movie) {
        return repository.save(movie);
    }

    public Long deleteMovie(Long id) {
        Movie movie = new Movie();
        movie.setId(id);
        repository.delete(movie);
        return id;
    }

    public void saveAll(List<Movie> movies) {
        repository.saveAll(movies);
    }

    public List<Movie> getAll(){
        return repository.findAll();
    }

    public List<Movie> getAllWinners(){
        return repository.findAllByWinnerEquals(WINNER_YES);
    }
}
