package com.joyit.offer.domain.models;

import lombok.Data;

@Data
public class Country {
    private int id;
    private String description;
    private EstReg estReg;
}
