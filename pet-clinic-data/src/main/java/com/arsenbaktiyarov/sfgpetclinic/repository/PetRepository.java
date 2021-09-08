package com.arsenbaktiyarov.sfgpetclinic.repository;

import com.arsenbaktiyarov.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
