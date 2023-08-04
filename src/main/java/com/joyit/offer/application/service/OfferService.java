package com.joyit.offer.application.service;

import com.joyit.offer.domain.models.*;
import com.joyit.offer.domain.ports.in.*;

import java.util.List;

public class OfferService implements CreateOfferUseCase, FindAllOffersUseCase, FindAllAreasUseCase, FindAllCountrysUseCase, FindAllCurrencyUseCase, FindAllEstRegUseCase, FindAllLocationsUseCase, FindAllLevelOfExperienceUseCase, FindAllModalitysUseCase, FindAllSubAreasUseCase, FindAllTypeOfContractsUseCase, FindAllWorkingHoursUseCase, FindAllStudyGradesUseCase {

    private final CreateOfferUseCase createOfferUseCase;
    private final FindAllOffersUseCase findAllOffersUseCase;
    private final FindAllAreasUseCase findAllAreasUseCase;
    private final FindAllCountrysUseCase findAllCountrysUseCase;
    private final FindAllCurrencyUseCase findAllCurrencyUseCase;
    private final FindAllEstRegUseCase findAllEstRegUseCase;
    private final FindAllLocationsUseCase findAllLocationsUseCase;
    private final FindAllLevelOfExperienceUseCase findAllLevelOfExperienceUseCase;
    private final FindAllModalitysUseCase findAllModalitysUseCase;
    private final FindAllStudyGradesUseCase findAllStudyGradesUseCase;
    private final FindAllSubAreasUseCase findAllSubAreasUseCase;
    private final FindAllTypeOfContractsUseCase findAllTypeOfContractsUseCase;
    private final FindAllWorkingHoursUseCase findAllWorkingHoursUseCase;

    public OfferService(CreateOfferUseCase createOfferUseCase, FindAllOffersUseCase findAllOffersUseCase, FindAllAreasUseCase findAllAreasUseCase, FindAllCountrysUseCase findAllCountrysUseCase, FindAllCurrencyUseCase findAllCurrencyUseCase, FindAllEstRegUseCase findAllEstRegUseCase, FindAllLocationsUseCase findAllLocationsUseCase, FindAllLevelOfExperienceUseCase findAllLevelOfExperienceUseCase, FindAllModalitysUseCase findAllModalitysUseCase, FindAllStudyGradesUseCase findAllStudyGradesUseCase, FindAllSubAreasUseCase findAllSubAreasUseCase, FindAllTypeOfContractsUseCase findAllTypeOfContractsUseCase, FindAllWorkingHoursUseCase findAllWorkingHoursUseCase) {
        this.createOfferUseCase = createOfferUseCase;
        this.findAllOffersUseCase = findAllOffersUseCase;
        this.findAllAreasUseCase = findAllAreasUseCase;
        this.findAllCountrysUseCase = findAllCountrysUseCase;
        this.findAllCurrencyUseCase = findAllCurrencyUseCase;
        this.findAllEstRegUseCase = findAllEstRegUseCase;
        this.findAllLocationsUseCase = findAllLocationsUseCase;
        this.findAllLevelOfExperienceUseCase = findAllLevelOfExperienceUseCase;
        this.findAllModalitysUseCase = findAllModalitysUseCase;
        this.findAllStudyGradesUseCase = findAllStudyGradesUseCase;
        this.findAllSubAreasUseCase = findAllSubAreasUseCase;
        this.findAllTypeOfContractsUseCase = findAllTypeOfContractsUseCase;
        this.findAllWorkingHoursUseCase = findAllWorkingHoursUseCase;
    }

    @Override
    public Offer createOffer(Offer offer) {
        return createOfferUseCase.createOffer(offer);
    }

    @Override
    public List<Offer> findAllOffers() {
        return findAllOffersUseCase.findAllOffers();
    }

    @Override
    public List<Area> findAllAreas() {
        return findAllAreasUseCase.findAllAreas();
    }

    @Override
    public List<Country> findAllCountrys() {
        return findAllCountrysUseCase.findAllCountrys();
    }

    @Override
    public List<Currency> findAllCurrencys() {
        return findAllCurrencyUseCase.findAllCurrencys();
    }

    @Override
    public List<EstReg> findAllEstRegs() {
        return findAllEstRegUseCase.findAllEstRegs();
    }

    @Override
    public List<LevelOfExperience> findAllLvlOfExps() {
        return findAllLevelOfExperienceUseCase.findAllLvlOfExps();
    }

    @Override
    public List<Location> findAllLocations() {
        return findAllLocationsUseCase.findAllLocations();
    }

    @Override
    public List<Modality> findAllModalitys() {
        return findAllModalitysUseCase.findAllModalitys();
    }

    @Override
    public List<StudyGrade> findAllStudyGrades() {
        return findAllStudyGradesUseCase.findAllStudyGrades();
    }

    @Override
    public List<SubArea> findAllSubAreas() {
        return findAllSubAreasUseCase.findAllSubAreas();
    }

    @Override
    public List<TypeOfContract> findAllTypeOfContracts() {
        return findAllTypeOfContractsUseCase.findAllTypeOfContracts();
    }

    @Override
    public List<WorkingHours> findAllWorkingHours() {
        return findAllWorkingHoursUseCase.findAllWorkingHours();
    }
}
