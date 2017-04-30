package model;

public abstract class RobotFactory
{
	public static Robot createRobot(String robotType)
	{
		Robot robot = null;
		
		if (robotType.equals("Forklift"))
		{
			robot = new Forklift();
		}
		else if (robotType.equals("RetBot"))
		{
			robot = new RetBot();
		}		
		return robot;
	}
}
