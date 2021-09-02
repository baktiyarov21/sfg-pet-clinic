package com.arsenbaktiyarov.sfgpetclinic.service.map;

import com.arsenbaktiyarov.sfgpetclinic.model.Specialty;
import com.arsenbaktiyarov.sfgpetclinic.model.Vet;
import com.arsenbaktiyarov.sfgpetclinic.service.SpecialtyService;
import com.arsenbaktiyarov.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VerServiceMap extends AbstractMapService<Vet, Long>
        implements VetService {

    private final SpecialtyService specialtyService;

    public VerServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(specialty -> {
                if (specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}