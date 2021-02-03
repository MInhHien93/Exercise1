package Controller;

import Entities.Customer;
import Entities.Room;
import View.Menu;

import java.util.ArrayList;
import java.util.List;

public class CustomerManagement {

    public static List<Customer> customers = new ArrayList<>();

    public void add(Customer customer) {
        customers.add(customer);
        for (Customer c : customers) {
            System.out.println(c.toString());
        }
    }

    public int search(String identity) {
        int index = -1;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getItennity().equals(identity)) {
                index = i;
            }
        }
        return index;
    }

    public Customer getCustomerInfoByCode (int index) {
        Customer customer = customers.get(index);
        return customer;
    }

    public void update(Customer customer) {
        for (Customer c:customers) {
            if (c.getItennity().equals(customer.getItennity())) {
                c = Menu.getCustomerInfo();
            }
            System.out.println(c.toString());
        }
    }

    public boolean delete(String identity) {
        boolean isRemove = false;
        for (Customer c:customers) {
            if (c.getItennity().equals(identity)) {
                customers.remove(c);
                isRemove = true;
            } else isRemove =false;
        }
        return isRemove;
    }

    public void showAll() {
        for (Customer c: customers) {
            System.out.println(c.toString());
        }
    }
}

