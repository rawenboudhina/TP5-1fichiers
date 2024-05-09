package TP_File;

import java.io.File;
import java.io.FilenameFilter;

public class Filtre implements FilenameFilter{
	private char lettre;
	public Filtre(char lettreDébut) {
	lettre = lettreDébut;
	}

	@Override
	public boolean accept(File dir, String name) {
		return name.startsWith(String.valueOf(lettre));
		
	}
	//return name.charAt(0);

}
