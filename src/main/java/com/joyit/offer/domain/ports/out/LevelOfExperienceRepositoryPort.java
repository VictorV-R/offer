package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.LevelOfExperience;

import java.util.List;

public interface LevelOfExperienceRepositoryPort {
    List<LevelOfExperience> getAllLvlOfExp();

}
