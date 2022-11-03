package homework;


import java.util.*;

public class CustomerService {

    TreeMap<Customer, String> map = new TreeMap<>((o1, o2) -> (int) (o1.getScores() - o2.getScores()));

    public Map.Entry<Customer, String> getSmallest() {

        Map<Customer, String> newMap = new HashMap<>();
        Map.Entry<Customer, String> entry = map.entrySet().iterator().next();
        newMap.put(new Customer(entry.getKey().getId(),entry.getKey().getName(),entry.getKey().getScores()),
                entry.getValue());
        return newMap.entrySet().iterator().next();
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {

        Map<Customer, String> newMap = new HashMap<>();
        long scores = customer.getScores();
        for (Map.Entry<Customer, String> entry : map.entrySet()) {
            if (entry.getKey().getScores() > scores) {
                newMap.put(new Customer(entry.getKey().getId(),entry.getKey().getName(),entry.getKey().getScores()),
                        entry.getValue());
                return newMap.entrySet().iterator().next();
            }
        }
        return null;
    }

    public void add(Customer customer, String data) {
        map.put(customer, data);
    }
}
