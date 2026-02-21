public class Client {
    public static void main(String[] args) {

        Beverage tea = new Tea();
        tea.prepareBeverage();

        System.out.println("-----");

        Beverage coffee = new Coffee();
        coffee.prepareBeverage();
    }
}
