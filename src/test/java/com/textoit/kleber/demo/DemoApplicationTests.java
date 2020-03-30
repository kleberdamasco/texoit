package com.textoit.kleber.demo;

import com.textoit.kleber.demo.model.csv.MovieAwardDTO;
import com.textoit.kleber.demo.service.CSVReaderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private CSVReaderService csvReadService;

	@Test
	void contextLoads() {

		List<MovieAwardDTO> movieAwardDTOS = csvReadService.loadObjectList(MovieAwardDTO.class);
		System.out.println(movieAwardDTOS);

	}

}
