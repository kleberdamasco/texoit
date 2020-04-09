package com.textoit.kleber.demo.service;

import com.textoit.kleber.demo.converter.MovieDTOConverter;
import com.textoit.kleber.demo.model.csv.MovieAwardDTO;
import com.textoit.kleber.demo.model.entity.Movie;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MoviePopulateService {

    private final CSVReaderService csvReaderService;
    private final MovieService movieService;

    public MoviePopulateService(CSVReaderService csvReaderService, MovieService movieService) {
        this.csvReaderService = csvReaderService;
        this.movieService = movieService;
    }

    public void createData() {
        List<Movie> movies = csvReaderService.loadObjectList(MovieAwardDTO.class).stream().map(new MovieDTOConverter()).collect(Collectors.toList());
        movieService.saveAll(movies);
    }

}
