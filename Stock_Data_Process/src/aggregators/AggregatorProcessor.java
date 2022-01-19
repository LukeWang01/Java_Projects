package aggregators;


import fileprocessors.StockFileReader;

import java.io.IOException;
import java.util.List;

public class AggregatorProcessor <T extends Aggregator> {
    // define the class
    T aggregator;
    String file;

    public AggregatorProcessor(T aggregator, String file){
        super();
        this.aggregator = aggregator;
        this.file = file;
    }

    public double runAggregator(int i) throws IOException {
        double requestValue;
        StockFileReader fileReader = new StockFileReader(file);
        List<String> lines =  fileReader.readFileData();
        i--;
        for(String line : lines) {
            String [] number = line.split(","); // save the data from the line to an array.
            Double value = Double.parseDouble(number[i]);
            aggregator.add(value);
        }

        requestValue = aggregator.calculate();


        return requestValue;
    }
}
