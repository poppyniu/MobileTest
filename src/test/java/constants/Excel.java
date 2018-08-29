package constants;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

import java.util.ArrayList;

/**
 * Created by poppy.zhang on 2018/8/9.
 */
public class Excel {
//    ArrayList<String> list = new ArrayList<String>();
    public static Workbook workBook;
    public static  Sheet sheet;
    public static  Row row;

    public ArrayList<String> convertExcelToArrayList(int col, int rowNum, Sheet sheet, ArrayList<String> list) throws Exception {
        //调每列所有行添加到list里
        for (int rowCount = 0; rowCount <= rowNum; rowCount++) {
            XSSFRow xssfRow = (XSSFRow) sheet.getRow(rowCount);
            if (xssfRow == null) {
                //略过空行
                continue;
            }
            XSSFCell eRow = xssfRow.getCell(col);
            list.add(eRow.toString());
            return list;
        }
        return list;
    }

}

