package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.EstReg;
import com.joyit.offer.infra.out.persistence.entitys.EstRegEntity;

public class EstRegMapper {
    public static EstReg entityToDomain(EstRegEntity estRegEntity){
        EstReg estReg = new EstReg();
        estReg.setId(estRegEntity.getId());
        estReg.setDescription(estRegEntity.getDescripcion());
        estReg.setEstReg(estRegEntity.getEstReg());
        return estReg;
    }

    public static EstRegEntity domainToEntity(EstReg estReg){
        EstRegEntity estRegEntity = new EstRegEntity();
        estRegEntity.setId(estReg.getId());
        estRegEntity.setDescripcion(estReg.getDescription());
        estRegEntity.setEstReg(estReg.getEstReg());
        return estRegEntity;
    }
}
