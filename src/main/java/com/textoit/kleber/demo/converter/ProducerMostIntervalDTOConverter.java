package com.textoit.kleber.demo.converter;

import com.textoit.kleber.demo.model.dto.ProducerMostInterval;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class ProducerMostIntervalDTOConverter {

    public ProducerMostInterval converter(Map<String, List<Integer[]>> producerPairsAwards) {

        AtomicReference<String> producer = new AtomicReference<>();
        AtomicReference<Integer> previousWin = new AtomicReference<>();
        AtomicReference<Integer> followingWin = new AtomicReference<>();
        AtomicReference<Integer> interval = new AtomicReference<>(0);

        producerPairsAwards.forEach((producerAux, pairs) -> {
            for (Integer[] pair : pairs) {
                Integer following = pair[1];
                Integer previous = pair[0];
                Integer intervalAux = following - previous;
                if(intervalAux > interval.get()) {
                    interval.set(intervalAux);
                    producer.set(producerAux);
                    previousWin.set(previous);
                    followingWin.set(following);
                }
            }
        });
        return ProducerMostInterval.builder()
                .producer(producer.get())
                .interval(interval.get())
                .previousWin(previousWin.get())
                .followingWin(followingWin.get())
                .build();
    }
}
