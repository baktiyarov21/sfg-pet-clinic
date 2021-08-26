package com.arsenbaktiyarov.sfgpetclinic.bootstrap;


import com.arsenbaktiyarov.sfgpetclinic.model.Owner;
import com.arsenbaktiyarov.sfgpetclinic.model.Vet;
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

        Vet vet = new Vet();
        vet.setId(1l);
        vet.setFirstName("Holloway");
        vet.setLastName("Max");

        Vet vet2 = new Vet();
        vet2.setId(2l);
        vet2.setFirstName("Sam");
        vet2.setLastName("rrr");

        Vet vet3 = new Vet();
        vet3.setId(3l);
        vet3.setFirstName("aaa");
        vet3.setLastName("bbbb");

        vetService.save(vet);
        vetService.save(vet2);
        vetService.save(vet3);

//        System.out.println(ownerService.findById(1L));
    }
}
