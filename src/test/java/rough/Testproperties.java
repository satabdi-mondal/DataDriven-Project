package rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testproperties {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		Properties config = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
        config.load(fis);
        System.out.println(config.getProperty("browser"));
    	Properties OR = new Properties();
		FileInputStream fR = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
        config.load(fR);
        System.out.println(config.getProperty("bmlBtn_CSS"));
	}

}
