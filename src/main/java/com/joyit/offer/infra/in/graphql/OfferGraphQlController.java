package com.joyit.offer.infra.in.graphql;

import com.joyit.offer.application.service.OfferService;
import com.joyit.offer.domain.models.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class OfferGraphQlController {

    @Autowired
    private OfferService offerService;
    @MutationMapping(name = "createOffer")
    public Offer createOfferGraphQL(@Argument(name = "offer") Offer offer){
        return offerService.createOffer(offer);
    }
}
