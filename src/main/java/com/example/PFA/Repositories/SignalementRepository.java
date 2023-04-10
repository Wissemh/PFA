package com.example.PFA.Repositories;

import com.example.PFA.models.Signalement;
import com.example.PFA.models.SignalementId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignalementRepository extends JpaRepository<Signalement , SignalementId> {
}
