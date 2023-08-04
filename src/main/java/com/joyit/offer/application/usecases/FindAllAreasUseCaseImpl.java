package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.Area;
import com.joyit.offer.domain.ports.in.FindAllAreasUseCase;
import com.joyit.offer.domain.ports.out.AreaRepositoryPort;

import java.util.List;

public class FindAllAreasUseCaseImpl implements FindAllAreasUseCase {

    private final AreaRepositoryPort areaRepositoryPort;

    public FindAllAreasUseCaseImpl(AreaRepositoryPort areaRepositoryPort) {
        this.areaRepositoryPort = areaRepositoryPort;
    }
    @Override
    public List<Area> findAllAreas() {
        return areaRepositoryPort.getAllAreas();
    }
}
