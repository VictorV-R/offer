package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.Country;
import com.joyit.offer.infra.out.persistence.entitys.CountryEntity;
import com.joyit.offer.infra.out.persistence.entitys.CountryEntity;

public class CountryMapper {
    public static Country entityToDomain(CountryEntity countryEntity){
        Country country = new Country();
        country.setId(countryEntity.getId());
        country.setDescription(countryEntity.getDescription());
        return country;
    }

    public static CountryEntity domainToEntity(Country country){
        CountryEntity countryEntity = new CountryEntity();
        countryEntity.setId(country.getId());
        countryEntity.setDescription(country.getDescription());
        return countryEntity;
    }
}
