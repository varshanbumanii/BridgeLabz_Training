package core_programming.programmingelements.level1;

public class volume {
	public static void main(String[] args) {
		double rad=6378;
		double areainkm = (4.0/3.0)*3.14*Math.pow(rad, 3);
		double areainmile = (4.0/3.0)*3.14*Math.pow(rad/1.6,3);
		System.out.println("Area in Kms : "+areainkm+" Area in Miles: "+areainmile);
	}

}
