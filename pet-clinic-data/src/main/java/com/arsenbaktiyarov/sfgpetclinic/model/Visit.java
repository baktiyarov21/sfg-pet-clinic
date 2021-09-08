package com.arsenbaktiyarov.sfgpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "descroption")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;





}
