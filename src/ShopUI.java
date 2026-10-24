//2
//
//import java.util.*;
//
//public class ShopUI {
//    private final Scanner scanner = new Scanner(System.in);
//    private final AuthService authService = new AuthService(scanner);
//    private final Cart cart = new Cart();
//    private final Map<Integer, Product> productById = ShopData.getProductById();
//
//    public void run() {
//        boolean running = true;
//
//        while (running) {
//            printMenu();
//            System.out.print("Выберите операцию (код): ");
//            String code = scanner.nextLine().trim();
//
//            Operation op = Operation.fromCode(code);
//            if (op == null) {
//                System.out.println("Неверная команда.");
//                continue;
//            }
//
//            switch (op) {
//                case LOGIN -> authService.login();
//                case LOGOUT -> authService.logout();
//                case EXIT -> {
//                    running = false;
//                    System.out.println("До свидания!");
//                }
//                default -> {
//                    if (!authService.isLoggedId()) {
//                        System.out.println("Сначала войдите в аккаунт (1).");
//                        continue;
//                    }
//                    handleLoggedInOperation(op);
//                }
//            }
//        }
//    }
//
//    private void printMenu() {
//        System.out.println("\n=== МИНИ-ИНТЕРНЕТ-МАГАЗИН ===");
//        for (Operation op : Operation.values()) {
//            System.out.printf("%s. %s%n", op.getCode(), op.getDescription());
//        }
//        if (authService.isLoggedId()) {
//            System.out.println("Текущий пользователь: " + authService.getCurrentUser().getLogin());
//        } else {
//            System.out.println("Гость (не авторизован)");
//        }
//    }
//
//    private void handleLoggedInOperation(Operation op) {
//        switch (op) {
//            case VIEW_CATEGORIES -> showCategories();
//            case VIEW_PRODUCTS_BY_CATEGORY -> selectCategoryAndShowProducts();
//            case ADD_TO_CART -> addToCart();
//            case CHECKOUT -> checkout();
//            case VIEW_CART -> viewCart();
//            default -> System.out.println("Операция не реализована.");
//        }
//    }
//
//    private void showCategories() {
//        var cats = ShopData.getCategories();
//        if (cats.isEmpty()) {
//            System.out.println("Каталогов нет.");
//            return;
//        }
//        System.out.println("Доступные каталоги:");
//        for (Category c : cats) {
//            System.out.println("- " + c.getName());
//        }
//    }
//
//    private void selectCategoryAndShowProducts() {
//        System.out.print("Введите название каталога (точно как в списке): ");
//        String catName = scanner.nextLine().trim();
//
//        var cat = ShopData.getCategories().stream()
//                .filter(c -> c.getName().equalsIgnoreCase(catName))
//                .findFirst()
//                .orElse(null);
//
//        if (cat == null) {
//            System.out.println("Каталог не найден.");
//            return;
//        }
//
//        var products = cat.getProducts();
//        if (products.isEmpty()) {
//            System.out.println("В этом каталоге нет товаров.");
//            return;
//        }
//
//        System.out.println("Товары в каталоге '" + cat.getName() + "':");
//        for (Product p : products) {
//            System.out.println(p);
//        }
//    }
//
//    private void addToCart() {
//        System.out.print("ID товара для добавления: ");
//        int id = readInt();
//        Product p = productById.get(id);
//        if (p == null) {
//            System.out.println("Товар не найден.");
//            return;
//        }
//        if (p.getStock() <= 0) {
//            System.out.println("Товара нет в наличии.");
//            return;
//        }
//
//        System.out.print("Количество: ");
//        int qty = readInt();
//        if (qty <= 0 || qty > p.getStock()) {
//            System.out.println("Недопустимое количество.");
//            return;
//        }
//
//        cart.add(id, qty);
//        System.out.println("Добавлено в корзину: " + p.getName() + ", шт: " + qty);
//    }
//
//    private void viewCart() {
//        if (cart.isEmpty()) {
//            System.out.println("Корзина пуста.");
//            return;
//        }
//        System.out.println("Ваша корзина:");
//        double total = cart.calculateTotal(productById);
//        for (var e : cart.getItems().entrySet()) {
//            int id = e.getKey();
//            int qty = e.getValue();
//            Product p = productById.get(id);
//            if (p != null) {
//                System.out.printf("- %s, шт: %d, цена: %.2f, итого: %.2f%n",
//                        p.getName(), qty, p.getPrice(), p.getPrice() * qty);
//            }
//        }
//        System.out.printf("Общая сумма: %.2f руб.%n", total);
//    }
//
//    private void checkout() {
//        if (cart.isEmpty()) {
//            System.out.println("Корзина пуста. Нечего покупать.");
//            return;
//        }
//
//        viewCart();
//        System.out.print("Подтвердить покупку? (да/нет): ");
//        String confirm = scanner.nextLine().trim().toLowerCase();
//        if (!confirm.equals("да")) {
//            System.out.println("Покупка отменена.");
//            return;
//        }
//
//        // Здесь можно добавить логику списания остатков, сохранения заказа и т.д.
//        System.out.println("Заказ оформлен! Спасибо за покупку.");
//        cart.clear();
//    }
//
//    private int readInt() {
//        while (true) {
//            try {
//                return Integer.parseInt(scanner.nextLine().trim());
//            } catch (NumberFormatException e) {
//                System.out.print("Введите корректное число: ");
//            }
//        }
//    }
//}

