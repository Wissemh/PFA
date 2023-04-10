package com.example.PFA.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "signalement")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Signalement {
    @EmbeddedId
    @Column(name="signal_id")
    private SignalementId id=new SignalementId();
    //@JsonBackReference
    @JsonIgnore
    @ManyToOne
    @MapsId("annonceId") // maps table1PK attribute of embedded id
    @JoinColumn(name = "annonce_id")
    private Annonce annonce;
    //@JsonBackReference
    @ManyToOne
    @MapsId("userId") // maps table2PK attribute of embedded id
    @JoinColumn(name = "user_id")
    User user;
}
