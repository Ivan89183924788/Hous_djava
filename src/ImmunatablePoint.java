//23
////комбинация неизменяемые поля + final методы(паттерн- неизменяемый обьект)
//public final class ImmunatablePoint{
//    private final int x;
//    private final int y;
//
//    public ImmunatablePoint(int x,int y){
//        this.x=x;
//        this.y=y;
//    }
//    //Эти методы нельзя переопределить
//    public final int getX(){return x;}
//    public final int getY(){return y;}
//
//    public final String describe(){
//        return "Точка ("+x+", "+ y+ ")" ;
//    }
//}