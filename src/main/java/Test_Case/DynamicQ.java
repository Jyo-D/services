package Test_Case;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;

import UTILEXC.ExcelUti;
import Utility.PostClass;

public class DynamicQ {
	
	public static String APIBody="0";
	public static LinkedHashMap map=new LinkedHashMap();
	
	
	@Test
	public static void test() throws Exception{
	ExcelUti.setExcel("D://Rest-Assured//com.services//src//main//java//TestData//TestData.xlsx", "DynamicQ");
	PostClass.APIUrl = ExcelUti.getCellValue(1, 0);
	System.out.println("API url "+PostClass.APIUrl);
	//APIBody=ExcelUti.getCellValue(1, 3);
	
    ExcelUti.lastrow1(0, 0);
    System.out.println(ExcelUti.lastrow);
    for(int i=1;i<=ExcelUti.lastrow-1;i++)
    {
    	String key=ExcelUti.getCellValue(i, 1);
    	System.out.println("key="+key);
    	String value=ExcelUti.getCellValue(i, 2);
    	System.out.println("value="+value);
    	map.put(key, value);}
	
    
	PostClass.POST_query("path","DEPT03");
	
	
    
    
	}
	

}
