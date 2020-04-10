package com.textoit.kleber.demo.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProducerMostInterval {

    private String producer;
    private Integer interval;
    private Integer previousWin;
    private Integer followingWin;


}
