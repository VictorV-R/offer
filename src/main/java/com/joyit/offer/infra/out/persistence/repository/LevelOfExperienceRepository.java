package com.joyit.offer.infra.out.persistence.repository;

import com.joyit.offer.infra.out.persistence.entitys.LevelOfExperienceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelOfExperienceRepository extends JpaRepository<LevelOfExperienceEntity, Integer> {
}
