package com.example.PFA.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Table(name = "annonce")
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_annonce")
    private Long idAnnonce;
    @Column(name = "description")
    private String description;
    @Column(name = "superficie")
    private float superficie;
    @Column(name = "loyer")
    private double loyer;
    @Column(name = "nbChambre")
    private int nbChambre;
    @Column(name = "nbPersonne")
    private int nbPersonne;
    @Column(name = "Animeaux")
    private boolean animeaux;
    @Column(name = "Fumeurs")
    private boolean fumeurs;
    @Column(name = "Adresse")
    private String adresse;
    @Column(name = "Caution")
    private double caution;
    @Column(name = "supprimé")
    private boolean supprimee = false;
    @Column(name = "longitude")
    private double longitude;
    @Column(name = "altitude")
    private double altitude;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    //@JsonManagedReference
    @JsonIgnore
    @OneToMany(mappedBy = "annonce")
    private List<Photo> photos;

    //@JsonManagedReference
    @JsonIgnore
    @OneToMany(mappedBy = "annonce")
    private List<Evaluation> evaluations;
    //@JsonManagedReference
    //@JsonIgnore
    @OneToMany(mappedBy = "annonce")
    private List<Signalement> signalements;

}
