package com.levadata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataUtils {

	static XSSFWorkbook workbok = null;
	static XSSFSheet sheet = null;
	static Row row;
	static Cell cell;
	 static DataFormatter formatter= null;

	public static void getdataFromExcel() throws InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("D:\\praneeth\\login.xlsx");

		workbok = new XSSFWorkbook(fis);
		sheet = workbok.getSheet("praneeth");

	}

	public static Object[][] setInfo() {
	        XSSFRow Row=sheet.getRow(0);     //get my Row which start from 0   
	     formatter=new DataFormatter();
	        int RowNum = sheet.getPhysicalNumberOfRows();// count my number of Rows
	        int ColNum= Row.getLastCellNum(); // get last ColNum 
	         		
	        Object Data[][]= new Object[RowNum-1][ColNum]; // pass my  count data in array
	         
            for(int i=0; i<RowNum-1; i++) //Loop work for Rows
            {  
                XSSFRow row= sheet.getRow(i+1);
                 
                for (int j=0; j<ColNum; j++) //Loop work for colNum
                {
                    if(row==null)
                        Data[i][j]= "";
                    else
                    {
                        XSSFCell cell= row.getCell(j);
                        if(cell==null)
                            Data[i][j]= ""; //if it get Null value it pass no data 
                        else
                        {
                            String value=formatter.formatCellValue(cell);
                            Data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
                        }
                    }
                }
            }
 
        return Data;
    }
}
	
	 /* 
	 * //Iterator sheet.iterator(); row = sheet.getRow(1); cell = row.getCell(1);
	 
	 * 
	 * System.out.println(row.getCell(0)); System.out.println(row.getCell(1));
	 * 
	 * 
	 * obj[0][0]=row.getCell(0); obj[0][1]=row.getCell(1);
	 * 
	 * obj[1][0]=row.getCell(2); obj[1][1]=row.getCell(3);
	 * 
	 */