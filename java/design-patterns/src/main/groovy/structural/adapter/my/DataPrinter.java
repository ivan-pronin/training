package structural.adapter.my;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

public class DataPrinter implements IDataPrinter
{
    @Override
    public void printData(List<Map<String, String>> data)
    {
        if (data.isEmpty())
        {
            System.err.println("No data provided");
            return;
        }

        List<Map<String, String>> copiedData = new ArrayList<>(data);
        Map<String, String> header = copiedData.get(0);
        for (String value : header.keySet())
        {
            printFormattedValue(value);
        }
        Enumeration<String> ee = new Enumeration<String>() {
            @Override
            public boolean hasMoreElements() {
                return false;
            }

            @Override
            public String nextElement() {
                return null;
            }
        };
        System.out.println();

        copiedData.forEach(map ->
        {
            header.keySet().forEach(k -> printFormattedValue(map.get(k)));
            System.out.println();
        });

    }

    private void printFormattedValue(String value)
    {
        System.out.printf("%22s", value);
    }
}
