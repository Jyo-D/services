package UTILEXC;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.CORBA.INV_FLAG;

public class mainjsonfunction{
	
	 XSSFWorkbook workbook = new XSSFWorkbook();
     XSSFSheet in = workbook.createSheet("jsonFormatRAHULKADYAN");
	
	
	private int create(int row) throws FileNotFoundException {

			
		

		// Placing requestId at the top.
		XSSFRow row0 = in.createRow(row);
		XSSFCell cell0row0 = row0.createCell(0);
		
		cell0row0.setCellValue("col_lookupName");

		XSSFCell cell1row0 = row0.createCell(1);
		
		cell1row0.setCellValue("col_lookupType");

XSSFCell cell2row0 = row0.createCell(2);
		
		cell2row0.setCellValue("col_lookupTable");
		
		
XSSFCell cell3row0 = row0.createCell(3);
		
		cell3row0.setCellValue("col_lookupColumn");
		
		
XSSFCell cell4row0 = row0.createCell(4);
		
		cell4row0.setCellValue("");	
		
XSSFCell cell5row0 = row0.createCell(5);
		
		cell5row0.setCellValue("");	
		
XSSFCell cell6row0 = row0.createCell(6);
		
cell6row0.setCellValue("Col_Constraints");


XSSFCell cell7row0 = row0.createCell(7);

cell7row0.setCellValue("");



XSSFCell cell8row0 = row0.createCell(8);

cell8row0.setCellValue("");

		
	
XSSFCell cell9row0 = row0.createCell(9);

cell9row0.setCellValue("");


XSSFCell cell10row0 = row0.createCell(10);

cell10row0.setCellValue("Col_Pagination");






		// Placing column headings below the row.
		XSSFRow row1 = in.createRow(1);
		XSSFCell cell3row1 = row1.createCell(3);
		
		cell3row1.setCellValue("Col_desplayName");

		XSSFCell cell4row1 = row1.createCell(4);
		
		cell4row1.setCellValue("Col_columnName");

		XSSFCell cell5row1 = row1.createCell(5);
	
		cell5row1.setCellValue("Col_searchable");

		XSSFCell cell6row1 = row1.createCell(6);
	
		cell6row1.setCellValue("Col_constraintColumn");

		XSSFCell cell7row1 = row1.createCell(7);
		
		cell7row1.setCellValue("Col_constraintOperator");

		XSSFCell cell8row1 = row1.createCell(8);
		
		cell8row1.setCellValue("Col_constraintValue");

		XSSFCell cell9row1 = row1.createCell(9);
		
		cell9row1.setCellValue("Col_parameterName");

		XSSFCell cell10row1 = row1.createCell(10);
		
		cell10row1.setCellValue("Col_allowed");
		
		
XSSFCell cell11row1 = row1.createCell(11);
		
		cell11row1.setCellValue("Col_recordsPerPage");
		
		
		in.addMergedRegion(new CellRangeAddress(0,0,3,5));
		in.addMergedRegion(new CellRangeAddress(0,0,6,9));
		in.addMergedRegion(new CellRangeAddress(0,0,10,11));
		
		
		in.autoSizeColumn(0);
		in.autoSizeColumn(1);
		in.autoSizeColumn(2);
		in.autoSizeColumn(3);
		in.autoSizeColumn(4);
		in.autoSizeColumn(5);
		in.autoSizeColumn(6);
		in.autoSizeColumn(7);

		
		
		
	      FileOutputStream outputStream = new FileOutputStream("D://jsonFormatRAHULKADYANbyRAHULKADYAN.xlsx");
          try {
			workbook.write(outputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     /*     try {
	//		workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		

		return row;
	}


	

	public static void main(String args[]){
		
		mainjsonfunction m=new mainjsonfunction();
		try {
			m.create(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
}
