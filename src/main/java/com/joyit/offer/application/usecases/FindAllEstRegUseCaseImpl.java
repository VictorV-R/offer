package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.EstReg;
import com.joyit.offer.domain.ports.in.FindAllEstRegUseCase;
import com.joyit.offer.domain.ports.out.EstRegRepositoryPort;

import java.util.List;

public class FindAllEstRegUseCaseImpl implements FindAllEstRegUseCase {

    private final EstRegRepositoryPort estRegRepositoryPort;

    public FindAllEstRegUseCaseImpl(EstRegRepositoryPort estRegRepositoryPort) {
        this.estRegRepositoryPort = estRegRepositoryPort;
    }

    @Override
    public List<EstReg> findAllEstRegs() {
        return estRegRepositoryPort.getAllEstReg();
    }
}
