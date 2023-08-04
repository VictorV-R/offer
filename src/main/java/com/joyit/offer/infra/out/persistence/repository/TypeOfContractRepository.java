package com.joyit.offer.infra.out.persistence.repository;

import com.joyit.offer.infra.out.persistence.entitys.TypeOfContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeOfContractRepository extends JpaRepository<TypeOfContractEntity, Integer> {
}
