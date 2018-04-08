package javamodularity.easytext.analysis.factory;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.ServiceLoader;
import javamodularity.easytext.analysisapi.Analyzer;

public class AnalyzerFactory {
	private static Map<AnalyzerAlgorithme ,Analyzer> analyzerImplementations;
	
	static {
		analyzerImplementations = new HashMap<AnalyzerAlgorithme, Analyzer>();
		Iterable<Analyzer> analyzers = ServiceLoader.load(Analyzer.class);
		for(Analyzer analyzer : analyzers){
			analyzerImplementations.put(
				AnalyzerAlgorithme.valueOf(analyzer.getName()), analyzer);
		}
	}
	
	public static List<AnalyzerAlgorithme> getSupportedTypes(){
			
			return new ArrayList<AnalyzerAlgorithme>(analyzerImplementations.keySet());
	}

	public static Analyzer getAnalyzer(AnalyzerAlgorithme algorithme) throws IllegalArgumentException {
		switch(algorithme) {
			case FLESH_KINCAID : 
				return analyzerImplementations != null ? 
					analyzerImplementations.get(0) : null;
			default : 
				throw new IllegalArgumentException(
					String.format("The algorithme is %s not supported!", algorithme));
		}
	}
}