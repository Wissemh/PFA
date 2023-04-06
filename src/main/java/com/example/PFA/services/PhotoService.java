package com.example.PFA.services;

import com.example.PFA.Repositories.AnnonceRepository;
import com.example.PFA.Repositories.PhotoRepository;
import com.example.PFA.models.Annonce;
import com.example.PFA.models.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhotoService {
    @Autowired
    private final PhotoRepository photoRepository;

    public PhotoService(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }
    public List<Photo> getAll(){return this.photoRepository.findAll();}
    public Optional<Photo> findById(Long id) {
        return photoRepository.findById(id);
    }
    public Photo addPhoto(Photo  photo) { return this.photoRepository.save(photo);}
    public void deletePhotoById(Long Id) { photoRepository.deleteById(Id);}
}

