package tn.esprit.spring.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name="T_RAYON")
@NoArgsConstructor
@Data
public class Rayon implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name="IdRayon")
    int id;
    @Column(name="Code")
    String code;
    @Column(name="Libelle")
    String libelle;
    @JsonIgnore
    @OneToMany(mappedBy = "rayon")
    private Set<Produit> produit;
}