package View;

import Entities.Customer;

public class Menu {
    public static Customer getCustomerInfo() {
        System.out.println("Nhập tên khách hàng");
        String name = Program.sc.nextLine();
        System.out.println("Nhập CMT khách hàng");
        String identity = Program.sc.nextLine();
        System.out.println("Nhập ngày sinh khách hàng");
        String dateOfBirth = Program.sc.nextLine();
        Customer customer = new Customer(name, identity, dateOfBirth);
        return customer;
    }
}
