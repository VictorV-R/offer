package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.Currency;

import java.util.List;

public interface CurrencyRepositoryPort {
    List<Currency> getAllCurrencys();

}
