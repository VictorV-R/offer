package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.Area;

import java.util.List;

public interface AreaRepositoryPort {
    List<Area> getAllAreas();
}
