package entity;

import java.util.Objects;

public class Record {
    private int ID_record;
    private int ID_service;
    private int ID_master;
    private String date;
    private String time;

    public Record(int ID_service, int ID_master, String date, String time) {
        this.ID_service = ID_service;
        this.ID_master = ID_master;
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

    public int getID_service() {
        return ID_service;
    }

    public void setID_service(int ID_service) {
        this.ID_service = ID_service;
    }

    public int getID_master() {
        return ID_master;
    }

    public void setID_master(int ID_master) {
        this.ID_master = ID_master;
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
        return ID_record == record.ID_record && ID_service == record.ID_service && ID_master == record.ID_master && Objects.equals(date, record.date) && Objects.equals(time, record.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_record, ID_service, ID_master, date, time);
    }
}
