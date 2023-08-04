package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.EstReg;
import com.joyit.offer.domain.ports.out.EstRegRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.EstRegEntity;
import com.joyit.offer.infra.out.persistence.mappers.EstRegMapper;
import com.joyit.offer.infra.out.persistence.repository.EstRegRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EstRegRepositoryAdapter implements EstRegRepositoryPort {

    private final EstRegRepository estRegRepository;

    public EstRegRepositoryAdapter(EstRegRepository estRegRepository) {
        this.estRegRepository = estRegRepository;
    }
    @Override
    public List<EstReg> getAllEstReg() {
        List<EstRegEntity> estRegEntityList = estRegRepository.findAll();
        List<EstReg> estRegList = new ArrayList<>();
        for(EstRegEntity estRegEntity: estRegEntityList)
            estRegList.add(EstRegMapper.entityToDomain(estRegEntity));
        return estRegList;
    }
}
