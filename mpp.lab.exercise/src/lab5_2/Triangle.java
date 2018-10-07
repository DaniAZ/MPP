package lab5_2;

public final class Triangle implements figure {
    private final double base;
    private final double height;
    Triangle(double base,double height)
    {
    	this.base=base;
    	this.height=height;
    }
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}

}
