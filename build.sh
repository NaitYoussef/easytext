#!/bin/bash
echo "Clean"
rm -r out/*
echo "Build"
javac -d out --module-source-path src -m easytext.gui
echo "Run"
java --module-path out -m easytext.gui/javamodularity.easytext.gui.Main
echo "Done"