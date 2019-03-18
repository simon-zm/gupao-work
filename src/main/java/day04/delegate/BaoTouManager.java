package day04.delegate;

import java.util.HashMap;
import java.util.Map;

public class BaoTouManager implements IWorker
{
	private Map<String, IWorker> tagets = new HashMap<String, IWorker>();

	public Map<String, IWorker> getTagets()
	{
		return tagets;
	}

	public void setTagets(Map<String, IWorker> tagets)
	{
		this.tagets = tagets;
	}

	public BaoTouManager()
	{
		tagets.put("��ǽ", new TiQiangWorker());
		tagets.put("��ˮ��", new ShuiNiWork());
	}

	public void doSome(String doType)
	{
		this.getTagets().get(doType).doSome(doType);
	}
}
