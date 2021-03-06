package com.textoit.kleber.demo;

import com.textoit.kleber.demo.model.entity.Movie;
import com.textoit.kleber.demo.service.MoviePopulateService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	private static final String HOST = "http://localhost:";
	private static final String BASE_PATH = "/api/movie-awards/v1/movies";

	@LocalServerPort
	private int port;

	@Autowired
	private MoviePopulateService moviePopulateService;

	@Autowired
	private TestRestTemplate restTemplate;

	@Before
	void setup(){
		moviePopulateService.createData();
	}

	@Test
	void shouldReturn201(){
		Movie movie = getMovie();
		ResponseEntity<String> responseEntity = this.restTemplate.postForEntity(HOST + port + BASE_PATH + "/create", movie, String.class);
		assertEquals(201, responseEntity.getStatusCodeValue());
	}

	@Test
	void shouldReturnMovieDeleted(){
		Movie movie = getMovie();
		ResponseEntity<Movie> responseEntity = this.restTemplate.postForEntity(HOST + port + BASE_PATH + "/create", movie, Movie.class);
		Movie movieCreated = responseEntity.getBody();
		String url = HOST + port + BASE_PATH + "/delete/id/"+movieCreated.getId();
		ResponseEntity<Movie> exchange = restTemplate.exchange(URI.create(url), HttpMethod.DELETE, responseEntity, Movie.class);
		assertNotNull(exchange.getBody());
	}

	private Movie getMovie() {
		Movie movie = new Movie();
		movie.setProducers("Alan and Mark");
		movie.setStudios("Wall Disney");
		movie.setTitle("The Treasure");
		movie.setWinner("yes");
		movie.setYear(2029);
		return movie;
	}

}
