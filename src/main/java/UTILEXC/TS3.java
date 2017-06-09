package UTILEXC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

import UTILEXC.ExcelUti;
import Utility.GetClass;
import Utility.JasonHandler;

public class TS3 {

	
	@Test
	public static void test() throws Exception{
	
		 String response1="{\'lookupName\':\'mat\',\'lookupcol\':[{\'_id\':\'591427eb42c39d2f77585dd6\',\'userId\':{\'use\':\'OBT-B17xOibeZ\'}} ,{\'av\':[{\'123\':\'456\'}],\'avatar\':\'null\' ,\'firstName\':\'Balakrishnan\' }, {\'name\':\'jyoti\',  \'age\':\'NOYB\'}] } " ;
		
		   // System.out.println("***********************************************************************************************************");
		   // System.out.println("response==="+res);
		  //  System.out.println("***********************************************************************************************************");
		    //.out.println(response.charAt(106));
		    
		 //System.out.println(JasonHandler.JContaint(res, "abc"));
		// System.out.println(JasonHandler.JArrayContaint(res, "lookupcol" , "_id"));
		
		 JSONObject obj = new JSONObject(response1);
		 System.out.println(List.av);
		 JSONArray lookupcol = obj.getJSONArray(List.av);
		 System.out.println(lookupcol.length());
		 JSONObject param1 = lookupcol.getJSONObject(0);
		 JSONObject param2 = lookupcol.getJSONObject(1);
		 JSONObject param3 = lookupcol.getJSONObject(2);
		 System.out.println("1st obj==="+param1);
		 System.out.println("2nd obj==="+param2);
		 System.out.println("3rd obj==="+param3);
		 //System.out.println("getting value of id from param1==="+param1.get("_id"));
		// System.out.println("getting value of userId from param1==="+param1.get("userId"));
		 
		 
		 
		 
	
		 System.out.println(lookupcol.getJSONObject(0).get("_id"));
		 
		 JSONObject param4 = (JSONObject) lookupcol.getJSONObject(0).get("userId");
		 System.out.println(param4.get("use"));
		 
	
	}
	
	
	
}
