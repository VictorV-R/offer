package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.LevelOfExperience;
import com.joyit.offer.domain.ports.out.LevelOfExperienceRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.LevelOfExperienceEntity;
import com.joyit.offer.infra.out.persistence.mappers.LevelOFExperienceMapper;
import com.joyit.offer.infra.out.persistence.repository.LevelOfExperienceRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LevelOfExperienceRepositoryAdapter implements LevelOfExperienceRepositoryPort {

    private final LevelOfExperienceRepository levelOfExperienceRepository;

    public LevelOfExperienceRepositoryAdapter(LevelOfExperienceRepository levelOfExperienceRepository) {
        this.levelOfExperienceRepository = levelOfExperienceRepository;
    }

    @Override
    public List<LevelOfExperience> getAllLvlOfExp() {
        List<LevelOfExperienceEntity> levelOfExperienceEntityList = levelOfExperienceRepository.findAll();
        List<LevelOfExperience> levelOfExperienceList = new ArrayList<>();
        for(LevelOfExperienceEntity levelOfExperienceEntity: levelOfExperienceEntityList)
            levelOfExperienceList.add(LevelOFExperienceMapper.entityToDomain(levelOfExperienceEntity));
        return levelOfExperienceList;
    }
}
