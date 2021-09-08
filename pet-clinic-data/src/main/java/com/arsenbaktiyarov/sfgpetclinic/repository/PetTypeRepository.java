package com.arsenbaktiyarov.sfgpetclinic.repository;

import com.arsenbaktiyarov.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
