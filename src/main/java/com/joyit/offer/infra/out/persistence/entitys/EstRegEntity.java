package com.joyit.offer.infra.out.persistence.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "est_reg")
public class EstRegEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    private String descripcion;
    private int estReg;

    @OneToMany(mappedBy = "estRegEntity")
    private Set<AreaEntity> areaEntities;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<CountryEntity> countryEntities;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<CurrencyEntity> currencyEntities;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<LevelOfExperienceEntity> levelOfExperienceEntities;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<LocationEntity> locationEntities;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<ModalityEntity> modalityEntities;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<StudyGradeEntity> studyGradeEntities;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<SubAreaEntity> subAreaEntities;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<TypeOfContractEntity> typeOfContractEntities;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<WorkingHoursEntity> workingHoursEntities;

    @OneToMany(mappedBy = "estRegEntity")
    private Set<OfferEntity> offerEntitySet;
}
