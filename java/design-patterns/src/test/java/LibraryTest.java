import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import structural.adapter.my.DataPrinter;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'Admin' at '20.08.17 13:10' with Gradle 3.1
 *
 * @author Admin, @date 20.08.17 13:10
 */
public class LibraryTest
{
    @Test
    public void testDataPrinter()
    {
        List<Map<String,String>> data = new ArrayList<>();
        data.add(creteNewRow("value11", "value12", "value13"));
        data.add(creteNewRow("value21", "value22", "value23"));
        data.add(creteNewRow("value31", "value32", "value33"));
        
        DataPrinter printer = new DataPrinter();
        printer.printData(data);
    }

    private Map<String, String> creteNewRow(String string, String string2, String string3)
    {
        Map<String, String> map = new HashMap<>();
        map.put("header1", string);
        map.put("header2", string2);
        map.put("header3", string3);
        return map;
    }
}