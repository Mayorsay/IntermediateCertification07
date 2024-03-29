package builder_;

public class Program {
    public static void main(String[] args) {
        Order order = new OrderBuilder()
                .setQnt(8)
                .setPrice(1000)
                .build();
    }
}
