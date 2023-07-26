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
@Table(name = "levelOfExp")
public class LevelOfExperienceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    private String description;

    @OneToMany(mappedBy = "levelOfExperienceEntity")
    private Set<OfferEntity> offerEntitySet;

    @ManyToOne()
    @JoinColumn(name = "estReg", nullable = false)
    private EstRegEntity estRegEntity;
}
