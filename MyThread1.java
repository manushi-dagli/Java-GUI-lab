class MyThread1 extends Thread{
	public void run(){
		int i=0;
		while(true){
			System.out.println(i+" Manushi");
			i++;
		}
	}
	public static void main(String[] args){
		MyThread1 t=new MyThread1();
		t.start();
		int i=0;
		while(true){
			System.out.println(i+" Dagli");
			i++;
		}
	}
}
