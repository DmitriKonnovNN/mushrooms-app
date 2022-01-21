package io.dmitrikonnov.mushroomsapp;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table (name = "mushrooms")
public class Mushroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int mushroomId;
    private int specimenId;
    private String latitude;
    private String longitude;
    private String description;

    @OneToMany(mappedBy = "mushroom")
    private List<Photo> photos;
}
