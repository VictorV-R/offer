package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.TypeOfContract;
import com.joyit.offer.domain.ports.out.TypeOfContractRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.TypeOfContractEntity;
import com.joyit.offer.infra.out.persistence.mappers.TypeOfContractMapper;
import com.joyit.offer.infra.out.persistence.repository.TypeOfContractRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TypeOfContractRepositoryAdapter implements TypeOfContractRepositoryPort {

    private final TypeOfContractRepository typeOfContractRepository;

    public TypeOfContractRepositoryAdapter(TypeOfContractRepository typeOfContractRepository) {
        this.typeOfContractRepository = typeOfContractRepository;
    }

    @Override
    public List<TypeOfContract> getAllTypeOfContracts() {
        List<TypeOfContractEntity> typeOfContractEntityList = typeOfContractRepository.findAll();
        List<TypeOfContract> typeOfContractList = new ArrayList<>();
        for(TypeOfContractEntity typeOfContractEntity: typeOfContractEntityList)
            typeOfContractList.add(TypeOfContractMapper.entityToDomain(typeOfContractEntity));
        return typeOfContractList;
    }
}
