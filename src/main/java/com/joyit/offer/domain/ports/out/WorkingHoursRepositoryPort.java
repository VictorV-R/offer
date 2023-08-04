package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.WorkingHours;

import java.util.List;

public interface WorkingHoursRepositoryPort {
    List<WorkingHours> getAllWorkingHours();

}
