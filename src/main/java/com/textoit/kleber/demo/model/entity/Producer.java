package com.textoit.kleber.demo.model.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

//@Entity
//@Table
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class Producer implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
