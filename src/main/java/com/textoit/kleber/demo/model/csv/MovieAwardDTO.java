package com.textoit.kleber.demo.model.csv;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieAwardDTO {
    private Long year;
    private String title;
    private String studios;
    private String producers;
    private String winner;
}
