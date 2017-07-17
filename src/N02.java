/**
 * No.02 实现SingleTon模式
 * @author Music
 *
 */
public class N02 {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
	}

}

/**
 * 利用静态内部类实现线程安全的单例模式 推荐使用此方法构建单例 在美团面试中提到了此方法
 * 
 * 通过将单实例的引用变量定义在静态内部类里，不用做If条件进行判断， 由JVM保证线程安全。
 * 
 * @author Music
 */
class Singleton {
	private Singleton() {
	}

	// 静态内部类
	static class NestClass {
		private static Singleton instance;
		static {
			// 当第一次引用getInstance()方法的时候，
			// 访问静态内部类中的静态成员变量，此时需要调用静态代码块。
			// 再次访问getInstance()方法会直接返回instance引用。
			System.out.println("instance = new Singleton()");
			instance = new Singleton();
		}
	}

	public static Singleton getInstance() {
		return NestClass.instance;
	}

}