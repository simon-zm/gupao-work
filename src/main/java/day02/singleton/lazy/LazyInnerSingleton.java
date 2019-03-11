package day02.singleton.lazy;

// ����ʽ����:�ڲ���÷�ʽʵ��
// �ŵ㣺
// �ӳټ��أ�ֻ���ڵ��õ�ʱ��Ż��ʼ��
public class LazyInnerSingleton
{
	private LazyInnerSingleton()
	{
	}

	public static LazyInnerSingleton getInstance()
	{
		return SingleHolder.INSTANCE;
	}

	private static class SingleHolder
	{
		private static final LazyInnerSingleton INSTANCE =
				new LazyInnerSingleton();
	}
}
