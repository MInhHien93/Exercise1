package Controller;

import Entities.Customer;
import Entities.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManagement {
    static List<Room> rooms = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static {
        Room r1 = new Room(1, "Standard", 150000);
        Room r2 = new Room(2, "VIP", 200000);
        Room r3 = new Room(3, "VIP2", 250000);
//        Room r4 = new Room(4, "SuperVIP", 350000);
//        Room r5 = new Room(5, "King", 500000);
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
//        rooms.add(r4);
//        rooms.add(r5);
    }

    public void add(Room room, Customer customer) {
        room.getCustomers().add(customer);
    }

    public void showAll() {
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(rooms.get(i).toString());
        }
    }
}
