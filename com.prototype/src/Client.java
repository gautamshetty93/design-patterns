public class Client {

    public static void main(String[] args) {

        Employee original = new Employee("Gautam", "Engineering", 80000);

        // Clone the object
        Employee cloned = (Employee) original.clone();
        cloned.setName("Rahul");

        System.out.println("Original: " + original);
        System.out.println("Cloned  : " + cloned);
    }
}