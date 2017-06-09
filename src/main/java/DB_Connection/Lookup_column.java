package DB_Connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Lookup_column {
	
	public static void main() throws Exception 
	   {
	      Class.forName("com.mysql.jdbc.Driver");
	      Connection connect = DriverManager.getConnection( 
	      "jdbc:mysql://localhost/hibernate_testing" , 
	      "root" , 
	      "root"
	      );
	      Statement statement = connect.createStatement();
	      ResultSet resultSet = statement
	      .executeQuery("select * from lookup_column");
	      XSSFWorkbook workbook = new XSSFWorkbook(); 
	      XSSFSheet spreadsheet = workbook
	      .createSheet("dept");
	      XSSFRow row=spreadsheet.createRow(1);
	      XSSFCell cell;
	      cell=row.createCell(1);
	      cell.setCellValue("columnId");
	      cell=row.createCell(2);
	      cell.setCellValue("COLUMN_NAME");
	      cell=row.createCell(3);
	      cell.setCellValue("COLUMN_DISPLAY_NAME");
	      cell=row.createCell(4);
	      cell.setCellValue("SEARCHABLE");
	      cell=row.createCell(5);
	      cell.setCellValue("lookupName");
	      
	      int i=2;
	      while(resultSet.next())
	      {
	         row=spreadsheet.createRow(i);
	         cell=row.createCell(1);
	         cell.setCellValue(resultSet.getString("columnId"));
	         cell=row.createCell(2);
	         cell.setCellValue(resultSet.getString("COLUMN_NAME"));
	         cell=row.createCell(3);
	         cell.setCellValue(resultSet.getString("COLUMN_DISPLAY_NAME"));
	         cell=row.createCell(4);
	         cell.setCellValue(resultSet.getString("SEARCHABLE"));
	         cell=row.createCell(5);
	         cell.setCellValue(resultSet.getString("lookupName"));
	        
	         i++;
	      }
	      
	      File file=new File("D://Rest-Assured/com.services/src/main/java/TestData/column.xlsx");
	      FileInputStream fis=new FileInputStream(file);
	      
	      FileOutputStream out = new FileOutputStream(file);
	      workbook.write(out);
	      out.close();
	      System.out.println(
	      "exceldatabase.xlsx written successfully");
	   }
	
	

}
