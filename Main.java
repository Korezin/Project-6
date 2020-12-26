package project6;

public class Main {
	public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle();
        System.out.println(rectangle.toString());
        if (rectangle.simular()) {
        	rectangle.moveUp();
        	rectangle.moveDown();
        	rectangle.moveLeft();
        	rectangle.moveRight();
        }
        System.out.println(rectangle.toString());
        System.out.println(rectangle.simular());
    }
}
