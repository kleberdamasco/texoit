package com.textoit.kleber.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProducerMovieWinner implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private Integer year;

    private String producer;

    @ManyToOne
    private Movie movie;

}
