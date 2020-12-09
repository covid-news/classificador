import java.util.*;

public class Categorias {
    public static final String PODER = "poder";
    public static final String ESPORTE = "esporte";
    public static final String MERCADO = "mercado";
    public static final String ILUSTRADA = "ilustrada";
    public static final String COTIDIANO = "cotidiano";
    public static final String SOBRETUDO = "sobretudo";
    public static final String ILUSTRISSIMA = "ilustrissima";
    public static final String EDUCACAO = "educacao";
    public static final String SAOPAULO = "saopaulo";
    public static final String MUNDO = "mundo";
    public static final String OPINIAO = "opiniao";
    public static final String COLUNAS = "colunas";
    public static final String TEC = "tec";
    public static final String AMBIENTE = "ambiente";
    public static final String EQUILIBRIOESAUDE = "equilibrioesaude";
    public static final String TV = "tv";
    public static final String BANCODEDADOS = "banco-de-dados";
    public static final String CIENCIA = "ciencia";
    public static final String PAINELDOLEITOR = "paineldoleitor";
    public static final String SEMINARIOSFOLHA = "seminariosfolha";
    public static final String TURISMO = "turismo";
    public static final String EMPREENDEDORSOCIAL = "empreendedorsocial";
    public static final String SERAFINA = "serafina";
    public static final String ASMAIS = "asmais";
    public static final String OMELHORDESAOPAULO = "o-melhor-de-sao-paulo";
    public static final String BBC = "bbc";
    public static final String COMIDA = "comida";
    public static final String MUSICA = "musica";
    public static final String FOLHINHA = "folhinha";
    public static final String ESPECIAL = "especial";
    public static final String TREINAMENTO = "treinamento";
    public static final String MULTIMIDIA = "multimidia";
    public static final String CENARIOS2017 = "cenarios-2017";
    public static final String TOPOFMIND = "topofmind";
    public static final String DW = "dw";
    public static final String OMBUDSMAN = "ombudsman";
    public static final String CONTASDECASA = "contasdecasa";
    public static final String MULHER = "mulher";
    public static final String DATA2016 = "2016";
    public static final String GUIADELIVROSDISCOSFILMES = "guia-de-livros-discos-filmes";
    public static final String TREINAMENTOCIENCIAESAUDE = "treinamentocienciaesaude";
    public static final String RFI = "rfi";
    public static final String VICE = "vice";
    public static final String BICHOS = "bichos";
    public static final String EURONEWS = "euronews";
    public static final String GUIADELIVROSFILMESDISCOS = "guia-de-livros-filmes-discos";
    public static final String INFOGRAFICOS = "infograficos";
    public static final String DATA2015 = "2015";

    public static boolean categoriaCadastrada (String categoria) {
        if (categoria.equals(PODER) || categoria.equals(ESPORTE) || categoria.equals(MERCADO) || categoria.equals(ILUSTRADA) || categoria.equals(COTIDIANO))
            return true;
        if (categoria.equals(SOBRETUDO) || categoria.equals(ILUSTRISSIMA) || categoria.equals(EDUCACAO) || categoria.equals(SAOPAULO) || categoria.equals(MUNDO))
            return true;
        if (categoria.equals(OPINIAO) || categoria.equals(COLUNAS) || categoria.equals(TEC) || categoria.equals(AMBIENTE) || categoria.equals(EQUILIBRIOESAUDE))
            return true;
        if (categoria.equals(TV) || categoria.equals(BANCODEDADOS) || categoria.equals(CIENCIA) || categoria.equals(PAINELDOLEITOR))
            return true;
        if (categoria.equals(SEMINARIOSFOLHA) || categoria.equals(TURISMO) || categoria.equals(EMPREENDEDORSOCIAL) || categoria.equals(SERAFINA) || categoria.equals(ASMAIS))
            return true;
        if (categoria.equals(OMELHORDESAOPAULO) || categoria.equals(BBC) || categoria.equals(COMIDA) || categoria.equals(MUSICA) || categoria.equals(FOLHINHA))
            return true;
        if (categoria.equals(ESPECIAL) || categoria.equals(TREINAMENTO) || categoria.equals(MULTIMIDIA) || categoria.equals(CENARIOS2017) || categoria.equals(TOPOFMIND) || categoria.equals(DW))
            return true;
        if (categoria.equals(OMBUDSMAN) || categoria.equals(CONTASDECASA) || categoria.equals(MULHER) || categoria.equals(DATA2016) || categoria.equals(GUIADELIVROSDISCOSFILMES) || categoria.equals(TREINAMENTOCIENCIAESAUDE))
            return true;
        if (categoria.equals(RFI) || categoria.equals(VICE) || categoria.equals(BICHOS) || categoria.equals(EURONEWS) || categoria.equals(GUIADELIVROSFILMESDISCOS) || categoria.equals(INFOGRAFICOS) || categoria.equals(DATA2015))
            return true;
        return false;
    }

