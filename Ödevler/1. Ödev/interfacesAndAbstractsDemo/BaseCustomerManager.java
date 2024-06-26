package interfacesAndAbstractsDemo;

public abstract class BaseCustomerManager implements ICustomerService {

    @Override
    public void save(Customer customer) {
        System.out.println("Saved to DB: " + customer.firstName);
    }
}
