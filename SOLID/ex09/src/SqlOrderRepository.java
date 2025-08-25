public class SqlOrderRepository implements OrderRepository {
    @Override
    public void save(String id) {
        System.out.println("Saving to SQL: " + id);
    }
}
