package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.StudyGrade;
import com.joyit.offer.domain.ports.out.StudyGradeRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.StudyGradeEntity;
import com.joyit.offer.infra.out.persistence.mappers.StudyGradeMapper;
import com.joyit.offer.infra.out.persistence.repository.StudyGradeRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudyGradeRepositoryAdapter implements StudyGradeRepositoryPort {

    private final StudyGradeRepository studyGradeRepository;

    public StudyGradeRepositoryAdapter(StudyGradeRepository studyGradeRepository) {
        this.studyGradeRepository = studyGradeRepository;
    }

    @Override
    public List<StudyGrade> getAllStudyGrades() {
        List<StudyGradeEntity> studyGradeEntityList = studyGradeRepository.findAll();
        List<StudyGrade> studyGradeList = new ArrayList<>();
        for(StudyGradeEntity studyGradeEntity: studyGradeEntityList)
            studyGradeList.add(StudyGradeMapper.entityToDomain(studyGradeEntity));
        return studyGradeList;
    }
}
