module easytext.analysis {
	requires transitive easytext.api;
	provides javamodularity.easytext.analysisapi.Analyzer 
		with javamodularity.easytext.analysis.FleschKincaid;
}