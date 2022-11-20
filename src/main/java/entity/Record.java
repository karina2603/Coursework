package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_record")
    private int ID_record;
    @Column(name = "id_service")
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH},)
    @JoinColumn(name = "record_service")
    private Service service;
    @Column(name = "id_master")
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH},
            mappedBy = "ID_master")
    private Master master;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;

    public Record(Service service, Master master, String date, String time) {
        this.service = service;
        this.master = master;
        this.date = date;
        this.time = time;
    }

    public Record() {
    }

    public int getID_record() {
        return ID_record;
    }

    public void setID_record(int ID_record) {
        this.ID_record = ID_record;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service ID_service) {
        this.service = ID_service;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return ID_record == record.ID_record && service == record.service && master == record.master && Objects.equals(date, record.date) && Objects.equals(time, record.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_record, service, master, date, time);
    }
}
