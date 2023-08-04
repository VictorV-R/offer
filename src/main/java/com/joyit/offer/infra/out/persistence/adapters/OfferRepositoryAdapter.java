package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.*;
import com.joyit.offer.domain.ports.out.OfferRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.OfferEntity;
import com.joyit.offer.infra.out.persistence.mappers.OfferMapper;
import com.joyit.offer.infra.out.persistence.repository.OfferRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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
        return OfferMapper.entityToDomain(savedOfferEntity);
    }

    @Override
    public List<Offer> getAllOffers() {
        List<OfferEntity> listOfffers = offerRepository.findAll();
        List<Offer> offerList = new ArrayList<>();
        for(OfferEntity offerEntity: listOfffers)
            offerList.add(OfferMapper.entityToDomain(offerEntity));
        return offerList;
    }
}
