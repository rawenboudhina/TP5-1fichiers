package TP_File;
import java.io.*;
import static java.lang.System.*;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws IOException {
		out.println("Répertoire courant : "+System.getProperty("user.dir"));
		File rep = new File(".");//dossier de travil courant
		out.println("Chemin relatif : "+ rep.getPath());
		out.println("Chemin absolu : "+ rep.getAbsolutePath());

		for (File élément: File.listRoots())
		out.println("Racine : "+élément);

		for (File élément : rep.listFiles())
		if (élément.isDirectory()) {
		out.print(élément.getName()+"\t");
		if (élément.getName().length()<8)
		out.print("\t");
		out.println("<REP>");
		}
		for (File élément : rep.listFiles())
		if (élément.isFile()){
		out.print(élément.getName()+"\t");
		if (élément.getName().length()<8) out.print("\t");
		out.printf("%tc", new Date(élément.lastModified()));
		out.printf("\t%10d octets\n", élément.length());
		}
		System.out.println("l'element commence par b \n");
		for (File élément : rep.listFiles(new Filtre('b'))){
				if (élément.isDirectory()){
					out.print(élément.getName()+"\t");
					out.printf("\t%10d octets\n", élément.length());


				}}


		
		}
		
	

}
