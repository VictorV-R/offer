package com.joyit.offer.domain.models;

import lombok.Data;

@Data
public class Location {
    private int id;
    private Country country;
    private String description;
    private EstReg estReg;
}
