package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.Offer;

import java.util.List;

public interface FindAllOffersUseCase {
    List<Offer> findAllOffers();
}
