package com.example.PFA.Repositories;

import com.example.PFA.models.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce,Long> {
}
