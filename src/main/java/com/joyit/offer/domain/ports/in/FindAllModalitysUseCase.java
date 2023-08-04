package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.Modality;

import java.util.List;

public interface FindAllModalitysUseCase {
    List<Modality> findAllModalitys();
}
