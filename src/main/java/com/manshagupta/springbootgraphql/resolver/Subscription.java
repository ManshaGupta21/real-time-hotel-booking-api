package com.manshagupta.springbootgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;
import com.manshagupta.springbootgraphql.model.Hotel;
import com.manshagupta.springbootgraphql.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Subscription implements GraphQLSubscriptionResolver {

    private final HotelRepository hotelRepository;

    public Publisher<Hotel> getNewHotel() {
        return hotelRepository.findWithTailableCursorBy();
    }
}
