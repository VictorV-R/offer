package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.LevelOfExperience;
import com.joyit.offer.infra.out.persistence.entitys.LevelOfExperienceEntity;

public class LevelOFExperienceMapper {
    public static LevelOfExperience entityToDomain(LevelOfExperienceEntity levelOfExperienceEntity){
        LevelOfExperience levelOfExperience = new LevelOfExperience();
        levelOfExperience.setId(levelOfExperienceEntity.getId());
        levelOfExperience.setDescription(levelOfExperienceEntity.getDescription());
        levelOfExperience.setEstReg(EstRegMapper.entityToDomain(levelOfExperienceEntity.getEstRegEntity()));
        return levelOfExperience;
    }

    public static LevelOfExperienceEntity domainToEntity(LevelOfExperience levelOfExperience){
        LevelOfExperienceEntity levelOfExperienceEntity = new LevelOfExperienceEntity();
        levelOfExperienceEntity.setId(levelOfExperience.getId());
        levelOfExperienceEntity.setDescription(levelOfExperience.getDescription());
        levelOfExperienceEntity.setEstRegEntity(EstRegMapper.domainToEntity(levelOfExperience.getEstReg()));
        return levelOfExperienceEntity;
    }
}
