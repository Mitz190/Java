package b;

class Bank {
	public int getRateOfInterest() {
		return 0;
	}
}

class Axis extends Bank{
	@Override
	public int getRateOfInterest() {
		return 6;
	}
}

class BOI extends Bank{
	@Override
	public int getRateOfInterest() {
		return 8;
	}
}

public class Main {
public static void main(String[] args) {
	Bank b;
	
	b= new Axis();
	System.out.println(b.getRateOfInterest());
}
}
