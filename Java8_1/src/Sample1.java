class car
{
	 int num;
	 double gas;
}

public class Sample1 
{

	
	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ
		car car1;
		car1 = new car();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("車のナンバーは" + car1.num + "です。");
		System.out.println("ガソリンは" + car1.gas + "です。");
	}

}
