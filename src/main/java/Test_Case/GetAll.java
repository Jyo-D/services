package Test_Case;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;

import UTILEXC.ExcelUti;
import Utility.GetClass;
import Utility.JasonHandler;
import Utility.PostClass;
public class GetAll {
	
	
	public static LinkedHashMap map=new LinkedHashMap();
	public static JSONParser parser = new JSONParser();
	
	@Test
	public static void test() throws Exception{
	ExcelUti.setExcel("D://Rest-Assured//com.services//src//main//java//TestData//TestData.xlsx", "GetAll");
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
	
    
	GetClass.GET();
	
/*	File file=new File("D://resp.json");
	FileInputStream fis=new FileInputStream(file);
	FileOutputStream fos=new FileOutputStream(file);
	byte[] contentInBytes = GetClass.response.getBody().asString().getBytes();
	fos.write(contentInBytes);
	
	Object obj = parser.parse(new FileReader("D://resp.json"));

    JSONObject jsonObject = (JSONObject) obj;
	
    /*String response=GetClass.response.getBody().asString();
    JSONObject res = new JSONObject();
    res.put("abc", response);
    System.out.println("***********************************************************************************************************");
    System.out.println(res);
    System.out.println("***********************************************************************************************************");
    
    
 System.out.println(JasonHandler.JContaint(res, "result"));
 
 
 System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
 System.out.println("***********************************************************************************************************");
 System.out.println(JasonHandler.JArrayContaint(jsonObject, "data", "firstName"));
 
 System.out.println("***********************************************************************************************************");*/

	String response=GetClass.response.getBody().asString();
  // String response="{ \'lookupName\': \'mat\' \'lookupcol\':[ {\'_id\':\'591427eb42c39d2f77585dd6\',  \'userId\':\'OBT-B17xOibeZ\', \'avatar\':\'null\'} {\'firstName\':\'Balakrishnan\'} ] } " ;      
    
	
	
	
	
	
/*	JSONObject res = new JSONObject(response);
    JSONObject json = getJSONfromURL(URL);
    JSONObject user = json.getJSONObject("user");
    JSONObject status = user.getJSONObject("status");
    int stat1 = status.getInt("stat1");
    
  //  res.put("result", response);
    System.out.println("***********************************************************************************************************");
    System.out.println(res);
    System.out.println("***********************************************************************************************************");
    
    
 System.out.println(JasonHandler.JContaint(res, "result"));
 System.out.println(JasonHandler.JArrayContaint(jsonObject, "result", "lookupcol"));*/
   
    
    
	}
	
    

}
