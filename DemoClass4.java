class DemoClass4 implements Demo5,Demo6
{
	public void m3()
	{
		Demo5.super.m3();
		Demo6.super.m3();
	}
}