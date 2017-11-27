package structural.adapter.my;

import java.util.ArrayList;
import java.util.List;

public class PatternRepository
{
    public static List<Pattern> getPatterns()
    {
        List<Pattern> patterns = new ArrayList<>();
        patterns.add(new Pattern(1, "Singleton", "Only one"));
        patterns.add(new Pattern(2, "Adapter", "Adding functionality"));
        return patterns;
    }
}
