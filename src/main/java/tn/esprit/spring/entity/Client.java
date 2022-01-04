package tn.esprit.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity(name = "Client")
@Table(name="T_CLIENT")
@NoArgsConstructor
@Data
public class Client implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name="idClient")
    Long id;
    @Column(name="nom")
    String nom;
    @Column(name="Prenom")
    String prenom;
    @Temporal(TemporalType.DATE)
    @Column(name="DateNaissance")
    Date datenaiss;
    @Column(name="email")
    String email;
    @Column(name="password")
    String password;
    @Enumerated(EnumType.STRING)
    @Column(name="CategorieClient")
    CategorieClient categ;
    @Enumerated(EnumType.STRING)
    @Column(name="profession")
    Profession profession;
    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private Set<Facture> factureSet;

}