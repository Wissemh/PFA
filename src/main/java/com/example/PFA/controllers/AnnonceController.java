package com.example.PFA.controllers;

import com.example.PFA.models.Annonce;
import com.example.PFA.services.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/annonce")
public class AnnonceController {
    @Autowired
    private AnnonceService annonceService;

    @GetMapping
    public List<Annonce> getAllAnnonces(){return this.annonceService.getAll();}
    @GetMapping("/{id}")
    public ResponseEntity<Annonce> findById(@PathVariable Long id) {
        Optional<Annonce> optionalAnnonce = annonceService.findById(id);
        if (optionalAnnonce.isPresent()) {
            Annonce annonce = optionalAnnonce.get();
            return new ResponseEntity<>(annonce, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping
    public ResponseEntity addAnnonce(@RequestBody Annonce annonce) {
        return ResponseEntity.ok(this.annonceService.addAnnonce(annonce));
    }
    @DeleteMapping("/{id}")
    public void deleteAnnonce(@PathVariable("id") Long Id){this.annonceService.deleteAnnonceById(Id);}
    @PutMapping
    private  Annonce udpdateAnnonce(@RequestBody Annonce annonce) {
        annonceService.updateAnnonce(annonce);
        return annonce;
    }

}
