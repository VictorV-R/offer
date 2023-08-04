package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.WorkingHours;

import java.util.List;

public interface FindAllWorkingHoursUseCase {
    List<WorkingHours> findAllWorkingHours();
}
