//2
//import java.util.Scanner;
//
//public class AuthService {
//    private User currentUser;
//    private final Scanner scanner;
//
//    public AuthService(Scanner scanner) {
//        this.scanner = scanner;
//    }
//
//    public User login(){
//        System.out.print("Логин: ");
//        String login=scanner.nextLine().trim();
//
//        System.out.print("Пароль: ");
//        String password= scanner.nextLine();
//
//        var users=ShopData.getUsers();
//        User user=users.get(login);
//
//        if(user!=null && user.checkPassword(password)){
//            user.setLoggedId(true);
//            currentUser=user;
//            System.out.println("Успешный вход!");
//        }else {
//            System.out.println("Неверный логин или пароль.");
//            currentUser=null;
//        }
//        return currentUser;
//    }
//
//    public void logout(){
//        if(currentUser!=null){
//            currentUser.setLoggedId(false);
//            System.out.println("Вы вышли из аккаунта.");
//        }
//        currentUser=null;
//    }
//    public  User getCurrentUser(){
//        return currentUser;
//    }
//
//    public boolean isLoggedId(){
//        return currentUser !=null && currentUser.isLoggedId();
//    }
//}

//25
//public class AuthService{
//    public static boolean userEzists(String email){
//        System.out.println("[AuthService] Проверяем существует ли пользователь: "+ email);
//        //Здесь могла быть проверка в БД
//        return email.equals("superadmin@mail.ru");
//    }
//}