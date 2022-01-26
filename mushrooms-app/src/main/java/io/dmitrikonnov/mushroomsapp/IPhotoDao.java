package io.dmitrikonnov.mushroomsapp;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IPhotoDao {

    void save(Photo photo);

    void saveImage(MultipartFile imageFile, Photo photo) throws IOException;
}
