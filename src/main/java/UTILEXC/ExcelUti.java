package UTILEXC;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUti {
	
	private static XSSFWorkbook xBook;
	private static XSSFSheet xSheet;
	public static XSSFCell xCell;
	private static XSSFRow xRow;
	public static int lastrow;
	
public static void setExcel(String Path, String Sheet){
		
		try {
			FileInputStream xfile = new FileInputStream(Path);
			xBook = new XSSFWorkbook (xfile);
			xSheet = xBook.getSheet(Sheet);
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

public static String getCellValue(int iRow, int iCell ){
    
	DataFormatter formatter = new DataFormatter();
	xRow = xSheet.getRow(iRow);
	
	try{xCell=xRow.getCell(iCell);}catch(Exception e){}
	String sValue = formatter.formatCellValue(xCell);

	
	return sValue;
	
	

}





public static int lastrow1(int iRow, int iCell) throws Exception{
	
	
	DataFormatter formatter = new DataFormatter();
	xRow = xSheet.getRow(iRow);
	int count = 0;
	for (Row row : xSheet) {
	    if (row.getCell(iCell) != null) {
	        count += 1;
	        
	    }
	   
	    lastrow=count-1;
	    
	    
	   
	}
	 return lastrow;
}

@SuppressWarnings({ "static-access", "deprecation" })
public static void setCellValue(String sResult, int iRow, int iCell){
	
	try {
		xRow = xSheet.getRow(iRow);
		lastrow=xRow.getLastCellNum();
		xCell = xRow.getCell(iCell, xRow.RETURN_BLANK_AS_NULL);
		if (xCell == null)
			{
			  xCell = xRow.createCell(iCell);
			  xCell.setCellValue(sResult);
			}
		else
			xCell.setCellValue(sResult);
	
		FileOutputStream xFileOut = new FileOutputStream("D://Rest-Assured//com.services//src//main//java//TestData//TD.xlsx");
		xBook.write(xFileOut);
		xFileOut.flush();
		xFileOut.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}


}
