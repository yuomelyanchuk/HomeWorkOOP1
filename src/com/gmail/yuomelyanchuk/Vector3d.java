package com.gmail.yuomelyanchuk;

public class Vector3d {
	private double x;
	private double y;
	private double z;

	public Vector3d() {
		super();
	}

	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

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

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Vector3d sumVectors(Vector3d vecOne, Vector3d vecTwo) {
		Vector3d vecRez = new Vector3d();
		vecRez.setX(vecOne.getX() + vecTwo.getX());
		vecRez.setY(vecOne.getY() + vecTwo.getY());
		vecRez.setZ(vecOne.getZ() + vecTwo.getZ());
		return (vecRez);
	}
	public double scalarProduct(Vector3d vecOne, Vector3d vecTwo){
		return(vecOne.getX()*vecTwo.getX()+vecOne.getY()*vecTwo.getY()+vecOne.getZ()*vecTwo.getZ());
	}
	public Vector3d vectorProduct(Vector3d vecOne, Vector3d vecTwo) {
		Vector3d vecRez = new Vector3d();
		vecRez.setX(vecOne.getY()*vecTwo.getZ() - vecOne.getZ()*vecTwo.getY());
		vecRez.setY(vecOne.getZ()*vecTwo.getX() - vecOne.getX()*vecTwo.getZ());
		vecRez.setZ(vecOne.getX()*vecTwo.getY() - vecOne.getY()*vecTwo.getX());
		return (vecRez);
	}

	@Override
	public String toString() {
		return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	

}
