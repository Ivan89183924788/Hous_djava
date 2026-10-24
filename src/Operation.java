//2
//public enum Operation {
//    LOGIN("1","Войти в аккаунт"),
//    VIEW_CATEGORIES("2","Просмотр списка каталогов товаров"),
//    VIEW_PRODUCTS_BY_CATEGORY("3","Просмотр товаров каталога"),
//    ADD_TO_CART("4","Добавить товар в корзину"),
//    CHECKOUT("5","Покупка товара из корзины"),
//    VIEW_CART("6","Просмотр корзины"),
//    LOGOUT("7","Выйти из аккаунта"),
//    EXIT("0","Выход из программы");
//
//    private final String code;
//    private final String description;
//
//    Operation(String code,String description){
//        this.code=code;
//        this.description=description;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public static Operation fromCode(String code){
//        for (Operation op:values()){
//            if (op.code.equals(code)){
//                return op;
//            }
//        }
//        return null;
//    }
//}
