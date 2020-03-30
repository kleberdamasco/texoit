package com.textoit.kleber.demo.service;

import com.textoit.kleber.demo.model.entity.Studio;
import com.textoit.kleber.demo.repository.StudioRepository;
import org.springframework.stereotype.Service;

@Service
public class StudioService {

    private final StudioRepository repository;

    public StudioService(StudioRepository repository) {
        this.repository = repository;
    }

    public Studio saveStudio(Studio studio) {
        return repository.save(studio);
    }

    public Studio deleteStudio(Studio studio) {
        return repository.save(studio);
    }

}
