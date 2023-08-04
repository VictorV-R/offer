package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.Location;

import java.util.List;

public interface LocationRepositoryPort {
    List<Location> getAllLocations();
}
