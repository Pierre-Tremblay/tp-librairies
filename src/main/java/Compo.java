import javax.persistence.*;

@Entity
@Table(name = "compo")
public class Compo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "id_liv")
    private String id_liv;

    @Column(name = "id_emp")
    private String id_emp;

    public Compo() {
    }

    public Compo(int id, String id_liv, String id_emp) {
        this.id = id;
        this.id_liv = id_liv;
        this.id_emp = id_emp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_liv() {
        return id_liv;
    }

    public void setId_liv(String id_liv) {
        this.id_liv = id_liv;
    }

    public String getId_emp() {
        return id_emp;
    }

    public void setId_emp(String id_emp) {
        this.id_emp = id_emp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Compo{");
        sb.append("id=").append(id);
        sb.append(", id_liv='").append(id_liv).append('\'');
        sb.append(", id_emp='").append(id_emp).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
