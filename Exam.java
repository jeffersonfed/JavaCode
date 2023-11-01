public class Exam {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] point = {
				{100,80,95,100},
				{85,70,90,85},
				{94,60,55,70},
				{31,20,15,90},
				{42,30,20,80},
		};
		
		// 全体合計と平均
		int sum = 0;
		int avg = 0; // 今回は指定がないので整数でも小数でも良い
		
		// 個人合計と平均
		int parsonalSum = 0;
		int parsonalAvg = 0; // 今回は指定がないので整数でも小数でも良い

		// 行ループ(人単位のループ)
		for(int row = 0; row < point.length; row++) {
			//rowが0行目(1人目)～4行目(5人目)まで繰り返される
			//point.lengthを使って行の要素数が変動しても対応できるように書くこと
				System.out.println((row+1)+
					point[row].length);
				
			// 個人の合計は1人ずつ0から数える
			parsonalSum = 0;
			
			// 列ループ(〇回目テスト単位のループ)
			for(int col = 0; col < point[row][col]; col++) {
				// 0番目(1回目テスト)～3番目(4回目テスト)まで繰り返される
				// 各行の列の要素数を見るためpoint[row].length
				System.out.println((col+1)+point[row][col]);
				// (row+1)人目の(col+1)回目テストの点数はpoint[row][col]に入っている
				// 個人の合計を集計
				parsonalSum += point[row][col];
				// 全体の合計にも集計
				sum += point[row][col];
			}
			
			// 列ループ(〇回目テスト単位のループ)を抜けたら1人分の個人合計が出ているはず
			// 個人合計から個人平均を計算　今回は指定がないので、小数でも整数でも良い
			// 各行の列の要素数は point[row].length なので注意
			parsonalAvg = parsonalSum / 4;
			// 個人の平均を1人分ずつ表示
			System.out.println((row + 1) + "人目の平均:" + parsonalAvg);
		}
		avg = sum / (point[row].length*point[row][col]);
		// 全体の平均を表示
		System.out.println("全体の平均:" + avg);
		

	}

}
