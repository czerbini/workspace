package com.zerbini.feignclient.controller;

import com.zerbini.feignclient.Beer;
import com.zerbini.feignclient.service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/beer")
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{id}")
    public List<Beer> burcarporId(@PathVariable Long id) {
        return beerService.getBeerById(id);
    }

    @GetMapping()
    public List<Beer> getRandomBeer() {
        return beerService.getRandomBeer();
    }
}
