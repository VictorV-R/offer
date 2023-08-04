package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.LevelOfExperience;

import java.util.List;

public interface FindAllLevelOfExperienceUseCase {
    List<LevelOfExperience> findAllLvlOfExps();
}
