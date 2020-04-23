package com.husrev.coupling;

public class Car implements Vehicle {

	@Override
	public String aracVer(String marka) {
		System.out.println(marka + " marka bir araba aldiniz");
		return marka;
	}
}
