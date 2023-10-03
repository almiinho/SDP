public class DailyRentalStrategy implements RentalStrategy {
    private double dailyRate;

    public DailyRentalStrategy(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public RentalReceipt rent(Car car, int days) {
        double totalPrice = dailyRate * days;
        return new RentalReceipt(car, days, totalPrice);
    }
}
