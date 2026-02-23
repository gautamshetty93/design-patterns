package com.flyweight.src;

public class Client {
    public static void main(String[] args) {
        Forest forest = new Forest();

        // Simulate planting trees in a game world. Many trees share the same TreeType instance.
        forest.plantTree(10, 20, "Oak", "Green", "Rough");
        forest.plantTree(15, 25, "Pine", "DarkGreen", "Needles");
        forest.plantTree(10, 30, "Oak", "Green", "Rough");
        forest.plantTree(200, 300, "Cherry", "Pink", "Blossom");
        forest.plantTree(210, 305, "Cherry", "Pink", "Blossom");
        forest.plantTree(400, 100, "Oak", "Green", "Rough");

        System.out.println("Total trees planted: " + forest.getTreeCount());
        System.out.println("Total distinct TreeTypes (flyweights) used: " + TreeFactory.getTreeTypeCount());

        System.out.println("Drawing forest:");
        forest.draw();
    }
}
