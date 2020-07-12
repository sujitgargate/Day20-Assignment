public class charge{

	private final double rx,ry;
	private final double q;
	public charge(double x0,double y0,double q0){
		rx=x0;ry=y0;q=q0;
	}
	
	public double potentialAt(double x,double y){
		double k=8.99;
		double dx=x-rx;
		double dy=y-ry;
		return k*q/Math.sqrt(dx*dx + dy*dy);
	}
	public String toString(){
	return " rx: "+rx+ " ry "+ry+ " q "+q;
	}
	public static void main(String args[]){
	
	double x =Double.parseDouble(args[0]);
	double y =Double.parseDouble(args[1]);
	charge c1 =new charge(0.51,0.63,21.3);
	charge c2 =new charge(0.21,0.33,11.3);
	double v1=c1.potentialAt(x,y);
	double v2=c2.potentialAt(x,y);
	System.out.println("V1"+v1+" "+"V2"+v2);
	System.out.println("c1"+c1+" "+"c2"+c2);
	}
}
