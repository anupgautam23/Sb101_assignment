package C3_Evaluation.Que1;

public class ThreadB extends Thread{
	
	A a;
	B b;
	
	public ThreadB(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		b.funB(a);
		
	}
	
	
}
