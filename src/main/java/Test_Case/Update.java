package Test_Case;

import java.util.LinkedHashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import UTILEXC.ExcelUti;
import Utility.Constants;
import Utility.PostClass;

public class Update {
	
	
	//public static String APIUrl;
	//public static String APIBody="{\"lookupColumn\": [{\"C\":\"DEPTNAME\",\"displayName\": \"D_Name1\",\"searchable\": \"true\"},{\"columnName\":\"DEPT_ID\",\"displayName\": \"DEPT_ID\",\"searchable\": \"true\"}],\"lookupConstraint\": [{\"constraintColumn\": \"DEPT_RANK\",\"constraintOperator\": \"gte\",\"constraintValue\": \"1\",\"parameterName\" : \"NIL\"}],\"lookupName\": \"dept_au\", \"lookupTable\": \"DEPT11\",\"lookupType\": \"multi\",\"paginationAllowed\": \"true\",\"paginationCount\":4}";
	public static String s1 ;
	public static LinkedHashMap map=new LinkedHashMap();
	
	
	
	@Test
	public static void test() throws Exception{
	ExcelUti.setExcel("D://Rest-Assured//com.services//src//main//java//TestData//TestData.xlsx", "Update");
	PostClass.APIUrl = ExcelUti.getCellValue(1, 0);
	System.out.println("API url "+PostClass.APIUrl);
	//APIBody=ExcelUti.getCellValue(1, 3);
	 String lookupName=ExcelUti.getCellValue(1, Constants.lookupName);
		String lookupTable=ExcelUti.getCellValue(1, Constants.lookupTable);
		String lookupType=ExcelUti.getCellValue(1, Constants.lookupType);
		String paginationAllowed=ExcelUti.getCellValue(1, Constants.paginationAllowed);
		String paginationCount=ExcelUti.getCellValue(1, Constants.paginationCount);
		s1 = new String("\"lookupName\": \""+lookupName+"\", \"lookupTable\": \""+lookupTable+"\",\"lookupType\": \""+lookupType+"\",\"paginationAllowed\": \""+paginationAllowed+"\",\"paginationCount\":\""+paginationCount+"\"}");
		
	
	
	System.out.println(ExcelUti.lastrow1(0,Constants.columnName));
	for(int i=1;i<=ExcelUti.lastrow1(0,Constants.columnName);i++)
	{
		String columnName=ExcelUti.getCellValue(i, Constants.columnName);
		String displayName=ExcelUti.getCellValue(i, Constants.displayName);
		String searchable=ExcelUti.getCellValue(i, Constants.searchable);
		String s2=new String("{\"lookupColumn\": [{\"columnName\":\""+columnName+"\",\"displayName\": \""+displayName+"\",\"searchable\": \""+searchable+"\"}],");
		
		s1=s2+s1;
	}
	
	System.out.println(s1);
	
	for(int i=1;i<=ExcelUti.lastrow1(0,Constants.constraintColumn);i++)
	{
		String constraintColumn=ExcelUti.getCellValue(i, Constants.constraintColumn);
		String constraintOperator=ExcelUti.getCellValue(i, Constants.constraintOperator);
		String constraintValue=ExcelUti.getCellValue(i, Constants.constraintValue);
		String parameterName=ExcelUti.getCellValue(i, Constants.parameterName);
		String s2=new String("\"lookupConstraint\": [{\"constraintColumn\": \""+constraintColumn+"\",\"constraintOperator\": \""+constraintOperator+"\",\"constraintValue\": \""+constraintValue+"\",\"parameterName\" : \""+parameterName+"\"}],");
		
		s1=s2+s1;
	}
	
	System.out.println(s1);
    ExcelUti.lastrow1(0, 0);
    System.out.println(ExcelUti.lastrow+1);
    for(int i=1;i<=ExcelUti.lastrow+1;i++)
    {
    	String key=ExcelUti.getCellValue(i, 1);
    	System.out.println("key="+key);
    	String value=ExcelUti.getCellValue(i, 2);
    	System.out.println("value="+value);
    	map.put(key, value);
    	
 }
	
    
	PostClass.POST("table","DEPT098");
	
	String response=PostClass.response.getBody().asString(); 
	System.out.println(response);
    JSONObject res = new JSONObject();
    res.put("result", response);
    
   // JasonHandler.JContaint(res, "_id");
    
    
	}

}
