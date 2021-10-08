package com.arsenbaktiyarov.sfgpetclinic.service.map;

import com.arsenbaktiyarov.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;
    final Long firstOwnerId = 1L;
    final Long secondOwnerId = 2L;

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        ownerMapService.save(Owner.builder().id(firstOwnerId).build());
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerMapService.findAll();
        assertEquals(1, owners.size());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(firstOwnerId);
        assertEquals(firstOwnerId, owner.getId());
    }

    @Test
    void saveExistingId() {
        Owner owner2 = Owner.builder().id(2l).build();

        Owner savedOwner = ownerMapService.save(owner2);
        assertEquals(secondOwnerId, savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner savedOwner = ownerMapService.save(Owner.builder().build());
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());

    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(firstOwnerId));
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(firstOwnerId);
        assertEquals(0, ownerMapService.findAll().size());
    }
}