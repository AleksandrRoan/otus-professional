package homework;


import java.util.*;

public class CustomerReverseOrder {

    Stack<Customer> customersSet = new Stack<>();


    public void add(Customer customer) {
        customersSet.push(customer);
    }

    public Customer take() {
        return customersSet.pop();
    }
}
