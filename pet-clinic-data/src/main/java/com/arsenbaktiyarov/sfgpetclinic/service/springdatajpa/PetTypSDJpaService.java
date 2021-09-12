package com.arsenbaktiyarov.sfgpetclinic.service.springdatajpa;

import com.arsenbaktiyarov.sfgpetclinic.model.PetType;
import com.arsenbaktiyarov.sfgpetclinic.repository.PetTypeRepository;
import com.arsenbaktiyarov.sfgpetclinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        Optional<PetType> petType = petTypeRepository.findById(aLong);
        if(petType.isPresent()) {
            return petType.get();
        } else {
            return null;
        }
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById((aLong));
    }
}
