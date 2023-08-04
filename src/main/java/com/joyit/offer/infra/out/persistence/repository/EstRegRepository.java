package com.joyit.offer.infra.out.persistence.repository;

import com.joyit.offer.infra.out.persistence.entitys.EstRegEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstRegRepository extends JpaRepository<EstRegEntity, Integer> {
}
