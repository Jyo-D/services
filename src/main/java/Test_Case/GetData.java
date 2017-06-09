package Test_Case;

import java.util.LinkedHashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

import UTILEXC.ExcelUti;
import Utility.GetClass;
import Utility.JasonHandler;
import Utility.PostClass;

public class GetData {
	
	
	public static LinkedHashMap map=new LinkedHashMap();
	public static JSONParser parser = new JSONParser();
	
	@Test
	public static void test() throws Exception{
	ExcelUti.setExcel("D://Rest-Assured//com.services//src//main//java//TestData//TestData.xlsx", "GetData");
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
	
    
	GetClass.GET("table","DEPT0119");
	
	 JSONObject jsonObject = (JSONObject) GetClass.response;
     
     
     
     JSONArray arry_cont = (JSONArray) jsonObject.get("lookupColumns");
    
    // option for itterating objects 
      for(Object o: arry_cont){
    
         System.out.println(o);
     }
  
    
     for(int i=0;i<arry_cont.size();i++)
     {
     jsonObject=(JSONObject)arry_cont.get(i);
     System.out.println("have the displayName value === "+jsonObject.get("displayName"));
     System.out.println("have the displayName value === "+jsonObject.get("columnName"));
     System.out.println("have the displayName value === "+jsonObject.get("searchable"));
     }

}}
