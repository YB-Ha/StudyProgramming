package c.inner;

public class NestedValueReference
{
	public int publicInt = 0;
	protected int protectedInt = 1;
	int justInt = 2;
	private int privateInt = 3;

	static int staticInt = 4;
	static class NestedClass
	{
		public void setValue()
		{
			staticInt = 14;
		}
	}

	class Inner
	{
		public void setValue()
		{
			publicInt = 10;
			protectedInt = 11;
			justInt = 12;
			privateInt = 13;
			staticInt = 24;
		}
	}

	public void setValue()
	{
		EventListener listener = new EventListener(){
			public void onClick()
			{
				publicInt = 30;
				protectedInt = 31;
				justInt = 32;
				privateInt = 33;
				staticInt = 34;
			}
		}
	}
}
