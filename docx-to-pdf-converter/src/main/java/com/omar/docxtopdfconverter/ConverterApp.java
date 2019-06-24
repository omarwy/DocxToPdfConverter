package com.omar.docxtopdfconverter;

public class ConverterApp {
	public static void main(String[] args) {
		DocxToPdfConverter.convertFile(args[0], args[1]); 
	}
}
