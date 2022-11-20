package entity;

import java.util.List;
import java.util.Objects;

public class Master {
    private int ID_master;
    private String name;
    private List<Integer> ID_service;

    public Master(String name, List<Integer> ID_service) {
        this.name = name;
        this.ID_service = ID_service;
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

    public List<Integer> getID_service() {
        return ID_service;
    }

    public void setID_service(List<Integer> ID_service) {
        this.ID_service = ID_service;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Master master = (Master) o;
        return ID_master == master.ID_master && Objects.equals(name, master.name) && Objects.equals(ID_service, master.ID_service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_master, name, ID_service);
    }
}
