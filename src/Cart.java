//2
//import java.util.*;
//public class Cart {
//    private final Map<Integer,Integer> items =new HashMap<>();
//
//    public void add(int productId, int quantity){
//        items.put(productId, items.getOrDefault(productId,0)+quantity);
//    }
//
//    public void remove(int productId){
//        items.remove(productId);
//    }
//
//    public void clear(){
//        items.clear();
//    }
//
//    public Map<Integer, Integer> getItems() {
//        return Collections.unmodifiableMap(items);
//    }
//
//    public boolean isEmpty(){
//        return items.isEmpty();
//    }
//
//    public int getTotalQuantity(){
//        return items.values().stream().mapToInt(Integer::intValue).sum();
//    }
//
//    public double calculateTotal(Map<Integer,Product> productById){
//        double total=0;
//        for (var entry:items.entrySet()){
//            int pid=entry.getKey();
//            int qty=entry.getValue();
//            Product p=productById.get(pid);
//            if(p!=null){
//                total+=p.getPrice()*qty;
//            }
//        }
//        return total;
//    }
//}
