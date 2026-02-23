package com.flyweight.src;

public class TreeType {
    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }

    // Simulate drawing the tree type at a given location
    public void draw(int x, int y) {
        System.out.println("Drawing '" + name + "' (color=" + color + ", texture=" + texture + ") at (" + x + "," + y + ")");
    }
}
