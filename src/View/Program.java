package View;

import Controller.CustomerManagement;
import Controller.HotelManagement;
import Entities.Customer;
import Entities.Room;

import java.util.Scanner;

public class Program {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CustomerManagement cm = new CustomerManagement();
        HotelManagement hotel = new HotelManagement();

        StartMenu:
        do {
            System.out.println("----Chương trình quản lý khách sạn----");
            System.out.println("------------Chọn chức năng------------");
            System.out.println("1. Quản lý khách hàng");
            System.out.println("2. Quản lý phòng");
            System.out.println("--------------------------------------");
            System.out.println("Nhập lựa chọn:");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                do {
                    System.out.println("----Quản lý khách hàng----");
                    System.out.println("------Chọn chức năng------");
                    System.out.println("1: Add");
                    System.out.println("2: Search");
                    System.out.println("3: Update");
                    System.out.println("4: Delete");
                    System.out.println("5: ShowAll");
                    System.out.println("--------------------------------------");
                    System.out.println("Nhập lựa chọn:");
                    int choice2 = Integer.parseInt(sc.nextLine());
                    switch (choice2) {
                        case 1:
                            Customer customer = Menu.getCustomerInfo();
                            cm.add(customer);
                            break;
                        case 2:
                            System.out.println("--------------------------------------");
                            System.out.println("Nhập CMT khách hàng cần tìm kiếm:");
                            String identityFound = sc.nextLine();
                            cm.search(identityFound);
//                            System.out.println("Hiện thông tin khách hàng muốn tìm kiếm");
//                            Customer customer1 = cm.getCustomerInfoByCode(index);
//                            System.out.println(customer1.toString());
                            break;
                        case 3:
                            System.out.println("--------------------------------------");
                            System.out.println("Nhập CMT khách hàng cần thay đổi:");
                            String identityChanged = sc.nextLine();
                            int index = cm.search(identityChanged);
                            System.out.println("Hiện thông tin khách hàng muốn thay đổi");
                            Customer customerBeforeChange = cm.getCustomerInfoByCode(index);
                            System.out.println(customerBeforeChange.toString());
                            cm.update(customerBeforeChange);
                            break;
                        case 4:
                            System.out.println("--------------------------------------");
                            System.out.println("Nhập CMT khách hàng muốn xóa:");
                            String indexDelete= sc.nextLine();
                            cm.delete(indexDelete);
                            break;
                        case 5:
                            System.out.println("--------------------------------------");
                            cm.showAll();
                            break;
                        default:
                            continue StartMenu;
                    }
                } while (true);

            } else {
                System.out.println("----Quản lý phòng----");
                System.out.println("---Chọn chức năng---");
                System.out.println("1: Add");
                System.out.println("2: ShowAll");
                System.out.println("--------------------------------------");
                System.out.println("Nhập lựa chọn:");
                int choice3 = Integer.parseInt(sc.nextLine());
                switch (choice3) {
                    case 1:

                        break;
                    case 2:
                        hotel.showAll();
                        break;
                    default:
                        continue StartMenu;
                }
            }
        } while (true);
    }
}

