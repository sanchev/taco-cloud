package com.github.sanchev.tacos.data;

import org.springframework.data.repository.CrudRepository;

import com.github.sanchev.tacos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {}