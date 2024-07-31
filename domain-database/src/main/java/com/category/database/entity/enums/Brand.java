package com.category.database.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Brand {

    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    F("F"),
    G("G"),
    H("H");

    private final String type;
    Brand(String type){
        this.type = type;
    }
}
