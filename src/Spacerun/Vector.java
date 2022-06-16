package Spacerun;
public class Vector {
public double x;
public double y;
public Vector() {
	this.set(0, 0);
}
public Vector(double x,double y) {
	this.set(x, y);
}
public void set(double x,double y) {
	this.x=x;
	this.y=y;
}
public void add(double dx,double dy) {
	this.x+=dx;
	this.y+=dy;
}
public void multiply(double m) {
	this.x*=m;
	this.y*=m;
}
public double getlength() {
	return Math.sqrt(this.x*this.x+this.y*this.y);
}
public void setlength(double L) {
	double currentLength = this.getlength();
	if(currentLength==0) {
	this.set(L, 0);
	}
	else {
	this.multiply(1/currentLength);
	this.multiply(L);
}
	}
public double getAngle() {
	return Math.toDegrees(Math.atan2(this.y, this.x));
}
public void setAngle(double angle) {
	double L = this.getlength();
	double angleRadians = Math.toRadians(angle);
	this.x=L*Math.cos(angleRadians);
	this.y=L*Math.sin(angleRadians);	
}

}
