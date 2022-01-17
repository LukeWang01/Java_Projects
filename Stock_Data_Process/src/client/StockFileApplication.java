package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;

public class StockFileApplication {
	
	public static void main(String args[]) throws IOException{
		StockFileReader fr = new StockFileReader("table.csv");
		
		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		System.out.println(dataResult.size());
	}
	/**
	 * populate the data field in the StockFileData class.
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
		List<HashMap<String, Double>> dataResult = new ArrayList<>();
		for (String line : lines){
			String [] values = line.split(",");
			int i = 0;
			HashMap<String, Double> headerandvalue = new HashMap<>();
			for (String value : values) {
				double val = Double.parseDouble(value);
				headerandvalue.put(headers.get(i), val);
				i++;
			}
			dataResult.add(headerandvalue); // add two maps, like update the dataResult.
		}
		return dataResult;
	}
}
