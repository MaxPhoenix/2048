package gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Text;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public abstract class Rankings {
	
	public static void main(String[] args){
		createXML();
	}
	
	private static void createXML(){
		
			Document document = new Document();
			
			Element root = new Element ("Players");
			document.setRootElement(root);
			
		
			
			
	
	}
	
	private void readXML(){
		
		SAXBuilder builder = new SAXBuilder ();
		
			Document readDoc;
			try {
				readDoc = builder.build(new File("C:/Users/Max/Desktop/prueba.txt"));
				System.out.println("Root : "+ readDoc.getRootElement());
				
				System.out.println("Player: "+readDoc.getRootElement().getChild("Nombre").getChildText(""));
			} catch (JDOMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}
	
}
