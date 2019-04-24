package com.javaeight;

interface Calculator{
	void switchOn();
	
}

class Java8Demo {
	
	
	public static void main(String[] arg) {
	//(parameter) -> {body}
		Calculator calculator=()->{
		System.out.println("Switch On");
	};
	calculator.switchOn();
	
}
	}

