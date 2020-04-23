package com.husrev.coupling;

public class Traveller {

	private Vehicle v;

	public Traveller(Vehicle v) {
		this.v = v;
	}

	public void yolculugaBasla() {
		String yolculukAraci = v.aracVer("Honda");
		System.out.println("yolculugunuz baslamak uzere");
		System.out.println(yolculukAraci + " ile yolculugumuz baslamistir.");
	}

}
