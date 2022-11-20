package entity;

import java.util.Objects;

public class Services {
    private int ID_service;
    private Service name;
    private int request_time;
    private int cost;

    public Services(Service name, int request_time, int cost) {
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

    public int getRequest_time() {
        return request_time;
    }

    public void setRequest_time(int request_time) {
        this.request_time = request_time;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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
