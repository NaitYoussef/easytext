package javamodularity.easytext.analysisapi;

import java.util.List;

public interface Analyzer {
	public String getName();
	public double analyze(List<List<String>> sentences);
}