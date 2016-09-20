package com.sidlu.excel;


import org.apache.poi.hssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ice on 9/20/2016.
 */
public class Test {
    public static void main(String[] args) throws IOException {

        //读取excel文件
        List<List<HSSFCell>> allRows = getExcelToList("d:\\这个是excel名称.xls");

        //打印信息
        for (int i = 0; i < allRows.size(); i++) {
            List<HSSFCell> hssfCells = allRows.get(i);
            for (int j = 0; j < hssfCells.size(); j++) {
                System.out.print(getCellValue(hssfCells.get(j))+"、");
            }
            System.out.println();
        }

    }

    /**
     *  根据excel文件地址获取文件该文件的List
     * @param fileAddress 文件地址
     * @return 返回一个List，这个list包含n个list,是所有行的集合，lsit2每一个之都是一个单元格对象(cell)
     */
    private static List<List<HSSFCell>> getExcelToList(String fileAddress) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(fileAddress);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //将输入流转换为workbook
        HSSFWorkbook workbookRead = null;
        try {
            workbookRead = new HSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //获取第一张工作表
        HSSFSheet sheet = workbookRead.getSheetAt(0);

        //所有行的集合，list的每个值是list
        return getAllRows(sheet);
    }

    /**
     *  根据sheet转换成相应的list，被getExcelToList()方法调用
     * @param sheet
     * @return 返回sheet相应的list
     */
    private static List<List<HSSFCell>> getAllRows(HSSFSheet sheet) {
        //获取总行数
        int rows = sheet.getLastRowNum() + 1;
        List<List<HSSFCell>> AllRowsList = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            //获取一个单独行
            HSSFRow row = sheet.getRow(i);
            List<HSSFCell> EachRowCellList = new ArrayList<HSSFCell>();
            for (int j = 0; j < row.getLastCellNum(); j++) {
                HSSFCell cellRead = row.getCell(j);
                EachRowCellList.add(cellRead);
            }
            AllRowsList.add(EachRowCellList);
        }
        return AllRowsList;
    }

    /**
     * 创建excel
     * @param excelName
     * @param sheetName
     */
    private static void createExcel(String excelName, String sheetName) {

        HSSFWorkbook workbook = new HSSFWorkbook();
        //新建工作表
        HSSFSheet sheet = workbook.createSheet(sheetName);
        //创建行，行号作为参数，第一行从0开始计算
        HSSFRow row = sheet.createRow(0);
        //创建单元格，row已经确定行号，列好作为参数，第一列从0开始计算
        HSSFCell cell = row.createCell(2);
        //设置单元格（第一行第三列）
        cell.setCellValue("hello word");
        HSSFCell cell1 = row.createCell(3);
        cell1.setCellValue(3.1415926);

        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(excelName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 不同的对象返回不同的值
     * @param cell
     * @return
     */
    public static Object getCellValue(HSSFCell cell) {
        if (cell == null) {
            return null;
        } else if (cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
            //System.out.println(cell.getNumericCellValue()+"----"+"Numerice");
            return cell.getNumericCellValue();
        } else if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
            //System.out.println(cell.getStringCellValue()+"----"+"String");
            return cell.getStringCellValue().trim();
        } else if (cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
            //System.out.println("blank");
            return null;
        }
        return null;
    }
}


/**
 * <!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
 * <dependency>
 * <groupId>org.apache.poi</groupId>
 * <artifactId>poi</artifactId>
 * <version>3.14</version>
 * </dependency>
 * <p>
 * <!-- https://mvnrepository.com/artifact/org.apache.poi/ooxml-schemas -->
 * <dependency>
 * <groupId>org.apache.poi</groupId>
 * <artifactId>ooxml-schemas</artifactId>
 * <version>1.3</version>
 * </dependency>
 * <p>
 * <p>
 * <mirror>
 * <id>alimaven</id>
 * <name>aliyun maven</name>
 * <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
 * <mirrorOf>central</mirrorOf>
 * </mirror>
 * <p>
 * <mirror>
 * <id>alimaven</id>
 * <name>aliyun maven</name>
 * <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
 * <mirrorOf>central</mirrorOf>
 * </mirror>
 * <p>
 * <mirror>
 * <id>alimaven</id>
 * <name>aliyun maven</name>
 * <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
 * <mirrorOf>central</mirrorOf>
 * </mirror>
 * <p>
 * <mirror>
 * <id>alimaven</id>
 * <name>aliyun maven</name>
 * <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
 * <mirrorOf>central</mirrorOf>
 * </mirror>
 */

/**
 <mirror>
 <id>alimaven</id>
 <name>aliyun maven</name>
 <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
 <mirrorOf>central</mirrorOf>
 </mirror>
 */
