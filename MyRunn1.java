class MyRunn implements Runnable{
	public void run(){
		int i=0;
		while(true){
			System.out.println(i+" Manushi");
			i++;
		}
	}
}
class MyRunn1{
	public static void main(String[] args){
		MyRunn r=new MyRunn();
		Thread t=new Thread(r);
		t.start();
		int i=0;
		while(true){
			System.out.println(i+" Dagli");
			i++;
		}
	}
}
