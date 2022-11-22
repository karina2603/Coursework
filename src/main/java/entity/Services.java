package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "services")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service")
    private int ID_service;
    @Column(name = "name")
    private Service name;
    @Column(name = "request_time")
    private double request_time;
    @Column(name = "cost")
    private int cost;
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinTable(
            name="masters_services",
            joinColumns = @JoinColumn(name = "service_id"),
            inverseJoinColumns = @JoinColumn(name = "master_id")
    )
    private List<Master> masters;
//    @OneToMany(cascade = CascadeType.ALL,
//            mappedBy = "service",
//            fetch = FetchType.LAZY)
//    private Set<Record> records;

    public void addMasterToService(Master master) {
        if (masters == null) {
            masters = new ArrayList<>();
        }
        masters.add(master);
    }
    public Services(Service name, double request_time, int cost) {
        this.name = name;
        this.request_time = request_time;
        this.cost = cost;
    }

    public Services() {
    }

    public int getID_service() {
        return ID_service;
    }

    public void setID_service(int ID_service) {
        this.ID_service = ID_service;
    }

    public Service getName() {
        return name;
    }

    public void setName(Service name) {
        this.name = name;
    }

    public double getRequest_time() {
        return request_time;
    }

    public void setRequest_time(double request_time) {
        this.request_time = request_time;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<Master> getMasters() {
        return masters;
    }

    public void setMasters(List<Master> masters) {
        this.masters = masters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Services services = (Services) o;
        return ID_service == services.ID_service && request_time == services.request_time && cost == services.cost && name == services.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_service, name, request_time, cost);
    }
}
