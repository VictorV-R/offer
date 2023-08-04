package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.Area;
import com.joyit.offer.domain.ports.out.AreaRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.AreaEntity;
import com.joyit.offer.infra.out.persistence.mappers.AreaMapper;
import com.joyit.offer.infra.out.persistence.repository.AreaRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AreaRepositoryAdapter implements AreaRepositoryPort {

    private final AreaRepository areaRepository;

    public AreaRepositoryAdapter(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    @Override
    public List<Area> getAllAreas() {
        List<AreaEntity> areaEntityList = areaRepository.findAll();
        List<Area> areaList = new ArrayList<>();
        for(AreaEntity areaEntity: areaEntityList)
            areaList.add(AreaMapper.entityToDomain(areaEntity));
        return areaList;
    }
}
