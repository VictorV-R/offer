package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.SubArea;
import com.joyit.offer.domain.ports.in.FindAllSubAreasUseCase;
import com.joyit.offer.domain.ports.out.SubAreaRepositoryPort;

import java.util.List;

public class FindAllSubAreasUseCaseImpl implements FindAllSubAreasUseCase {

    private final SubAreaRepositoryPort subAreaRepositoryPort;

    public FindAllSubAreasUseCaseImpl(SubAreaRepositoryPort subAreaRepositoryPort) {
        this.subAreaRepositoryPort = subAreaRepositoryPort;
    }

    @Override
    public List<SubArea> findAllSubAreas() {
        return subAreaRepositoryPort.getAllSubAreas();
    }
}
