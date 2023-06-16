class Sd{
	synchronized void display(String str){
		
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
		}
		
		
	}
}

class T1 extends Thread{
	Sd d1=new Sd();
	public void run(){
		d1.display("Hello");
	}
}

class T2 extends Thread{
	Sd d2=new Sd();
	public void run(){
		d2.display("Manushi");
	}
}

class SharedObjectTest{
	public static void main(String[] args){
		Sd sd=new Sd();
		T1 thread1=new T1();
		T2 thread2=new T2();
		thread1.start();
		thread2.start();
	}
}