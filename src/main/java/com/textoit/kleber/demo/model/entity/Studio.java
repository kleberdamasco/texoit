package com.textoit.kleber.demo.model.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

//@Table
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class Studio implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;


}
