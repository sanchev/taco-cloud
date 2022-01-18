package com.github.sanchev.tacos.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.github.sanchev.tacos.TacoOrder;


public interface OrderRepository 
         extends MongoRepository<TacoOrder, String> {

}
