/**
 * No.04 �滻�ո�
 * @author Music
 *
 */
public class N04 {
	public static void main(String[] args) {
		String str = "we are happy";
		System.out.println(replaceBlank(str.toCharArray()));
	}
	/**
	 * 
	 * @param string ���滻���ַ���
	 */
	public static String replaceBlank(char string[]){
		if (string == null) {
			return "";
		}
		int originalLength = 0;//�ַ���ʵ�ʳ���
		int numberOfBlank = 0;
		int i = 0;
		while (i < string.length) {
			++originalLength;
			if (string[i] == ' ') {
				++numberOfBlank;
			}
			++i;
		}
		//newLength Ϊ�ѿո��滻Ϊ'%20'֮��ĳ���
		int newLength = originalLength + numberOfBlank * 2;
		int indexOfOriginal = originalLength - 1;
		int indexOfNew = newLength - 1;
		char[] newString = new char[newLength];
		while (indexOfOriginal >= 0 && indexOfNew >= indexOfOriginal) {
			if (string[indexOfOriginal] == ' ') {
				newString[indexOfNew --] = '0';
				newString[indexOfNew --] = '2';
				newString[indexOfNew --] = '%';
			} else {
				newString[indexOfNew --] = string [indexOfOriginal];
			}
			-- indexOfOriginal;
		}
		return new String(newString);
	}
}
