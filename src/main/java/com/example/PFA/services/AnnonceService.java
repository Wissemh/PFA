package com.example.PFA.services;

import com.example.PFA.Repositories.AnnonceRepository;
import com.example.PFA.models.Annonce;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnonceService {
    private final AnnonceRepository annonceRepository;

    public AnnonceService(AnnonceRepository annonceRepository) {
        this.annonceRepository = annonceRepository;
    }
    public List<Annonce> getAll(){return this.annonceRepository.findAll();}
    public Optional<Annonce> findById(Long id) {
        return annonceRepository.findById(id);
    }
    public Annonce addAnnonce(Annonce  annonce) { return this.annonceRepository.save(annonce);}
    public void deleteAnnonceById(Long Id) { annonceRepository.deleteById(Id);}
}
