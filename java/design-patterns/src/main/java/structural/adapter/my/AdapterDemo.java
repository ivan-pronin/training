package structural.adapter.my;

import java.util.List;

public class AdapterDemo
{
    public static void main(String[] args)
    {
        List<Pattern> patterns = PatternRepository.getPatterns();
        IPatternsPrinter printer = new PatternsPrinter();
        printer.printPatterns(patterns);
    }
}
