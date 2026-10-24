//35
//import java.util.Objects;
//
//public class Vehicle implements Comparable<Vehicle> {
//    protected int id;
//    protected String brand;
//    protected String model;
//    protected int year;
//    protected double price;
//
//    public Vehicle(int id, String brand, String model, int year, double price) {
//        this.id = id;
//        this.brand = brand;
//        this.model = model;
//        this.year = year;
//        this.price = price;
//    }
//
//    // Геттеры
//    public int getId() { return id; }
//    public String getBrand() { return brand; }
//    public String getModel() { return model; }
//    public int getYear() { return year; }
//    public double getPrice() { return price; }
//
//    @Override
//    public String toString() {
//        return String.format("[ID:%d] %s %s (%d) - $%.2f", id, brand, model, year, price);
//    }
//
//    /**
//     * Естественная сортировка:
//     * 1. По цене (возрастание)
//     * 2. Если цена равна -> по году (возрастание)
//     * 3. Если год равен -> по ID (возрастание)
//     */
//    @Override
//    public int compareTo(Vehicle other) {
//        if (this.price != other.price) {
//            return Double.compare(this.price, other.price);
//        }
//        if (this.year != other.year) {
//            return Integer.compare(this.year, other.year);
//        }
//        return Integer.compare(this.id, other.id);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Vehicle)) return false;
//        Vehicle vehicle = (Vehicle) o;
//        return id == vehicle.id &&
//                Double.compare(vehicle.price, price) == 0 &&
//                year == vehicle.year &&
//                brand.equals(vehicle.brand) &&
//                model.equals(vehicle.model);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, brand, model, year, price);
//    }
//}

