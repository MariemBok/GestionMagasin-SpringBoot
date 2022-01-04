package tn.esprit.spring.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;


@Entity(name="Produit")
@Table(name="T_PRODUIT")
@NoArgsConstructor
@Getter
@Setter
public class Produit implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name="IdProduit")
    Long id;
    @Column(name="Code")
    String code;
    @Column(name="Libelle")
    String libelle;
    @Column(name="PrixUnitaire")
    float prix;
    @OneToOne
    @JoinColumn(name = "DetailProduit_Id")
    private DetailProduit detailproduit;
    @ManyToOne
    @JoinColumn(name = "Stock_Id")
    private Stock stock;
    @JsonIgnore
    @OneToMany(mappedBy = "produit")
    private Set<DetailFacture> detailFactureSet;
    @ManyToMany
    @JoinTable(name = "T_PRODUIT_FOURNISSEUR",
                joinColumns = {@JoinColumn(name="Produit_Id")},
                inverseJoinColumns ={@JoinColumn(name = "Fournisseur_Id")})
    private Set<Fournisseur> fournisseurSet;
    @ManyToOne
    @JoinColumn(name = "Rayon_Id")
    private Rayon rayon;

}