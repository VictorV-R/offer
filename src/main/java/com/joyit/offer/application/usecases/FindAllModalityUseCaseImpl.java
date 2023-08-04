package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.Modality;
import com.joyit.offer.domain.ports.in.FindAllModalitysUseCase;
import com.joyit.offer.domain.ports.out.ModalityRepositoryPort;

import java.util.List;

public class FindAllModalityUseCaseImpl implements FindAllModalitysUseCase {

    private final ModalityRepositoryPort modalityRepositoryPort;

    public FindAllModalityUseCaseImpl(ModalityRepositoryPort modalityRepositoryPort) {
        this.modalityRepositoryPort = modalityRepositoryPort;
    }

    @Override
    public List<Modality> findAllModalitys() {
        return modalityRepositoryPort.getAllModalitys();
    }
}
