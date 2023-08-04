package com.joyit.offer.domain.ports.out;

import com.joyit.offer.domain.models.Modality;

import java.util.List;

public interface ModalityRepositoryPort {
    List<Modality> getAllModalitys();

}
