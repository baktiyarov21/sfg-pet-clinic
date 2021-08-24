package com.arsenbaktiyarov.sfgpetclinic.service;

import com.arsenbaktiyarov.sfgpetclinic.model.Owner;
import com.arsenbaktiyarov.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet findByLastName(String lastName);
    Vet save(Owner owner);
    Set<Vet> findAll();
}
