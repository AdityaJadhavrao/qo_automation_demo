package try_automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.annotations.BeforeMethod;



public class Shell_script extends BaseClass{
	
	public void run_shell_script() throws IOException, InterruptedException
	{
		{
			String projectDir = System.getProperty("user.dir");
			String scriptPath = projectDir+"";
			
			ProcessBuilder processbuilder = new ProcessBuilder("/bin/bash",scriptPath);
			Process process = processbuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			while((line=reader.readLine())!=null)
			{
				System.out.println(line);
			}
			int exitcode = process.waitFor();
		}
	}
}