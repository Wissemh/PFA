package com.example.PFA.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user")
    private Long idUser;
    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name="email")
    private String email;
    @Column(name="numTel")
    private String numTel;
    @Column(name="motDePasse")
    private String motDePasse;

    @Column(name = "is_admin")
    private boolean isAdmin;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_ecole")
    private Ecole ecole;
    @JsonBackReference
    @OneToMany(mappedBy = "user")
    private List<Annonce> annonces;
    @JsonBackReference
    @OneToMany(mappedBy = "user")
    private List<Signalement> signalements;
}

