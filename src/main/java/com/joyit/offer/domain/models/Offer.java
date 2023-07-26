package com.joyit.offer.domain.models;

import lombok.Data;

import java.util.List;

@Data
public class Offer {
    private int id;
    private String position;
    private TypeOfContract typoOfContract;
    private LevelOfExperience levelOfExperience;
    private WorkingHours workingHours;
    private Modality modality;
    private Area area;
    private SubArea subArea;
    private Country country;
    private Location location;
    private int sueldoMinimo;
    private int sueldoMaximo;
    private Currency currency;
    private String description;
    private int yearsOfExp;
    private List<Skil> skils;
    private int minAge;
    private int maxAge;
    private StudyGrade minStudyGrade;
    private List<Language> languages;
    private EstReg estReg;
}
