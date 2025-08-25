public class ShippingCostCalculator {
    private final ShippingStrategy standardStrategy = new StandardShippingStrategy();
    private final ShippingStrategy expressStrategy = new ExpressShippingStrategy();
    private final ShippingStrategy overnightStrategy = new OvernightShippingStrategy();

    double cost(Shipment s) {
        ShippingStrategy strategy = getStrategy(s.type);
        return strategy.calculateCost(s.weightKg);
    }

    private ShippingStrategy getStrategy(String type) {
        switch (type) {
            case "STANDARD":
                return standardStrategy;
            case "EXPRESS":
                return expressStrategy;
            case "OVERNIGHT":
                return overnightStrategy;
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
