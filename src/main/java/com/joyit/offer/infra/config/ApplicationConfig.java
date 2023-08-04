package com.joyit.offer.infra.config;

import com.joyit.offer.application.service.OfferService;
import com.joyit.offer.application.usecases.*;
import com.joyit.offer.domain.ports.out.*;
import com.joyit.offer.infra.out.persistence.adapters.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public OfferService offerService(OfferRepositoryPort offerRepositoryPort, AreaRepositoryPort areaRepositoryPort, CountryRepositoryPort countryRepositoryPort, CurrencyRepositoryPort currencyRepositoryPort, EstRegRepositoryPort estRegRepositoryPort, LevelOfExperienceRepositoryPort levelOfExperienceRepositoryPort, LocationRepositoryPort locationRepositoryPort, ModalityRepositoryPort modalityRepositoryPort, StudyGradeRepositoryPort studyGradeRepositoryPort, SubAreaRepositoryPort subAreaRepositoryPort, TypeOfContractRepositoryPort typeOfContractRepositoryPort, WorkingHoursRepositoryPort workingHoursRepositoryPort){
        return new OfferService(
                new CreateOfferUseCaseImpl(offerRepositoryPort),
                new FindAllOffersUseCaseImpl(offerRepositoryPort),
                new FindAllAreasUseCaseImpl(areaRepositoryPort),
                new FindAllCountrysUseCaseImpl(countryRepositoryPort),
                new FindAllCurrencyUseCaseImpl(currencyRepositoryPort),
                new FindAllEstRegUseCaseImpl(estRegRepositoryPort),
                new FindAllLocationsUseCaseImpl(locationRepositoryPort),
                new FindAllLvlOfExpUseCaseImpl(levelOfExperienceRepositoryPort),
                new FindAllModalityUseCaseImpl(modalityRepositoryPort),
                new FindAllStudyGradesUseCaseImpl(studyGradeRepositoryPort),
                new FindAllSubAreasUseCaseImpl(subAreaRepositoryPort),
                new FindAllTypeOfContractsUseCaseImpl(typeOfContractRepositoryPort),
                new FindAllWorkingHoursUseCaseImpl(workingHoursRepositoryPort));
    }

    @Bean
    public OfferRepositoryPort offerRepositoryPort(OfferRepositoryAdapter offerRepositoryAdapter){
        return offerRepositoryAdapter;
    }

    @Bean
    public AreaRepositoryPort areaRepositoryPort(AreaRepositoryAdapter areaRepositoryAdapter){
        return areaRepositoryAdapter;
    }
    @Bean
    public  CountryRepositoryPort countryRepositoryPort(CountryRepositoryAdapter countryRepositoryAdapter){
        return  countryRepositoryAdapter;
    }

    @Bean
    public CurrencyRepositoryPort currencyRepositoryPort(CurrencyRepositoryAdapter currencyRepositoryAdapter){
        return currencyRepositoryAdapter;
    }

    @Bean
    public EstRegRepositoryPort estRegRepositoryPort(EstRegRepositoryAdapter estRegRepositoryAdapter){
        return estRegRepositoryAdapter;
    }

    @Bean
    public LevelOfExperienceRepositoryPort levelOfExperienceRepositoryPort(LevelOfExperienceRepositoryAdapter levelOfExperienceRepositoryAdapter){
        return levelOfExperienceRepositoryAdapter;
    }

    @Bean
    public LocationRepositoryPort locationRepositoryPort(LocationRepositoryAdapter locationRepositoryAdapter){
        return locationRepositoryAdapter;
    }

    @Bean
    public ModalityRepositoryPort modalityRepositoryPort(ModalityRepositoryAdapter modalityRepositoryAdapter){
        return modalityRepositoryAdapter;
    }

    @Bean
    public StudyGradeRepositoryPort studyGradeRepositoryPort(StudyGradeRepositoryAdapter studyGradeRepositoryAdapter){
        return studyGradeRepositoryAdapter;
    }

    @Bean
    public SubAreaRepositoryPort subAreaRepositoryPort(SubAreaRepositoryAdapter subAreaRepositoryAdapter){
        return subAreaRepositoryAdapter;
    }

    @Bean
    public TypeOfContractRepositoryPort typeOfContractRepositoryPort(TypeOfContractRepositoryAdapter typeOfContractRepositoryAdapter){
        return typeOfContractRepositoryAdapter;
    }

    @Bean
    public WorkingHoursRepositoryPort workingHoursRepositoryPort(WorkingHoursRepositoryAdapter workingHoursRepositoryAdapter){
        return workingHoursRepositoryAdapter;
    }
}