    public static void qtdCategorias(LinkedList<NoticiaEntidade> buffer) {
        NoticiaEntidade noticia = new NoticiaEntidade();

		int contadorPoder = 0;
		int contadorEsporte = 0;
		int contadorMercado = 0;
		int contadorIlustrada = 0;
		int contadorCotidiano = 0;
		int contadorSobretudo = 0;
		int contadorIlustrissima = 0;
		int contadorEducacao = 0;
		int contadorSaoPaulo = 0;
		int contadorMundo = 0;
		int contadorOpiniao = 0;
        int contadorColunas = 0;
        int contadorTec = 0;
        int contadorAmbiente = 0;
        int contadorEquilibrioESaude = 0;
        int contadorTv = 0;
        int contadorBancoDeDados = 0;
        int contadorCiencia = 0;
        int contadorPainelDoLeitor = 0;
		int contadorSeminariosFolha = 0;
        int contadorTurismo = 0;
        int contadorEmpreendedorSocial = 0;
        int contadorSerafina = 0;
        int contadorAsMais = 0;
        int contadorOMelhorDeSaoPaulo = 0;
        int contadorBBC = 0;
        int contadorComida = 0;
        int contadorMusica = 0;
        int contadorFolhinha = 0;
        int contadorEspecial = 0;
        int contadorTreinamento = 0;
        int contadorMultimidia = 0;
        int contadorCenarios2017 = 0;
        int contadorTopOfMind = 0;
        int contadorDW = 0;
        int contadorOmBudsMan = 0;
        int contadorContasDeCasa = 0;
        int contadorMulher = 0;
        int contador2016 = 0;
        int contadorGuiaDeLivrosDiscosFilmes = 0;
        int contadorTreinamentoCienciaESaude = 0;
        int contadorRFI = 0;
        int contadorVice = 0;
        int contadorBichos = 0;
        int contadorEuronews = 0;
        int contadorGuiaDeLivrosFilmesDiscos = 0;
        int contadorInfograficos = 0;
        int contador2015 = 0;
		int total = 0;
		
		Iterator<NoticiaEntidade> i = buffer.iterator();
		
		System.out.println("Resumo de contagem de categorias: \n");
		
		while (i.hasNext()) {
			noticia = i.next();

			switch (noticia.categoria) {
				case "poder": 
					contadorPoder++;
					break;
				case "esporte": 
					contadorEsporte++;
					break;
				case "mercado": 
					contadorMercado++;
					break;	
				case "ilustrada": 
					contadorIlustrada++;
					break;
				case "cotidiano": 
					contadorCotidiano++;
					break;
				case "sobretudo": 
					contadorSobretudo++;
					break;
				case "ilustrissima": 
					contadorIlustrissima++;
					break;
				case "educacao": 
					contadorEducacao++;
					break;
				case "saopaulo": 
					contadorSaoPaulo++;
					break;
				case "mundo": 
					contadorMundo++;
					break;
				case "opiniao": 
					contadorOpiniao++;
					break;
				case "colunas": 
					contadorColunas++;
                    break;
                case TEC:
                    contadorTec++;
                    break;
                case AMBIENTE:
                    contadorAmbiente++;
                    break;
                case EQUILIBRIOESAUDE:
                    contadorEquilibrioESaude++;
                    break;
                case TV:
                    contadorTv++;
                    break;
                case BANCODEDADOS:
                    contadorBancoDeDados++;
                    break;
                case CIENCIA:
                    contadorCiencia++;
                    break;
                case PAINELDOLEITOR:
                    contadorPainelDoLeitor++;
                    break;
                case SEMINARIOSFOLHA:
                    contadorSeminariosFolha++;
                    break;
                case TURISMO:
                    contadorTurismo++;
                    break;
                case EMPREENDEDORSOCIAL:
                    contadorEmpreendedorSocial++;
                    break;
                case SERAFINA:
                    contadorSerafina++;
                    break;
                case ASMAIS:
                    contadorAsMais++;
                    break;
                case OMELHORDESAOPAULO:
                    contadorOMelhorDeSaoPaulo++;
                    break;
                case BBC:
                    contadorBBC++;
                    break;
                case COMIDA:
                    contadorComida++;
                    break;
                case MUSICA:
                    contadorMusica++;
                    break;
                case FOLHINHA:
                    contadorFolhinha++;
                    break;
                case ESPECIAL:
                    contadorEspecial++;
                    break;
                case TREINAMENTO:
                    contadorTreinamento++;
                    break;
                case MULTIMIDIA:
                    contadorMultimidia++;
                    break;
                case CENARIOS2017:
                    contadorCenarios2017++;
                    break;
                case TOPOFMIND:
                    contadorTopOfMind++;
                    break;
                case DW:
                    contadorDW++;
                    break;
                case OMBUDSMAN:
                    contadorOmBudsMan++;
                    break;
                case CONTASDECASA:
                    contadorContasDeCasa++;
                    break;
                case MULHER:
                    contadorMulher++;
                    break;
                case DATA2016:
                    contador2016++;
                    break;
                case GUIADELIVROSDISCOSFILMES:
                    contadorGuiaDeLivrosDiscosFilmes++;
                    break;
                case TREINAMENTOCIENCIAESAUDE:
                    contadorTreinamentoCienciaESaude++;
                    break;
                case RFI:
                    contadorRFI++;
                    break;
                case VICE:
                    contadorVice++;
                    break;
                case BICHOS:
                    contadorBichos++;
                    break;
                case EURONEWS:
                    contadorEuronews++;
                    break;
                case GUIADELIVROSFILMESDISCOS:
                    contadorGuiaDeLivrosFilmesDiscos++;
                    break;
                case INFOGRAFICOS:
                    contadorInfograficos++;
                    break;
                case DATA2015:
                    contador2015++;
                    break;
				default:
					break;
			}
			total++;
		}

		System.out.println("Categoria PODER: " + contadorPoder);
		System.out.println("Categoria ESPORTE: " + contadorEsporte);
		System.out.println("Categoria MERCADO: " + contadorMercado);
		System.out.println("Categoria ILUSTRADA: " + contadorIlustrada);
		System.out.println("Categoria COTIDIANO: " + contadorCotidiano);
		System.out.println("Categoria SOBRETUDO: " + contadorSobretudo);
		System.out.println("Categoria ILUSTRISSIMA: " + contadorIlustrissima);
		System.out.println("Categoria EDUCACAO: " + contadorEducacao);
		System.out.println("Categoria SAO PAULO: " + contadorSaoPaulo);
		System.out.println("Categoria MUNDO: " + contadorMundo);
		System.out.println("Categoria OPINIAO: " + contadorOpiniao);
        System.out.println("Categoria COLUNAS: " + contadorColunas);
        System.out.println("Categoria TEC: " + contadorTec);
        System.out.println("Categoria AMBIENTE: " + contadorAmbiente);
        System.out.println("Categoria EQUILIBRIOESAUDE: " + contadorEquilibrioESaude);
        System.out.println("Categoria TV: " + contadorTv);
        System.out.println("Categoria BANCODEDADOS: " + contadorBancoDeDados);
        System.out.println("Categoria CIENCIA: " + contadorCiencia);
        System.out.println("Categoria PAINELDOLEITOR: " + contadorPainelDoLeitor);
        System.out.println("Categoria SEMINARIOSFOLHA: " + contadorSeminariosFolha);
        System.out.println("Categoria TURISMO: " + contadorTurismo);
        System.out.println("Categoria EMPREENDEDORSOCIAL: " + contadorEmpreendedorSocial);
        System.out.println("Categoria SERAFINA: " + contadorSerafina);
        System.out.println("Categoria ASMAIS: " + contadorAsMais);
        System.out.println("Categoria OMELHORDESAOPAULO: " + contadorOMelhorDeSaoPaulo);
        System.out.println("Categoria BBC: " + contadorBBC);
        System.out.println("Categoria COMIDA: " + contadorComida);
        System.out.println("Categoria MUSICA: " + contadorMusica);
        System.out.println("Categoria FOLHINHA: " + contadorFolhinha);
        System.out.println("Categoria ESPECIAL: " + contadorEspecial);
        System.out.println("Categoria TREINAMENTO: " + contadorTreinamento);
        System.out.println("Categoria MULTIMIDIA: " + contadorMultimidia);
        System.out.println("Categoria CENARIOS2017: " + contadorCenarios2017);
        System.out.println("Categoria TOPOFMIND: " + contadorTopOfMind);
        System.out.println("Categoria DW: " + contadorDW);
        System.out.println("Categoria OMBUDSMAN: " + contadorOmBudsMan);
        System.out.println("Categoria CONTASDECASA: " + contadorContasDeCasa);
        System.out.println("Categoria MULHER: " + contadorMulher);
        System.out.println("Categoria 2016: " + contador2016);
        System.out.println("Categoria GUIADELIVROSDISCOSFILMES: " + contadorGuiaDeLivrosDiscosFilmes);
        System.out.println("Categoria TREINAMENTOCIENCIAESAUDE: " + contadorTreinamentoCienciaESaude);
        System.out.println("Categoria RFI: " + contadorRFI);
        System.out.println("Categoria VICE: " + contadorVice);
        System.out.println("Categoria BICHOS: " + contadorBichos);
        System.out.println("Categoria EURONEWS: " + contadorEuronews);
        System.out.println("Categoria GUIADELIVROSFILMESDISCOS: " + contadorGuiaDeLivrosFilmesDiscos);
        System.out.println("Categoria INFOGRAFICOS: " + contadorInfograficos);
        System.out.println("Categoria 2015: " + contador2015);
		System.out.println("TOTAL: " + total);
    }
    
	public static void descobreCategoria(LinkedList<NoticiaEntidade> buffer) {
        Iterator<NoticiaEntidade> i = buffer.iterator();
        NoticiaEntidade noticia = new NoticiaEntidade();
        LinkedList<String> novasCategorias = new LinkedList<String>();
        int contador = 0;
		
        System.out.println("Descobrindo novas categorias: \n");
        
        while (i.hasNext()) {
            noticia = i.next();

            if ( !categoriaCadastrada(noticia.categoria) ) {
                if ( !novasCategorias.contains(noticia.categoria) ) {
                    novasCategorias.add(noticia.categoria);
                    contador++;
                }
            }
        }

        if (contador == 0)
            System.out.println("Não há novas categorias.");
        else { 
            Iterator<String> j = novasCategorias.iterator();

            while (j.hasNext())
                System.out.println("Nova categoria: " + j.next());

            System.out.println("\nForam descobertas " + contador + " novas categorias");
        }
	}
}
