package com.manshagupta.springbootgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.manshagupta.springbootgraphql.model.Hotel;
import com.manshagupta.springbootgraphql.model.Payment;
import com.manshagupta.springbootgraphql.repository.HotelRepository;
import com.manshagupta.springbootgraphql.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final HotelRepository hotelRepository;
    private final PaymentRepository paymentRepository;

    public Iterable<Hotel> findAllHotels() {
        return hotelRepository.findAll().toIterable();
    }

    public Optional<Hotel> findHotelById(String id) {
        return hotelRepository.findById(id).blockOptional();
    }

    public Optional<Long> countHotels() {
        return hotelRepository.count().blockOptional();
    }

    public Iterable<Payment> findAllPayments() {
        return paymentRepository.findAll().toIterable();
    }
}
