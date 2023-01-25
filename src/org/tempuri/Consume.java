package org.tempuri;

public class Consume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		CalculatorSoap port = cal.getCalculatorSoap();
		
		System.out.println(port.add(1, 1));

	}

}
