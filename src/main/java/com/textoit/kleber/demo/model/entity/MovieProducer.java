package com.textoit.kleber.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MovieProducer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieProducer implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Producer producer;

}
