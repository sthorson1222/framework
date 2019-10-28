package utils;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
public class PdfWriterClass{
	 

	public static void main(String[] args)
	   {
	      Document document = new Document();
	      try
	      {
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
	         document.open();
	         document.add(new Paragraph("Sean, Kuntal and Ravi."));
	         document.add(new Paragraph("let's start working on the manual test!"));
	         document.addSubject("sean is working on it");
	         document.close();
	         writer.close();
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
	   }
	


	   
	   

}

