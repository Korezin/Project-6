package project6;

public class MovablePoints implements Movable{
	 public int x, y, xSpeed, ySpeed;
	 
	 public MovablePoints(int x, int y, int xSpeed, int ySpeed) {
		 this.x = x;
		 this.y = y;
		 this.xSpeed = xSpeed;
		 this.ySpeed = ySpeed;
		 }
	 
	 @Override
	 public String toString() {
		 return "x = " + x + "\n" + "y = " + y + "\n" + 
	 "xSpeed = " + xSpeed + "\n" + "ySpeed = " + ySpeed + "\n";
	    }
	
	 @Override
	public void moveUp() {
		y += ySpeed;
	}

	@Override
	public void moveDown() {
		y -= ySpeed;
	}

	@Override
	public void moveLeft() {
		x -= xSpeed;
	}

	@Override
	public void moveRight() {
		x += xSpeed;
	}

}
