package com.manshagupta.springbootgraphql.repository;

import com.manshagupta.springbootgraphql.model.Payment;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PaymentRepository extends ReactiveMongoRepository<Payment, String> {
}
