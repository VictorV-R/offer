package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.WorkingHours;
import com.joyit.offer.infra.out.persistence.entitys.WorkingHoursEntity;

public class WorkingHoursMapper {
    public static WorkingHours entityToDomain(WorkingHoursEntity workingHoursEntity){
        WorkingHours workingHours = new WorkingHours();
        workingHours.setId(workingHoursEntity.getId());
        workingHours.setDescription(workingHoursEntity.getDescription());
        return workingHours;
    }

    public static WorkingHoursEntity domainToEntity(WorkingHours workingHours){
        WorkingHoursEntity workingHoursEntity = new WorkingHoursEntity();
        workingHoursEntity.setId(workingHours.getId());
        workingHoursEntity.setDescription(workingHours.getDescription());
        return workingHoursEntity;
    }
}
