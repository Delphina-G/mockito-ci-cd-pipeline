package com.example.mockitodemo;

import java.io.FileOutputStream;
import org.springframework.stereotype.Service;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.io.source.ByteArrayOutputStream;
import com.itextpdf.kernel.pdf.PdfWriter;

@Service
public class EmployeeService {
	
	public void htmlToPdf(String processedHtml) {

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		try {
			PdfWriter pdfWriter = new PdfWriter(byteArrayOutputStream);
			DefaultFontProvider defaultFont = new DefaultFontProvider();
			ConverterProperties converterProperties = new ConverterProperties();
			converterProperties.setFontProvider(defaultFont);

			HtmlConverter.convertToPdf(processedHtml, pdfWriter, converterProperties);

			FileOutputStream fout = new FileOutputStream("D:\\PDFs\\Thymeleaf.pdf");

			byteArrayOutputStream.writeTo(fout);
			byteArrayOutputStream.close();

			byteArrayOutputStream.flush();

			fout.close();

		} catch (Exception ex) {
			System.err.println(ex.getLocalizedMessage());
		}

	}
	

}
