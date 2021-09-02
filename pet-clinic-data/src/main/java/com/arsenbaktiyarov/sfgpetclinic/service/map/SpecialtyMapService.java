package com.arsenbaktiyarov.sfgpetclinic.service.map;

import com.arsenbaktiyarov.sfgpetclinic.model.Specialty;
import com.arsenbaktiyarov.sfgpetclinic.service.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class SpecialtyMapService
        extends AbstractMapService<Specialty, Long>
        implements SpecialtyService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
