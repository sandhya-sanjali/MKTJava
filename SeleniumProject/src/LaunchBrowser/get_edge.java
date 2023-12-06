package LaunchBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class get_edge 
{

	public static void main(String[] args)
	{
		EdgeDriver e1=new EdgeDriver();
		e1.get("https://www.google.co.in/");
	}

}
