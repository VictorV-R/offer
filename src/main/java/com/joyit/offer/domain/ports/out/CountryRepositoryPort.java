package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.Country;

import java.util.List;

public interface CountryRepositoryPort {
    List<Country> getAllCountrys();
}
