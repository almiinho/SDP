public class Main {
    public static void main(String[] args) {
        CarRentalSystem carRentalSystem = CarRentalSystem.getInstance();

        Car car1 = new Car("Toyota Camry", "014PVL|14");
        Car car2 = new Car("Chevrolet Cobalt", "666ZLO|13");
        Car car3 = new Car("Hyundai Tucson", "117AEM|01");

        RentalStrategy dailyRentalStrategy1 = new DailyRentalStrategy(70.0);
        RentalStrategy dailyRentalStrategy2 = new DailyRentalStrategy(20.0);
        RentalStrategy dailyRentalStrategy3 = new DailyRentalStrategy(50.0);

        RentalReceipt receipt1 = carRentalSystem.rentCar(car1, dailyRentalStrategy1, 1);
        RentalReceipt receipt2 = carRentalSystem.rentCar(car2, dailyRentalStrategy2, 1);
        RentalReceipt receipt3 = carRentalSystem.rentCar(car3, dailyRentalStrategy3, 1);


        displayReceipt(receipt1);
        displayReceipt(receipt2);
        displayReceipt(receipt3);
    }

    private static void displayReceipt(RentalReceipt receipt) {
        System.out.println("Rental Receipt:");
        System.out.println("Model: " + receipt.getCar().getModel());
        System.out.println("License Plate: " + receipt.getCar().getLicensePlate());
        System.out.println("Rental Duration: " + receipt.getRentalDuration() + " days");
        System.out.println("Total Price: $" + receipt.getTotalPrice());
        System.out.println();
    }
}
