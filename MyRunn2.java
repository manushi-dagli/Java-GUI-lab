class MyRunn2 implements Runnable{
	public void run(){
		int i=0;
		while(true){
			System.out.println(i+" Manushi");
			i++;
		}
	}

	public static void main(String[] args){
		MyRunn2 r=new MyRunn2();
		Thread t=new Thread(r);
		t.start();
		int i=0;
		while(true){
			System.out.println(i+" Dagli");
			i++;
		}
	}
}
