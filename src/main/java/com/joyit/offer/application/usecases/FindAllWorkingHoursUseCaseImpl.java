package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.WorkingHours;
import com.joyit.offer.domain.ports.in.FindAllWorkingHoursUseCase;
import com.joyit.offer.domain.ports.out.WorkingHoursRepositoryPort;

import java.util.List;

public class FindAllWorkingHoursUseCaseImpl implements FindAllWorkingHoursUseCase {

    private final WorkingHoursRepositoryPort workingHoursRepositoryPort;

    public FindAllWorkingHoursUseCaseImpl(WorkingHoursRepositoryPort workingHoursRepositoryPort) {
        this.workingHoursRepositoryPort = workingHoursRepositoryPort;
    }

    @Override
    public List<WorkingHours> findAllWorkingHours() {
        return workingHoursRepositoryPort.getAllWorkingHours();
    }
}
