/***
 * No.03 实现二维数组中的查找
 * @author Music
 *
 */
public class N03 {
	public static void main(String[] args) {
		int[][] mMartix = {{1,2,8,9},
						   {2,4,9,12},
						   {4,7,10,13},
						   {6,8,11,15}};
		System.err.println(find(mMartix, mMartix.length, mMartix[0].length, 7));
	}
	
	/**
	 * 
	 * @param martix 二维数组
	 * @param rows 行数
	 * @param columns 列数
	 * @param number 要查找的数
	 * @return 是否在数组中找到要查找的数
	 */
	public static boolean find(int[][] martix, int rows, int columns, int number){
		boolean found = false;
		if (martix != null && rows > 0 && columns > 0) {
			int row = 0;
			int column = columns - 1; // 从右上角开始查找
			while (row < rows && column >= 0) {
				if (martix[row][column] == number) {
					found = true;
					System.out.println("行数为：" + (row + 1) + ",列数为：" + (column + 1));
					break;
				}else if (martix[row][column] < number) {
					++row;
				}else {
					--column;
				}
			}
		}
		return found;
	}
}
