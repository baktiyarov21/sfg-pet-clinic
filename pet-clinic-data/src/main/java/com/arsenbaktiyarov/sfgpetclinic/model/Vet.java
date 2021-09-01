package com.arsenbaktiyarov.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person{
    private Set<Specialty> specialities = new HashSet<>();

    public Set<Specialty> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Specialty> specialities) {
        this.specialities = specialities;
    }
}
