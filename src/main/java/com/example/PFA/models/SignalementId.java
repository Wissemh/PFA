package com.example.PFA.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class SignalementId implements Serializable {
    private Long annonceId;
    private Long userId;
}
