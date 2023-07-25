package com.joyit.offer.domain.models;

import lombok.Data;

@Data
public class WorkingHours {
    private int id;
    private String description;
    private EstReg estReg;
}
