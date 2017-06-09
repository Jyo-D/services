package Utility;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import UTILEXC.ExcelUti;

public class JasonHandler {
	
	public static void putList(List listA,String s) throws FileNotFoundException{
		   
		   if(s.equals("Col_displayName")){
		    
		    int start=3;
		    int i;
		    try {
		     i=ExcelUti.lastrow1(1,2);
		    
		     // TODO Auto-generated catch block
		    
		    
		    start=2;
		    Iterator iterator = listA.iterator();
		    while(iterator.hasNext()){
		      String element = (String) iterator.next();
		   ExcelUti.setCellValue(element,i+1,start);
		   start++;
		      
		    }}catch (Exception e) {}
		   
		      
		    } }
	
	public static void main(String[]  args){
	    
	    //setExcel("C:/Users/Rahul Kadyan/Desktop/json functions/jsonexcel.xlsx", "Sheet2");
	    
	       ExcelUti.setExcel("D://Rest-Assured//com.services//src//main//java//TestData//TD.xlsx", "TD");
	    
	    
	    List Col_displayName = new ArrayList();
	    Col_displayName.add(0,"element 0");
	    Col_displayName.add(1,"element 1");
	    Col_displayName.add(2,"element 2");
	    
	    
	    
	    
	    try {
	     //lastrow1(1,2);
	     
	    
	     //System.out.println("value"+lastrow1(1, 2));
	     putList(Col_displayName,"Col_displayName");
	    } catch (Exception e) {
	     // TODO Auto-generated catch block
	    }}
	

	static String  Value;
	public static ArrayList<String> JArrayContaint(JSONObject jsonObject,String JsonArrayName, String ArryKey)
    {
		ArrayList<String>  list = new ArrayList<String>();
		JSONArray arry_cont = (JSONArray) jsonObject.get(JsonArrayName);
		System.out.println("arry-count="+arry_cont.size());
		 for(int i=0;i<arry_cont.size();i++)
         {
         jsonObject=(JSONObject)arry_cont.get(i);
         
         Value = (String) jsonObject.get(ArryKey);
         list.add(Value);
        
         }
		return list;
		
    }
	
	
	
   	public static String JContaint(JSONObject jsonObject, String ArryKey)
   	{
   		return (String) jsonObject.get(ArryKey);
   		 
   	}
   	
   	
   	
   	
   	
}
