package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.Skil;

import java.util.List;

public interface FindAllSkilUseCase {
    List<Skil> findAllSkils();
}
