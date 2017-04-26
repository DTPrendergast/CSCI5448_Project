package model;

public abstract class RobotFactory
{
	public static Robot createRobot(String robotType)
	{
		Robot robot = null;
		
		if (robotType=="Forklift")
		{
			robot = new Forklift();
		}
		else if (robotType=="RetBot")
		{
			robot = new RetBot();
		}		
		return robot;
	}
}
