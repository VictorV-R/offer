package com.joyit.offer.infra.out.persistence.adapters;

import com.joyit.offer.domain.models.Currency;
import com.joyit.offer.domain.ports.out.CurrencyRepositoryPort;
import com.joyit.offer.infra.out.persistence.entitys.CurrencyEntity;
import com.joyit.offer.infra.out.persistence.mappers.CurrencyMapper;
import com.joyit.offer.infra.out.persistence.repository.CurrencyRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CurrencyRepositoryAdapter implements CurrencyRepositoryPort {

    private final CurrencyRepository currencyRepository;

    public CurrencyRepositoryAdapter(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    @Override
    public List<Currency> getAllCurrencys() {
        List<CurrencyEntity> currencyEntityList = currencyRepository.findAll();
        List<Currency> currencyList = new ArrayList<>();
        for(CurrencyEntity currencyEntity: currencyEntityList)
            currencyList.add(CurrencyMapper.entityToDomain(currencyEntity));
        return currencyList;
    }
}
