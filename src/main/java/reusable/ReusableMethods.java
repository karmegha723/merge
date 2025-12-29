package reusable;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReusableMethods {
    public static Sheet readExcelData(String path)
    {
        Sheet sheet1;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(path));
            try {
                Workbook wb = WorkbookFactory.create(fileInputStream);
                sheet1=wb.getSheet("Sheet1");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    return sheet1;
    }
}
