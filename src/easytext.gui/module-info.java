module easytext.gui {
	exports javamodularity.easytext.gui to javafx.graphics;
	requires javafx.graphics;
	requires javafx.controls;
	requires easytext.api;
	requires easytext.analysis.factory;
}