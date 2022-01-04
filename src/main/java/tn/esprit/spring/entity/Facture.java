package tn.esprit.spring.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity(name="Facture")
@Table(name="T_FACTURE")
@NoArgsConstructor
@Getter
@Setter
public class Facture implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name="IdFacture")
    Long id;
    @Column(name="MontantRemise")
    float montant;
    @Column(name="MontantFacture")
    float montantfac;
    @Temporal(TemporalType.DATE)
    @Column(name="DateFacture")
    Date datefact;
    @Column(name="Active")
    Boolean active;
    @JsonIgnore
    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> detailFactureSet;
    @ManyToOne
    @JoinColumn(name = "Client_Id")
    private Client client;

}