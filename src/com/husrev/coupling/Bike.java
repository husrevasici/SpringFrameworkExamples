package com.husrev.coupling;

public class Bike implements Vehicle {

	@Override
	public String aracVer(String marka) {
		System.out.println(marka+" marka bir bisikler aldiniz.");
		return marka;
	}
}
