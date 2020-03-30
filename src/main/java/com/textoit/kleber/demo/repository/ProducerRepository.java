package com.textoit.kleber.demo.repository;

import com.textoit.kleber.demo.model.entity.Producer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducerRepository extends JpaRepository<Producer, Long> {

}
