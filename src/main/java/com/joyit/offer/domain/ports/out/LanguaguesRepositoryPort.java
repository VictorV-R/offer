package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.Language;

import java.util.List;

public interface LanguaguesRepositoryPort {
    List<Language> getAllLanguagues();

}
