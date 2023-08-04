package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.Modality;
import com.joyit.offer.domain.ports.out.ModalityRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.ModalityEntity;
import com.joyit.offer.infra.out.persistence.mappers.ModalityMapper;
import com.joyit.offer.infra.out.persistence.repository.ModalityRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ModalityRepositoryAdapter implements ModalityRepositoryPort {

    private final ModalityRepository modalityRepository;

    public ModalityRepositoryAdapter(ModalityRepository modalityRepository) {
        this.modalityRepository = modalityRepository;
    }

    @Override
    public List<Modality> getAllModalitys() {
        List<ModalityEntity> modalityEntityList = modalityRepository.findAll();
        List<Modality> modalityList = new ArrayList<>();
        for(ModalityEntity modalityEntity: modalityEntityList)
            modalityList.add(ModalityMapper.entityToDomain(modalityEntity));
        return modalityList;
    }
}
