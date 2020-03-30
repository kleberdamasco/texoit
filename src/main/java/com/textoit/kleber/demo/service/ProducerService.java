package com.textoit.kleber.demo.service;

import com.textoit.kleber.demo.model.entity.Producer;
import com.textoit.kleber.demo.repository.ProducerRepository;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final ProducerRepository repository;

    public ProducerService(ProducerRepository repository) {
        this.repository = repository;
    }

    public Producer saveProducer(Producer producer) {
        return repository.save(producer);
    }

    public Producer deleteProducer(Producer producer) {
        return repository.save(producer);
    }

}
