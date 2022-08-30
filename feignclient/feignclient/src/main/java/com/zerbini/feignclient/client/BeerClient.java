package com.zerbini.feignclient.client;

import com.zerbini.feignclient.Beer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@FeignClient(name = "BeerClient", url = "https://api.punkapi.com/v2/beers")
public interface BeerClient {

    @GetMapping(value = "/random")
    List<Beer> getRadomBeer();

    @GetMapping("/{id}")
    List<Beer> getBeerById(@PathVariable("id") Long id);
}
