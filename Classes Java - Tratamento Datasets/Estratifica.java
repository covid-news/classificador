import java.io.*;
import java.util.*;

public class Estratifica {
	private static BufferedReader fileReader;
	private static NoticiaEntidade noticia;
	private static LinkedList<NoticiaEntidade> buffer;
	
	private static String preProcessamento (String linha) throws IOException {
		for (int i = 0; i < 2; i++) {
			linha += fileReader.readLine();
			linha = linha.replace("\t\t", "");
		}
		return linha;
	}
	
	private static void fatorarLinha (String linha) {
		noticia = new NoticiaEntidade();
		
		String linhaContraria = new StringBuilder(linha).reverse().toString(); 
		
		char[] linhaContrariaChars = linhaContraria.toCharArray();
		char[] linkContrarioChars = new char[linhaContrariaChars.length];
		char[] subCategoriaContrariaChars = new char[linhaContrariaChars.length];
		char[] categoriaContrariaChars = new char[linhaContrariaChars.length];
		char[] dataContrariaChars = new char[linhaContrariaChars.length];
		char[] textoContrarioChars = new char[linhaContrariaChars.length];
		char[] mancheteContrariaChars = new char[linhaContrariaChars.length];
		
		int contadorVirgulas = 0;
		int iteradorSubCategoria = 0;
		int iteradorCategoria = 0;
		int iteradorData = 0;
		int iteradorTexto = 0;
		int iteradorManchete = 0;
		
		boolean aspasUnicas = false;
		
		for (int i = 0; i < linhaContrariaChars.length; i++) {
			
			if (contadorVirgulas == 0) {
				if (linhaContrariaChars[i] != ',')
					linkContrarioChars[i] = linhaContrariaChars[i];
				else
					contadorVirgulas++;
			}
			
			else if (contadorVirgulas == 1) {
				if (linhaContrariaChars[i] != ',') {
					subCategoriaContrariaChars[iteradorSubCategoria] = linhaContrariaChars[i];
					iteradorSubCategoria++;
				}
				else
					contadorVirgulas++;
			}
			
			else if (contadorVirgulas == 2) {
				if (linhaContrariaChars[i] != ',') {
					categoriaContrariaChars[iteradorCategoria] = linhaContrariaChars[i];
					iteradorCategoria++;
				}
				else
					contadorVirgulas++;
			}
			
			else if (contadorVirgulas == 3) {
				if (linhaContrariaChars[i] != ',') {
					dataContrariaChars[iteradorData] = linhaContrariaChars[i];
					iteradorData++;
				}
				else
					contadorVirgulas++;
			}
			
			else if (contadorVirgulas == 4) {
				if (linhaContrariaChars[i] != ',' || !aspasUnicas) {
					
					if (linhaContrariaChars[i] == '"' && !aspasUnicas)
						aspasUnicas = true;
					else
						aspasUnicas = false;
					
					textoContrarioChars[iteradorTexto] = linhaContrariaChars[i];
					iteradorTexto++;
				}
				else
					contadorVirgulas++;
			}
			
			else {
				mancheteContrariaChars[iteradorManchete] = linhaContrariaChars[i];
				iteradorManchete++;
			}
		}

		String linkContrario = new String(linkContrarioChars).trim();
		String subCategoriaContraria = new String(subCategoriaContrariaChars).trim();
		String categoriaContraria = new String(categoriaContrariaChars).trim();
		String dataContraria = new String(dataContrariaChars).trim();
		String textoContrario = new String(textoContrarioChars).trim();
		String mancheteContraria = new String(mancheteContrariaChars).trim();
		
		noticia.manchete = new StringBuilder(mancheteContraria).reverse().toString();
		noticia.texto = new StringBuilder(textoContrario).reverse().toString();
		noticia.data = new StringBuilder(dataContraria).reverse().toString();
		noticia.categoria = new StringBuilder(categoriaContraria).reverse().toString();
		noticia.subCategoria = new StringBuilder(subCategoriaContraria).reverse().toString();
		noticia.link = new StringBuilder(linkContrario).reverse().toString();
	}
	
	/* private static void imprimeBuffer() {
		Iterator<NoticiaEntidade> i = buffer.iterator();
		
		System.out.println("Teste de formatacao do buffer: \n");
		
		while (i.hasNext()) {
			noticia = i.next();
			System.out.println("Noticia: {");
			System.out.println("\t" + noticia.manchete);
			System.out.println("\t" + noticia.texto);
			System.out.println("\t" + noticia.data);
			System.out.println("\t" + noticia.categoria);
			System.out.println("\t" + noticia.subCategoria);
			System.out.println("\t" + noticia.link);
			System.out.println("}");
		}
	} */

