package com.joyit.offer.domain.models;

import lombok.Data;

@Data
public class Language {
    private int id;
    private LanguageLevel level;
    private String description;
    private EstReg estReg;
}
