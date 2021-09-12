package com.arsenbaktiyarov.sfgpetclinic.service.springdatajpa;

import com.arsenbaktiyarov.sfgpetclinic.model.Specialty;
import com.arsenbaktiyarov.sfgpetclinic.repository.SpecialtyRepository;
import com.arsenbaktiyarov.sfgpetclinic.service.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialities = new HashSet<>();
        specialtyRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Specialty findById(Long aLong) {
        Optional<Specialty> specialty = specialtyRepository.findById(aLong);
        if(specialty.isPresent()) {
            return specialty.get();
        } else {
            return null;
        }
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
