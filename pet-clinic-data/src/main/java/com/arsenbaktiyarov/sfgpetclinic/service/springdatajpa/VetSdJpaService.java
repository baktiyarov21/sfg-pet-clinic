package com.arsenbaktiyarov.sfgpetclinic.service.springdatajpa;

import com.arsenbaktiyarov.sfgpetclinic.model.Vet;
import com.arsenbaktiyarov.sfgpetclinic.repository.VetRepository;
import com.arsenbaktiyarov.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class VetSdJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSdJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        return (Set<Vet>) vetRepository.findAll();
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
