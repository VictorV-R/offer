package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.Location;
import com.joyit.offer.domain.ports.in.FindAllLocationsUseCase;
import com.joyit.offer.domain.ports.out.LocationRepositoryPort;

import java.util.List;

public class FindAllLocationsUseCaseImpl implements FindAllLocationsUseCase {

    private final LocationRepositoryPort locationRepositoryPort;

    public FindAllLocationsUseCaseImpl(LocationRepositoryPort locationRepositoryPort) {
        this.locationRepositoryPort = locationRepositoryPort;
    }

    @Override
    public List<Location> findAllLocations() {
        return locationRepositoryPort.getAllLocations();
    }
}
