package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.LevelOfExperience;
import com.joyit.offer.domain.ports.in.FindAllLevelOfExperienceUseCase;
import com.joyit.offer.domain.ports.out.LevelOfExperienceRepositoryPort;

import java.util.List;

public class FindAllLvlOfExpUseCaseImpl implements FindAllLevelOfExperienceUseCase {

    private final LevelOfExperienceRepositoryPort levelOfExperienceRepositoryPort;

    public FindAllLvlOfExpUseCaseImpl(LevelOfExperienceRepositoryPort levelOfExperienceRepositoryPort) {
        this.levelOfExperienceRepositoryPort = levelOfExperienceRepositoryPort;
    }

    @Override
    public List<LevelOfExperience> findAllLvlOfExps() {
        return levelOfExperienceRepositoryPort.getAllLvlOfExp();
    }
}
