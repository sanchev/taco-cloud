package com.github.sanchev.tacos.data;

import com.github.sanchev.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {}