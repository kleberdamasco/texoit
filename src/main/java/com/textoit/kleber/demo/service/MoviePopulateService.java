package com.textoit.kleber.demo.service;

import com.textoit.kleber.demo.model.csv.MovieAwardDTO;
import org.springframework.stereotype.Component;

@Component
public class MoviePopulateService {

    private final CSVReaderService csvReaderService;
    private final MovieService movieService;
    private final ProducerService producerService;
    private final StudioService studioService;


    public MoviePopulateService(CSVReaderService csvReaderService, MovieService movieService, ProducerService producerService, StudioService studioService) {
        this.csvReaderService = csvReaderService;
        this.movieService = movieService;
        this.producerService = producerService;
        this.studioService = studioService;
    }


    public void createData(){
        csvReaderService.loadObjectList(MovieAwardDTO.class);
    }
}
