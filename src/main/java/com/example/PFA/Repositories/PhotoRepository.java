package com.example.PFA.Repositories;

import com.example.PFA.models.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Long > {
}
