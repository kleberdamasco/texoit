package com.textoit.kleber.demo.model.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

//@Entity
//@Table(name = "MovieProducer")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class MovieProducer implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Producer producer;

}
