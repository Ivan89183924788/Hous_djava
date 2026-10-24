//38
//public class User1{
//    private String name;
//    private int age;
//    private String email;
//    private String phone;
//    private String city;
//
//    public User1(Builder builder) {
//        this.name = builder.name;
//        this.age = builder.age;
//        this.email = builder.email;
//        this.phone = builder.phone;
//        this.city = builder.city;
//    }
//    @Override
//    public String toString() {
//        return "User{"+
//                "name=' "+name+'\''+
//                "age="+age+
//                ", email='"+email+'\''+
//                ", phone='"+phone+'\''+
//                ", city='"+city+'\''+
//                '}';
//    }
//    public static class Builder{
//        private String name;
//        private int age;
//        private String email;
//        private String phone;
//        private String city;

//        public Builder name(String name){
//            this.name = name;
//            return this;
//        }
//        public Builder age(int age){
//            this.age = age;
//            return this;
//        }
//        public Builder email(String email){
//            this.email = email;
//            return this;
//        }
//        public Builder phone(String phone){
//            this.phone = phone;
//            return this;
//        }
//        public Builder city(String city){
//            this.city = city;
//            return this;
//        }
//        public User1 build(){
//            return new User1(this);
//        }
//    }
//}
