package com.joyit.offer.infra.out.persistence.entitys;

import com.joyit.offer.domain.models.Area;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "subArea")
public class SubAreaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    private String description;

    @ManyToOne()
    @JoinColumn(name = "area", nullable = false)
    private AreaEntity areaEntity;

    @OneToMany(mappedBy = "subAreaEntity")
    private Set<OfferEntity> offerEntitySet;

    @ManyToOne()
    @JoinColumn(name = "estReg", nullable = false)
    private EstRegEntity estRegEntity;
}
