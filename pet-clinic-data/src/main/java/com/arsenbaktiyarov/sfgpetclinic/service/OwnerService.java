package com.arsenbaktiyarov.sfgpetclinic.service;

import com.arsenbaktiyarov.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
}
