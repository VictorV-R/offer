package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.Area;

import java.util.List;

public interface FindAllAreasUseCase {
    List<Area> findAllAreas();
}
