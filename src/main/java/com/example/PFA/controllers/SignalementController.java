package com.example.PFA.controllers;

import com.example.PFA.models.Photo;
import com.example.PFA.models.Signalement;
import com.example.PFA.models.SignalementId;
import com.example.PFA.services.SignalementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/signalement")
public class SignalementController {
    @Autowired
    private SignalementService signalementService;
    @GetMapping
    public List<Signalement> getAllSignalements(){return this.signalementService.getAll();}
    @GetMapping("/{id}")
    public ResponseEntity<Signalement> findById(@PathVariable SignalementId id) {
        Optional<Signalement> optionalSignalement = signalementService.findById(id);
        if (optionalSignalement.isPresent()) {
            Signalement signalement = optionalSignalement.get();
            return new ResponseEntity<>(signalement, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping
    public ResponseEntity addSignalement(@RequestBody Signalement signalement) {
        return ResponseEntity.ok(this.signalementService.addSignalement(signalement));
    }

}
