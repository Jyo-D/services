package TestNG;

import java.util.ArrayList;

import org.testng.annotations.Test;

import DB_Connection.Lookup_column;
import DB_Connection.Lookup_config;
import DB_Connection.Lookup_constraint;
import Test_Case.Create;
import UTILEXC.ExcelUti;
import Utility.Constants;
import Utility.PostClass;


public class T1 {

	@Test
	public static void main() throws Exception {
		
		ArrayList config=new ArrayList();
		ArrayList column=new ArrayList();	
		ArrayList constraint=new ArrayList();
		
		Create.test();
		Lookup_config.main();
		
		ExcelUti.setExcel("D://Rest-Assured//com.services//src//main//java//TestData//config.xlsx", "dept");
		
		for(int i=2;i<=ExcelUti.lastrow1(0, Constants.LOOKUP_NAME)+1;i++)
		{
			
			System.out.println(Create.lookupName+"=======lookupname");
			System.out.println(ExcelUti.getCellValue(i, Constants.LOOKUP_NAME)+"=======lookup_name");
		if(ExcelUti.getCellValue(i, Constants.LOOKUP_NAME).equalsIgnoreCase(Create.lookupName))
		{
			System.out.println(i+"=i");
			config.add(ExcelUti.getCellValue(i, 1));
			config.add(ExcelUti.getCellValue(i, 2));
			config.add(ExcelUti.getCellValue(i, 3));
			config.add(ExcelUti.getCellValue(i, 4));
			config.add(ExcelUti.getCellValue(i, 5));
			
		}}
		
		

	
		Lookup_column.main();
ExcelUti.setExcel("D://Rest-Assured//com.services//src//main//java//TestData//column.xlsx", "dept");
		
		for(int i=2;i<=ExcelUti.lastrow1(0, 5)+1;i++)
		{
			
			
			System.out.println(ExcelUti.getCellValue(i, 5)+"=======lookup_name");
		if(ExcelUti.getCellValue(i, 5).equalsIgnoreCase(Create.lookupName))
		{
			System.out.println(i+"=i");
			column.add(ExcelUti.getCellValue(i, 1));
			column.add(ExcelUti.getCellValue(i, 2));
			column.add(ExcelUti.getCellValue(i, 3));
			column.add(ExcelUti.getCellValue(i, 4));
			column.add(ExcelUti.getCellValue(i, 5));
			
		}}
		
		
		
		Lookup_constraint.main();
ExcelUti.setExcel("D://Rest-Assured//com.services//src//main//java//TestData//constraint.xlsx", "dept");
		
		for(int i=2;i<=ExcelUti.lastrow1(0, 6)+1;i++)
		{
			
			
			System.out.println(ExcelUti.getCellValue(i, 6)+"=======lookup_name");
		if(ExcelUti.getCellValue(i, 6).equalsIgnoreCase(Create.lookupName))
		{
			System.out.println(i+"=i");
			constraint.add(ExcelUti.getCellValue(i, 1));
			constraint.add(ExcelUti.getCellValue(i, 2));
			constraint.add(ExcelUti.getCellValue(i, 3));
			constraint.add(ExcelUti.getCellValue(i, 4));
			constraint.add(ExcelUti.getCellValue(i, 5));
			constraint.add(ExcelUti.getCellValue(i, 6));
			
		}}
		
		for(int j=0;j<=config.size();j++)
		{
			try{System.out.println(config.get(j));}catch(Exception e){}
		}
		
		for(int j=0;j<=column.size();j++)
		{
			try{System.out.println(column.get(j));}catch(Exception e){}
		}
		
		for(int j=0;j<=constraint.size();j++)
		{
			try{System.out.println(constraint.get(j));}catch(Exception e){}
		}
		
		
	}

}
