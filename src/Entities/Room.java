package Entities;

import java.io.Serializable;
import java.util.List;

public class Room implements Serializable {
    private int idRoom;
    private String typeOfRoom;
    private double priceOfRoom;
    private List<Customer> customers;
    private int days;

    public Room(int idRoom, String typeOfRoom, double priceOfRoom) {
        this.idRoom = idRoom;
        this.typeOfRoom = typeOfRoom;
        this.priceOfRoom = priceOfRoom;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public double getPriceOfRoom() {
        return priceOfRoom;
    }

    public void setPriceOfRoom(int priceOfRoom) {
        this.priceOfRoom = priceOfRoom;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
         String info = "-------Thông tin khách hàng------\n";
//        for (Customer c:customers) {
//            info += c.toString();
//        }
        info += "Loại phòng: " + typeOfRoom + "\n" +
                "Giá phòng: " + priceOfRoom;
        return info;
    }
}