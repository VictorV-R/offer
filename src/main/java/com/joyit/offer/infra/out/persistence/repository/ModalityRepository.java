package com.joyit.offer.infra.out.persistence.repository;

import com.joyit.offer.infra.out.persistence.entitys.ModalityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModalityRepository extends JpaRepository<ModalityEntity, Integer> {
}
