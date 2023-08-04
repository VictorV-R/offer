package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.*;

import java.util.List;

public interface OfferRepositoryPort {
    Offer save(Offer offer);
    List<Offer> getAllOffers();

}
