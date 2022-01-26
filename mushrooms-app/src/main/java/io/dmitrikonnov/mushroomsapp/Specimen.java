package io.dmitrikonnov.mushroomsapp;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Specimen {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int specimenId;
    private int mushroomId;
    private String latitude;
    private String longitude;
    private String description;

    @OneToMany(mappedBy = "specimen")
    private List<Photo> photos;
}
