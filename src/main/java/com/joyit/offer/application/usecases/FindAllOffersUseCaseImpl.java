package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.Offer;
import com.joyit.offer.domain.ports.in.FindAllOffersUseCase;
import com.joyit.offer.domain.ports.out.OfferRepositoryPort;

import java.util.List;

public class FindAllOffersUseCaseImpl implements FindAllOffersUseCase {

    private final OfferRepositoryPort offerRepositoryPort;

    public FindAllOffersUseCaseImpl(OfferRepositoryPort offerRepositoryPort) {
        this.offerRepositoryPort = offerRepositoryPort;
    }

    @Override
    public List<Offer> findAllOffers() {
        return offerRepositoryPort.getAll();
    }
}
