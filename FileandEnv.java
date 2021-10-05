package Utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileandEnv {
	public static Map<String,String> fileandenv=new HashMap<String,String>();
	public static Properties propMain=new Properties();
	public static Properties propSet=new Properties();
	
	public static Map<String,String> envANdFile(){
		String env=System.getProperty("env");
		if(env.equalsIgnoreCase("dev")) {
			try {
				FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/dataprovider/dataproviders.properties");
				fileandenv.put("ServerUrl",propMain.getProperty("ServerUrl"));
				fileandenv.put("portNo",propMain.getProperty("portNo"));
				fileandenv.put("username",propMain.getProperty("username"));
				fileandenv.put("password",propMain.getProperty("password"));
				
			
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return fileandenv;
	}
	private static Map<String, String> envAndFile() {
		// TODO Auto-generated method stub
		if(fileandenv==null) {
			fileandenv=envAndFile();
		}
		return fileandenv;
	}






}
