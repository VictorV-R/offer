package com.joyit.offer.infra.in.web;

import com.joyit.offer.application.service.OfferService;
import com.joyit.offer.domain.models.Offer;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offers")
public class OfferController {
    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @PostMapping
    public ResponseEntity<Offer> createOffer(@RequestBody Offer offer){
        Offer createdOffer = offerService.createOffer(offer);
        return new ResponseEntity<>(createdOffer, HttpStatus.CREATED);
    }
    @GetMapping
    public List<Offer> all(){
        List<Offer> offers = offerService.findAllOffers();
        return new ResponseEntity<>(offers, HttpStatus.FOUND).getBody();
    }


}
