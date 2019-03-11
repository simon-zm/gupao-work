package day02.singleton.hungry;

/**
 * 
 * @��������
 * ����ʽ����
 * 1.������ص�ʱ���������ʼ����������ʵ��
 * 
 * �ŵ㣺
 * û�м�����ִ��Ч�ʸߣ��û��������
 * �̰߳�ȫ
 * ȱ�㣺
 * ����ʹ����񣬶����ʼ�����˷���Դ�ռ�
 * 
 */
public class HungrySingleton
{
	private HungrySingleton()
	{
	}

	private static final HungrySingleton instance = new HungrySingleton();

	public static HungrySingleton getInstance()
	{
		return instance;
	}
}
