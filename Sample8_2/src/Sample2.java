
class car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリンは" + gas + "です。");
	}
}
public class Sample2 {

	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ
		car car1;
		car1 = new car();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
	}

}
