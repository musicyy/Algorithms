/**
 * No.04 替换空格
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
	 * @param string 被替换的字符串
	 */
	public static String replaceBlank(char string[]){
		if (string == null) {
			return "";
		}
		int originalLength = 0;//字符串实际长度
		int numberOfBlank = 0;
		int i = 0;
		while (i < string.length) {
			++originalLength;
			if (string[i] == ' ') {
				++numberOfBlank;
			}
			++i;
		}
		//newLength 为把空格替换为'%20'之后的长度
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
