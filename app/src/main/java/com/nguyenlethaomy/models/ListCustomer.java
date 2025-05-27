package com.nguyenlethaomy.models;

import java.util.ArrayList;

public class ListCustomer {
    private ArrayList<Customer> customers;

    public ListCustomer() {
        customers=new ArrayList<>();
    }
    public void addCustomer (Customer c)
    {
        customers.add(c);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    public void generate_sample_dataset()
    {
        addCustomer(new Customer(1, "Linh", "linhtran@example.com", "0911223344", "linhtran", "abc123"));
        addCustomer(new Customer(2, "Hùng", "hungvo@example.com", "0988776655", "hungvo", "abc123"));
        addCustomer(new Customer(3, "Mai", "mainguyen@example.com", "0933112233", "mainguyen", "abc123"));
        addCustomer(new Customer(4, "Tú", "tudang@example.com", "0909887766", "tudang", "abc123"));
        addCustomer(new Customer(5, "An", "anpham@example.com", "0966554433", "anpham", "abc123"));
        addCustomer(new Customer(6, "Lan", "lanle@example.com", "0977445566", "lanle", "abc123"));
        addCustomer(new Customer(7, "Phong", "phongnguyen@example.com", "0944332211", "phongnguyen", "abc123"));
        addCustomer(new Customer(8, "Nhung", "nhungvo@example.com", "0955667788", "nhungvo", "abc123"));
        addCustomer(new Customer(9, "Quang", "quangtruong@example.com", "0922446688", "quangtruong", "abc123"));
        addCustomer(new Customer(10, "Yến", "yenho@example.com", "0933445599", "yenho", "abc123"));
    }
    public boolean isExisting(Customer c)
    {
        for(Customer cus: customers)
        {
            if(cus.getId()== c.getId() ||
                    cus.getPhone().equals(c.getPhone()) ||
                    cus.getEmail().equalsIgnoreCase(c.getEmail()) ||
                    cus.getUsername().equalsIgnoreCase(c.getUsername())
            )
                return true;
        }
        return false;
    }
}
