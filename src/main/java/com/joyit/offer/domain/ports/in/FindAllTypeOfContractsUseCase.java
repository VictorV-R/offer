package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.TypeOfContract;

import java.util.List;

public interface FindAllTypeOfContractsUseCase {
    List<TypeOfContract> findAllTypeOfContracts();
}
