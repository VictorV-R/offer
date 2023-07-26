package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.Currency;
import com.joyit.offer.infra.out.persistence.entitys.CurrencyEntity;

public class CurrencyMapper {
    public static Currency entityToDomain(CurrencyEntity currencyEntity){
        Currency currency = new Currency();
        currency.setId(currencyEntity.getId());
        currency.setDescription(currencyEntity.getDescription());
        return currency;
    }

    public static CurrencyEntity domainToEntity(Currency currency){
        CurrencyEntity currencyEntity = new CurrencyEntity();
        currencyEntity.setId(currency.getId());
        currencyEntity.setDescription(currency.getDescription());
        return currencyEntity;
    }
}
