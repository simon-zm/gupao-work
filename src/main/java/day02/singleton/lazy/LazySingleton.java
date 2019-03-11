package day02.singleton.lazy;

/**
 * 
 * ����ʽ������ֻ���ڵ��õ�ʱ��Żᱻ��ʼ��
 * �ŵ㣺��ʡ��Դ
 * ȱ�㣺����д���̲߳���ȫ
 */
public class LazySingleton
{
	private LazySingleton()
	{
	}

	private static LazySingleton instance = null;

	public static LazySingleton getInstance()
	{
		if (null == instance)
		{
			return new LazySingleton();
		}
		return instance;
	}
}
