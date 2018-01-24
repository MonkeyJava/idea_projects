package com.company.javapoi.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellAddress;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 *
 *
 *
 *
 */
public class MyExcel {
    public static void main(String[] args) throws IOException {


        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("mySheet");
        //Row row = sheet.createRow(0);
        //Cell cell = row.createCell(0);
        //cell.setCellValue(2.5d);

        FileOutputStream fos = new FileOutputStream("C:\\myList.xls");
        FileInputStream fis = new FileInputStream("C:\\Data\\vibro.dat");

//    POIFSFileSystem fs = new POIFSFileSystem(fis);

        wb.write(fos);
        //Cell res = wb.getSheet("mySheet").getRow(0).getCell(0);
        //System.out.println(res);
        byte[] buff = new byte[fis.available()];
        fis.read(buff);
        for (int i = 0; i < buff.length; i++) {

            byte data = buff[i];
            fos.write(data);
        }
        fos.close();
        fis.close();
    }
}
