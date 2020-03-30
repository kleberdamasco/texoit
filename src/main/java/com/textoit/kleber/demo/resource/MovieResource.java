package com.textoit.kleber.demo.resource;

import com.textoit.kleber.demo.model.entity.Movie;
import com.textoit.kleber.demo.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/movie-awards/v1/movies")
public class MovieResource {

    private final MovieService movieService;

    public MovieResource(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Movie>> getAll(){
        return ResponseEntity.ok(movieService.getAll());
    }

    @GetMapping("/all/winners")
    public ResponseEntity<List<Movie>> getAllWinners(){
        return ResponseEntity.ok(movieService.getAllWinners());
    }

    @DeleteMapping("/delete/id/{id}")
    public ResponseEntity<Long> deleteMovie(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.deleteMovie(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Movie> create(@RequestBody Movie movie) {
        return ResponseEntity.created(URI.create("/movies/created")).body(movieService.saveMovie(movie));
    }

}
