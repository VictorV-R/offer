package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.Offer;

public interface CreateOfferUseCase {
    Offer createOffer(Offer offer);
}
