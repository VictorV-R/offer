package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.Location;
import com.joyit.offer.infra.out.persistence.entitys.LocationEntity;

public class LocationMapper {
    public static Location entityToDomain(LocationEntity locationEntity){
        Location location = new Location();
        location.setId(locationEntity.getId());
        location.setDescription(locationEntity.getDescription());
        location.setEstReg(EstRegMapper.entityToDomain(locationEntity.getEstRegEntity()));
        return location;
    }

    public static LocationEntity domainToEntity(Location location){
        LocationEntity locationEntity = new LocationEntity();
        locationEntity.setId(location.getId());
        locationEntity.setDescription(location.getDescription());
        locationEntity.setEstRegEntity(EstRegMapper.domainToEntity(location.getEstReg()));
        return locationEntity;
    }
}
