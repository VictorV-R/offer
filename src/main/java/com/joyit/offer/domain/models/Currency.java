package com.joyit.offer.domain.models;

import lombok.Data;

@Data
public class Currency {
    private int id;
    private String description;
    private EstReg estReg;
}
