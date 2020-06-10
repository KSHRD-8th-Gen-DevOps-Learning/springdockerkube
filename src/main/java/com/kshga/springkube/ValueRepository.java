package com.kshga.springkube;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ValueRepository extends CrudRepository<Value, Long> {
    List<Value> findByValue(String value);
}