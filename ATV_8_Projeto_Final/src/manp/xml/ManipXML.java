package manp.xml;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

import classes.Funcionario;

import util.DataUtil;

public class ManipXML{

	final static String NOMEDOARQUIVO = "SYSTEMA GESTAO";
	final static String LOCALHOST = "src/xml/";
	
	public static boolean gravarXMLCliente(List<Funcionario> lista){		//
		// Cria o elemento que ser� o root
		Element config = new Element("Clientes");

		//define config como root
		Document documento = new Document(config);

		Element titulo = new Element("titulo");
		titulo.setText("Cadastro de Clientes");

		Element data = new Element("data");
		data.setText(DataUtil.DataHoraForStringPadraoH(new Date()));
		
		config.addContent(titulo);
		config.addContent(data);
		
		for (int x = 0; x < lista.size(); x++){
			Element cliente = new Element("cliente");
			
			cliente.setAttribute("codigo", String.valueOf(lista.get(x).getMatricula()));
			
			Element nome = new Element("nome");
			nome.setText(lista.get(x).getNome());

			/*Element email = new Element("email");
			email.setText(lista.get(x).getEmail());

			Element fone = new Element("fone");
			fone.setText(lista.get(x).getFone());*/
						
			cliente.addContent(nome);
			//cliente.addContent(email);
			//cliente.addContent(fone);
			config.addContent(cliente);			
		}

		//classe respons�vel para imprimir / gerar o xml
		XMLOutputter xout = new XMLOutputter();	
		try {
			//criando o arquivo de saida
			System.out.println(NOMEDOARQUIVO + ".xml");
			BufferedWriter arquivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(LOCALHOST +  NOMEDOARQUIVO + ".xml"),"UTF-8"));
			//imprimindo o xml no arquivo
			xout.output(documento, arquivo);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static List<Funcionario> lerXMLCOM(){
		List<Funcionario> listaFunc = new ArrayList<Funcionario>();
		Document doc = null;
		SAXBuilder builder = new SAXBuilder();	
		try { 
			doc = builder.build(LOCALHOST + NOMEDOARQUIVO + ".xml");
		} catch (Exception e) {
			e.printStackTrace();
		}            
		Element config = doc.getRootElement();
		List lista = config.getChildren("cliente");
		
		for (Iterator iter = lista.iterator(); iter.hasNext();) {
			Element element = (Element) iter.next();
			Funcionario f = new Funcionario();
			f.setMatricula(Integer.parseInt(element.getAttributeValue("codigo")));
			f.setNome(element.getChildText("nome"));
			//cli.setEmail(element.getChildText("email"));
			//cli.setFone(element.getChildText("fone"));
			listaFunc.add(f);
		}
		return listaFunc;
	}	
}