package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.Modality;
import com.joyit.offer.infra.out.persistence.entitys.ModalityEntity;

public class ModalityMapper {
    public static Modality entityToDomain(ModalityEntity modalityEntity){
        Modality modality = new Modality();
        modality.setId(modalityEntity.getId());
        modality.setDescription(modalityEntity.getDescription());
        return modality;
    }

    public static ModalityEntity domainToEntity(Modality modality){
        ModalityEntity modalityEntity = new ModalityEntity();
        modalityEntity.setId(modality.getId());
        modalityEntity.setDescription(modality.getDescription());
        return modalityEntity;
    }
}
