package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.Country;
import com.joyit.offer.domain.ports.in.FindAllCountrysUseCase;
import com.joyit.offer.domain.ports.out.CountryRepositoryPort;

import java.util.List;

public class FindAllCountrysUseCaseImpl implements FindAllCountrysUseCase {

    private final CountryRepositoryPort countryRepositoryPort;

    public FindAllCountrysUseCaseImpl(CountryRepositoryPort countryRepositoryPort) {
        this.countryRepositoryPort = countryRepositoryPort;
    }

    @Override
    public List<Country> findAllCountrys() {
        return countryRepositoryPort.getAllCountrys();
    }
}
