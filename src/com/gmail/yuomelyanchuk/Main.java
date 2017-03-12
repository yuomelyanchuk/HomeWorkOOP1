package com.gmail.yuomelyanchuk;

public class Main {

	public static void main(String[] args) {

		System.out.println("Vector3d");
		Vector3d vecOne = new Vector3d(1.5, 2.5, 3.3);
		Vector3d vecTwo = new Vector3d(4.5, 5.2, 6.3);
		System.out.println("sum vectors=" + vecOne.sumVectors(vecOne, vecTwo).toString());
		System.out.println("scalar product=" + vecOne.scalarProduct(vecOne, vecTwo));
		System.out.println("vector product=" + vecOne.vectorProduct(vecOne, vecTwo).toString());

		System.out.println(System.lineSeparator() + "Phone and Network");
		Network net = new Network();
		Phone ph = new Phone("ggg-5s", 5);
		Phone ph2 = new Phone("ggg-6s", 6);
		Phone ph3 = new Phone("ggg-7s", 7);
		Phone ph4 = new Phone("ggg-7s", 7);
		ph.registerInNetwork(net);
		ph2.registerInNetwork(net);
		ph3.registerInNetwork(net);
		ph4.registerInNetwork(net);
		ph2.makeCall(5);
		ph2.makeCall(7);
		ph.makeCall(7);
		ph4.makeCall(5);

	}

}
