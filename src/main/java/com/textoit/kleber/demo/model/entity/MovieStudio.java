package com.textoit.kleber.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

//@Entity
//@Table(name = "MovieStudio")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class MovieStudio implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Studio studio;

}
