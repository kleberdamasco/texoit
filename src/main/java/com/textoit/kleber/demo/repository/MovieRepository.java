package com.textoit.kleber.demo.repository;

import com.textoit.kleber.demo.model.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    public List<Movie> findAllByWinnerEquals(String condition);

}
