package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.Offer;

public interface OfferRepositoryPort {
    Offer save(Offer offer);
}
