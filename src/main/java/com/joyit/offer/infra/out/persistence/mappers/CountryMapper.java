package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.Country;
import com.joyit.offer.infra.out.persistence.entitys.CountryEntity;

public class CountryMapper {
    public static Country entityToDomain(CountryEntity countryEntity){
        Country country = new Country();
        country.setId(countryEntity.getId());
        country.setDescription(countryEntity.getDescription());
        country.setEstReg(EstRegMapper.entityToDomain(countryEntity.getEstRegEntity()));
        return country;
    }

    public static CountryEntity domainToEntity(Country country){
        CountryEntity countryEntity = new CountryEntity();
        countryEntity.setId(country.getId());
        countryEntity.setDescription(country.getDescription());
        countryEntity.setEstRegEntity(EstRegMapper.domainToEntity(country.getEstReg()));
        return countryEntity;
    }
}
