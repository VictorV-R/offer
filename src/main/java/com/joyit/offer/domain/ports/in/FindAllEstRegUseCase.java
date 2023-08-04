package com.joyit.offer.domain.ports.in;

import com.joyit.offer.domain.models.EstReg;

import java.util.List;

public interface FindAllEstRegUseCase {
    List<EstReg> findAllEstRegs();
}
