package com.example.PFA.models;
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
   /* @ManyToOne
    @MapsId("annonceId") // maps table1PK attribute of embedded id
    @JoinColumn(name = "annonce_id")
    private Annonce annonce;
    /*@ManyToOne
    @MapsId("userId") // maps table2PK attribute of embedded id
    @JoinColumn(name = "user_id")
    User user;*/
}
