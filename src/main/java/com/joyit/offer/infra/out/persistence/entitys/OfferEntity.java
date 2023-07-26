package com.joyit.offer.infra.out.persistence.entitys;

import com.joyit.offer.domain.models.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "offer")
public class OfferEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String position;

    @ManyToOne()
    @JoinColumn(name = "typeOfContract_id)", nullable = false)
    private TypeOfContractEntity typoOfContractEntity;

    @ManyToOne()
    @JoinColumn(name = "levelOfExp_id", nullable = false)
    private LevelOfExperienceEntity levelOfExperienceEntity;

    @ManyToOne()
    @JoinColumn(name = "workingHours_id", nullable = false)
    private WorkingHoursEntity workingHoursEntity;

    @ManyToOne()
    @JoinColumn(name = "modality_id", nullable = false)
    private ModalityEntity modalityEntity;

    @ManyToOne()
    @JoinColumn(name = "area_id", nullable = false)
    private AreaEntity areaEntity;

    @ManyToOne()
    @JoinColumn(name = "subArea_id", nullable = false)
    private SubAreaEntity subAreaEntity;

    @ManyToOne()
    @JoinColumn(name = "country_id", nullable = false)
    private CountryEntity countryEntity;

    @ManyToOne()
    @JoinColumn(name = "location_id", nullable = false)
    private LocationEntity locationEntity;
    private int sueldoMinimo;
    private int sueldoMaximo;

    @ManyToOne()
    @JoinColumn(name = "currency_id", nullable = false)
    private CurrencyEntity currencyEntity;
    private String description;
    private int yearsOfExp;

//    private List<Skil> skils;

    private int minAge;
    private int maxAge;

    @ManyToOne()
    @JoinColumn(name = "studyGrade_id", nullable = false)
    private StudyGradeEntity minStudyGradeEntity;

//    private List<Language> languages;

    @ManyToOne()
    @JoinColumn(name = "estreg_id", nullable = false)
    private EstRegEntity estRegEntity;


}
