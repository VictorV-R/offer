package com.joyit.offer.infra.out.persistence.repository;

import com.joyit.offer.infra.out.persistence.entitys.WorkingHoursEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkingHoursRepository extends JpaRepository<WorkingHoursEntity, Integer> {
}
