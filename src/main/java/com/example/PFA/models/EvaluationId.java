package com.example.PFA.models;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Data
@Embeddable
public class EvaluationId implements Serializable {
    private Long annonceId;
    private Long userId;
}
