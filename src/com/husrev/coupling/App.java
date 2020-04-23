package com.husrev.coupling;

public class App {

	public static void main(String[] args) {

		Traveller t = new Traveller(new Car());
		t.yolculugaBasla();
	}
}
