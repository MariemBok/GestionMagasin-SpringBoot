package tn.esprit.spring.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="T_FOURNISSEUR")
@NoArgsConstructor
@Data
public class Fournisseur implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name="IdFournisseur")
    Long id;
    @Column(name="Code")
    String code;
    @Column(name="Libelle")
    String libelle;
}