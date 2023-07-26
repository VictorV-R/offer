package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.Area;
import com.joyit.offer.infra.out.persistence.entitys.AreaEntity;

public class AreaMapper {
    public static Area entityToDomain(AreaEntity areaEntity){
        Area area = new Area();
        area.setId(areaEntity.getId());
        area.setDescription(areaEntity.getDescription());
        return area;
    }

    public static AreaEntity domainToEntity(Area area){
        AreaEntity areaEntity = new AreaEntity();
        areaEntity.setId(area.getId());
        areaEntity.setDescription(area.getDescription());
        return areaEntity;
    }
}
