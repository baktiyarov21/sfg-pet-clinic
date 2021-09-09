package com.arsenbaktiyarov.sfgpetclinic.service.springdatajpa;

import com.arsenbaktiyarov.sfgpetclinic.model.Pet;
import com.arsenbaktiyarov.sfgpetclinic.repository.PetRepository;
import com.arsenbaktiyarov.sfgpetclinic.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;


@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        return (Set<Pet>) petRepository.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        Optional<Pet> pet = petRepository.findById(aLong);
        if(pet.isPresent()) {
            return pet.get();
        } else {
            return null;
        }
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
