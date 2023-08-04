package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.StudyGrade;

import java.util.List;

public interface StudyGradeRepositoryPort {
    List<StudyGrade> getAllStudyGrades();
}
