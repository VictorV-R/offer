package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.Currency;

import java.util.List;

public interface FindAllCurrencyUseCase {
    List<Currency> findAllCurrencys();
}
