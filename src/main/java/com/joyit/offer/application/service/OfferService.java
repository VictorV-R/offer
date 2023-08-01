package com.joyit.offer.application.service;

import com.joyit.offer.domain.models.Offer;
import com.joyit.offer.domain.ports.in.CreateOfferUseCase;
import com.joyit.offer.domain.ports.in.FindAllOffersUseCase;

import java.util.List;

public class OfferService implements CreateOfferUseCase, FindAllOffersUseCase {

    private final CreateOfferUseCase createOfferUseCase;
    private final FindAllOffersUseCase findAllOffersUseCase;

    public OfferService(CreateOfferUseCase createOfferUseCase, FindAllOffersUseCase findAllOffersUseCase) {
        this.createOfferUseCase = createOfferUseCase;
        this.findAllOffersUseCase = findAllOffersUseCase;
    }

    @Override
    public Offer createOffer(Offer offer) {
        return createOfferUseCase.createOffer(offer);
    }

    @Override
    public List<Offer> findAllOffers() {
        return findAllOffersUseCase.findAllOffers();
    }
}
