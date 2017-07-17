/***
 * No.03 ʵ�ֶ�ά�����еĲ���
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
	 * @param martix ��ά����
	 * @param rows ����
	 * @param columns ����
	 * @param number Ҫ���ҵ���
	 * @return �Ƿ����������ҵ�Ҫ���ҵ���
	 */
	public static boolean find(int[][] martix, int rows, int columns, int number){
		boolean found = false;
		if (martix != null && rows > 0 && columns > 0) {
			int row = 0;
			int column = columns - 1; // �����Ͻǿ�ʼ����
			while (row < rows && column >= 0) {
				if (martix[row][column] == number) {
					found = true;
					System.out.println("����Ϊ��" + (row + 1) + ",����Ϊ��" + (column + 1));
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
