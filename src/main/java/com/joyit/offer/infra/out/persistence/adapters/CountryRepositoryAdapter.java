package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.Country;
import com.joyit.offer.domain.ports.out.CountryRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.CountryEntity;
import com.joyit.offer.infra.out.persistence.mappers.CountryMapper;
import com.joyit.offer.infra.out.persistence.repository.CountryRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CountryRepositoryAdapter implements CountryRepositoryPort {

    private final CountryRepository countryRepository;

    public CountryRepositoryAdapter(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> getAllCountrys() {
        List<CountryEntity> countryEntityList = countryRepository.findAll();
        List<Country> countryList = new ArrayList<>();
        for(CountryEntity countryEntity: countryEntityList)
            countryList.add(CountryMapper.entityToDomain(countryEntity));
        return countryList;
    }
}