	private static void produzirArquivos() {
		LinkedList<NoticiaEntidade> poder = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> esporte = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> mercado = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> ilustrada = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> cotidiano = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> sobretudo = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> ilustrissima = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> educacao = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> saopaulo = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> mundo = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> opiniao = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> colunas = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> tec = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> ambiente = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> equilibrioesaude = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> tv = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> bancodedados = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> ciencia = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> paineldoleitor = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> seminariosfolha = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> turismo = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> empreendedorsocial = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> serafina = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> asmais = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> omelhordesaopaulo = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> bbc = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> comida = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> musica = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> folhinha = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> especial = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> treinamento = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> multimidia = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> cenarios2017 = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> topofmind = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> dw = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> ombudsman = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> contasdecasa = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> mulher = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> data2016 = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> guiadelivrosdiscosfilmes = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> treinamentocienciaesaude = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> rfi = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> vice = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> bichos = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> euronews = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> guiadelivrosfilmesediscos = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> infograficos = new LinkedList<NoticiaEntidade>();
		LinkedList<NoticiaEntidade> data2015 = new LinkedList<NoticiaEntidade>();
		
		Iterator<NoticiaEntidade> i = buffer.iterator();

		while ( i.hasNext() ) {
			noticia = i.next();

			switch (noticia.categoria) {
				case Categorias.PODER: 
					poder.addLast(noticia);
					break;
				case Categorias.ESPORTE: 
					esporte.addLast(noticia);
					break;
				case Categorias.MERCADO: 
					mercado.addLast(noticia);
					break;	
				case Categorias.ILUSTRADA: 
					ilustrada.addLast(noticia);
					break;
				case Categorias.COTIDIANO: 
					cotidiano.addLast(noticia);
					break;
				case Categorias.SOBRETUDO: 
					sobretudo.addLast(noticia);
					break;
				case Categorias.ILUSTRISSIMA: 
					ilustrissima.addLast(noticia);
					break;
				case Categorias.EDUCACAO: 
					educacao.addLast(noticia);
					break;
				case Categorias.SAOPAULO: 
					saopaulo.addLast(noticia);
					break;
				case Categorias.MUNDO: 
					mundo.addLast(noticia);
					break;
				case Categorias.OPINIAO: 
					opiniao.addLast(noticia);
					break;
				case Categorias.COLUNAS: 
					colunas.addLast(noticia);
                    break;
                case Categorias.TEC:
                    tec.addLast(noticia);
                    break;
                case Categorias.AMBIENTE:
                    ambiente.addLast(noticia);
                    break;
                case Categorias.EQUILIBRIOESAUDE:
                    equilibrioesaude.addLast(noticia);
                    break;
                case Categorias.TV:
                    tv.addLast(noticia);
                    break;
                case Categorias.BANCODEDADOS:
                    bancodedados.addLast(noticia);
                    break;
                case Categorias.CIENCIA:
                    ciencia.addLast(noticia);
                    break;
                case Categorias.PAINELDOLEITOR:
                    paineldoleitor.addLast(noticia);
                    break;
                case Categorias.SEMINARIOSFOLHA:
                    seminariosfolha.addLast(noticia);
                    break;
                case Categorias.TURISMO:
                    turismo.addLast(noticia);
                    break;
                case Categorias.EMPREENDEDORSOCIAL:
                    empreendedorsocial.addLast(noticia);
                    break;
                case Categorias.SERAFINA:
                    serafina.addLast(noticia);
                    break;
                case Categorias.ASMAIS:
                    asmais.addLast(noticia);
                    break;
                case Categorias.OMELHORDESAOPAULO:
                    omelhordesaopaulo.addLast(noticia);
                    break;
                case Categorias.BBC:
                    bbc.addLast(noticia);
                    break;
                case Categorias.COMIDA:
                    comida.addLast(noticia);
                    break;
                case Categorias.MUSICA:
                    musica.addLast(noticia);
                    break;
                case Categorias.FOLHINHA:
                    folhinha.addLast(noticia);
                    break;
                case Categorias.ESPECIAL:
                    especial.addLast(noticia);
                    break;
                case Categorias.TREINAMENTO:
                    treinamento.addLast(noticia);
                    break;
                case Categorias.MULTIMIDIA:
                    multimidia.addLast(noticia);
                    break;
                case Categorias.CENARIOS2017:
                    cenarios2017.addLast(noticia);
                    break;
                case Categorias.TOPOFMIND:
                    topofmind.addLast(noticia);
                    break;
                case Categorias.DW:
                    dw.addLast(noticia);
                    break;
                case Categorias.OMBUDSMAN:
                    ombudsman.addLast(noticia);
                    break;
                case Categorias.CONTASDECASA:
                    contasdecasa.addLast(noticia);
                    break;
                case Categorias.MULHER:
                    mulher.addLast(noticia);
                    break;
                case Categorias.DATA2016:
                    data2016.addLast(noticia);
                    break;
                case Categorias.GUIADELIVROSDISCOSFILMES:
                    guiadelivrosdiscosfilmes.addLast(noticia);
                    break;
                case Categorias.TREINAMENTOCIENCIAESAUDE:
                    treinamentocienciaesaude.addLast(noticia);
                    break;
                case Categorias.RFI:
                    rfi.addLast(noticia);
                    break;
                case Categorias.VICE:
                    vice.addLast(noticia);
                    break;
                case Categorias.BICHOS:
                    bichos.addLast(noticia);
                    break;
                case Categorias.EURONEWS:
                    euronews.addLast(noticia);
                    break;
                case Categorias.GUIADELIVROSFILMESDISCOS:
                    guiadelivrosfilmesediscos.addLast(noticia);
                    break;
                case Categorias.INFOGRAFICOS:
                    infograficos.addLast(noticia);
                    break;
                case Categorias.DATA2015:
                    data2015.addLast(noticia);
                    break;
				default:
					break;
			}
		}

		GravaConjunto fileWriter = new GravaConjunto();

		fileWriter.gravarConjunto("poder", poder);
		fileWriter.gravarConjunto("esporte", esporte);
		fileWriter.gravarConjunto("mercado", mercado);
		fileWriter.gravarConjunto("ilustrada", ilustrada);
		fileWriter.gravarConjunto("cotidiano", cotidiano);
		fileWriter.gravarConjunto("sobretudo", sobretudo);
		fileWriter.gravarConjunto("ilustrissima", ilustrissima);
		fileWriter.gravarConjunto("educacao", educacao);
		fileWriter.gravarConjunto("saopaulo", saopaulo);
		fileWriter.gravarConjunto("mundo", mundo);
		fileWriter.gravarConjunto("opiniao", opiniao);
		fileWriter.gravarConjunto("colunas", colunas);
		fileWriter.gravarConjunto("tec", tec);
		fileWriter.gravarConjunto("ambiente", ambiente);
		fileWriter.gravarConjunto("equilibrioesaude", equilibrioesaude);
		fileWriter.gravarConjunto("tv", tv);
		fileWriter.gravarConjunto("bancodedados", bancodedados);
		fileWriter.gravarConjunto("ciencia", ciencia);
		fileWriter.gravarConjunto("paineldoleitor", paineldoleitor);
		fileWriter.gravarConjunto("seminariosfolha", seminariosfolha);
		fileWriter.gravarConjunto("turismo", turismo);
		fileWriter.gravarConjunto("empreendedorsocial", empreendedorsocial);
		fileWriter.gravarConjunto("serafina", serafina);
		fileWriter.gravarConjunto("asmais", asmais);
		fileWriter.gravarConjunto("omelhordesaopaulo", omelhordesaopaulo);
		fileWriter.gravarConjunto("bbc", bbc);
		fileWriter.gravarConjunto("comida", comida);
		fileWriter.gravarConjunto("musica", musica);
		fileWriter.gravarConjunto("folhinha", folhinha);
		fileWriter.gravarConjunto("especial", especial);
		fileWriter.gravarConjunto("treinamento", treinamento);
		fileWriter.gravarConjunto("multimidia", multimidia);
		fileWriter.gravarConjunto("cenarios2017", cenarios2017);
		fileWriter.gravarConjunto("topofmind", topofmind);
		fileWriter.gravarConjunto("dw", dw);
		fileWriter.gravarConjunto("ombudsman", ombudsman);
		fileWriter.gravarConjunto("contasdecasa", contasdecasa);
		fileWriter.gravarConjunto("mulher", mulher);
		fileWriter.gravarConjunto("data2016", data2016);
		fileWriter.gravarConjunto("guiadelivrosdiscosfilmes", guiadelivrosdiscosfilmes);
		fileWriter.gravarConjunto("treinamentocienciaesaude", treinamentocienciaesaude);
		fileWriter.gravarConjunto("rfi", rfi);
		fileWriter.gravarConjunto("vice", vice);
		fileWriter.gravarConjunto("bichos", bichos);
		fileWriter.gravarConjunto("euronews", euronews);
		fileWriter.gravarConjunto("guiadelivrosfilmesediscos", guiadelivrosfilmesediscos);
		fileWriter.gravarConjunto("infograficos", infograficos);
		fileWriter.gravarConjunto("data2015", data2015);
	}
	
	public static void main (String[] args) {
		try {
			fileReader = new BufferedReader( new FileReader ("Noticias.txt") );
			
			buffer = new LinkedList<NoticiaEntidade>();
			
			String linha = fileReader.readLine();
			
			while (linha != null) {
				
				if ( linha.equals ("\"") ) 
					linha = preProcessamento(linha);
				
				fatorarLinha(linha);
				
				buffer.addLast(noticia);

				linha = fileReader.readLine();
			}
			fileReader.close();
			
			//imprimeBuffer();
			// Categorias.qtdCategorias(buffer);
			// Categorias.descobreCategoria(buffer);
			produzirArquivos();
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.toString());
			System.exit(1);
		}
	}
}