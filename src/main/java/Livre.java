import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "titre")
    private String titre;

    @Column(name = "auteur")
    private String auteur;

    @ManyToMany(mappedBy="livres")
    private Set<Emprunt> emprunts;

    public Livre() {
        emprunts=new HashSet<Emprunt>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(Set<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livre{");
        sb.append("id=").append(id);
        sb.append(" titre='").append(titre).append('\'');
        sb.append(" auteur='").append(auteur).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
