package entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "masters")
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne
    @JoinColumn(name = "master_record")
    private int ID_master;
    @Column(name = "name")
    private String name;
    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {CascadeType.DETACH, CascadeType.MERGE,
                    CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinTable(
            name="masters_services",
            joinColumns = @JoinColumn(name = "master_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id")
    )
    private List<Services> services;

    public Master(String name, List<Services> services) {
        this.name = name;
        this.services = services;
    }

    public Master() {
    }

    public int getID_master() {
        return ID_master;
    }

    public void setID_master(int ID_master) {
        this.ID_master = ID_master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Services> getServices() {
        return services;
    }

    public void setServices(List<Services> services) {
        this.services = services;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Master master = (Master) o;
        return ID_master == master.ID_master && Objects.equals(name, master.name) && Objects.equals(services, master.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_master, name, services);
    }
}
