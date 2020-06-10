package com.kshga.springkube;

import javax.persistence.*;

@Entity
@Table(name = "values")
public class Value {

    public Value() {}

    public Value(String value) {
        this.value = value;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "value")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
