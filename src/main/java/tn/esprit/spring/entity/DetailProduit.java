package tn.esprit.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity(name="DetailProduit")
@Table(name="T_DPRODUIT")
@NoArgsConstructor
@Getter
@Setter
public class DetailProduit implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name="IdDetailProduit")
    Long id;
    @Temporal(TemporalType.DATE)
    @Column(name="dateCreation")
    Date datecr;
    @Temporal(TemporalType.DATE)
    @Column(name="dateDerniereModification")
    Date datemodif;
    @Enumerated(EnumType.STRING)
    @Column(name="categorieProduit")
    CategorieProduit categ;
    @JsonIgnore
    @OneToOne(mappedBy = "detailproduit")
    private Produit produit;
}