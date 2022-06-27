import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "emprunt")
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date_debut")
    private LocalDate date_debut;

    @Column(name = "date_fin")
    private LocalDate date_fin;

    @Column(name = "delai")
    private String delai;


    @ManyToMany
    @JoinTable(name = "compo",
            joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName =
                    "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName =
                    "ID")
    )
    private Set<Livre> livres;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    public Emprunt() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(LocalDate date_debut) {
        this.date_debut = date_debut;
    }

    public LocalDate getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(LocalDate date_fin) {
        this.date_fin = date_fin;
    }

    public String getDelai() {
        return delai;
    }

    public void setDelai(String delai) {
        this.delai = delai;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emprunt{");
        sb.append("\n");
        sb.append(" id=").append(id).append(",\n");
        sb.append(" date_debut=").append(date_debut).append(",\n");
        sb.append(" date_fin=").append(date_fin).append(",\n");
        sb.append(" delai='").append(delai).append('\'').append(",\n");
        sb.append(" id_client='").append(client).append('\'').append(",\n");
        sb.append(" livres=").append(livres).append(",\n");
        sb.append('}');
        return sb.toString();
    }
}
