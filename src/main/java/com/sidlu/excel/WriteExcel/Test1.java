package com.sidlu.excel.WriteExcel;


import org.apache.poi.hssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by ice on 9/20/2016.
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        HSSFWorkbook workbook=new HSSFWorkbook();
        //新建工作表
        HSSFSheet sheet=workbook.createSheet("这个是sheet名称");
        //创建行，行号作为参数，第一行从0开始计算
        HSSFRow row=sheet.createRow(0);
        //创建单元格，row已经确定行号，列好作为参数，第一列从0开始计算
        HSSFCell cell=row.createCell(2);
        //设置单元格（第一行第三列）
        cell.setCellValue("hello word");
        HSSFCell cell1 = row.createCell(3);
        cell1.setCellValue(3.1415926);

        FileOutputStream outputStream=new FileOutputStream("d:\\这个是excel名称.xls");

        workbook.write(outputStream);

        outputStream.close();

        //读取excel文件
        FileInputStream inputStream=new FileInputStream("d:\\这个是excel名称.xls");
        //将输入流转换为workbook
        HSSFWorkbook workbookRead=new HSSFWorkbook(inputStream);
        //获取工作表
        HSSFSheet sheetRead=workbookRead.getSheetAt(0);
        //获取行
        HSSFRow rowRead=sheetRead.getRow(0);
        //获取单元格（第一行第三列）
        HSSFCell cellRead1=rowRead.getCell(2);
        HSSFCell cellRead2=rowRead.getCell(3);

        System.out.println("单元格内容为:"+cellRead1.getStringCellValue());
        System.out.println("单元格内容为:"+cellRead2.getNumericCellValue());
    }
}

/**
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
 <dependency>
 <groupId>org.apache.poi</groupId>
 <artifactId>poi</artifactId>
 <version>3.14</version>
 </dependency>

 <!-- https://mvnrepository.com/artifact/org.apache.poi/ooxml-schemas -->
 <dependency>
 <groupId>org.apache.poi</groupId>
 <artifactId>ooxml-schemas</artifactId>
 <version>1.3</version>
 </dependency>

 */

/**
 <mirror>
 <id>alimaven</id>
 <name>aliyun maven</name>
 <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
 <mirrorOf>central</mirrorOf>
 </mirror>
 */
