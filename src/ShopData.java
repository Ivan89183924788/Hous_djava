//2
//
// import java.util.*;
//
//public class ShopData {
//    private static final List<Category> categories=new ArrayList<>();
//    private static final List<Product> products=new ArrayList<>();
//    private static final Map<String,User> users =new HashMap<>();
//    private static final Map<Integer,Product> productById=new HashMap<>();
//
//    static {
//        Category electronics = new Category(1,"Электроника");
//        Category clothes=new Category(2,"Одежда");
//        categories.add(electronics);
//        categories.add(clothes);
//
//        Product phone= new Product(101,"Смартфон Х",29999.0,10,electronics);
//        Product laptor= new Product(101,"Ноутбук Pro",79999.0,10,electronics);
//        Product tshirt= new Product(101,"Футболка базовая",1299.0,10,clothes);
//        Product jeans= new Product(101,"Джины классические",3999.0,10,clothes);
//
//        products.add(phone);
//        products.add(laptor);
//        products.add(tshirt);
//        products.add(jeans);
//
//        electronics.addProduct(phone);
//        electronics.addProduct(laptor);
//        clothes.addProduct(tshirt);
//        clothes.addProduct(jeans);
//
//        for (Product p:products){
//            productById.put(p.getId(), p);
//        }
//
//        users.put("Ivan",new User("Ivan","12345"));
//        users.put("Anna",new User("Anna","54321"));
//    }
//    public static List<Category> getCategories(){
//        return categories;
//    }
//    public static Map<String,User> getUsers(){
//        return users;
//    }
//    public static Map<Integer,Product> getProductById(){
//        return productById;
//    }
//
//}
