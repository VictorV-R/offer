package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.TypeOfContract;

import java.util.List;

public interface TypeOfContractRepositoryPort {
    List<TypeOfContract> getAllTypeOfContracts();

}
