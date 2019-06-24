package com.omar.docxtopdfconverter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import com.documents4j.api.DocumentType;
import com.documents4j.api.IConverter;
import com.documents4j.job.LocalConverter;

public class DocxToPdfConverter {

    /**
     * This method converts a docx file into a pdf file
     * 
     * @param docxPath
     * @param pdfPath
     */
    public static void convertFile(String docxPath, String pdfPath) {
    	

        File inputDocxFile = new File(docxPath);
        File outputPdfFile = new File(pdfPath);
        try  {
            InputStream inputStreamDocx = new FileInputStream(inputDocxFile);
            OutputStream outputStreamPdf = new FileOutputStream(outputPdfFile);
            IConverter converter = LocalConverter.builder().build();
            converter.convert(inputStreamDocx).as(DocumentType.DOCX).to(outputStreamPdf).as(DocumentType.PDF).execute();
            outputStreamPdf.close();
            System.out.println("Pdf file successfully created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
