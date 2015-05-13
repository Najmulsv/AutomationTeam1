package BestBuyTest;

import baseApi.Base;
import com.bestbuyHome.DataReader;
import org.testng.annotations.Test;

import java.io.IOException;

public class Search extends Base  {
    public DataReader dr = new DataReader();
    String path = "C:\\Users\\nojrul2006\\Documents\\Workspace\\Automation_Team1\\BestBuy\\Data\\DataSheet.xls";
    @Test
    public void searchNews()throws IOException, InterruptedException {
        String [][] value = dr.fileReader(path);
        typeAndEnterByCss(value[1][0], value[1][1]);
        sleepFor(3);

        typeAndEnterByCss(value[2][0], value[2][1]);
        sleepFor(3);

        typeAndEnterByCss(value[3][0], value[3][1]);
        sleepFor(3);

        typeAndEnterByCss(value[4][0], value[4][1]);
        sleepFor(3);

        typeAndEnterByCss(value[5][0], value[5][1]);
        sleepFor(3);

        typeAndEnterByCss(value[6][0], value[6][1]);
        sleepFor(3);

    }
}
