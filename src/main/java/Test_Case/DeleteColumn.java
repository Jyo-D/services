package Test_Case;

import java.util.LinkedHashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

import UTILEXC.ExcelUti;
import Utility.GetClass;

public class DeleteColumn {
	
	public static LinkedHashMap map=new LinkedHashMap();
	public static JSONParser parser = new JSONParser();
	
	@Test
	public static void test() throws Exception{
	ExcelUti.setExcel("D://Rest-Assured//com.services//src//main//java//TestData//TestData.xlsx", "DeleteColumn");
	GetClass.APIUrl = ExcelUti.getCellValue(1, 0);
	System.out.println(GetClass.APIUrl);
	
	ExcelUti.lastrow1(0, 0);
    System.out.println(ExcelUti.lastrow);
    for(int i=1;i<=ExcelUti.lastrow-1;i++)
    {
    	String key=ExcelUti.getCellValue(i, 1);
    	System.out.println("key="+key);
    	String value=ExcelUti.getCellValue(i, 2);
    	System.out.println("value="+value);
    	map.put(key, value);}
	
    
	GetClass.GET("columnID","40");

}

}
