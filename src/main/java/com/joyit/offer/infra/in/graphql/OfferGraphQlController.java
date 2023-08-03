package com.joyit.offer.infra.in.graphql;

import com.joyit.offer.application.service.OfferService;
import com.joyit.offer.domain.models.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class OfferGraphQlController {

    @Autowired
    private OfferService offerService;
    @QueryMapping(name = "offers")
    public List<Offer> getOffers(){
        return offerService.findAllOffers();
    }
    @MutationMapping(name = "createOffer")
    public Offer createOfferGraphQL(@RequestBody Offer offer){
        return offerService.createOffer(offer);
    }
}
