package stream_FilterStream;

import java.io.Serializable;

@SuppressWarnings("serial") 
public class Point implements Serializable{

	private int x;
	private int y;

	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	@Override
	public String toString() {
		return "Point ("+x+","+y+")"; 
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public static void main(String[] args) {
		
		Point p = new Point(10, 20);
		System.out.println(p.getX());
		System.out.println(p.getY());
		
	}


}

