package com.calculadora.v6;

public class Division extends Operacion {
	
	Division(int x, int y) {
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return x / y;
	}
	
	@Override
	public String toString() {
		return "Division [x=" + x + ", y=" + y + "]";
	}

}