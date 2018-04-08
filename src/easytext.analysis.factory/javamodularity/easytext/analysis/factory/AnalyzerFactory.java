package javamodularity.easytext.analysis.factory;

import java.util.List;
import java.util.Arrays;
import javamodularity.easytext.analysis.FleschKincaid;
import javamodularity.easytext.analysisapi.Analyzer;

public class AnalyzerFactory {
	private static List<Analyzer> analyzerImplementations;
	
	static {
		analyzerImplementations = new ArrayList<Analyzer>();
		Iterable<Analyzer> analyzers = ServiceLoader.load(Analyzer.class);
		for(Analyzer analyzer : analyzers){
			analyzerImplementations.add(analyzer);
		}
	}
	
	public static List<AnalyzerAlgorithme> getSupportedTypes(){
			
			return analyzerImplementations;
	}

	public static Analyzer getAnalyzer(AnalyzerAlgorithme algorithme) throws IllegalArgumentException {
		switch(algorithme) {
			case FLESH_KINCAID : 
				return anaanalyzerImplementations != null ? 
				analyzerImplementations.get(0) : null;
			default : 
				throw new IllegalArgumentException(
					String.format("The algorithme is %s not supported!", algorithme));
		}
	}
}