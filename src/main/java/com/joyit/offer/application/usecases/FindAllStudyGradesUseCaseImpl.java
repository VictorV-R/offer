package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.StudyGrade;
import com.joyit.offer.domain.ports.in.FindAllStudyGradesUseCase;
import com.joyit.offer.domain.ports.out.StudyGradeRepositoryPort;

import java.util.List;

public class FindAllStudyGradesUseCaseImpl implements FindAllStudyGradesUseCase {

    private final StudyGradeRepositoryPort studyGradeRepositoryPort;

    public FindAllStudyGradesUseCaseImpl(StudyGradeRepositoryPort studyGradeRepositoryPort) {
        this.studyGradeRepositoryPort = studyGradeRepositoryPort;
    }

    @Override
    public List<StudyGrade> findAllStudyGrades() {
        return studyGradeRepositoryPort.getAllStudyGrades();
    }
}
