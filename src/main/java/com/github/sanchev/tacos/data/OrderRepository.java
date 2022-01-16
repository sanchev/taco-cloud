package com.github.sanchev.tacos.data;

import com.github.sanchev.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {
}