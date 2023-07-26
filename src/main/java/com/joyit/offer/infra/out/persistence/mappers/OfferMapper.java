package com.joyit.offer.infra.out.persistence.mappers;

import com.joyit.offer.domain.models.Offer;
import com.joyit.offer.infra.out.persistence.entitys.OfferEntity;

public class OfferMapper {
    public static Offer entityToDomain(OfferEntity offerEntity){
        Offer offer = new Offer();
        offer.setId(offerEntity.getId());
        offer.setPosition(offerEntity.getPosition());
        offer.setTypoOfContract(TypeOfContractMapper.entityToDomain(offerEntity.getTypoOfContractEntity()));
        offer.setLevelOfExperience(LevelOFExperienceMapper.entityToDomain(offerEntity.getLevelOfExperienceEntity()));
        offer.setWorkingHours(WorkingHoursMapper.entityToDomain(offerEntity.getWorkingHoursEntity()));
        offer.setModality(ModalityMapper.entityToDomain(offerEntity.getModalityEntity()));
        offer.setArea(AreaMapper.entityToDomain(offerEntity.getAreaEntity()));
        offer.setSubArea(SubAreaMapper.entityToDomain(offerEntity.getSubAreaEntity()));
        offer.setCountry(CountryMapper.entityToDomain(offerEntity.getCountryEntity()));
        offer.setLocation(LocationMapper.entityToDomain(offerEntity.getLocationEntity()));
        offer.setSueldoMinimo(offerEntity.getSueldoMinimo());
        offer.setSueldoMaximo(offerEntity.getSueldoMaximo());
        offer.setCurrency(CurrencyMapper.entityToDomain(offerEntity.getCurrencyEntity()));
        offer.setDescription(offerEntity.getDescription());
        offer.setYearsOfExp(offerEntity.getYearsOfExp());
        // Skils
        offer.setMinAge(offerEntity.getMinAge());
        offer.setMaxAge(offerEntity.getMaxAge());
        offer.setMinStudyGrade(StudyGradeMapper.entityToDomain(offerEntity.getMinStudyGradeEntity()));
        // Languages
        offer.setEstReg(EstRegMapper.entityToDomain(offerEntity.getEstRegEntity()));

        return offer;
    }

    public static OfferEntity domainToEntity(Offer offer){
        OfferEntity offerEntity = new OfferEntity();
        offerEntity.setId(offer.getId());
        offerEntity.setPosition(offer.getPosition());
        offerEntity.setTypoOfContractEntity(TypeOfContractMapper.domainToEntity(offer.getTypoOfContract()));
        offerEntity.setLevelOfExperienceEntity(LevelOFExperienceMapper.domainToEntity(offer.getLevelOfExperience()));
        offerEntity.setWorkingHoursEntity(WorkingHoursMapper.domainToEntity(offer.getWorkingHours()));
        offerEntity.setModalityEntity(ModalityMapper.domainToEntity(offer.getModality()));
        offerEntity.setAreaEntity(AreaMapper.domainToEntity(offer.getArea()));
        offerEntity.setSubAreaEntity(SubAreaMapper.domainToEntity(offer.getSubArea()));
        offerEntity.setCountryEntity(CountryMapper.domainToEntity(offer.getCountry()));
        offerEntity.setLocationEntity(LocationMapper.domainToEntity(offer.getLocation()));
        offerEntity.setSueldoMinimo(offer.getSueldoMinimo());
        offerEntity.setSueldoMaximo(offer.getSueldoMaximo());
        offerEntity.setCurrencyEntity(CurrencyMapper.domainToEntity(offer.getCurrency()));
        offerEntity.setDescription(offer.getDescription());
        offerEntity.setYearsOfExp(offer.getYearsOfExp());
        // Skils
        offerEntity.setMinAge(offer.getMinAge());
        offerEntity.setMaxAge(offer.getMaxAge());
        offerEntity.setMinStudyGradeEntity(StudyGradeMapper.domainToEntity(offer.getMinStudyGrade()));
        // Languages
        offerEntity.setEstRegEntity(EstRegMapper.domainToEntity(offer.getEstReg()));

        return offerEntity;
    }
}
