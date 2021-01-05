package U11_one_star;

import java.util.*;

public class S11_15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] p = new Point[999];
		for(int i=0;i<n;++i) {
			p[i] = new Point();
			p[i].setX(sc.nextDouble());
			p[i].setY(sc.nextDouble());
		}
		System.out.println(getPS(p, n));
	}
	
	public static double getS(Point a,Point b,Point c)    
	  {  
	      return ((b.getX() - a.getX()) * (c.getY() - a.getY()) - (b.getY() - a.getY()) * (c.getX() - a.getX())) / 2; //应用叉积的定义推出的 
	  }

	public static double getPS(Point p[], int n)    
	 {
	     double sumS = 0;
	     for(int i = 1; i <= n - 2; i++)
	         sumS += getS(p[i-1], p[i], p[i + 1]);
	     return sumS;
	 }
}

class Point{
	private double x = 0;
	private double y = 0;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}