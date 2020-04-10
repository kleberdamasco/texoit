package com.textoit.kleber.demo.converter;

import com.textoit.kleber.demo.model.csv.MovieAwardDTO;
import com.textoit.kleber.demo.model.entity.Movie;

import java.util.function.Function;

public class MovieDTOConverter implements Function<MovieAwardDTO, Movie> {

    @Override
    public Movie apply(MovieAwardDTO dto) {
        Movie movie = new Movie();
        movie.setProducers(dto.getProducers());
        movie.setStudios(dto.getStudios());
        movie.setTitle(dto.getTitle());
        movie.setYear(dto.getYear().intValue());
        movie.setWinner(dto.getWinner());
        return movie;
    }
}
