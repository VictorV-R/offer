package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.TypeOfContract;
import com.joyit.offer.domain.ports.in.FindAllTypeOfContractsUseCase;
import com.joyit.offer.domain.ports.out.TypeOfContractRepositoryPort;

import java.util.List;

public class FindAllTypeOfContractsUseCaseImpl implements FindAllTypeOfContractsUseCase {

    private final TypeOfContractRepositoryPort typeOfContractRepositoryPort;

    public FindAllTypeOfContractsUseCaseImpl(TypeOfContractRepositoryPort typeOfContractRepositoryPort) {
        this.typeOfContractRepositoryPort = typeOfContractRepositoryPort;
    }

    @Override
    public List<TypeOfContract> findAllTypeOfContracts() {
        return typeOfContractRepositoryPort.getAllTypeOfContracts();
    }
}
