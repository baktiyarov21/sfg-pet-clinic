package com.arsenbaktiyarov.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person{
    private Set<Specialty> specialities;

    public Set<Specialty> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Specialty> specialities) {
        this.specialities = specialities;
    }
}
