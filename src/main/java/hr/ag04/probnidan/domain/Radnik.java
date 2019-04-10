package hr.ag04.probnidan.domain;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "radnik")
public class Radnik {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "name", unique = false)
    private String name;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "ZanimanjeRadnika",
            joinColumns = {@JoinColumn(name = "radnik_id")},
            inverseJoinColumns = {@JoinColumn(name = "zanimanje_id")}
    )
    private List<Zanimanje> zanimanja = new ArrayList<>();

    public Radnik() {
    }

    public Radnik(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Radnik(Integer id, String name, List<Zanimanje> zanimanja) {
        this.id = id;
        this.name = name;
        this.zanimanja = zanimanja;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Zanimanje> getZanimanja() {
        return zanimanja;
    }

    public void setZanimanja(List<Zanimanje> zanimanja) {
        this.zanimanja = zanimanja;
    }
}
