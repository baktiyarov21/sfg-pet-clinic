package com.arsenbaktiyarov.sfgpetclinic.service.springdatajpa;

import com.arsenbaktiyarov.sfgpetclinic.model.Vet;
import com.arsenbaktiyarov.sfgpetclinic.repository.VetRepository;
import com.arsenbaktiyarov.sfgpetclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        Optional<Vet> vet = vetRepository.findById(aLong);
        if(vet.isPresent()) {
            return vet.get();
        } else {
            return null;
        }
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
