package com.joyit.offer.infra.config;

import com.joyit.offer.application.service.OfferService;
import com.joyit.offer.application.usecases.CreateOfferUseCaseImpl;
import com.joyit.offer.application.usecases.FindAllOffersUseCaseImpl;
import com.joyit.offer.domain.ports.out.OfferRepositoryPort;
import com.joyit.offer.infra.out.persistence.adapters.OfferRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public OfferService offerService(OfferRepositoryPort offerRepositoryPort){
        return new OfferService(
                new CreateOfferUseCaseImpl(offerRepositoryPort),
                new FindAllOffersUseCaseImpl(offerRepositoryPort));
    }

    @Bean
    public OfferRepositoryPort offerRepositoryPort(OfferRepositoryAdapter offerRepositoryAdapter){
        return offerRepositoryAdapter;
    }
}
