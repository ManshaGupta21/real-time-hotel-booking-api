package com.manshagupta.springbootgraphql.repository;

import com.manshagupta.springbootgraphql.model.Hotel;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface HotelRepository extends ReactiveCrudRepository<Hotel, String> {

    @Tailable
    Flux<Hotel> findWithTailableCursorBy();
}
