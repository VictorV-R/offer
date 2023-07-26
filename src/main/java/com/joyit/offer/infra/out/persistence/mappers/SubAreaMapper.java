package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.SubArea;
import com.joyit.offer.infra.out.persistence.entitys.SubAreaEntity;

public class SubAreaMapper {
    public static SubArea entityToDomain(SubAreaEntity subAreaEntity){
        SubArea subArea = new SubArea();
        subArea.setId(subAreaEntity.getId());
        subArea.setDescription(subAreaEntity.getDescription());
        return subArea;
    }

    public static SubAreaEntity domainToEntity(SubArea subArea){
        SubAreaEntity subAreaEntity = new SubAreaEntity();
        subAreaEntity.setId(subArea.getId());
        subAreaEntity.setDescription(subArea.getDescription());
        return subAreaEntity;
    }
}
