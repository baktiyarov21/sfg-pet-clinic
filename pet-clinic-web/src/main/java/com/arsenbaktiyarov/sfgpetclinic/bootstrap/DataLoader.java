package com.arsenbaktiyarov.sfgpetclinic.bootstrap;


import com.arsenbaktiyarov.sfgpetclinic.model.Owner;
import com.arsenbaktiyarov.sfgpetclinic.service.OwnerService;
import com.arsenbaktiyarov.sfgpetclinic.service.VetService;
import com.arsenbaktiyarov.sfgpetclinic.service.map.OwnerServiceMap;
import com.arsenbaktiyarov.sfgpetclinic.service.map.VerServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VerServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("A");
        owner.setLastName("B");
        ownerService.save(owner);
        System.out.println("Owner Created");
    }
}
