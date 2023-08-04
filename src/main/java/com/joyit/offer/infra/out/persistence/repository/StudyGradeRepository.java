package com.joyit.offer.infra.out.persistence.repository;

import com.joyit.offer.infra.out.persistence.entitys.StudyGradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyGradeRepository extends JpaRepository<StudyGradeEntity, Integer> {
}
