class Comm{
	int value=0;
	boolean flag=true;
	synchronized int get(){
		int val;
		while(flag!=false) 
			wait();
		val=value;
		flag=true;
		notify();
		return val;
	}
	synchronized void set(int x){
		while(flag!=true) 
			wait();
		
		value=x;
		flag=false;
		notify();
	}
	
	
}

class Consumer extends Thread{
	Comm comm1=new Comm();
	public void run(){
		
		int i=1;
		while(true){
			comm1.get();
			System.out.println("Consumer: "+i);
			i++;
		}
		
	}
}

class Producer extends Thread{
	Comm comm2=new Comm();
	public void run(){
		int i=1;
		while(true){
			comm2.set(i);
			System.out.println("Producer: "+i);
			i++;
		}
		
	}
}

class InterComm{
	public static void main(String[] args){
		Comm c1=new Comm();
		Consumer c=new Consumer();
		Producer p=new Producer();
		c.start();
		p.start();
	}
}