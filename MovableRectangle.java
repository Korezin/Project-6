package project6;
import java.util.Scanner;
public class MovableRectangle extends Rectangle implements Movable{
	MovablePoints leftUp;
    MovablePoints rightDown;
    
    public MovableRectangle() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("leftUp: ");
    	System.out.print("x = ");
    	int x = scan.nextInt();
    	System.out.print("y = ");
    	int y = scan.nextInt();
    	System.out.print("xSpeed = ");
    	int xSpeed = scan.nextInt();
    	System.out.print("ySpeed = ");
    	int ySpeed = scan.nextInt();
        this.leftUp = new MovablePoints(x, y, xSpeed, ySpeed);
        System.out.println();
        System.out.println("rightDown: ");
    	System.out.print("x = ");
    	x = scan.nextInt();
    	System.out.print("y = ");
    	y = scan.nextInt();
    	System.out.print("xSpeed = ");
    	xSpeed = scan.nextInt();
    	System.out.print("ySpeed = ");
    	ySpeed = scan.nextInt();
        this.rightDown = new MovablePoints(x, y, xSpeed, ySpeed);
    }
    
    @Override
    public void moveUp() {
    	if (leftUp.ySpeed > 0 && rightDown.ySpeed > 0) {
    		leftUp.moveUp();
    		rightDown.moveUp();
    	}
    }
    
    @Override
    public void moveDown() {
    	if (leftUp.ySpeed < 0 && rightDown.ySpeed < 0) {
    		leftUp.moveDown();
    		rightDown.moveDown();
    	}
    }
    
    @Override
    public void moveLeft() {
    	if (leftUp.xSpeed < 0 && rightDown.xSpeed < 0) {
    		leftUp.moveLeft();
    		rightDown.moveLeft();
    	}
    }
    
    @Override
    public void moveRight() {
    	if (leftUp.xSpeed > 0 && rightDown.xSpeed > 0) {
    		leftUp.moveRight();
    		rightDown.moveRight();
    	}
    }
    
    public boolean simular() {
        if (leftUp.xSpeed == rightDown.xSpeed && leftUp.ySpeed == rightDown.ySpeed) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String toString() {
        return "\nMovableRectangle: \n" + "leftUp\n" + leftUp + 
        		"\n" + "rightDown\n" + rightDown;
    }
}
