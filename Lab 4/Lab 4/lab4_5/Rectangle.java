package lab4_5;
public final class Rectangle extends ClosedCurve implements Polygon {
	private final double width;
  private final double length;
	
	public Rectangle(double width, double length){
		this.width = width;
    this.length = length;
		
	}
	public double computeArea() {
		return width * length;
	}
	
	public int getNumberOfSides() {
		double side1, side2, side3, side4;
		side1=side2=width;
		side3=side4=length;
		double sides[] = {side1, side2, side3, side4};
		int sidesum = sides.length;
		return sidesum;
	}
  public double[] getArrayOfSides(){
    double sides[] = {width, width, length, length};
    return sides;
  }

}