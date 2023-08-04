package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.Country;

import java.util.List;

public interface FindAllCountrysUseCase {
    List<Country> findAllCountrys();
}
