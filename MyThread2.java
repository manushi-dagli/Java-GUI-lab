class MyThread extends Thread{
	public void run(){
		int i=0;
		while(true){
			System.out.println(i+" Manushi");
			i++;
		}
	}
}
class MyThread2{
	public static void main(String[] args){
		MyThread t=new MyThread();
		t.start();
		int i=0;
		while(true){
			System.out.println(i+" Dagli");
			i++;
		}
	}
}
