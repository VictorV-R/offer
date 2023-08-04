package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.Skil;

import java.util.List;

public interface SkilRepositoryPort {
    List<Skil> getAllSkils();
}
