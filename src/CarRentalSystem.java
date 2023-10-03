public class CarRentalSystem {
    private static CarRentalSystem instance;

    private CarRentalSystem() {

    }

    public static CarRentalSystem getInstance() {
        if (instance == null) {
            instance = new CarRentalSystem();
        }
        return instance;
    }

    public RentalReceipt rentCar(Car car, RentalStrategy rentalStrategy, int days) {
        return rentalStrategy.rent(car, days);
    }
}
