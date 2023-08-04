package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.TypeOfContract;
import com.joyit.offer.infra.out.persistence.entitys.TypeOfContractEntity;

public class TypeOfContractMapper {
    public static TypeOfContract entityToDomain(TypeOfContractEntity typeOfContractEntity){
        TypeOfContract typeOfContract = new TypeOfContract();
        typeOfContract.setId(typeOfContractEntity.getId());
        typeOfContract.setDescription(typeOfContractEntity.getDescription());
        typeOfContract.setEstReg(EstRegMapper.entityToDomain(typeOfContractEntity.getEstRegEntity()));
        return typeOfContract;
    }

    public static TypeOfContractEntity domainToEntity(TypeOfContract typeOfContract){
        TypeOfContractEntity typeOfContractEntity = new TypeOfContractEntity();
        typeOfContractEntity.setId(typeOfContract.getId());
        typeOfContractEntity.setDescription(typeOfContract.getDescription());
        typeOfContractEntity.setEstRegEntity(EstRegMapper.domainToEntity(typeOfContract.getEstReg()));
        return typeOfContractEntity;
    }
}
