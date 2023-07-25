package com.joyit.offer.domain.models;

import lombok.Data;

@Data
public class SubArea {
    private int id;
    private Area area;
    private String description;
    private EstReg estReg;
}
