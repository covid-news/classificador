import java.io.*;
import java.util.*;

public class GravaConjunto {
    public GravaConjunto() {}

    public void gravarConjunto (String nomeArquivo, LinkedList<NoticiaEntidade> buffer) {
		try {
            BufferedWriter streamManchete = new BufferedWriter ( new FileWriter("DataSetEstratificado//" + nomeArquivo + "Manchete.txt") );
            BufferedWriter streamTexto = new BufferedWriter ( new FileWriter("DataSetEstratificado//" + nomeArquivo + "Texto.txt") );
            Iterator<NoticiaEntidade> i = buffer.iterator();
            
            while ( i.hasNext() ) {
                NoticiaEntidade noticia = i.next();

                streamManchete.write(noticia.manchete);
                streamTexto.write(noticia.texto);

                streamManchete.newLine();
                streamTexto.newLine();
            }
            streamManchete.close();
            streamTexto.close();
        }
        catch (IOException e) {
			System.out.println("Erro " + e.toString() + " na gravacao do arquivo: " + nomeArquivo);
			return;
		}
    }
}
