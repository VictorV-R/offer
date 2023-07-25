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
@Table(name = "civil_status")
public class EstRegEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    private String descripcion;
    private int estReg;

    @OneToMany(mappedBy = "estRegEntity")
    private Set<AreaEntity> civilStatusEntitySet;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<CountryEntity> genderEntitySet;
    @OneToMany(mappedBy = "estRegEntity")
    private Set<OfferEntity> applicantEntitySet;
}
