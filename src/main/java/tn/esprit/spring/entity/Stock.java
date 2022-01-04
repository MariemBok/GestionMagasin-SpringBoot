package tn.esprit.spring.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;


@Entity(name="Stock")
@Table(name="T_STOCK")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Stock implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name="IdStock")
    Long id;
    @Column(name="Quantite")
    Integer qte;
    @Column(name="quantiteMin")
    Integer qteMin;
    @Column(name="libelleStock")
    String libellestock;
    @JsonIgnore
    @OneToMany(mappedBy = "stock", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
    private Set<Produit> produitSet;

}