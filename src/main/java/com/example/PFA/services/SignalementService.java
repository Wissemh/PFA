package com.example.PFA.services;

import com.example.PFA.Repositories.SignalementRepository;
import com.example.PFA.models.Photo;
import com.example.PFA.models.Signalement;
import com.example.PFA.models.SignalementId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SignalementService {
    @Autowired
    private final SignalementRepository signalementRepository ;
    public SignalementService(SignalementRepository signalementRepository) {
        this.signalementRepository = signalementRepository;
    }
    public List<Signalement> getAll() { return this.signalementRepository.findAll(); }
    public Optional<Signalement> findById(SignalementId id) {return  this.findById(id);}
    public Signalement addSignalement(Signalement  signalement) { return this.signalementRepository.save(signalement);}
    public void deleteSignalementById(SignalementId Id) { signalementRepository.deleteById(Id);}
    public void updatePhoto (Signalement signalement) { signalementRepository.save(signalement); }
}
