package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.WorkingHours;
import com.joyit.offer.domain.ports.out.WorkingHoursRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.WorkingHoursEntity;
import com.joyit.offer.infra.out.persistence.mappers.WorkingHoursMapper;
import com.joyit.offer.infra.out.persistence.repository.WorkingHoursRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WorkingHoursRepositoryAdapter implements WorkingHoursRepositoryPort {

    private final WorkingHoursRepository workingHoursRepository;

    public WorkingHoursRepositoryAdapter(WorkingHoursRepository workingHoursRepository) {
        this.workingHoursRepository = workingHoursRepository;
    }

    @Override
    public List<WorkingHours> getAllWorkingHours() {
        List<WorkingHoursEntity> workingHoursEntityList = workingHoursRepository.findAll();
        List<WorkingHours> workingHoursList = new ArrayList<>();
        for(WorkingHoursEntity workingHoursEntity: workingHoursEntityList)
            workingHoursList.add(WorkingHoursMapper.entityToDomain(workingHoursEntity));
        return workingHoursList;
    }
}
