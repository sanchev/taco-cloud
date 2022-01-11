package com.github.sanchev.tacos.data;

import com.github.sanchev.tacos.TacoOrder;

import java.util.Optional;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);

    Optional<TacoOrder> findById(Long id);

}