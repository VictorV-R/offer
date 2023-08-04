package com.joyit.offer.application.usecases;

import com.joyit.offer.domain.models.Currency;
import com.joyit.offer.domain.ports.in.FindAllCurrencyUseCase;
import com.joyit.offer.domain.ports.out.CurrencyRepositoryPort;

import java.util.List;

public class FindAllCurrencyUseCaseImpl implements FindAllCurrencyUseCase {

    private final CurrencyRepositoryPort currencyRepositoryPort;

    public FindAllCurrencyUseCaseImpl(CurrencyRepositoryPort currencyRepositoryPort) {
        this.currencyRepositoryPort = currencyRepositoryPort;
    }

    @Override
    public List<Currency> findAllCurrencys() {
        return currencyRepositoryPort.getAllCurrencys();
    }
}
