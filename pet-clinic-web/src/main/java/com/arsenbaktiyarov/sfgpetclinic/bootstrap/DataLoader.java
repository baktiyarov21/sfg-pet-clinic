package com.arsenbaktiyarov.sfgpetclinic.bootstrap;


import com.arsenbaktiyarov.sfgpetclinic.model.Owner;
import com.arsenbaktiyarov.sfgpetclinic.service.OwnerService;
import com.arsenbaktiyarov.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;

        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Tony");
        owner.setLastName("Ferguson");
        ownerService.save(owner);
        System.out.println("Owners loading....");
        Owner owner1 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Colby");
        owner1.setLastName("Covington");
        ownerService.save(owner1);
        Owner owner2 = new Owner();
        owner2.setId(3L);
        owner2.setFirstName("Robert");
        owner2.setLastName("Whittaker");
        ownerService.save(owner2);
        System.out.println("Owners was created");

//        System.out.println(ownerService.findById(1L));
    }
}
