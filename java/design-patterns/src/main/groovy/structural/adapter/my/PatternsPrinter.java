package structural.adapter.my;

import java.util.List;

public class PatternsPrinter implements IPatternsPrinter
{
    private DataPrinter printer = new DataPrinter();
    private PatternDataAdapter patternAdapter = new PatternDataAdapter();
    
    @Override
    public void printPatterns(List<Pattern> patterns)
    {
        printer.printData(patternAdapter.printPatterns(patterns));
    }

}
