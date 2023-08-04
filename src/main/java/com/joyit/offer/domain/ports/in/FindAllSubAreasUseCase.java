package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.SubArea;

import java.util.List;

public interface FindAllSubAreasUseCase {
    List<SubArea> findAllSubAreas();
}
