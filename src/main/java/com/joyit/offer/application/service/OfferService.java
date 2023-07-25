package com.joyit.offer.application.service;

import com.joyit.offer.domain.models.Offer;
import com.joyit.offer.domain.ports.in.CreateOfferUseCase;

public class OfferService implements CreateOfferUseCase {

    private final CreateOfferUseCase createOfferUseCase;

    public OfferService(CreateOfferUseCase createOfferUseCase) {
        this.createOfferUseCase = createOfferUseCase;

    }

    @Override
    public Offer createOffer(Offer offer) {
        return createOfferUseCase.createOffer(offer);
    }
}
