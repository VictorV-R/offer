package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.Offer;
import com.joyit.offer.domain.ports.out.OfferRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.OfferEntity;
import com.joyit.offer.infra.out.persistence.mappers.OfferMapper;
import com.joyit.offer.infra.out.persistence.repository.OfferRepository;
import org.springframework.stereotype.Component;

@Component
public class OfferRepositoryAdapter implements OfferRepositoryPort {

    private final OfferRepository offerRepository;

    public OfferRepositoryAdapter(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public Offer save(Offer offer) {
        OfferEntity offerEntity = OfferMapper.domainToEntity(offer);
        OfferEntity savedOfferEntity = offerRepository.save(offerEntity);
        return null;
    }
}
