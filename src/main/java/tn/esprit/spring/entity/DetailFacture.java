package tn.esprit.spring.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


import javax.persistence.*;


@Entity
@Table(name="T_DFACTURE")
@NoArgsConstructor
@Data
public class DetailFacture  implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name="IdDetailFacture")
    Long id;
    @Column(name="Qte")
    Integer qte;
    @Column(name="prixTotal")
    float prix;
    @Column(name="PourcentageRemise")
    Integer pourcentage;
    @Column (name="MontantRemise")
    float montant;
    @ManyToOne
    @JoinColumn(name="Produit_Id")
    private Produit produit;
    @ManyToOne
    @JoinColumn(name = "Facture_Id")
    private Facture facture;

}