package com.annotation.Custom_Annotation.model;

import com.annotation.Custom_Annotation.annotation.NameValidation;

public class Agent {

    @NameValidation(message = "Please correct the name")
    private String name;

    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
