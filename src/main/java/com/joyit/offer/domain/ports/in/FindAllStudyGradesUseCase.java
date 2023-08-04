package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.StudyGrade;

import java.util.List;

public interface FindAllStudyGradesUseCase {
    List<StudyGrade> findAllStudyGrades();
}
