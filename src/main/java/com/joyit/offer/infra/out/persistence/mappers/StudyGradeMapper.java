package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.StudyGrade;
import com.joyit.offer.infra.out.persistence.entitys.StudyGradeEntity;

public class StudyGradeMapper {
    public static StudyGrade entityToDomain(StudyGradeEntity studyGradeEntity){
        StudyGrade studyGrade = new StudyGrade();
        studyGrade.setId(studyGradeEntity.getId());
        studyGrade.setDescription(studyGradeEntity.getDescription());
        return studyGrade;
    }

    public static StudyGradeEntity domainToEntity(StudyGrade studyGrade){
        StudyGradeEntity studyGradeEntity = new StudyGradeEntity();
        studyGradeEntity.setId(studyGrade.getId());
        studyGradeEntity.setDescription(studyGrade.getDescription());
        return studyGradeEntity;
    }
}
