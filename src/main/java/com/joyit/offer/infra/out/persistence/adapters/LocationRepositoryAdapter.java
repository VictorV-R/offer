package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.Location;
import com.joyit.offer.domain.ports.out.LocationRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.LocationEntity;
import com.joyit.offer.infra.out.persistence.mappers.LocationMapper;
import com.joyit.offer.infra.out.persistence.repository.LocationRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocationRepositoryAdapter implements LocationRepositoryPort {

    private final LocationRepository locationRepository;

    public LocationRepositoryAdapter(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> getAllLocations() {
        List<LocationEntity> locationEntityList = locationRepository.findAll();
        List<Location> locationList = new ArrayList<>();
        for(LocationEntity locationEntity: locationEntityList)
            locationList.add(LocationMapper.entityToDomain(locationEntity));
        return locationList;
    }
}
