package task1;

interface IDelivery {
    void deliver(String order);
}

abstract class DeliveryService {
    protected abstract IDelivery createDelivery();

    public void sendOrder(String order) {
        IDelivery delivery = createDelivery();
        delivery.deliver(order);
    }
}

final class CourierDelivery extends DeliveryService {
    @Override
    protected IDelivery createDelivery() {
        return order -> System.out.println(
            "Courier: " + order
        );
    }
}

final class PickupDelivery extends DeliveryService {
    @Override
    protected IDelivery createDelivery() {
        return order -> System.out.println(
            "Pickup: " + order
        );
    }
}

public class Main {
    public static void main(String[] args) {
        DeliveryService service = (args.length > 0 && args[0].equals("courier"))
            ? new CourierDelivery()
            : new PickupDelivery();

        service.sendOrder("Order");
    }
}