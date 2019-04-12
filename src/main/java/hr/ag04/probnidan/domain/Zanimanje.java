package hr.ag04.probnidan.domain;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "zanimanje")
public class Zanimanje {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "name", unique = true)
    private String name;

    @ManyToMany(mappedBy = "zanimanja")
    private List<Radnik> radnici = new ArrayList<>();

    public Zanimanje() {
    }

    public Zanimanje(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Zanimanje(Integer id, String name,  List<Radnik> radnici) {
        this.id = id;
        this.name = name;
        this.radnici = radnici;
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

    public List<Radnik> getRadnici() {
        return radnici;
    }

    public void setRadnici(List<Radnik> radnici) {
        this.radnici = radnici;
    }

}
