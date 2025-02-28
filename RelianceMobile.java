class RelianceMobile
{
	private Sim r = new IdeaSim();
	
	public  RelianceMobile()
	{
		startMobile();
		r.startSim();
	}
	private void startMobile()
	{
		System.out.println("Welcome to the Reliance Mobile");
	}
}