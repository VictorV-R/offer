package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.Location;

import java.util.List;

public interface FindAllLocationsUseCase {
    List<Location> findAllLocations();
}
