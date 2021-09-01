package com.arsenbaktiyarov.sfgpetclinic.model;

import java.io.Serializable;

public class Speciality extends BaseEntity implements Serializable {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
