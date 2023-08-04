package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.SubArea;
import com.joyit.offer.domain.ports.out.SubAreaRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.SubAreaEntity;
import com.joyit.offer.infra.out.persistence.mappers.SubAreaMapper;
import com.joyit.offer.infra.out.persistence.repository.SubAreaRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SubAreaRepositoryAdapter implements SubAreaRepositoryPort {
    
    private final SubAreaRepository subAreaRepository;

    public SubAreaRepositoryAdapter(SubAreaRepository subAreaRepository) {
        this.subAreaRepository = subAreaRepository;
    }

    @Override
    public List<SubArea> getAllSubAreas() {
        List<SubAreaEntity> subAreaEntityList = subAreaRepository.findAll();
        List<SubArea> subAreaList = new ArrayList<>();
        for(SubAreaEntity subAreaEntity: subAreaEntityList)
            subAreaList.add(SubAreaMapper.entityToDomain(subAreaEntity));
        return subAreaList;
    }
}
