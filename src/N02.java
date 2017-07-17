/**
 * No.02 ʵ��SingleTonģʽ
 * @author Music
 *
 */
public class N02 {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
	}

}

/**
 * ���þ�̬�ڲ���ʵ���̰߳�ȫ�ĵ���ģʽ �Ƽ�ʹ�ô˷����������� �������������ᵽ�˴˷���
 * 
 * ͨ������ʵ�������ñ��������ھ�̬�ڲ����������If���������жϣ� ��JVM��֤�̰߳�ȫ��
 * 
 * @author Music
 */
class Singleton {
	private Singleton() {
	}

	// ��̬�ڲ���
	static class NestClass {
		private static Singleton instance;
		static {
			// ����һ������getInstance()������ʱ��
			// ���ʾ�̬�ڲ����еľ�̬��Ա��������ʱ��Ҫ���þ�̬����顣
			// �ٴη���getInstance()������ֱ�ӷ���instance���á�
			System.out.println("instance = new Singleton()");
			instance = new Singleton();
		}
	}

	public static Singleton getInstance() {
		return NestClass.instance;
	}

}