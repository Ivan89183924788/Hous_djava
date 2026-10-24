
////18
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Warehouse {
//    private Map<Integer,Product> productMap;
//
//    public Warehouse(){
//        productMap=new HashMap<>();
//    }
//    public void dobProducty(Product tovary){
//        if(productMap.containsKey(tovary.getId())){
//            System.out.println("Ошибка товар с ID "+ tovary.getId()+" уже существует");
//            return;
//
//        }
//        productMap.put(tovary.getId(), tovary);
//        System.out.println("Товар '"+tovary.getName()+"' успешно добавлен.");
//    }
//
//    public void izmKolic(int id,int novKolich){
//        Product tovary=productMap.get(id);
//        if (tovary!=null){
//            tovary.setQuantity(novKolich);
//            System.out.println("Количество товара '"+ tovary.getName()+"' обновлено до "+novKolich);
//        }else {
//            System.out.println("Товар с таким ID не найден");
//        }
//    }
//
//    public void udalityTovar(int id){
//        Product udality=productMap.remove(id);
//        if(udality!=null){
//            System.out.println("Товар "+ udality.getName()+" удален.");
//        }else {
//            System.out.println("Товар ID "+ id+" не найден!");
//        }
//
//    }
//
//    public void naytyPoId(int id){
//        Product tovary=productMap.get(id);
//        if(tovary!=null){
//            System.out.println("Товар "+ tovary+ "успешно найден!");
//        }else {
//            System.out.println("Товар с таким ID "+id+" не существует.");
//        }
//    }
//
//    public List<Product> poiskCategoriy(String category){
//        List<Product> naydenCategoriy=new ArrayList<>();
//        for(Product tovCat:productMap.values()){
//            if(tovCat.getCategory().equalsIgnoreCase(category)){
//                naydenCategoriy.add(tovCat);
//            }
//        }
//        if(!naydenCategoriy.isEmpty()){
//            System.out.println("Товары категории: '"+ category+"' :");
//            for(Product tov:naydenCategoriy){
//                System.out.println(tov);
//            }
//        }else {
//            System.out.println("Товары категории '"+category+ "' не найдены");
//        }
//        return naydenCategoriy;
//    }
//
//    public double polnayaStoimosty(){
//        double polniy=0;
//        for(Product stoim:productMap.values()){
//            polniy+=stoim.getPrice()*stoim.getQuantity();
//        }
//        System.out.printf("Общая стоимость склада: %.2f руб.%n",polniy);
//        return polniy;
//    }
//
//    public void napicatyVseTovary(){
//        System.out.println("Ве товары на складе:");
//        if(productMap.isEmpty()){
//            System.out.println("Склад пустой.");
//            return;
//        }
//        for(Product sklad:productMap.values()){
//            System.out.println(sklad);
//        }
//    }
//}
