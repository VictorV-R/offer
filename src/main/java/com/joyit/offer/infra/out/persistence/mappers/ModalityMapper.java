package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.Modality;
import com.joyit.offer.infra.out.persistence.entitys.ModalityEntity;

public class ModalityMapper {
    public static Modality entityToDomain(ModalityEntity modalityEntity){
        Modality modality = new Modality();
        modality.setId(modalityEntity.getId());
        modality.setDescription(modalityEntity.getDescription());
        modality.setEstReg(EstRegMapper.entityToDomain(modalityEntity.getEstRegEntity()));
        return modality;
    }

    public static ModalityEntity domainToEntity(Modality modality){
        ModalityEntity modalityEntity = new ModalityEntity();
        modalityEntity.setId(modality.getId());
        modalityEntity.setDescription(modality.getDescription());
        modalityEntity.setEstRegEntity(EstRegMapper.domainToEntity(modality.getEstReg()));
        return modalityEntity;
    }
}
