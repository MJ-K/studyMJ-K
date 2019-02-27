package test;
import java.awt.Graphics;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.FileInputStream;
import java.io.IOException;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;

public class PrintSettin{
  static public void main(String args[]) throws Exception {
    PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
    pras.add(new Copies(1));
    PrintService pss[] = PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.GIF, pras);
    if (pss.length == 0)
      throw new RuntimeException("No printer services available.");
    PrintService ps = pss[0];
    System.out.println("Printing to " + ps);
    DocPrintJob job = ps.createPrintJob();
    FileInputStream fin = new FileInputStream("src/Image/main.jpg");
    Doc doc = new SimpleDoc(fin, DocFlavor.INPUT_STREAM.GIF, null);
    job.print(doc, pras);
    fin.close();
  }
}