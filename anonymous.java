/*class Test{
	public static void main(String[] args) {
		
		paneer p = new paneer();
		p.paneer();
		paneer p1 = new paneer(){
			public void paneer()
			{
				System.out.println("extra spicy");
			}
		};
		p1.paneer();
	}
}

class paneer{
	public void paneer()
	{
		System.out.println("normal");
	}  
}*/


class Test
{
	public static void main(String[] args) {
		
		Thread t = new Thread(){
			public void run(){
				int i = 1;
				while(true)
				{
					try{
						Thread.sleep(500);
					}
					catch(Exception e){

					}
					System.out.println(++i);

				}
			}

		};
		t.start();
		for (int i=1;i<=5;i++) {
			System.out.println("hitesh ");
 		}
	}
}