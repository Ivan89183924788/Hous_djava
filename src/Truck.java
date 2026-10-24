//35
//public class Truck extends Vehicle {
//    private double cargoCapacityTons;
//    private int axles;
//
//    public Truck(int id, String brand, String model, int year, double price,
//                 double cargoCapacityTons, int axles) {
//        super(id, brand, model, year, price);
//        this.cargoCapacityTons = cargoCapacityTons;
//        this.axles = axles;
//    }
//
//    // Этот геттер обязателен для сортировки по грузоподъёмности
//    public double getCargoCapacityTons() {
//        return cargoCapacityTons;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + String.format(" | Truck (Capacity: %.1f tons, Axles: %d)", cargoCapacityTons, axles);
//    }
//}
