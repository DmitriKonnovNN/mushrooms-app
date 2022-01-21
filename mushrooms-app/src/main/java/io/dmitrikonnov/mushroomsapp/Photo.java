package io.dmitrikonnov.mushroomsapp;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue
    private int photoId;
    private String photographer;
    private String path;
    private String fileName;
    private String comments;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name="mushroom_id")
    private Mushroom mushroom;
}
