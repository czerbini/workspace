package com.zerbini.feignclient.service;

import com.zerbini.feignclient.Beer;
import com.zerbini.feignclient.client.BeerClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BeerService {

    private final BeerClient beerClient;

    public List<Beer> getRandomBeer() {
        return beerClient.getRadomBeer();
    }

    public List<Beer> getBeerById(Long id) {
        return beerClient.getBeerById(id);
    }
}
