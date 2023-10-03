public class RentalReceipt {
    private Car car;
    private int rentalDuration;
    private double totalPrice;

    public RentalReceipt(Car car, int rentalDuration, double totalPrice) {
        this.car = car;
        this.rentalDuration = rentalDuration;
        this.totalPrice = totalPrice;
    }

    public Car getCar() {
        return car;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
