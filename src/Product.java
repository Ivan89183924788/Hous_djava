//2
//public class Product {
//    private int id;
//    private String name;
//    private double price;
//    private int stock;
//    private Category category;
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getStock() {
//        return stock;
//    }
//
//    public Category getCategory() {
//        return category;
//    }
//
//    public Product(int id, String name, double price, int stock, Category category) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//        this.stock = stock;
//        this.category = category;
//    }
//    @Override
//    public String toString(){
//        return String.format("[%d] %s | %.2f руб. | Остаток:%d шт. | Категория: %s ",
//                id,name,price,stock,category.getName());
//    }
//}

//import java.util.*;
//
//class Product{
//    private final int id;
//    private String name;
//    private String category;
//    private double price;
//    private int quantity;
//
//    public Product(int id, String name, String category, double price, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.category = category;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setQuantity(int quantity) {
//        if (quantity<0){
//            throw new IllegalArgumentException("Количество не должно быть отрицательным");
//        }
//        this.quantity = quantity;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void changeQuantity(int delta){
//        int newQty=this.quantity+delta;
//        if(newQty<0){
//            throw new IllegalArgumentException(
//                    "Недостаточно товара: нельзя убрать " + (-delta) +
//                            "шт.из имеющиися " + this.quantity
//            );
//        }
//        this.quantity=newQty;
//    }
//    @Override
//    public String toString(){
//
//    }
//}

//import java.util.HashMap;
//import java.util.Map;
////15
//class Product{
//    private final String name;
//    private final double price;
//
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    @Override
//    public String toString(){
//        return "Product{name='"+ name+"',price="+price+"}";
//    }
//}

//16

//class Product{
//    int id;
//    String name;
//    String category;
//    double price;
//    int quantity;
//
//    Product(int id,String name,String category,double price,int quantity){
//        this.id=id;
//        this.name=name;
//        this.category=category;
//        this.price=price;
//        this.quantity=quantity;
//    }
//
//    @Override
//    public String toString(){
//        return "Product {id=" +id + ", name='"+name+"',category='"+category+"',price="+price+",qty="+quantity+"}";
//    }
//}


////18
//class Product{
//    private int id;
//    private String name;
//    private String category;
//    private double price;
//    private int quantity;
//
//    public Product(int id,String name,String category,double price,int quantity){
//        this.id=id;
//        this.name=name;
//        this.category=category;
//        this.price=price;
//        this.quantity=quantity;
//    }
//
//    public int getId(){return id;}
//    public String getName(){return name;}
//    public String getCategory(){return category;}
//    public double getPrice(){return price;}
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//    @Override
//    public String toString(){
//        return String.format("ID:%d,Name:'%s',Category:'%s',Price:%.2f,Quantity:%d",
//                id,name,category,price,quantity);
//    }
//}