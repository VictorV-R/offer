package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.Offer;
import com.joyit.offer.domain.ports.in.CreateOfferUseCase;
import com.joyit.offer.domain.ports.out.OfferRepositoryPort;

public class CreateOfferUseCaseImpl implements CreateOfferUseCase {

    private final OfferRepositoryPort offerRepositoryPort;

    public CreateOfferUseCaseImpl(OfferRepositoryPort offerRepositoryPort) {
        this.offerRepositoryPort = offerRepositoryPort;
    }

    @Override
    public Offer createOffer(Offer offer) {
        return offerRepositoryPort.save(offer);
    }
}
