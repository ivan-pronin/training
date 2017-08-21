package structural.adapter.my;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatternDataAdapter
{
    public List<Map<String, String>> printPatterns(List<Pattern> patterns)
    {
        List<Map<String, String>> data = new ArrayList<>();
        for (Pattern p : patterns)
        {
            data.add(new HashMap<String, String>()
            {
                {
                    put("Id", "" + p.getId());
                    put("Name", p.getName());
                    put("Description", p.getDescription());
                }
            });
        }
        return data;
    }
}
