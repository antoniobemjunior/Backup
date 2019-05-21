package projeto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.awt.Component;
import javax.swing.SwingConstants;

public class Principal {

	static int obterIndice = 0;


public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
	
	//Declaração e Inicialização das Variáveis
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int inicioX = 0, valor = 0, espacamento = 5;
	final int backR = 0, backG = 128, backB = 255;
	int[] resposta = new int[18];
	Random gerador = new Random();
	boolean valida;
	JFrame a = new JFrame();
	JFrame f = new JFrame();
	ImageIcon caminho = null;
	JPanel auxiliarAvaliar = new JPanel();
	JPanel auxiliarConfiguracoes = new JPanel();
	JPanel auxiliarFinal = new JPanel();
	JPanel auxiliarPrincipal = new JPanel();
	JPanel auxiliarRespostas = new JPanel();
	JButton anterior = new JButton("Anterior");
	JButton anterior2 = new JButton("Anterior");
	JButton anterior3 = new JButton("Anterior");
	JButton anterior4 = new JButton("Anterior");
	JButton botaoConfiguracoes = new JButton("Configurações");
	JButton botaoInformacoes = new JButton("Informações para avaliar meu trabalho");
	JButton botaoIniciar = new JButton("Iniciar");
	JButton botaoLogar = new JButton("Logar");
	JButton botaoOk = new JButton("OK");
	JButton proximo = new JButton("Próximo");
	JButton proximo2 = new JButton("Próximo");
	JButton proximo3 = new JButton("Próximo");
	JButton proximo4 = new JButton("Próximo");
	JButton voltar = new JButton("Voltar");
	JLabel imagem = new JLabel();
	JLabel lblbotaoLogar = new JLabel("Verifica se o login e a senha foram inseridos corretamente e");
	JLabel lblbotaoLogar2 = new JLabel("libera o acesso ao Guia de Avaliação.");
	JLabel lblbotaoOk = new JLabel("Retorna a tela inicial.");
	JLabel lblCor = new JLabel("Cor do plano de fundo");
	JLabel lblbotaoConfiguracoes = new JLabel("Botão de acesso as configurações do QUIZ.");
	JLabel lblbotaoInformacoes = new JLabel("Botão de acesso a tela de login.");
	JLabel lblbotaoIniciar = new JLabel("Botão que da início ao jogo de perguntas e respostas.");
	JLabel lblIdioma = new JLabel("Idioma das perguntas");
	JLabel lblLogin = new JLabel("Login");
	JLabel lblmario = new JLabel("Indica a posição que o usuário terminou o jogo.");
	JLabel lblSenha = new JLabel("Senha");
	JLabel lblSom = new JLabel("Som");
	JLabel lbllblCor = new JLabel("O usuário pode escolher 138 opções de cor de fundo.");
	JLabel lbllblHora = new JLabel("O usuário pode mostrar a hora ao longo das perguntas.");
	JLabel lbllblIdioma = new JLabel("O usuário pode escolher perguntas em português ou inglês.");
	JLabel lbllblSom = new JLabel("O usuário pode ativar o som ao longo das perguntas.");
	JLabel lbllbllblLogin = new JLabel("Logar para ter acesso ao Guia de Avaliação. Login: Ralf.");
	JLabel lbllbllblSenha = new JLabel("Senha para ter acesso ao Guia de Avaliação. Senha: Lima.");
	JLabel mario = new JLabel();
	JLabel lbl = new JLabel("Bem vindo ao QUIZ.");
	JButton horanao = new JButton("Não");
	JButton horasim = new JButton("Sim");
	JButton ingles = new JButton("Inglês");
	JButton ok = new JButton("OK");
	JButton portugues = new JButton("Português");
	JButton somnao = new JButton("Não");
	JButton somsim = new JButton("Sim");
	JLabel cor001 = new JLabel();
	JLabel cor002 = new JLabel();
	JLabel cor003 = new JLabel();
	JLabel cor004 = new JLabel();
	JLabel cor005 = new JLabel();
	JLabel cor006 = new JLabel();
	JLabel cor007 = new JLabel();
	JLabel cor008 = new JLabel();
	JLabel cor009 = new JLabel();
	JLabel cor010 = new JLabel();
	JLabel cor011 = new JLabel();
	JLabel cor012 = new JLabel();
	JLabel cor013 = new JLabel();
	JLabel cor014 = new JLabel();
	JLabel cor015 = new JLabel();
	JLabel cor016 = new JLabel();
	JLabel cor017 = new JLabel();
	JLabel cor018 = new JLabel();
	JLabel cor019 = new JLabel();
	JLabel cor020 = new JLabel();
	JLabel cor021 = new JLabel();
	JLabel cor022 = new JLabel();
	JLabel cor023 = new JLabel();
	JLabel cor024 = new JLabel();
	JLabel cor025 = new JLabel();
	JLabel cor026 = new JLabel();
	JLabel cor027 = new JLabel();
	JLabel cor028 = new JLabel();
	JLabel cor029 = new JLabel();
	JLabel cor030 = new JLabel();
	JLabel cor031 = new JLabel();
	JLabel cor032 = new JLabel();
	JLabel cor033 = new JLabel();
	JLabel cor034 = new JLabel();
	JLabel cor035 = new JLabel();
	JLabel cor036 = new JLabel();
	JLabel cor037 = new JLabel();
	JLabel cor038 = new JLabel();
	JLabel cor039 = new JLabel();
	JLabel cor040 = new JLabel();
	JLabel cor041 = new JLabel();
	JLabel cor042 = new JLabel();
	JLabel cor043 = new JLabel();
	JLabel cor044 = new JLabel();
	JLabel cor045 = new JLabel();
	JLabel cor046 = new JLabel();
	JLabel cor047 = new JLabel();
	JLabel cor048 = new JLabel();
	JLabel cor049 = new JLabel();
	JLabel cor050 = new JLabel();
	JLabel cor051 = new JLabel();
	JLabel cor052 = new JLabel();
	JLabel cor053 = new JLabel();
	JLabel cor054 = new JLabel();
	JLabel cor055 = new JLabel();
	JLabel cor056 = new JLabel();
	JLabel cor057 = new JLabel();
	JLabel cor058 = new JLabel();
	JLabel cor059 = new JLabel();
	JLabel cor060 = new JLabel();
	JLabel cor061 = new JLabel();
	JLabel cor062 = new JLabel();
	JLabel cor063 = new JLabel();
	JLabel cor064 = new JLabel();
	JLabel cor065 = new JLabel();
	JLabel cor066 = new JLabel();
	JLabel cor067 = new JLabel();
	JLabel cor068 = new JLabel();
	JLabel cor069 = new JLabel();
	JLabel cor070 = new JLabel();
	JLabel cor071 = new JLabel();
	JLabel cor072 = new JLabel();
	JLabel cor073 = new JLabel();
	JLabel cor074 = new JLabel();
	JLabel cor075 = new JLabel();
	JLabel cor076 = new JLabel();
	JLabel cor077 = new JLabel();
	JLabel cor078 = new JLabel();
	JLabel cor079 = new JLabel();
	JLabel cor080 = new JLabel();
	JLabel cor081 = new JLabel();
	JLabel cor082 = new JLabel();
	JLabel cor083 = new JLabel();
	JLabel cor084 = new JLabel();
	JLabel cor085 = new JLabel();
	JLabel cor086 = new JLabel();
	JLabel cor087 = new JLabel();
	JLabel cor088 = new JLabel();
	JLabel cor089 = new JLabel();
	JLabel cor090 = new JLabel();
	JLabel cor091 = new JLabel();
	JLabel cor092 = new JLabel();
	JLabel cor093 = new JLabel();
	JLabel cor094 = new JLabel();
	JLabel cor095 = new JLabel();
	JLabel cor096 = new JLabel();
	JLabel cor097 = new JLabel();
	JLabel cor098 = new JLabel();
	JLabel cor099 = new JLabel();
	JLabel cor100 = new JLabel();
	JLabel cor101 = new JLabel();
	JLabel cor102 = new JLabel();
	JLabel cor103 = new JLabel();
	JLabel cor104 = new JLabel();
	JLabel cor105 = new JLabel();
	JLabel cor106 = new JLabel();
	JLabel cor107 = new JLabel();
	JLabel cor108 = new JLabel();
	JLabel cor109 = new JLabel();
	JLabel cor110 = new JLabel();
	JLabel cor111 = new JLabel();
	JLabel cor112 = new JLabel();
	JLabel cor113 = new JLabel();
	JLabel cor114 = new JLabel();
	JLabel cor115 = new JLabel();
	JLabel cor116 = new JLabel();
	JLabel cor117 = new JLabel();
	JLabel cor118 = new JLabel();
	JLabel cor119 = new JLabel();
	JLabel cor120 = new JLabel();
	JLabel cor121 = new JLabel();
	JLabel cor122 = new JLabel();
	JLabel cor123 = new JLabel();
	JLabel cor124 = new JLabel();
	JLabel cor125 = new JLabel();
	JLabel cor126 = new JLabel();
	JLabel cor127 = new JLabel();
	JLabel cor128 = new JLabel();
	JLabel cor129 = new JLabel();
	JLabel cor130 = new JLabel();
	JLabel cor131 = new JLabel();
	JLabel cor132 = new JLabel();
	JLabel cor133 = new JLabel();
	JLabel cor134 = new JLabel();
	JLabel cor135 = new JLabel();
	JLabel cor136 = new JLabel();
	JLabel cor137 = new JLabel();
	JLabel cor138 = new JLabel();
	JLabel hora = new JLabel("Hora");
	JLabel lblCores = new JLabel("Cor do plano de fundo");
	JLabel lblHora = new JLabel("Hora");
	JLabel lblIdiomas = new JLabel("Idioma das perguntas");
	JLabel som = new JLabel("Som");
	JLabel questao01 = new JLabel();
	JLabel questao02 = new JLabel();
	JLabel questao03 = new JLabel();
	JLabel questao04 = new JLabel();
	JLabel questao05 = new JLabel();
	JLabel questao06 = new JLabel();
	JLabel questao07 = new JLabel();
	JLabel questao08 = new JLabel();
	JLabel questao09 = new JLabel();
	JLabel questao10 = new JLabel();
	JLabel questao11 = new JLabel();
	JLabel questao12 = new JLabel();
	JLabel questao13 = new JLabel();
	JLabel questao14 = new JLabel();
	JLabel questao15 = new JLabel();
	JLabel questao16 = new JLabel();
	JLabel questao17 = new JLabel();
	JLabel questao18 = new JLabel();
	JLabel questao19 = new JLabel();
	JLabel questao20 = new JLabel();
	JLabel questao21 = new JLabel();
	JLabel questao22 = new JLabel();
	JLabel questao23 = new JLabel();
	JLabel questao24 = new JLabel();
	JLabel questao25 = new JLabel();
	JLabel questao26 = new JLabel();
	JLabel questao27 = new JLabel();
	JLabel questao28 = new JLabel();
	JLabel questao29 = new JLabel();
	JLabel questao30 = new JLabel();
	JLabel questao31 = new JLabel();
	JLabel questao32 = new JLabel();
	JLabel questao33 = new JLabel();
	JLabel questao34 = new JLabel();
	JLabel questao35 = new JLabel();
	JLabel questao36 = new JLabel();
	JLabel respostas = new JLabel("Respostas (Passe o mouse por cima da imagem)");
	JLabel respostasPortugues = new JLabel("Português");
	JLabel respostasIngles = new JLabel("Inglês");
	JLabel telaAvaliar = new JLabel();
	JLabel telaConfiguracoes = new JLabel();
	JLabel telaFinal = new JLabel();
	JLabel telaInicio = new JLabel();
	Image img = null; 
	JTextField lbllblLogin = new JTextField();
	JTextField lbllblSenha = new JTextField();

	inicioX = ((int) (screenSize.getHeight() - 400));
	imagem.setBounds(0, 0, (screenSize.width / 2) - 16, (screenSize.height / 2) + 50);
	
	//Gerando o vetor com a ordem das perguntas
	for (int i = 0; i < 18; i++) resposta[i] = -1;
	
	while (valor < 18) {
		obterIndice = gerador.nextInt(18);
		valida = false;
		
		// Verifica se há determinado número gerado no vetor
		for (int indiceLocal = 0; indiceLocal < 18; indiceLocal++) if (resposta[indiceLocal] == obterIndice) valida = true;
		
		// Atribui o valor se necessário
		if (valida == false) {
			resposta[valor] = obterIndice;
			valor++;
		}
	}
	obterIndice = 0;
	
	// JFrame Principal
	f.setSize(screenSize.width / 2, screenSize.height);
	f.setLocationRelativeTo(null);
	f.getContentPane().setLayout(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setResizable(false);
	f.setTitle("QUIZ");
	f.setIconImage(null);
	f.setVisible(true);
	
	// JFrame Auxiliar
	a.setBounds(f.getX() + f.getWidth() - 14, 0, screenSize.width / 4, screenSize.height);
	a.getContentPane().setLayout(null);
	a.setResizable(false);
	a.setTitle("GUIA PARA AVALIAR O TRABALHO");
	a.setIconImage(null);

	
	// Vetores da perguntas
	String[][] questoesBR = {
			{ "De quem é a famosa frase: \"Penso, logo existo\"?", "Platão", "Galileu Galilei", "Descartes", "Sócrates", "Francis Bacon", "c", "questao01.jpg", "questao01.wav" },
			{ "De onde é a invenção do chuveiro elétrico?", "França", "Inglaterra", "Brasil", "Austrália", "Itália", "c", "questao02.jpg", "questao02.wav" },
			{ "Quais o menor e o maior país do mundo?", "Vaticano e Rússia", "Nauru e China", "Mônaco e Canadá", "Malta e Estados Unidos", "São Marino e Índia", "a", "questao03.jpg", "questao03.wav" },
			{ "Qual o nome do presidente do Brasil que ficou conhecido como Jango?", "Jânio Quadros", "Jacinto Anjos", "Getúlio Vargas", "João Figueiredo", "João Goulart", "e", "questao04.jpg", "questao04.wav" }, 
			{ "Qual o grupo em que todas as palavras foram escritas corretamente?", "Asterístico, beneficiente, meteorologia, entertido", "Asterisco, beneficente, meteorologia, entretido", "Asterisco, beneficente, metereologia, entretido", "Asterístico, beneficiente, metereologia, entretido", "Asterisco, beneficiente, metereologia, entretido", "b", "questao05.jpg", "questao05.wav" },
			{ "Qual o livro mais vendido no mundo a seguir à Bíblia?", "O Senhor dos Anéis", "Dom Quixote", "O Pequeno Príncipe", "Ela, a Feiticeira", "Um Conto de Duas Cidades", "b", "questao06.jpg", 						"questao06.wav" }, 
			{ "Quantas casas decimais tem o número pi?", "Duas", "Centenas", "Trilhares", "Vinte", "Milhares", "c", "questao07.jpg", "questao07.wav" },
			{ "Atualmente, quantos elementos químicos a tabela periódica possui?", "113", "109", "108", "118", "92", "d", "questao08.jpg", "questao08.wav" },
			{ "Quais os países que têm a maior e a menor expectativa de vida do mundo?", "Japão e Serra Leoa", "Austrália e Afeganistão", "Itália e Chade", "Brasil e Congo", "Estados Unidos e Angola", "a", "questao09.jpg", "questao09.wav" }, 
			{ "O que a palavra legend significa em português?", "Legenda", "Conto", "História", "Lenda", "Legendário", "d", "questao10.jpg", "questao10.wav" },
			{ "Qual o número mínimo de jogadores numa partida de futebol?", "8", "10", "9", "5", "7", "e", "questao11.jpg", "questao11.wav" }, 
			{ "Quais os principais autores do Barroco no Brasil?", "Gregório de Matos, Bento Teixeira e Manuel Botelho de Oliveira", "Miguel de Cervantes, Gregório de Matos e Danthe Alighieri", "Padre Antônio Vieira, Padre Manuel de Melo e Gregório de Matos", "Castro Alves, Bento Teixeira e Manuel Botelho de Oliveira", "Álvares de Azevedo, Gregório de Matos e Bento Teixeira", "a", "questao12.jpg", "questao12.wav" },
			{ "Quais as duas datas que são comemoradas em novembro?", "Independência do Brasil e Dia da Bandeira", "Proclamação da República e Dia Nacional da Consciência Negra", "Dia do Médico e Dia de São Lucas", "Dia de Finados e Dia Nacional do Livro", "Black Friday e Dia da Árvore", "b", "questao13.jpg", "questao13.wav" }, 				
			{ "Quem pintou \"Guernica\"?", "Paul Cézanne", "Pablo Picasso", "Diego Rivera", "Tarsila do Amaral", "Salvador Dalí", "b", "questao14.jpg", "questao14.wav" },
			{ "Quanto tempo a luz do Sol demora para chegar à Terra?", "12 minutos", "1 dia", "12 horas", "8 minutos", "15 segundos", "d", "questao15.jpg", "questao15.wav" },
			{ "Qual a tradução da frase \"Fabiano cogió su saco antes de salir\"?", "Fabiano coseu seu paletó antes de sair", "Fabiano fechou o saco antes de sair", "Fabiano pegou seu paletó antes de sair", "Fabiano cortou o saco antes de cair", "Fabiano rasgou seu paletó antes de cair", "c", "questao16.jpg", "questao16.wav" }, 
			{ "Qual a nacionalidade de Che Guevara?", "Cubana", "Peruana", "Panamenha", "Boliviana", "Argentina", "e", "questao17.jpg", "questao17.wav" }, 
			{ "Qual a altura da rede de vôlei nos jogos masculino e feminino?", "2,4 para ambos", "2,5 m e 2,0 m", "1,8 m e 1,5 m", "2,45 m e 2,15 m", "2,43 m e 2,24 m", "e", "questao18.jpg", "questao18.wav" }, };
	
	String[][] questoesEN = {
			{ "Complete the phrase: We ____ have to go to the mall.", "aren't", "are", "doesn't", "is", "don't", "e", "questao19.jpg", "questao19.wav" },
			{ "Which one is correct?", "I dosen´t like this guy", "She loves me so much", "They hasen´t to do the homework", "Ricardo want to kiss me", "They aren't home", "b", "questao20.jpg", "questao20.wav" }, 
			{ "Which of the alternatives is not a nationality?", "Chinese", "Spain", "German", "Indian", "Brazilian", "b", "questao21.jpg", "questao21.wav" },
			{ "Which of the alternatives correctly expresses the phrase \"It's 14:45\"?", "It's eleven and five", "It's one o'clock", "It's twenty to six", "It's a quarter to three", "It's eleven to eight", "d", "questao22.jpg", "questao22.wav" }, 
			{ "What is the correct translation for \"Meu pai é muito preguiçoso!\"?", "My father is not lazy!", "My dad é very courageous!", "I like to dance", "My father is fat!", "My father is very lazy!", "e", "questao23.jpg", "questao23.wav" },
			{ "Choose the phrase that is in the past:", "My boyfriend wants to marry me", "I didn´t want to go to this party!", "I like to watch videos with my friends", "The new mall will open in this city", "She is awesome!", "b", "questao24.jpg", "questao24.wav" },
			{ "Which of these alternatives is not a part of the body?", "shoulder", "hand", "number", "arm", "head","c", "questao25.jpg", "questao25.wav" },
			{ "Select the alternative whose phrase is conjugated correctly.", "She likes to dance with her cousins every weekend", "Did she knows that i love her?", "You is my best friend in the world!", "The house where i live are beaultiful", "I forget my keys yesterday", "a", "questao26.jpg", "questao26.wav" },
			{ "Complete the sentence: My cousin __ very nice to me! That´s why i like her!", "are", "don´t", "is", "isn´t", "aren´t", "c", "questao27.jpg", "questao27.wav" },
			{ "Choose the question word that is to be used in this phrase: ___ did you go last week?", "where", "why", "which", "what", "whose", "a", "questao28.jpg", "questao28.wav" },
			{ "What is the plural of \"batata\"?", "Tomatos", "Potatos", "Apples", "Potatoes", "Tomatoes", "d", "questao29.jpg", "questao29.wav" },
			{ "What is the answer to the question: Do you like ice-cream?", "Yes, I don't like", "No, I like", "Yes, I like OR Yes, I do", "Yes, I liked ice-cream", "None of the above", "c", "questao30.jpg", "questao30.wav" },
			{ "What does the English acronym SOS mean?", "Save our songs", "Save out souls", "Safe out songs", "Save our souls", "Saver out souls", "d", "questao31.jpg", "questao31.wav" },
			{ "In the English-language coffins, the letters RIP are written. What do they mean?", "Rest in piece", "Rest in peace", "Restart in planet", "Resolve intelligence plant", "Rest in plant", "b", "questao32.jpg", "questao32.wav" },
			{ "How do you say 33 in English?", "Twelve three", "Twenty three", "Thirty-three", "Forty three", "Three three", "c", "questao33.jpg", "questao33.wav" },
			{ "How do you say \"borracha\" in English?", "Ruler", "Eraser", "Knife", "Fork", "Watermelon", "b", "questao34.jpg", "questao34.wav" },
			{ "Which is the correct question to answer: \"Yes, there is a diner in this street\"?", "Is there a snack bar on this street?", "Are there a bar in this street?", "Do are a snack bar on this street?", "There is a snack bar on this street?", "None is correct", "a", "questao35.jpg", "questao35.wav" },
			{ "What is the alternative that answers the following question: How old are you?", "I have sixteen years old", "My name is Peter", "Yes, I'm eighteen", "I'm twenty years old", "I have twenty years old", "d", "questao36.jpg", "questao36.wav" }, };
	
	//Telas dos finais
	String[] finais = { "Layer 01.jpg", "Layer 02.jpg", "Layer 03.jpg", "Layer 04.jpg", "Layer 05.jpg", "Layer 06.jpg", "Layer 07.jpg", "Layer 08.jpg", "Layer 09.jpg", "Layer 10.jpg", "Layer 11.jpg", "Layer 12.jpg", "Layer 13.jpg", "Layer 14.jpg", "Layer 15.jpg", "Layer 16.jpg", "Layer 17.jpg", "Layer 18.jpg" };
	
	//Painel das configurações
	JPanel painelConfiguracoes = new JPanel();
	
	// Painel do Bem Vindo
	JPanel painelLogin = new JPanel();
	painelLogin.setBounds(0, 0, screenSize.width / 2, screenSize.height);
	painelLogin.setBackground(new Color(backR, backG, backB));
	painelLogin.setLayout(null);
	
	
	// JLabel bem vindo
	lbl.setFont(new Font("Arial", Font.BOLD, 30));
	lbl.setBounds(0, screenSize.height / 2, screenSize.width / 2, 30);
	lbl.setHorizontalAlignment(JLabel.CENTER);
	lbl.setForeground(new Color(255, 255, 255));
	
	// Adicionar ao painel de login
	painelLogin.add(lbl);
	painelLogin.setVisible(true);
	
	// Hora na tela das perguntas
	JLabel tempoNaTela = new JLabel();
	
	tempoNaTela.setAlignmentX(Component.CENTER_ALIGNMENT);
	tempoNaTela.setHorizontalAlignment(JLabel.CENTER);
	tempoNaTela.setFont(new Font("Arial", Font.BOLD, 20));
	tempoNaTela.setForeground(new Color(255, 255, 255));
	f.getContentPane().add(tempoNaTela);
	f.getContentPane().add(painelLogin);
	
	// Som de bem vindo ao QUIZ
	Clip clip = AudioSystem.getClip();
	clip.open(AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "\\src\\Sons\\Bem Vindo ao QUIZ.wav")));
	clip.start();
	
	//Paineis do JFrame auxiliar
	auxiliarPrincipal.setBounds(0, 0, a.getWidth(), a.getHeight() - 5);
	auxiliarPrincipal.setBackground(new Color(backR, backG, backB));
	auxiliarPrincipal.setLayout(null);
	
	auxiliarConfiguracoes.setBounds(0, 0, a.getWidth(), a.getHeight() - 5);
	auxiliarConfiguracoes.setBackground(new Color(backR, backG, backB));
	auxiliarConfiguracoes.setLayout(null);
	
	auxiliarAvaliar.setBounds(0, 0, a.getWidth(), a.getHeight() - 5);
	auxiliarAvaliar.setBackground(new Color(backR, backG, backB));
	auxiliarAvaliar.setLayout(null);
	
	auxiliarRespostas.setBounds(0, 0, a.getWidth(), a.getHeight() - 5);
	auxiliarRespostas.setBackground(new Color(backR, backG, backB));
	auxiliarRespostas.setLayout(null);
	
	auxiliarFinal.setBounds(0, 0, a.getWidth(), a.getHeight() - 5);
	auxiliarFinal.setBackground(new Color(backR, backG, backB));
	auxiliarFinal.setLayout(null);
	
	// Itens do painel auxiliar para as respostas
	respostas.setHorizontalAlignment(JLabel.CENTER);
	respostas.setFont(new Font("Arial", Font.BOLD, 16));
	respostas.setForeground(new Color(255, 255, 255));
	respostas.setBounds(espacamento, espacamento, auxiliarPrincipal.getWidth() - 16, (int) (screenSize.getHeight() / 50));
	respostas.setVisible(true);
	
	respostasPortugues.setHorizontalAlignment(JLabel.LEFT);
	respostasPortugues.setFont(new Font("Arial", Font.BOLD, 16));
	respostasPortugues.setForeground(new Color(255, 255, 255));
	respostasPortugues.setBounds(espacamento, respostas.getY() + respostas.getHeight(), respostas.getWidth(), respostas.getHeight());
	respostasPortugues.setVisible(true);
	
	questao01.setBounds(espacamento, respostasPortugues.getY() + respostasPortugues.getHeight() + espacamento, (int) (screenSize.getWidth() / 13), (int) (screenSize.getHeight() / 15));
	questao01.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao01.jpg");
	img = caminho.getImage().getScaledInstance(questao01.getWidth(), questao01.getHeight(), Image.SCALE_SMOOTH);
	questao01.setIcon(new ImageIcon(img));
	questao01.setOpaque(true);
	questao01.setToolTipText(questoesBR[0][6]);
	questao01.setVisible(true);
	
	questao02.setBounds(questao01.getX() + questao01.getWidth() + espacamento, questao01.getY(), questao01.getWidth(), questao01.getHeight());
	questao02.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao02.jpg");
	img = caminho.getImage().getScaledInstance(questao02.getWidth(), questao02.getHeight(), Image.SCALE_SMOOTH);
	questao02.setIcon(new ImageIcon(img));
	questao02.setOpaque(true);
	questao02.setToolTipText(questoesBR[1][6]);
	questao02.setVisible(true);
	
	questao03.setBounds(questao02.getX() + questao02.getWidth() + espacamento, questao02.getY(), questao02.getWidth(), questao02.getHeight());
	questao03.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao03.jpg");
	img = caminho.getImage().getScaledInstance(questao03.getWidth(), questao03.getHeight(), Image.SCALE_SMOOTH);
	questao03.setIcon(new ImageIcon(img));
	questao03.setOpaque(true);
	questao03.setToolTipText(questoesBR[2][6]);
	questao03.setVisible(true);
	
	questao04.setBounds(espacamento, questao03.getY() + questao03.getHeight() + espacamento, questao03.getWidth(), questao03.getHeight());
	questao04.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao04.jpg");
	img = caminho.getImage().getScaledInstance(questao04.getWidth(), questao04.getHeight(), Image.SCALE_SMOOTH);
	questao04.setIcon(new ImageIcon(img));
	questao04.setOpaque(true);
	questao04.setToolTipText(questoesBR[3][6]);
	questao04.setVisible(true);
	
	questao05.setBounds(questao04.getX() + questao04.getWidth() + espacamento, questao04.getY(), questao04.getWidth(), questao04.getHeight());
	questao05.setBorder(new LineBorder(new Color(0, 0, 0), 1)); 
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao05.jpg");
	img = caminho.getImage().getScaledInstance(questao05.getWidth(), questao05.getHeight(), Image.SCALE_SMOOTH);
	questao05.setIcon(new ImageIcon(img));
	questao05.setOpaque(true);
	questao05.setToolTipText(questoesBR[4][6]);
	questao05.setVisible(true);
	
	questao06.setBounds(questao05.getX() + questao05.getWidth() + espacamento, questao05.getY(), questao05.getWidth(), questao05.getHeight());
	questao06.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao06.jpg");
	img = caminho.getImage().getScaledInstance(questao06.getWidth(), questao06.getHeight(), Image.SCALE_SMOOTH);
	questao06.setIcon(new ImageIcon(img));
	questao06.setOpaque(true);
	questao06.setToolTipText(questoesBR[5][6]);
	questao06.setVisible(true);
	
	questao07.setBounds(espacamento, questao06.getY() + questao06.getHeight() + espacamento, questao06.getWidth(), questao06.getHeight());
	questao07.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao07.jpg");
	img = caminho.getImage().getScaledInstance(questao07.getWidth(), questao07.getHeight(), Image.SCALE_SMOOTH);
	questao07.setIcon(new ImageIcon(img));
	questao07.setOpaque(true);
	questao07.setToolTipText(questoesBR[6][6]);
	questao07.setVisible(true);
	
	questao08.setBounds(questao07.getX() + questao07.getWidth() + espacamento, questao07.getY(), questao07.getWidth(), questao07.getHeight());
	questao08.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao08.jpg");
	img = caminho.getImage().getScaledInstance(questao08.getWidth(), questao08.getHeight(), Image.SCALE_SMOOTH);
	questao08.setIcon(new ImageIcon(img));
	questao08.setOpaque(true);
	questao08.setToolTipText(questoesBR[7][6]);
	questao08.setVisible(true);
	
	questao09.setBounds(questao08.getX() + questao08.getWidth() + espacamento, questao08.getY(), questao08.getWidth(), questao08.getHeight());
	questao09.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao09.jpg");
	img = caminho.getImage().getScaledInstance(questao09.getWidth(), questao09.getHeight(), Image.SCALE_SMOOTH);
	questao09.setIcon(new ImageIcon(img));
	questao09.setOpaque(true);
	questao09.setToolTipText(questoesBR[8][6]);
	questao09.setVisible(true);
	
	questao10.setBounds(espacamento, questao09.getY() + questao09.getHeight() + espacamento, questao09.getWidth(), questao09.getHeight());
	questao10.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao10.jpg");
	img = caminho.getImage().getScaledInstance(questao10.getWidth(), questao10.getHeight(), Image.SCALE_SMOOTH);
	questao10.setIcon(new ImageIcon(img));
	questao10.setOpaque(true);
	questao10.setToolTipText(questoesBR[9][6]);
	questao10.setVisible(true);
	
	questao11.setBounds(questao10.getX() + questao10.getWidth() + espacamento, questao10.getY(), questao10.getWidth(), questao10.getHeight());
	questao11.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao11.jpg");
	img = caminho.getImage().getScaledInstance(questao11.getWidth(), questao11.getHeight(), Image.SCALE_SMOOTH);
	questao11.setIcon(new ImageIcon(img));
	questao11.setOpaque(true);
	questao11.setToolTipText(questoesBR[10][6]);
	questao11.setVisible(true);
	
	questao12.setBounds(questao11.getX() + questao11.getWidth() + espacamento, questao11.getY(), questao11.getWidth(), questao11.getHeight());
	questao12.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao12.jpg");
	img = caminho.getImage().getScaledInstance(questao12.getWidth(), questao12.getHeight(), Image.SCALE_SMOOTH);
	questao12.setIcon(new ImageIcon(img));
	questao12.setOpaque(true);
	questao12.setToolTipText(questoesBR[11][6]);
	questao12.setVisible(true);
	
	questao13.setBounds(espacamento, questao12.getY() + questao12.getHeight() + espacamento, questao12.getWidth(), questao12.getHeight());
	questao13.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao13.jpg");
	img = caminho.getImage().getScaledInstance(questao13.getWidth(), questao13.getHeight(), Image.SCALE_SMOOTH);
	questao13.setIcon(new ImageIcon(img));
	questao13.setOpaque(true);
	questao13.setToolTipText(questoesBR[12][6]);
	questao13.setVisible(true);
	
	questao14.setBounds(questao13.getX() + questao13.getWidth() + espacamento, questao13.getY(), questao13.getWidth(), questao13.getHeight());
	questao14.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao14.jpg");
	img = caminho.getImage().getScaledInstance(questao14.getWidth(), questao14.getHeight(), Image.SCALE_SMOOTH);
	questao14.setIcon(new ImageIcon(img));
	questao14.setOpaque(true);
	questao14.setToolTipText(questoesBR[13][6]);
	questao14.setVisible(true);
	
	questao15.setBounds(questao14.getX() + questao14.getWidth() + espacamento, questao14.getY(), questao14.getWidth(), questao14.getHeight());
	questao15.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao15.jpg");
	img = caminho.getImage().getScaledInstance(questao15.getWidth(), questao15.getHeight(), Image.SCALE_SMOOTH);
	questao15.setIcon(new ImageIcon(img));
	questao15.setOpaque(true);
	questao15.setToolTipText(questoesBR[14][6]);
	questao15.setVisible(true);
	
	questao16.setBounds(espacamento, questao15.getY() + questao15.getHeight() + espacamento, questao15.getWidth(), questao15.getHeight());
	questao16.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao16.jpg");
	img = caminho.getImage().getScaledInstance(questao16.getWidth(), questao16.getHeight(), Image.SCALE_SMOOTH);
	questao16.setIcon(new ImageIcon(img));
	questao16.setOpaque(true);
	questao16.setToolTipText(questoesBR[15][6]);
	questao16.setVisible(true);
	
	questao17.setBounds(questao16.getX() + questao16.getWidth() + espacamento, questao16.getY(), questao16.getWidth(), questao16.getHeight());
	questao17.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao17.jpg");
	img = caminho.getImage().getScaledInstance(questao17.getWidth(), questao17.getHeight(), Image.SCALE_SMOOTH);
	questao17.setIcon(new ImageIcon(img));
	questao17.setOpaque(true);
	questao17.setToolTipText(questoesBR[16][6]);
	questao17.setVisible(true);
	
	questao18.setBounds(questao17.getX() + questao17.getWidth() + espacamento, questao17.getY(), questao17.getWidth(), questao17.getHeight());
	questao18.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao18.jpg");
	img = caminho.getImage().getScaledInstance(questao18.getWidth(), questao18.getHeight(), Image.SCALE_SMOOTH);
	questao18.setIcon(new ImageIcon(img));
	questao18.setOpaque(true);
	questao18.setToolTipText(questoesBR[17][6]);
	questao18.setVisible(true);
	
	respostasIngles.setHorizontalAlignment(JLabel.LEFT);
	respostasIngles.setFont(new Font("Arial", Font.BOLD, 16));
	respostasIngles.setForeground(new Color(255, 255, 255));
	respostasIngles.setBounds(espacamento, questao18.getY() + questao18.getHeight() + espacamento, respostas.getWidth(), respostas.getHeight());
	respostasIngles.setVisible(true);
	
	questao19.setBounds(espacamento, respostasIngles.getY() + respostasIngles.getHeight() + espacamento, (int) (screenSize.getWidth() / 13), (int) (screenSize.getHeight() / 15));
	questao19.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao19.jpg");
	img = caminho.getImage().getScaledInstance(questao19.getWidth(), questao19.getHeight(), Image.SCALE_SMOOTH);
	questao19.setIcon(new ImageIcon(img));
	questao19.setOpaque(true);
	questao19.setToolTipText(questoesEN[0][6]);
	questao19.setVisible(true);
	
	questao20.setBounds(questao19.getX() + questao19.getWidth() + espacamento, questao19.getY(), questao19.getWidth(), questao19.getHeight());
	questao20.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao20.jpg");
	img = caminho.getImage().getScaledInstance(questao20.getWidth(), questao20.getHeight(), Image.SCALE_SMOOTH);
	questao20.setIcon(new ImageIcon(img));
	questao20.setOpaque(true);
	questao20.setToolTipText(questoesEN[1][6]);
	questao20.setVisible(true);
	
	questao21.setBounds(questao20.getX() + questao20.getWidth() + espacamento, questao20.getY(), questao20.getWidth(), questao20.getHeight());
	questao21.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao21.jpg");
	img = caminho.getImage().getScaledInstance(questao21.getWidth(), questao21.getHeight(), Image.SCALE_SMOOTH);
	questao21.setIcon(new ImageIcon(img));
	questao21.setOpaque(true);
	questao21.setToolTipText(questoesEN[2][6]);
	questao21.setVisible(true);
	
	questao22.setBounds(espacamento, questao21.getY() + questao21.getHeight() + espacamento, questao21.getWidth(), questao21.getHeight());
	questao22.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao22.jpg");
	img = caminho.getImage().getScaledInstance(questao22.getWidth(), questao22.getHeight(), Image.SCALE_SMOOTH);
	questao22.setIcon(new ImageIcon(img));
	questao22.setOpaque(true);
	questao22.setToolTipText(questoesEN[3][6]);
	questao22.setVisible(true);
	
	questao23.setBounds(questao22.getX() + questao22.getWidth() + espacamento, questao22.getY(), questao22.getWidth(), questao22.getHeight());
	questao23.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao23.jpg");
	img = caminho.getImage().getScaledInstance(questao23.getWidth(), questao23.getHeight(), Image.SCALE_SMOOTH);
	questao23.setIcon(new ImageIcon(img));
	questao23.setOpaque(true);
	questao23.setToolTipText(questoesEN[4][6]);
	questao23.setVisible(true);
	
	questao24.setBounds(questao23.getX() + questao23.getWidth() + espacamento, questao23.getY(), questao23.getWidth(), questao23.getHeight());
	questao24.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao24.jpg");
	img = caminho.getImage().getScaledInstance(questao24.getWidth(), questao24.getHeight(), Image.SCALE_SMOOTH);
	questao24.setIcon(new ImageIcon(img));
	questao24.setOpaque(true);
	questao24.setToolTipText(questoesEN[5][6]);
	questao24.setVisible(true);
	
	questao25.setBounds(espacamento, questao24.getY() + questao24.getHeight() + espacamento, questao24.getWidth(), questao24.getHeight());
	questao25.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao25.jpg");
	img = caminho.getImage().getScaledInstance(questao25.getWidth(), questao25.getHeight(), Image.SCALE_SMOOTH);
	questao25.setIcon(new ImageIcon(img));
	questao25.setOpaque(true);
	questao25.setToolTipText(questoesEN[6][6]);
	questao25.setVisible(true);
	
	questao26.setBounds(questao25.getX() + questao25.getWidth() + espacamento, questao25.getY(), questao25.getWidth(), questao25.getHeight());
	questao26.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao26.jpg");
	img = caminho.getImage().getScaledInstance(questao26.getWidth(), questao26.getHeight(), Image.SCALE_SMOOTH);
	questao26.setIcon(new ImageIcon(img));
	questao26.setOpaque(true);
	questao26.setToolTipText(questoesEN[7][6]);
	questao26.setVisible(true);
	
	questao27.setBounds(questao26.getX() + questao26.getWidth() + espacamento, questao26.getY(), questao26.getWidth(), questao26.getHeight());
	questao27.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao27.jpg");
	img = caminho.getImage().getScaledInstance(questao27.getWidth(), questao27.getHeight(), Image.SCALE_SMOOTH);
	questao27.setIcon(new ImageIcon(img));
	questao27.setOpaque(true);
	questao27.setToolTipText(questoesEN[8][6]);
	questao27.setVisible(true);
	
	questao28.setBounds(espacamento, questao27.getY() + questao27.getHeight() + espacamento, questao27.getWidth(), questao27.getHeight());
	questao28.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao28.jpg");
	img = caminho.getImage().getScaledInstance(questao28.getWidth(), questao28.getHeight(), Image.SCALE_SMOOTH);
	questao28.setIcon(new ImageIcon(img));
	questao28.setOpaque(true);
	questao28.setToolTipText(questoesEN[9][6]);
	questao28.setVisible(true);
	
	questao29.setBounds(questao28.getX() + questao28.getWidth() + espacamento, questao28.getY(), questao28.getWidth(), questao28.getHeight());
	questao29.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao29.jpg");
	img = caminho.getImage().getScaledInstance(questao29.getWidth(), questao29.getHeight(), Image.SCALE_SMOOTH);
	questao29.setIcon(new ImageIcon(img));
	questao29.setOpaque(true);
	questao29.setToolTipText(questoesEN[10][6]);
	questao29.setVisible(true);
	
	questao30.setBounds(questao29.getX() + questao29.getWidth() + espacamento, questao29.getY(), questao29.getWidth(), questao29.getHeight());
	questao30.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao30.jpg");
	img = caminho.getImage().getScaledInstance(questao30.getWidth(), questao30.getHeight(), Image.SCALE_SMOOTH);
	questao30.setIcon(new ImageIcon(img));
	questao30.setOpaque(true);
	questao30.setToolTipText(questoesEN[11][6]);
	questao30.setVisible(true);
	
	questao31.setBounds(espacamento, questao30.getY() + questao30.getHeight() + espacamento, questao30.getWidth(), questao30.getHeight());
	questao31.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao31.jpg");
	img = caminho.getImage().getScaledInstance(questao31.getWidth(), questao31.getHeight(), Image.SCALE_SMOOTH);
	questao31.setIcon(new ImageIcon(img));
	questao31.setOpaque(true);
	questao31.setToolTipText(questoesEN[12][6]);
	questao31.setVisible(true);
	
	questao32.setBounds(questao31.getX() + questao31.getWidth() + espacamento, questao31.getY(), questao31.getWidth(), questao31.getHeight());
	questao32.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao32.jpg");
	img = caminho.getImage().getScaledInstance(questao32.getWidth(), questao32.getHeight(), Image.SCALE_SMOOTH);
	questao32.setIcon(new ImageIcon(img));
	questao32.setOpaque(true);
	questao32.setToolTipText(questoesEN[13][6]);
	questao32.setVisible(true);
	
	questao33.setBounds(questao32.getX() + questao32.getWidth() + espacamento, questao32.getY(), questao32.getWidth(), questao32.getHeight());
	questao33.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao33.jpg");
	img = caminho.getImage().getScaledInstance(questao33.getWidth(), questao33.getHeight(), Image.SCALE_SMOOTH);
	questao33.setIcon(new ImageIcon(img));
	questao33.setOpaque(true);
	questao33.setToolTipText(questoesEN[14][6]);
	questao33.setVisible(true);
	
	questao34.setBounds(espacamento, questao33.getY() + questao33.getHeight() + espacamento, questao33.getWidth(), questao33.getHeight());
	questao34.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao34.jpg");
	img = caminho.getImage().getScaledInstance(questao34.getWidth(), questao34.getHeight(), Image.SCALE_SMOOTH);
	questao34.setIcon(new ImageIcon(img));
	questao34.setOpaque(true);
	questao34.setToolTipText(questoesEN[15][6]);
	questao34.setVisible(true);
	
	questao35.setBounds(questao34.getX() + questao34.getWidth() + espacamento, questao34.getY(), questao34.getWidth(), questao34.getHeight());
	questao35.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao35.jpg");
	img = caminho.getImage().getScaledInstance(questao35.getWidth(), questao35.getHeight(), Image.SCALE_SMOOTH);
	questao35.setIcon(new ImageIcon(img));
	questao35.setOpaque(true);
	questao35.setToolTipText(questoesEN[16][6]);
	questao35.setVisible(true);
	
	questao36.setBounds(questao35.getX() + questao35.getWidth() + espacamento, questao35.getY(), questao35.getWidth(), questao35.getHeight());
	questao36.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\questao36.jpg");
	img = caminho.getImage().getScaledInstance(questao36.getWidth(), questao36.getHeight(), Image.SCALE_SMOOTH);
	questao36.setIcon(new ImageIcon(img));
	questao36.setOpaque(true);
	questao36.setToolTipText(questoesEN[17][6]);
	questao36.setVisible(true);
	
	// Botões de navegação entre os paineis do JFrame auxiliar
	proximo.setBounds(questao35.getX(), questao35.getY() + questao35.getHeight() + espacamento, questao35.getWidth(), respostas.getHeight() + 10);
	proximo.setFont(new Font("Arial", Font.BOLD, 16));
	
	anterior.setBounds(questao01.getX(), questao35.getY() + questao35.getHeight() + espacamento, questao35.getWidth(), respostas.getHeight() + 10);
	anterior.setFont(new Font("Arial", Font.BOLD, 16));
	anterior.setVisible(true);
	
	proximo2.setBounds(questao03.getX(), questao35.getY() + questao35.getHeight() + espacamento, questao35.getWidth(), respostas.getHeight() + 10);
	proximo2.setFont(new Font("Arial", Font.BOLD, 16));
	proximo2.setVisible(true);
	
	anterior2.setBounds(questao01.getX(), questao35.getY() + questao35.getHeight() + espacamento, questao35.getWidth(), respostas.getHeight() + 10);
	anterior2.setFont(new Font("Arial", Font.BOLD, 16));
	anterior2.setVisible(true);
	
	proximo3.setBounds(questao03.getX(), questao35.getY() + questao35.getHeight() + espacamento, questao35.getWidth(), respostas.getHeight() + 10);
	proximo3.setFont(new Font("Arial", Font.BOLD, 16));
	proximo3.setVisible(true);
	
	anterior3.setBounds(questao01.getX(), questao35.getY() + questao35.getHeight() + espacamento, questao35.getWidth(), respostas.getHeight() + 10);
	anterior3.setFont(new Font("Arial", Font.BOLD, 16));
	anterior3.setVisible(true);
	
	proximo4.setBounds(questao03.getX(), questao35.getY() + questao35.getHeight() + espacamento, questao35.getWidth(), respostas.getHeight() + 10);
	proximo4.setFont(new Font("Arial", Font.BOLD, 16));
	proximo4.setVisible(true);
	
	anterior4.setBounds(questao01.getX(), questao35.getY() + questao35.getHeight() + espacamento, questao35.getWidth(), respostas.getHeight() + 10);
	anterior4.setFont(new Font("Arial", Font.BOLD, 16));
	anterior4.setVisible(true);
	
	// Itens do painel auxiliar para a tela inicial
	telaInicio.setBounds(espacamento, espacamento, respostas.getWidth() - 10, (int) (screenSize.getHeight() / 2));
	telaInicio.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\telaInicio.jpg");
	img = caminho.getImage().getScaledInstance(telaInicio.getWidth(), telaInicio.getHeight(), Image.SCALE_SMOOTH);
	telaInicio.setIcon(new ImageIcon(img));
	telaInicio.setOpaque(true);
	
	botaoIniciar.setFont(new Font("Arial", Font.BOLD, 16));
	botaoIniciar.setBounds(espacamento, telaInicio.getY() + telaInicio.getHeight() + (espacamento * 5), respostas.getWidth() - 10, proximo.getHeight());
	botaoIniciar.setForeground(new Color(0, 0, 0));
	botaoIniciar.setFocusable(false);
	botaoIniciar.setSelected(false);
	
	lblbotaoIniciar.setFont(new Font("Arial", Font.PLAIN, 16));
	lblbotaoIniciar.setForeground(new Color(255, 255, 255));
	lblbotaoIniciar.setBounds(espacamento, botaoIniciar.getY() + botaoIniciar.getHeight() + espacamento, respostas.getWidth(), respostas.getHeight());
	
	botaoConfiguracoes.setFont(new Font("Arial", Font.BOLD, 16));
	botaoConfiguracoes.setBounds(espacamento, lblbotaoIniciar.getY() + lblbotaoIniciar.getHeight() + (espacamento * 5), respostas.getWidth() - 10, proximo.getHeight());
	botaoConfiguracoes.setForeground(new Color(0, 0, 0));
	botaoConfiguracoes.setFocusable(false);
	botaoConfiguracoes.setSelected(false);
	
	lblbotaoConfiguracoes.setFont(new Font("Arial", Font.PLAIN, 16));
	lblbotaoConfiguracoes.setForeground(new Color(255, 255, 255));
	lblbotaoConfiguracoes.setBounds(espacamento, botaoConfiguracoes.getY() + botaoConfiguracoes.getHeight() + espacamento, respostas.getWidth(), respostas.getHeight());
	
	botaoInformacoes.setFont(new Font("Arial", Font.BOLD, 16));
	botaoInformacoes.setBounds(espacamento, lblbotaoConfiguracoes.getY() + lblbotaoConfiguracoes.getHeight() + (espacamento * 5), respostas.getWidth() - 10, proximo.getHeight());
	botaoInformacoes.setForeground(new Color(0, 0, 0));
	botaoInformacoes.setFocusable(false);
	botaoInformacoes.setSelected(false);
	
	lblbotaoInformacoes.setFont(new Font("Arial", Font.PLAIN, 16));
	lblbotaoInformacoes.setForeground(new Color(255, 255, 255));
	lblbotaoInformacoes.setBounds(espacamento, botaoInformacoes.getY() + botaoInformacoes.getHeight() + espacamento, respostas.getWidth(), respostas.getHeight());
	
	// Itens do painel auxiliar para as configurações	
	telaConfiguracoes.setBounds(espacamento, espacamento, respostas.getWidth() - 10, (int) (screenSize.getHeight() / 2));
	telaConfiguracoes.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\telaConfiguracoes.jpg");
	img = caminho.getImage().getScaledInstance(telaConfiguracoes.getWidth(), telaConfiguracoes.getHeight(), Image.SCALE_SMOOTH);
	telaConfiguracoes.setIcon(new ImageIcon(img));
	telaConfiguracoes.setOpaque(true);
	
	lblCor.setFont(new Font("Arial", Font.BOLD, 16));
	lblCor.setBounds(espacamento, telaConfiguracoes.getY() + telaConfiguracoes.getHeight() + (espacamento * 5), respostas.getWidth() - 10, proximo.getHeight());
	lblCor.setForeground(new Color(0, 0, 0));
	lblCor.setFocusable(false);
	lblCor.setVisible(true);
	
	lbllblCor.setFont(new Font("Arial", Font.PLAIN, 16));
	lbllblCor.setForeground(new Color(255, 255, 255));
	lbllblCor.setBounds(espacamento, lblCor.getY() + lblCor.getHeight() + espacamento, respostas.getWidth(), respostas.getHeight());
	lbllblCor.setVisible(true);
	
	lblIdioma.setFont(new Font("Arial", Font.BOLD, 16));
	lblIdioma.setBounds(espacamento, lbllblCor.getY() + lbllblCor.getHeight() + (espacamento * 5), respostas.getWidth() - 10, proximo.getHeight());
	lblIdioma.setForeground(new Color(0, 0, 0));
	lblIdioma.setFocusable(false);
	lblIdioma.setVisible(true);
	
	lbllblIdioma.setFont(new Font("Arial", Font.PLAIN, 16));
	lbllblIdioma.setForeground(new Color(255, 255, 255));
	lbllblIdioma.setBounds(espacamento, lblIdioma.getY() + lblIdioma.getHeight() + espacamento, respostas.getWidth(), respostas.getHeight());
	lbllblIdioma.setVisible(true);
	
	lblHora.setFont(new Font("Arial", Font.BOLD, 16));
	lblHora.setBounds(espacamento, lbllblIdioma.getY() + lbllblIdioma.getHeight() + (espacamento * 5), respostas.getWidth() - 10, proximo.getHeight());
	lblHora.setForeground(new Color(0, 0, 0));
	lblHora.setFocusable(false);
	lblHora.setVisible(true);
	
	lbllblHora.setFont(new Font("Arial", Font.PLAIN, 16));
	lbllblHora.setForeground(new Color(255, 255, 255));
	lbllblHora.setBounds(espacamento, lblHora.getY() + lblHora.getHeight() + espacamento, respostas.getWidth(), respostas.getHeight());
	lbllblHora.setVisible(true);
	
	lblSom.setFont(new Font("Arial", Font.BOLD, 16));
	lblSom.setBounds(espacamento, lbllblHora.getY() + lbllblHora.getHeight() + (espacamento * 5), respostas.getWidth() - 10, proximo.getHeight());
	lblSom.setForeground(new Color(0, 0, 0));
	lblSom.setFocusable(false);
	lblSom.setVisible(true);
	
	lbllblSom.setFont(new Font("Arial", Font.PLAIN, 16));
	lbllblSom.setForeground(new Color(255, 255, 255));
	lbllblSom.setBounds(espacamento, lblSom.getY() + lblSom.getHeight() + espacamento, respostas.getWidth(), respostas.getHeight());
	lbllblSom.setVisible(true);
	
	botaoOk.setFont(new Font("Arial", Font.BOLD, 16));
	botaoOk.setBounds(espacamento, lbllblSom.getY() + lbllblSom.getHeight() + (espacamento * 5), questao35.getWidth() - 10, proximo.getHeight());
	botaoOk.setForeground(new Color(0, 0, 0));
	botaoOk.setFocusable(false);
	botaoOk.setSelected(false);
	botaoOk.setVisible(true);
	
	lblbotaoOk.setFont(new Font("Arial", Font.PLAIN, 16));
	lblbotaoOk.setForeground(new Color(255, 255, 255));
	lblbotaoOk.setBounds(espacamento, botaoOk.getY() + botaoOk.getHeight() + espacamento, respostas.getWidth(), respostas.getHeight());
	lblbotaoOk.setVisible(true);
	
	
	// Itens do painel auxiliar para a avaliação do trabalho
	telaAvaliar.setBounds(espacamento, espacamento, respostas.getWidth() - 10, (int) (screenSize.getHeight() / 2));
	telaAvaliar.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\telaAvaliar.jpg");
	img = caminho.getImage().getScaledInstance(telaAvaliar.getWidth(), telaAvaliar.getHeight(), Image.SCALE_SMOOTH);
	telaAvaliar.setIcon(new ImageIcon(img));
	telaAvaliar.setOpaque(true);
	
	lblLogin.setFont(new Font("Arial", Font.BOLD, 16));
	lblLogin.setBounds(espacamento * 10, telaAvaliar.getY() + telaAvaliar.getHeight() + (espacamento * 5), questao35.getWidth() - 10, proximo.getHeight());
	lblLogin.setForeground(new Color(0, 0, 0));
	lblLogin.setFocusable(false);
	lblLogin.setVisible(true);
	
	lbllblLogin.setBounds(espacamento, lblLogin.getY() + lblLogin.getHeight() + espacamento, questao35.getWidth() - 10, proximo.getHeight());
	lbllblLogin.setEnabled(false);
	lbllblLogin.setVisible(true);
	
	lbllbllblLogin.setForeground(new Color(255, 255, 255));
	lbllbllblLogin.setFont(new Font("Arial", Font.PLAIN, 16));
	lbllbllblLogin.setBounds(espacamento, lbllblLogin.getY() + lbllblLogin.getHeight() + espacamento, respostas.getWidth(), proximo.getHeight());
	lbllbllblLogin.setVisible(true);
	
	lblSenha.setFont(new Font("Arial", Font.BOLD, 16));
	lblSenha.setBounds(espacamento * 10, lbllbllblLogin.getY() + lbllbllblLogin.getHeight() + (espacamento * 5), questao35.getWidth() - 10, proximo.getHeight());
	lblSenha.setForeground(new Color(0, 0, 0));
	lblSenha.setFocusable(false);
	lblSenha.setVisible(true);
	
	lbllblSenha.setBounds(espacamento, lblSenha.getY() + lblSenha.getHeight() + espacamento, questao35.getWidth() - 10, proximo.getHeight());
	lbllblSenha.setEnabled(false);
	lbllblSenha.setVisible(true);
	
	lbllbllblSenha.setForeground(new Color(255, 255, 255));
	lbllbllblSenha.setFont(new Font("Arial", Font.PLAIN, 16));
	lbllbllblSenha.setBounds(espacamento, lbllblSenha.getY() + lbllblSenha.getHeight() + espacamento, respostas.getWidth(), proximo.getHeight());
	lbllbllblSenha.setVisible(true);
	
	botaoLogar.setFont(new Font("Arial", Font.BOLD, 16));
	botaoLogar.setBounds(espacamento, lbllbllblSenha.getY() + lbllbllblSenha.getHeight() + (espacamento * 5), questao35.getWidth() - 10, proximo.getHeight());
	botaoLogar.setForeground(new Color(0, 0, 0));
	botaoLogar.setFocusable(false);
	botaoLogar.setVisible(true);
	
	lblbotaoLogar.setFont(new Font("Arial", Font.PLAIN, 16));
	lblbotaoLogar.setForeground(new Color(255, 255, 255));
	lblbotaoLogar.setBounds(espacamento, botaoLogar.getY() + botaoLogar.getHeight() + espacamento, respostas.getWidth(), proximo.getHeight());
	lblbotaoLogar.setVisible(true);
	
	lblbotaoLogar2.setFont(new Font("Arial", Font.PLAIN, 16));
	lblbotaoLogar2.setForeground(new Color(255, 255, 255));
	lblbotaoLogar2.setBounds(espacamento, lblbotaoLogar.getY() + lblbotaoLogar.getHeight(), respostas.getWidth(), proximo.getHeight());
	lblbotaoLogar2.setVisible(true);
	
	
	// Itens do painel auxiliar para a tela final
	telaFinal.setBounds(espacamento, espacamento, respostas.getWidth() - 10, (int) (screenSize.getHeight() / 2));
	telaFinal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\telaFinal.jpg");
	img = caminho.getImage().getScaledInstance(telaFinal.getWidth(), telaFinal.getHeight(), Image.SCALE_SMOOTH);
	telaFinal.setIcon(new ImageIcon(img));
	telaFinal.setOpaque(true);
	
	mario.setBounds(espacamento, telaFinal.getY() + telaFinal.getHeight() + (espacamento * 5), 20, 40);
	caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\Mario.jpg");
	img = caminho.getImage().getScaledInstance(mario.getWidth(), mario.getHeight(), Image.SCALE_SMOOTH);
	mario.setIcon(new ImageIcon(img));
	mario.setOpaque(true);
	
	lblmario.setFont(new Font("Arial", Font.PLAIN, 16));
	lblmario.setForeground(new Color(255, 255, 255));
	lblmario.setBounds(espacamento, mario.getY() + mario.getHeight() + espacamento, respostas.getWidth(), proximo.getHeight());
	lblmario.setVisible(true);
	
	// Adicionando items da avaliação no painel auxiliar para avaliação do trabalho.
	auxiliarAvaliar.add(proximo3);
	auxiliarAvaliar.add(anterior2);
	auxiliarAvaliar.add(telaAvaliar);
	auxiliarAvaliar.add(lblLogin);
	auxiliarAvaliar.add(lbllblLogin);
	auxiliarAvaliar.add(lbllbllblLogin);
	auxiliarAvaliar.add(lblSenha);
	auxiliarAvaliar.add(lbllblSenha);
	auxiliarAvaliar.add(lbllbllblSenha);
	auxiliarAvaliar.add(botaoLogar);
	auxiliarAvaliar.add(lblbotaoLogar);
	auxiliarAvaliar.add(lblbotaoLogar2);

	// Adicionando items de configuração no painel auxiliar para as configurações.
	auxiliarConfiguracoes.add(telaConfiguracoes);
	auxiliarConfiguracoes.add(lblCor);
	auxiliarConfiguracoes.add(lbllblCor);
	auxiliarConfiguracoes.add(lblIdioma);
	auxiliarConfiguracoes.add(lbllblIdioma);
	auxiliarConfiguracoes.add(lblHora);
	auxiliarConfiguracoes.add(lbllblHora);
	auxiliarConfiguracoes.add(lblSom);
	auxiliarConfiguracoes.add(lbllblSom);
	auxiliarConfiguracoes.add(botaoOk);
	auxiliarConfiguracoes.add(lblbotaoOk);
	auxiliarConfiguracoes.add(proximo2);
	auxiliarConfiguracoes.add(anterior);
	
	// Adicionando items no painel auxiliar para as telas finais.
	auxiliarFinal.add(telaFinal);
	auxiliarFinal.add(mario);
	auxiliarFinal.add(lblmario);
	auxiliarFinal.add(anterior4);
	
	// Adicionando items no painel auxiliar para a tela inicial.
	auxiliarPrincipal.add(proximo);
	auxiliarPrincipal.add(telaInicio);
	auxiliarPrincipal.add(botaoIniciar);
	auxiliarPrincipal.add(lblbotaoIniciar);
	auxiliarPrincipal.add(botaoConfiguracoes);
	auxiliarPrincipal.add(lblbotaoConfiguracoes);
	auxiliarPrincipal.add(botaoInformacoes);
	auxiliarPrincipal.add(lblbotaoInformacoes);
	
	// Adicionando items das respostas no painel auxiliar para as respostas das perguntas do QUIZ.
	auxiliarRespostas.add(respostas);
	auxiliarRespostas.add(respostasPortugues);
	auxiliarRespostas.add(questao01);
	auxiliarRespostas.add(questao02);
	auxiliarRespostas.add(questao03);
	auxiliarRespostas.add(questao04);
	auxiliarRespostas.add(questao05);
	auxiliarRespostas.add(questao06);
	auxiliarRespostas.add(questao07);
	auxiliarRespostas.add(questao08);
	auxiliarRespostas.add(questao09);
	auxiliarRespostas.add(questao10);
	auxiliarRespostas.add(questao11);
	auxiliarRespostas.add(questao12);
	auxiliarRespostas.add(questao13);
	auxiliarRespostas.add(questao14);
	auxiliarRespostas.add(questao15);
	auxiliarRespostas.add(questao16);
	auxiliarRespostas.add(questao17);
	auxiliarRespostas.add(questao18);
	auxiliarRespostas.add(respostasIngles);
	auxiliarRespostas.add(questao19);
	auxiliarRespostas.add(questao20);
	auxiliarRespostas.add(questao21);
	auxiliarRespostas.add(questao22);
	auxiliarRespostas.add(questao23);
	auxiliarRespostas.add(questao24);
	auxiliarRespostas.add(questao25);
	auxiliarRespostas.add(questao26);
	auxiliarRespostas.add(questao27);
	auxiliarRespostas.add(questao28);
	auxiliarRespostas.add(questao29);
	auxiliarRespostas.add(questao30);
	auxiliarRespostas.add(questao31);
	auxiliarRespostas.add(questao32);
	auxiliarRespostas.add(questao33);
	auxiliarRespostas.add(questao34);
	auxiliarRespostas.add(questao35);
	auxiliarRespostas.add(questao36);
	auxiliarRespostas.add(anterior3);
	auxiliarRespostas.add(proximo4);

	// Adicionado todos os paineis no JFrame auxiliar.
	a.getContentPane().add(auxiliarFinal);
	a.getContentPane().add(auxiliarRespostas);
	a.getContentPane().add(auxiliarAvaliar);
	a.getContentPane().add(auxiliarConfiguracoes);
	a.getContentPane().add(auxiliarPrincipal);
	
	// Itens que aparecem na tela principal do programa.
	JButton avaliar = new JButton("Informações para avaliar meu trabalho");
	JButton configuracoes = new JButton("Configurações");
	JButton iniciar = new JButton("Iniciar");
	JButton logar = new JButton("Logar");
	JLabel informacoes = new JLabel("Regra: Você só tem uma chance de acertar cada questão.");
	JLabel login = new JLabel("Login");
	JLabel quiz = new JLabel("QUIZ");
	JLabel senha = new JLabel("Senha");
	JTextField login2 = new JTextField("");
	JTextField senha2 = new JTextField("");
	
	JPanel painelInicio = new JPanel();
	painelInicio.setBounds(0, 0, 960, 1080);
	f.getContentPane().add(painelInicio);
	painelInicio.setBackground(new Color(backR, backG, backB));
	painelInicio.setLayout(null);
	painelInicio.setVisible(true);
	
	quiz.setFont(new Font("Arial", Font.BOLD, 160));
	quiz.setForeground(new Color(255, 255, 255));
	quiz.setHorizontalAlignment(JLabel.CENTER);
	quiz.setBounds(0, screenSize.height / 4, (screenSize.width / 2) - 16, 130);
	
	iniciar.setToolTipText("Iniciar");
	iniciar.setFont(new Font("Arial", Font.BOLD, 20));
	iniciar.setBounds(0, screenSize.height / 2, (screenSize.width / 2) - 16, 30);
	
	informacoes.setFont(new Font("Arial", Font.BOLD, 20));
	informacoes.setHorizontalAlignment(JLabel.CENTER);
	informacoes.setBounds(0, screenSize.height - 200, (screenSize.width / 2) - 16, 30);
	informacoes.setForeground(new Color(255, 255, 255));
	informacoes.setBackground(null);
	
	configuracoes.setToolTipText("Configurações");
	configuracoes.setFont(new Font("Arial", Font.BOLD, 20));
	configuracoes.setBounds(0, iniciar.getY() + iniciar.getHeight() + 10, (screenSize.width / 2) - 16, 30);
	
	avaliar.setToolTipText("Informações para avaliar meu trabalho");
	avaliar.setFont(new Font("Arial", Font.BOLD, 20));
	avaliar.setBounds(0, configuracoes.getY() + configuracoes.getHeight() + 10, (screenSize.width / 2) - 16, 30);
	
	// Itens da tela Informações para avaliar meu trabalho
	login.setHorizontalAlignment(JLabel.CENTER);
	login.setFont(new Font("Arial", Font.BOLD, 20));
	login.setForeground(new Color(255, 255, 255));
	login.setBounds(10, screenSize.height / 2 - 200, (screenSize.width / 2) - 16, 30);
	login.setVisible(false);
	
	login2.setHorizontalAlignment(JLabel.CENTER);
	login2.setFont(new Font("Arial", Font.BOLD, 20));
	login2.setForeground(new Color(0, 0, 0));
	login2.setBounds(((screenSize.width) / 5), login.getY() + 40, 190, 30);
	login2.setVisible(false);
	
	senha.setHorizontalAlignment(JLabel.CENTER);
	senha.setFont(new Font("Arial", Font.BOLD, 20));
	senha.setForeground(new Color(255, 255, 255));
	senha.setBounds(10, login2.getY() + 40, (screenSize.width / 2) - 16, 30);
	senha.setVisible(false);
	
	senha2.setHorizontalAlignment(JLabel.CENTER);
	senha2.setFont(new Font("Arial", Font.BOLD, 20));
	senha2.setForeground(new Color(0, 0, 0));
	senha2.setBounds(((screenSize.width) / 5), senha.getY() + 40, 190, 30);
	senha2.setVisible(false);
	
	logar.setHorizontalAlignment(JButton.CENTER);
	logar.setFont(new Font("Arial", Font.BOLD, 20));
	logar.setForeground(new Color(0, 0, 0));
	logar.setBounds(((screenSize.width) / 5), senha2.getY() + 70, 190, 30);
	logar.setVisible(false);
		
	voltar.setBounds(((screenSize.width) / 5), logar.getY() + logar.getHeight() + espacamento, logar.getWidth(), logar.getHeight());
	voltar.setFont(new Font("Arial", Font.BOLD, 20));
	voltar.setForeground(new Color(0, 0, 0));
	voltar.setVisible(false);
	
	// Adicionando os itens da tela principal no painel Inicio.
	painelInicio.add(iniciar);
	painelInicio.add(quiz);
	painelInicio.add(informacoes);
	painelInicio.add(avaliar);
	painelInicio.add(login);
	painelInicio.add(login2);
	painelInicio.add(senha);
	painelInicio.add(senha2);
	painelInicio.add(logar);
	painelInicio.add(voltar);
	painelInicio.add(configuracoes);
	painelInicio.setVisible(true);
	painelInicio.setVisible(true);
	
	//Ação dos JButtons e dos JLabel
	
	//Botão de acesso a tela de login para ter acesso ao guia de avaliação do trabalho.
	avaliar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			iniciar.setVisible(false);
			configuracoes.setVisible(false);
			avaliar.setVisible(false);
			informacoes.setVisible(false);
			quiz.setVisible(false);
			login.setVisible(true);
			login2.setVisible(true);
			senha.setVisible(true);
			senha2.setVisible(true);
			logar.setVisible(true);
			voltar.setVisible(true);
		}
	});
	
	//Voltar da tela de login para a tela principal do programa.
	voltar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			iniciar.setVisible(true);
			configuracoes.setVisible(true);
			avaliar.setVisible(true);
			informacoes.setVisible(true);
			quiz.setVisible(true);
			login.setVisible(false);
			login2.setVisible(false);
			senha.setVisible(false);
			senha2.setVisible(false);
			logar.setVisible(false);
			voltar.setVisible(false);
		}
	});
	
	//Acessar a tela de configuração do QUIZ.
	configuracoes.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			iniciar.setVisible(false);
			configuracoes.setVisible(false);
			avaliar.setVisible(false);
			portugues.setBackground(new Color(0, 255, 0));
			painelConfiguracoes.setVisible(true);
			painelInicio.setVisible(false);
			lblCores.setVisible(true);
		}
	});
	
	//Botão que avalia se o usuário digitou o login e a senha correta e libera o acesso ao Guia de Avaliação do meu trabalho.
	logar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (login2.getText().equals("Ralf") && senha2.getText().equals("Lima")) {
				// Tela Avaliar
				login.setVisible(false);
				login2.setVisible(false);
				senha.setVisible(false);
				senha2.setVisible(false);
				logar.setVisible(false);
				voltar.setVisible(false);
				a.setVisible(true);
				auxiliarFinal.setBackground(painelInicio.getBackground());
				auxiliarRespostas.setBackground(painelInicio.getBackground());
				auxiliarAvaliar.setBackground(painelInicio.getBackground());
				auxiliarConfiguracoes.setBackground(painelInicio.getBackground());
				auxiliarPrincipal.setBackground(painelInicio.getBackground());
				
				auxiliarPrincipal.setVisible(true);
				auxiliarConfiguracoes.setVisible(false);
				auxiliarAvaliar.setVisible(false);
				auxiliarRespostas.setVisible(false);
				auxiliarFinal.setVisible(false);
				
				// Mostrar Tela Principal
				iniciar.setVisible(true);
				configuracoes.setVisible(true);
				avaliar.setVisible(true);
				informacoes.setVisible(true);
				quiz.setVisible(true);
			} else {
				senha2.setText("senha errada!");
			}
		}
	});
	
	// Itens da tela de configuração
	horasim.setFocusTraversalKeysEnabled(false);
	horasim.setFocusPainted(false);
	horasim.setAlignmentX(Component.CENTER_ALIGNMENT);
	horasim.setBorderPainted(false);
	horasim.setBorder(null);
	horasim.setHorizontalAlignment(JLabel.CENTER);
	horasim.setFont(new Font("Arial", Font.BOLD, 20));
	horasim.setBackground(new Color(0, 255, 0));
	
	horanao.setFocusTraversalKeysEnabled(false);
	horanao.setFocusPainted(false);
	horanao.setAlignmentX(Component.CENTER_ALIGNMENT);
	horanao.setBorderPainted(false);
	horanao.setBorder(null);
	horanao.setHorizontalAlignment(JLabel.CENTER);
	horanao.setFont(new Font("Arial", Font.BOLD, 20));
	horanao.setBackground(null);
	
	somsim.setFocusTraversalKeysEnabled(false);
	somsim.setFocusPainted(false);
	somsim.setAlignmentX(Component.CENTER_ALIGNMENT);
	somsim.setBorderPainted(false);
	somsim.setBorder(null);
	somsim.setHorizontalAlignment(JLabel.CENTER);
	somsim.setFont(new Font("Arial", Font.BOLD, 20));
	somsim.setBackground(new Color(0, 255, 0));
	
	somnao.setFocusTraversalKeysEnabled(false);
	somnao.setFocusPainted(false);
	somnao.setAlignmentX(Component.CENTER_ALIGNMENT);
	somnao.setBorderPainted(false);
	somnao.setBorder(null);
	somnao.setHorizontalAlignment(JLabel.CENTER);
	somnao.setFont(new Font("Arial", Font.BOLD, 20));
	somnao.setBackground(null);
	
	portugues.setFocusTraversalKeysEnabled(false);
	portugues.setFocusPainted(false);
	portugues.setAlignmentX(Component.CENTER_ALIGNMENT);
	portugues.setBorderPainted(false);
	portugues.setBorder(null);
	portugues.setHorizontalAlignment(JLabel.CENTER);
	portugues.setFont(new Font("Arial", Font.BOLD, 20));
	portugues.setBackground(new Color(0, 255, 0));
	
	ingles.setFocusTraversalKeysEnabled(false);
	ingles.setFocusPainted(false);
	ingles.setAlignmentX(Component.CENTER_ALIGNMENT);
	ingles.setBorderPainted(false);
	ingles.setBorder(null);
	ingles.setHorizontalAlignment(JLabel.CENTER);
	ingles.setFont(new Font("Arial", Font.BOLD, 20));
	ingles.setBackground(null);
	
	lblCores.setFont(new Font("Arial", Font.BOLD, 20));
	lblCores.setBounds(5, 10, 400, 24);
	
	lblIdiomas.setFont(new Font("Arial", Font.BOLD, 20));
	
	hora.setFont(new Font("Arial", Font.BOLD, 20));
	hora.setBounds(5, lblCores.getY() + 420, 400, 24);
	
	som.setFont(new Font("Arial", Font.BOLD, 20));
	som.setBounds(5, hora.getY() + 80, 400, 24);
	
	ok.setHorizontalAlignment(JLabel.CENTER);
	ok.setFont(new Font("Arial", Font.BOLD, 20));
	ok.setBounds(5, som.getY() + 80, 140, 30);
	
	//Adicionando itens ao painel de configuração	
	painelConfiguracoes.add(cor001);
	painelConfiguracoes.add(cor002);
	painelConfiguracoes.add(cor003);
	painelConfiguracoes.add(cor004);
	painelConfiguracoes.add(cor005);
	painelConfiguracoes.add(cor006);
	painelConfiguracoes.add(cor007);
	painelConfiguracoes.add(cor008);
	painelConfiguracoes.add(cor009);
	painelConfiguracoes.add(cor009);
	painelConfiguracoes.add(cor010);
	painelConfiguracoes.add(cor011);
	painelConfiguracoes.add(cor012);
	painelConfiguracoes.add(cor013);
	painelConfiguracoes.add(cor014);
	painelConfiguracoes.add(cor015);
	painelConfiguracoes.add(cor016);
	painelConfiguracoes.add(cor017);
	painelConfiguracoes.add(cor018);
	painelConfiguracoes.add(cor019);
	painelConfiguracoes.add(cor020);
	painelConfiguracoes.add(cor021);
	painelConfiguracoes.add(cor022);
	painelConfiguracoes.add(cor023);
	painelConfiguracoes.add(cor024);
	painelConfiguracoes.add(cor025);
	painelConfiguracoes.add(cor026);
	painelConfiguracoes.add(cor027);
	painelConfiguracoes.add(cor028);
	painelConfiguracoes.add(cor029);
	painelConfiguracoes.add(cor030);
	painelConfiguracoes.add(cor031);
	painelConfiguracoes.add(cor032);
	painelConfiguracoes.add(cor033);
	painelConfiguracoes.add(cor034);
	painelConfiguracoes.add(cor035);
	painelConfiguracoes.add(cor036);
	painelConfiguracoes.add(cor037);
	painelConfiguracoes.add(cor038);
	painelConfiguracoes.add(cor039);
	painelConfiguracoes.add(cor040);
	painelConfiguracoes.add(cor041);
	painelConfiguracoes.add(cor042);
	painelConfiguracoes.add(cor043);
	painelConfiguracoes.add(cor044);
	painelConfiguracoes.add(cor045);
	painelConfiguracoes.add(cor046);
	painelConfiguracoes.add(cor047);
	painelConfiguracoes.add(cor048);
	painelConfiguracoes.add(cor049);
	painelConfiguracoes.add(cor050);
	painelConfiguracoes.add(cor051);
	painelConfiguracoes.add(cor052);
	painelConfiguracoes.add(cor053);
	painelConfiguracoes.add(cor054);
	painelConfiguracoes.add(cor055);
	painelConfiguracoes.add(cor056);
	painelConfiguracoes.add(cor057);
	painelConfiguracoes.add(cor058);
	painelConfiguracoes.add(cor059);
	painelConfiguracoes.add(cor060);
	painelConfiguracoes.add(cor061);
	painelConfiguracoes.add(cor062);
	painelConfiguracoes.add(cor063);
	painelConfiguracoes.add(cor064);
	painelConfiguracoes.add(cor065);
	painelConfiguracoes.add(cor066);
	painelConfiguracoes.add(cor067);
	painelConfiguracoes.add(cor068);
	painelConfiguracoes.add(cor069);
	painelConfiguracoes.add(cor070);
	painelConfiguracoes.add(cor071);
	painelConfiguracoes.add(cor072);
	painelConfiguracoes.add(cor073);
	painelConfiguracoes.add(cor074);
	painelConfiguracoes.add(cor075);
	painelConfiguracoes.add(cor076);
	painelConfiguracoes.add(cor077);
	painelConfiguracoes.add(cor078);
	painelConfiguracoes.add(cor079);
	painelConfiguracoes.add(cor080);
	painelConfiguracoes.add(cor081);
	painelConfiguracoes.add(cor082);
	painelConfiguracoes.add(cor083);
	painelConfiguracoes.add(cor084);
	painelConfiguracoes.add(cor085);
	painelConfiguracoes.add(cor086);
	painelConfiguracoes.add(cor087);
	painelConfiguracoes.add(cor088);
	painelConfiguracoes.add(cor089);
	painelConfiguracoes.add(cor090);
	painelConfiguracoes.add(cor091);
	painelConfiguracoes.add(cor092);
	painelConfiguracoes.add(cor093);
	painelConfiguracoes.add(cor094);
	painelConfiguracoes.add(cor095);
	painelConfiguracoes.add(cor096);
	painelConfiguracoes.add(cor097);
	painelConfiguracoes.add(cor098);
	painelConfiguracoes.add(cor099);
	painelConfiguracoes.add(cor100);
	painelConfiguracoes.add(cor101);
	painelConfiguracoes.add(cor102);
	painelConfiguracoes.add(cor103);
	painelConfiguracoes.add(cor104);
	painelConfiguracoes.add(cor105);
	painelConfiguracoes.add(cor106);
	painelConfiguracoes.add(cor107);
	painelConfiguracoes.add(cor108);
	painelConfiguracoes.add(cor109);
	painelConfiguracoes.add(cor110);
	painelConfiguracoes.add(cor111);
	painelConfiguracoes.add(cor112);
	painelConfiguracoes.add(cor113);
	painelConfiguracoes.add(cor114);
	painelConfiguracoes.add(cor115);
	painelConfiguracoes.add(cor116);
	painelConfiguracoes.add(cor117);
	painelConfiguracoes.add(cor118);
	painelConfiguracoes.add(cor119);
	painelConfiguracoes.add(cor120);
	painelConfiguracoes.add(cor121);
	painelConfiguracoes.add(cor122);
	painelConfiguracoes.add(cor123);
	painelConfiguracoes.add(cor124);
	painelConfiguracoes.add(cor125);
	painelConfiguracoes.add(cor126);
	painelConfiguracoes.add(cor127);
	painelConfiguracoes.add(cor128);
	painelConfiguracoes.add(cor129);
	painelConfiguracoes.add(cor130);
	painelConfiguracoes.add(cor131);
	painelConfiguracoes.add(cor132);
	painelConfiguracoes.add(cor133);
	painelConfiguracoes.add(cor134);
	painelConfiguracoes.add(cor135);
	painelConfiguracoes.add(cor136);
	painelConfiguracoes.add(cor137);
	painelConfiguracoes.add(cor138);
	painelConfiguracoes.add(ingles);
	painelConfiguracoes.add(lblCores);
	painelConfiguracoes.add(lblIdiomas);
	painelConfiguracoes.add(hora);
	painelConfiguracoes.add(horanao);
	painelConfiguracoes.add(horasim);
	painelConfiguracoes.add(ok);
	painelConfiguracoes.add(portugues);
	painelConfiguracoes.add(som);
	painelConfiguracoes.add(somnao);
	painelConfiguracoes.add(somsim);
	
	//Escondendo o painel de Bem Vindo
	painelLogin.setVisible(false);
	
	//Painel das perguntas
	JPanel painel = new JPanel();

	//Itens do painel das perguntas
	JButton btn01 = new JButton();
	JButton btn02 = new JButton();
	JButton btn03 = new JButton();
	JButton btn04 = new JButton();
	JButton btn05 = new JButton();
	JButton proximaQuestao = new JButton("Próxima questão");
	JLabel linha = new JLabel();
	JTextField questao = new JTextField();
	

	
	// Configurando os itens do Painel das perguntas
	questao.setBounds(0, inicioX, (screenSize.width / 2) - 16, 60);
	questao.setEditable(false);
	questao.setBorder(null);
	questao.setBackground(new Color(backR, backG, backB));
	questao.setForeground(new Color(255, 255, 255));
	questao.setOpaque(true);
	questao.setFont(new Font("Arial", Font.PLAIN, 20));
	questao.setText(questoesBR[0][0]);
	questao.setHorizontalAlignment(JLabel.CENTER);
	
	linha.setBackground(new Color(255, 255, 255));
	linha.setOpaque(true);
	linha.setBounds(100, questao.getY() + questao.getHeight() + 1, (screenSize.width / 2) - 225, 1);
	
	btn01.setHorizontalTextPosition(SwingConstants.CENTER);
	btn01.setAlignmentX(Component.CENTER_ALIGNMENT);
	btn01.setRequestFocusEnabled(false);
	btn01.setBounds(0, linha.getY() + linha.getHeight() + 21, (screenSize.width / 2) - 16, 30);
	btn01.setFont(new Font("Arial", Font.PLAIN, 20));
	btn01.setForeground(new Color(255, 255, 255));
	btn01.setBorderPainted(false);
	btn01.setHorizontalAlignment(JButton.CENTER);
	
	btn02.setHorizontalTextPosition(SwingConstants.CENTER);
	btn02.setAlignmentX(Component.CENTER_ALIGNMENT);
	btn02.setRequestFocusEnabled(false);
	btn02.setBounds(0, btn01.getY() + btn01.getHeight() + 1, (screenSize.width / 2) - 16, 30);
	btn02.setFont(new Font("Arial", Font.PLAIN, 20));
	btn02.setForeground(new Color(255, 255, 255));
	btn02.setBorderPainted(false);
	btn02.setHorizontalAlignment(JButton.CENTER);
	
	btn03.setHorizontalTextPosition(SwingConstants.CENTER);
	btn03.setAlignmentX(Component.CENTER_ALIGNMENT);
	btn03.setRequestFocusEnabled(false);
	btn03.setBounds(0, btn02.getY() + btn02.getHeight() + 1, (screenSize.width / 2) - 16, 30);
	btn03.setFont(new Font("Arial", Font.PLAIN, 20));
	btn03.setForeground(new Color(255, 255, 255));
	btn03.setBorderPainted(false);
	btn03.setHorizontalAlignment(JButton.CENTER);
	
	btn04.setHorizontalTextPosition(SwingConstants.CENTER);
	btn04.setAlignmentX(Component.CENTER_ALIGNMENT);
	btn04.setRequestFocusEnabled(false);
	btn04.setBounds(0, btn03.getY() + btn03.getHeight() + 1, (screenSize.width / 2) - 16, 30);
	btn04.setFont(new Font("Arial", Font.PLAIN, 20));
	btn04.setForeground(new Color(255, 255, 255));
	btn04.setBorderPainted(false);
	btn04.setHorizontalAlignment(JButton.CENTER);
	
	btn05.setHorizontalTextPosition(SwingConstants.CENTER);
	btn05.setAlignmentX(Component.CENTER_ALIGNMENT);
	btn05.setRequestFocusEnabled(false);
	btn05.setBounds(0, btn04.getY() + btn04.getHeight() + 1, (screenSize.width / 2) - 16, 30);
	btn05.setFont(new Font("Arial", Font.PLAIN, 20));
	btn05.setForeground(new Color(255, 255, 255));
	btn05.setBorderPainted(false);
	btn05.setHorizontalAlignment(JButton.CENTER);
	
	tempoNaTela.setBounds(10, btn05.getY() + btn05.getHeight() + 51, 100, 30);
	
	proximaQuestao.setHorizontalTextPosition(SwingConstants.CENTER);
	proximaQuestao.setRequestFocusEnabled(false);
	proximaQuestao.setBounds(((screenSize.width) / 5), screenSize.height - (screenSize.height / 8), 190, 30);
	proximaQuestao.setFont(new Font("Arial", Font.PLAIN, 20));
	proximaQuestao.setEnabled(false);
	painel.setBounds(0, 0, screenSize.width / 2, screenSize.height);
	painel.setVisible(false);
	painel.setLayout(null);
	
	// Adicionando elementos ao painel das perguntas
	painel.add(btn01);
	painel.add(btn02);
	painel.add(btn03);
	painel.add(btn04);
	painel.add(btn05);
	painel.add(linha);
	painel.add(proximaQuestao);
	painel.add(questao);
	
	// Padronizando a cor de fundo das opcoes de resposta com a cor de fundo do painel principal
	btn01.setBackground(painelInicio.getBackground());
	btn02.setBackground(painelInicio.getBackground());
	btn03.setBackground(painelInicio.getBackground());
	btn04.setBackground(painelInicio.getBackground());
	btn05.setBackground(painelInicio.getBackground());
	
	// Padronizando a cor de fundo do painel da perguntas com a cor de fundo do painel principal
	painel.setBackground(painelInicio.getBackground());
	
	// Adicionar painel das perguntas ao JFrame principal
	f.getContentPane().add(painel);
	
	//Escondendo as informacoes do painel das perguntas
	questao.setVisible(false);
	linha.setVisible(false);
	btn01.setVisible(false);
	btn02.setVisible(false);
	btn03.setVisible(false);
	btn04.setVisible(false);
	btn05.setVisible(false);
	proximaQuestao.setVisible(false);
	
	//Botões que marcam a opcão que o usuário escolheu
	btn01.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			btn01.setBackground(new Color(0, 0, 255));
			btn02.setBackground(painel.getBackground());
			btn03.setBackground(painel.getBackground());
			btn04.setBackground(painel.getBackground());
			btn05.setBackground(painel.getBackground());
			proximaQuestao.setEnabled(true);
		}
	});
	
	btn02.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			btn01.setBackground(painel.getBackground());
			btn02.setBackground(new Color(0, 0, 255));
			btn03.setBackground(painel.getBackground());
			btn04.setBackground(painel.getBackground());
			btn05.setBackground(painel.getBackground());
			proximaQuestao.setEnabled(true);
		}
	});
	
	btn03.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			btn01.setBackground(painel.getBackground());
			btn02.setBackground(painel.getBackground());
			btn03.setBackground(new Color(0, 0, 255));
			btn04.setBackground(painel.getBackground());
			btn05.setBackground(painel.getBackground());
			proximaQuestao.setEnabled(true);
		}
	});
	
	btn04.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			btn01.setBackground(painel.getBackground());
			btn02.setBackground(painel.getBackground());
			btn03.setBackground(painel.getBackground());
			btn04.setBackground(new Color(0, 0, 255));
			btn05.setBackground(painel.getBackground());
			proximaQuestao.setEnabled(true);
		}
	});
	
	btn05.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			btn01.setBackground(painel.getBackground());
			btn02.setBackground(painel.getBackground());
			btn03.setBackground(painel.getBackground());
			btn04.setBackground(painel.getBackground());
			btn05.setBackground(new Color(0, 0, 255));
			proximaQuestao.setEnabled(true);
		}
	});
	
	// Botão que checa se o usuário escolheu a opção de resposta correta e decide se o usuário ganhou ou perdeu o jogo.
	proximaQuestao.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JLabel fim = new JLabel();
			JButton verificacao = new JButton();
			ImageIcon caminho = null;
			boolean acertou = false;
			Image img = null;
			proximaQuestao.setEnabled(false);
			verificacao.setBackground(new Color(0, 255, 0));
			if (horasim.getBackground().equals(verificacao.getBackground())) {
				tempoNaTela.setVisible(true);
				Timer timer = new Timer(1000, new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
						String str = fmt.format(new Date());
						tempoNaTela.setText(str);
					}
				});
				timer.setRepeats(true);
				timer.setCoalesce(true);
				timer.setInitialDelay(0);
				timer.start();
			}
			if (portugues.getBackground().equals(verificacao.getBackground())) {
				if (obterIndice < (resposta.length - 1)) obterIndice++;
				if (obterIndice < 17) {
					if (portugues.getBackground().equals(verificacao.getBackground())) {
						caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + questoesBR[resposta[obterIndice]][7]);
						img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(), Image.SCALE_SMOOTH);
						imagem.setIcon(new ImageIcon(img));
						imagem.setOpaque(true);
						imagem.setVisible(false);
						imagem.setVisible(true);
					}
				}
				verificacao.setBackground(new Color(0, 0, 255));
				acertou = false;
				for (int i = 0; i < 1; i++) {
					if (btn01.getBackground().equals(verificacao.getBackground())) {
						if ("a".equals(questoesBR[resposta[obterIndice - 1]][6])) {
							btn01.setBackground(new Color(0, 255, 0));
							acertou = true;
						} else fim.setOpaque(true);
					}
					if (btn02.getBackground().equals(verificacao.getBackground())) {
						if ("b".equals(questoesBR[resposta[obterIndice - 1]][6])) {
							btn02.setBackground(new Color(0, 255, 0));
							acertou = true;
						} else fim.setOpaque(true);
					}
					if (btn03.getBackground().equals(verificacao.getBackground())) {
						if ("c".equals(questoesBR[resposta[obterIndice - 1]][6])) {
							btn03.setBackground(new Color(0, 255, 0));
							acertou = true;
						} else fim.setOpaque(true);
					}
					if (btn04.getBackground().equals(verificacao.getBackground())) {
						if ("d".equals(questoesBR[resposta[obterIndice - 1]][6])) {
							btn04.setBackground(new Color(0, 255, 0));
							acertou = true;
						} else fim.setOpaque(true);
					}
					if (btn05.getBackground().equals(verificacao.getBackground())) {
						if ("e".equals(questoesBR[resposta[obterIndice - 1]][6])) {
							btn05.setBackground(new Color(0, 255, 0));
							acertou = true;
						} else fim.setOpaque(true);
					}
					if (acertou == true) {
						questao.setVisible(false);
						btn01.setVisible(false);
						btn02.setVisible(false);
						btn03.setVisible(false);
						btn04.setVisible(false);
						btn05.setVisible(false);
						imagem.setVisible(false);
						questao.setText(questoesBR[resposta[obterIndice]][0]);
						btn01.setText(questoesBR[resposta[obterIndice]][1]);
						btn02.setText(questoesBR[resposta[obterIndice]][2]);
						btn03.setText(questoesBR[resposta[obterIndice]][3]);
						btn04.setText(questoesBR[resposta[obterIndice]][4]);
						btn05.setText(questoesBR[resposta[obterIndice]][5]);
						btn01.setBackground(painel.getBackground());
						btn02.setBackground(painel.getBackground());
						btn03.setBackground(painel.getBackground());
						btn04.setBackground(painel.getBackground());
						btn05.setBackground(painel.getBackground());
						questao.setVisible(true);
						btn01.setVisible(true);
						btn02.setVisible(true);
						btn03.setVisible(true);
						btn04.setVisible(true);
						btn05.setVisible(true);
						imagem.setVisible(true);
						if (obterIndice > 16) {
							painel.setVisible(false);
							painelInicio.setVisible(true);
							informacoes.setText("Parabéns você ganhou!");
							informacoes.setBounds(10, 10, (screenSize.width / 2) - 16, 30);
							
							painelInicio.add(fim);
							fim.setBounds(0, informacoes.getY() + 40, (screenSize.width / 2) - 16, screenSize.height - 300);
							caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[17]);
							img = caminho.getImage().getScaledInstance(fim.getWidth(), fim.getHeight(),Image.SCALE_SMOOTH);
							fim.setIcon(new ImageIcon(img));
							fim.setOpaque(true);
							fim.setVisible(false);
							fim.setVisible(true);
							verificacao.setBackground(new Color(0, 255, 0));
							if (somsim.getBackground().equals(verificacao.getBackground())) {
								try {
									Clip clip = AudioSystem.getClip();
									clip.open(AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "\\src\\Sons\\Win.wav")));
									clip.start();
								} catch (LineUnavailableException e1) {
									e1.printStackTrace();
								} catch (UnsupportedAudioFileException | IOException e2) {
									e2.printStackTrace();
								}
							}
						}
						
					} else {
						painel.setVisible(false);
						painelInicio.setVisible(true);
						informacoes.setText("Que pena você errou.");
						informacoes.setBounds(10, 10, (screenSize.width / 2) - 16, 30);
						painelInicio.add(fim);
						fim.setBounds(0, informacoes.getY() + 40, (screenSize.width / 2) - 16, screenSize.height - 300);
						if (obterIndice == 1) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 2) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 3) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 4) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 5) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 6) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 7) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 8) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 9) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 10) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 11) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 12) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 13) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 14) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 15) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 16) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						img = caminho.getImage().getScaledInstance(fim.getWidth(), fim.getHeight(), Image.SCALE_SMOOTH);
						fim.setIcon(new ImageIcon(img));
						fim.setOpaque(true);
						fim.setVisible(false);
						fim.setVisible(true);
						verificacao.setBackground(new Color(0, 255, 0));
						if (somsim.getBackground().equals(verificacao.getBackground())) {
							try {
								Clip clip = AudioSystem.getClip();
								clip.open(AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "\\src\\Sons\\Loser.wav")));
								clip.start();
							} catch (LineUnavailableException e1) {
								e1.printStackTrace();
							} catch (UnsupportedAudioFileException | IOException e2) {
								e2.printStackTrace();
							}
						}
					}
					verificacao.setBackground(new Color(0, 255, 0));
					if (somsim.getBackground().equals(verificacao.getBackground())) {
						try {
							Clip clip = AudioSystem.getClip();
							clip.open(AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "\\src\\Sons\\" + questoesBR[resposta[obterIndice]][8])));
							if (fim.isOpaque() == false) clip.start();
						} catch (LineUnavailableException e1) {
							e1.printStackTrace();
						} catch (UnsupportedAudioFileException | IOException e2) {
							e2.printStackTrace();
						}
					}
				}
			} else if (ingles.getBackground().equals(verificacao.getBackground())) {
				if (obterIndice < (resposta.length - 1)) obterIndice++;
				if (obterIndice < 17) {
					if (ingles.getBackground().equals(verificacao.getBackground())) {
						caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + questoesEN[resposta[obterIndice]][7]);
						img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(), Image.SCALE_SMOOTH);
						imagem.setIcon(new ImageIcon(img));
						imagem.setOpaque(true);
						imagem.setVisible(false);
						imagem.setVisible(true);
					}
				}
				verificacao.setBackground(new Color(0, 0, 255));
				acertou = false;
				for (int i = 0; i < 1; i++) {
					if (btn01.getBackground().equals(verificacao.getBackground())) {
						if ("a".equals(questoesEN[resposta[obterIndice - 1]][6])) {
							btn01.setBackground(new Color(0, 255, 0));
							acertou = true;
						} else btn01.setBackground(new Color(255, 0, 0));
					}
					if (btn02.getBackground().equals(verificacao.getBackground())) {
						if ("b".equals(questoesEN[resposta[obterIndice - 1]][6])) {
							btn02.setBackground(new Color(0, 255, 0));
							acertou = true;
						} else btn02.setBackground(new Color(255, 0, 0));
					}
					if (btn03.getBackground().equals(verificacao.getBackground())) {
						if ("c".equals(questoesEN[resposta[obterIndice - 1]][6])) {
							btn03.setBackground(new Color(0, 255, 0));
							acertou = true;
						} else btn03.setBackground(new Color(255, 0, 0));
					}
					if (btn04.getBackground().equals(verificacao.getBackground())) {
						if ("d".equals(questoesEN[resposta[obterIndice - 1]][6])) {
							btn04.setBackground(new Color(0, 255, 0));
							acertou = true;
						} else btn04.setBackground(new Color(255, 0, 0));
					}
					if (btn05.getBackground().equals(verificacao.getBackground())) {
						if ("e".equals(questoesEN[resposta[obterIndice - 1]][6])) {
							btn05.setBackground(new Color(0, 255, 0));
							acertou = true;
						} else btn05.setBackground(new Color(255, 0, 0));
					}
					if (acertou == true) {
						questao.setVisible(false);
						btn01.setVisible(false);
						btn02.setVisible(false);
						btn03.setVisible(false);
						btn04.setVisible(false);
						btn05.setVisible(false);
						imagem.setVisible(false);
						questao.setText(questoesEN[resposta[obterIndice]][0]);
						btn01.setText(questoesEN[resposta[obterIndice]][1]);
						btn02.setText(questoesEN[resposta[obterIndice]][2]);
						btn03.setText(questoesEN[resposta[obterIndice]][3]);
						btn04.setText(questoesEN[resposta[obterIndice]][4]);
						btn05.setText(questoesEN[resposta[obterIndice]][5]);
						btn01.setBackground(painel.getBackground());
						btn02.setBackground(painel.getBackground());
						btn03.setBackground(painel.getBackground());
						btn04.setBackground(painel.getBackground());
						btn05.setBackground(painel.getBackground());
						questao.setVisible(true);
						btn01.setVisible(true);
						btn02.setVisible(true);
						btn03.setVisible(true);
						btn04.setVisible(true);
						btn05.setVisible(true);
						imagem.setVisible(true);
						if (obterIndice > 16) {
							painel.setVisible(false);
							painelInicio.setVisible(true);
							informacoes.setText("Parabéns você ganhou!");
							informacoes.setBounds(10, 10, (screenSize.width / 2) - 16, 30);
							painelInicio.add(fim);
							fim.setBounds(0, informacoes.getY() + 40, (screenSize.width / 2) - 16, screenSize.height - 300);
							caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[17]); 
							img = caminho.getImage().getScaledInstance(fim.getWidth(), fim.getHeight(), Image.SCALE_SMOOTH);
							fim.setIcon(new ImageIcon(img));
							fim.setOpaque(true);
							fim.setVisible(false);
							fim.setVisible(true);
							verificacao.setBackground(new Color(0, 255, 0));
							if (somsim.getBackground().equals(verificacao.getBackground())) {
								try {
									Clip clip = AudioSystem.getClip();
									clip.open(AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "\\src\\Sons\\Win.wav")));
									clip.start();
								} catch (LineUnavailableException e1) {
									e1.printStackTrace();
								} catch (UnsupportedAudioFileException | IOException e2) {
									e2.printStackTrace();
								}
							}
						}
						
					} else {
						painel.setVisible(false);
						painelInicio.setVisible(true);
						informacoes.setText("Que pena você errou.");
						informacoes.setBounds(10, 10, (screenSize.width / 2) - 16, 30);
						painelInicio.add(fim);
						fim.setBounds(0, informacoes.getY() + 40, (screenSize.width / 2) - 16, screenSize.height - 300);
						if (obterIndice == 1) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 2) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 3) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 4) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 5) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 6) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 7) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 8) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 9) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 10) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 11) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 12) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 13) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 14) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 15) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						if (obterIndice == 16) caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + finais[obterIndice - 1]);
						img = caminho.getImage().getScaledInstance(fim.getWidth(), fim.getHeight(), Image.SCALE_SMOOTH);
						fim.setIcon(new ImageIcon(img));
						fim.setOpaque(true);
						fim.setVisible(false);
						fim.setVisible(true);
						verificacao.setBackground(new Color(0, 255, 0));
						if (somsim.getBackground().equals(verificacao.getBackground())) {
							try {
								Clip clip = AudioSystem.getClip();
								clip.open(AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "\\src\\Sons\\Loser.wav")));
								clip.start();
							} catch (LineUnavailableException e1) {
								e1.printStackTrace();
							} catch (UnsupportedAudioFileException | IOException e2) {
								e2.printStackTrace();
							}
						}
					}
					verificacao.setBackground(new Color(0, 255, 0));
					if (somsim.getBackground().equals(verificacao.getBackground())) {
						try {
							Clip clip = AudioSystem.getClip();
							clip.open(AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "\\src\\Sons\\" + questoesEN[resposta[obterIndice]][8])));
							if (fim.isOpaque() == false)
								clip.start();
						} catch (LineUnavailableException e1) {
							e1.printStackTrace();
						} catch (UnsupportedAudioFileException | IOException e2) {
							e2.printStackTrace();
						}
					}
				}
			}
		}
	});
	
	//Adicionando o painel de configurações no JFrame principal.
	f.getContentPane().add(painelConfiguracoes);
	
	//Configuração do painel de configurações.
	painelConfiguracoes.setBounds(0, 0, screenSize.width / 2, screenSize.height);
	painelConfiguracoes.setBackground(new Color(backR, backG, backB));
	painelConfiguracoes.setLayout(null);
	painelConfiguracoes.setVisible(false);
	
	// Configurando as 138 opções de cores que o usuário pode escolher para a cor de fundo do QUiZ.
	cor001.setBounds(10, 40, 40, 20);
	cor001.setOpaque(true);
	cor001.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor001.setBackground(new Color(128, 0, 0));
	
	cor002.setBounds(cor001.getX() + 42, cor001.getY(), cor001.getWidth(), cor001.getHeight());
	cor002.setOpaque(true);
	cor002.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor002.setBackground(new Color(139, 0, 0));
	
	cor003.setBounds(cor002.getX() + 42, cor002.getY(), cor002.getWidth(), cor002.getHeight());
	cor003.setOpaque(true);
	cor003.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor003.setBackground(new Color(165, 42, 42));
	
	cor004.setBounds(cor003.getX() + 42, cor003.getY(), cor003.getWidth(), cor003.getHeight());
	cor004.setOpaque(true);
	cor004.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor004.setBackground(new Color(178, 34, 34));
	
	cor005.setBounds(cor004.getX() + 42, cor004.getY(), cor004.getWidth(), cor004.getHeight());
	cor005.setOpaque(true);
	cor005.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor005.setBackground(new Color(220, 20, 60));
	
	cor006.setBounds(cor005.getX() + 42, cor005.getY(), cor005.getWidth(), cor005.getHeight());
	cor006.setOpaque(true);
	cor006.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor006.setBackground(new Color(225, 0, 0));
	
	cor007.setBounds(cor006.getX() + 42, cor006.getY(), cor006.getWidth(), cor006.getHeight());
	cor007.setOpaque(true);
	cor007.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor007.setBackground(new Color(225, 99, 71));
	
	cor008.setBounds(cor007.getX() + 42, cor007.getY(), cor007.getWidth(), cor007.getHeight());
	cor008.setOpaque(true);
	cor008.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor008.setBackground(new Color(255, 127, 80));
	
	cor009.setBounds(cor008.getX() + 42, cor008.getY(), cor008.getWidth(), cor008.getHeight());
	cor009.setOpaque(true);
	cor009.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor009.setBackground(new Color(205, 92, 92));
	
	cor010.setBounds(cor009.getX() + 42, cor009.getY(), cor009.getWidth(), cor009.getHeight());
	cor010.setOpaque(true);
	cor010.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor010.setBackground(new Color(240, 128, 128));
	
	cor011.setBounds(cor001.getX(), cor010.getY() + cor010.getHeight() + 2, cor010.getWidth(), cor010.getHeight());
	cor011.setOpaque(true);
	cor011.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor011.setBackground(new Color(233, 150, 122));
	
	cor012.setBounds(cor011.getX() + 42, cor011.getY(), cor011.getWidth(), cor011.getHeight());
	cor012.setOpaque(true);
	cor012.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor012.setBackground(new Color(250, 128, 114));
	
	cor013.setBounds(cor012.getX() + 42, cor012.getY(), cor012.getWidth(), cor012.getHeight());
	cor013.setOpaque(true);
	cor013.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor013.setBackground(new Color(255, 160, 122));
	
	cor014.setBounds(cor013.getX() + 42, cor013.getY(), cor013.getWidth(), cor013.getHeight());
	cor014.setOpaque(true);
	cor014.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor014.setBackground(new Color(255, 69, 0));
	
	cor015.setBounds(cor014.getX() + 42, cor014.getY(), cor014.getWidth(), cor014.getHeight());
	cor015.setOpaque(true);
	cor015.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor015.setBackground(new Color(255, 140, 0));
	
	cor016.setBounds(cor015.getX() + 42, cor015.getY(), cor015.getWidth(), cor015.getHeight());
	cor016.setOpaque(true);
	cor016.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor016.setBackground(new Color(255, 165, 0));
	
	cor017.setBounds(cor016.getX() + 42, cor016.getY(), cor016.getWidth(), cor016.getHeight());
	cor017.setOpaque(true);
	cor017.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor017.setBackground(new Color(255, 215, 0));
	
	cor018.setBounds(cor017.getX() + 42, cor017.getY(), cor017.getWidth(), cor017.getHeight());
	cor018.setOpaque(true);
	cor018.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor018.setBackground(new Color(184, 134, 11));
	
	cor019.setBounds(cor018.getX() + 42, cor018.getY(), cor018.getWidth(), cor018.getHeight());
	cor019.setOpaque(true);
	cor019.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor019.setBackground(new Color(218, 165, 32));
	
	cor020.setBounds(cor019.getX() + 42, cor019.getY(), cor019.getWidth(), cor019.getHeight());
	cor020.setOpaque(true);
	cor020.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor020.setBackground(new Color(238, 232, 170));
	
	cor021.setBounds(cor001.getX(), cor020.getY() + cor020.getHeight() + 2, cor020.getWidth(), cor020.getHeight());
	cor021.setOpaque(true);
	cor021.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor021.setBackground(new Color(189, 183, 107));
	
	cor022.setBounds(cor021.getX() + 42, cor021.getY(), cor021.getWidth(), cor021.getHeight());
	cor022.setOpaque(true);
	cor022.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor022.setBackground(new Color(128, 128, 0));
	
	cor023.setBounds(cor022.getX() + 42, cor022.getY(), cor022.getWidth(), cor022.getHeight());
	cor023.setOpaque(true);
	cor023.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor023.setBackground(new Color(255, 255, 0));
	
	cor024.setBounds(cor023.getX() + 42, cor023.getY(), cor023.getWidth(), cor023.getHeight());
	cor024.setOpaque(true);
	cor024.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor024.setBackground(new Color(154, 205, 50));
	
	cor025.setBounds(cor024.getX() + 42, cor024.getY(), cor024.getWidth(), cor024.getHeight());
	cor025.setOpaque(true);
	cor025.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor025.setBackground(new Color(85, 107, 47));
	
	cor026.setBounds(cor025.getX() + 42, cor025.getY(), cor025.getWidth(), cor025.getHeight());
	cor026.setOpaque(true);
	cor026.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor026.setBackground(new Color(107, 142, 35));
	
	cor027.setBounds(cor026.getX() + 42, cor026.getY(), cor026.getWidth(), cor026.getHeight());
	cor027.setOpaque(true);
	cor027.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor027.setBackground(new Color(124, 252, 0));
	
	cor028.setBounds(cor027.getX() + 42, cor027.getY(), cor027.getWidth(), cor027.getHeight());
	cor028.setOpaque(true);
	cor028.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor028.setBackground(new Color(127, 255, 0));
	
	cor029.setBounds(cor028.getX() + 42, cor028.getY(), cor028.getWidth(), cor028.getHeight());
	cor029.setOpaque(true);
	cor029.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor029.setBackground(new Color(173, 255, 47));
	
	cor030.setBounds(cor029.getX() + 42, cor029.getY(), cor029.getWidth(), cor029.getHeight());
	cor030.setOpaque(true);
	cor030.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor030.setBackground(new Color(0, 100, 0));
	
	cor031.setBounds(cor001.getX(), cor030.getY() + cor030.getHeight() + 2, cor030.getWidth(), cor030.getHeight());
	cor031.setOpaque(true);
	cor031.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor031.setBackground(new Color(0, 128, 0));
	
	cor032.setBounds(cor031.getX() + 42, cor031.getY(), cor031.getWidth(), cor031.getHeight());
	cor032.setOpaque(true);
	cor032.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor032.setBackground(new Color(34, 139, 34));
	
	cor033.setBounds(cor032.getX() + 42, cor032.getY(), cor032.getWidth(), cor032.getHeight());
	cor033.setOpaque(true);
	cor033.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor033.setBackground(new Color(0, 255, 0));
	
	cor034.setBounds(cor033.getX() + 42, cor033.getY(), cor033.getWidth(), cor033.getHeight());
	cor034.setOpaque(true);
	cor034.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor034.setBackground(new Color(50, 205, 50));
	
	cor035.setBounds(cor034.getX() + 42, cor034.getY(), cor034.getWidth(), cor034.getHeight());
	cor035.setOpaque(true);
	cor035.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor035.setBackground(new Color(144, 238, 144));
	
	cor036.setBounds(cor035.getX() + 42, cor035.getY(), cor035.getWidth(), cor035.getHeight());
	cor036.setOpaque(true);
	cor036.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor036.setBackground(new Color(152, 251, 152));
	
	cor037.setBounds(cor036.getX() + 42, cor036.getY(), cor036.getWidth(), cor036.getHeight());
	cor037.setOpaque(true);
	cor037.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor037.setBackground(new Color(143, 188, 143));
	
	cor038.setBounds(cor037.getX() + 42, cor037.getY(), cor037.getWidth(), cor037.getHeight());
	cor038.setOpaque(true);
	cor038.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor038.setBackground(new Color(0, 250, 154));
	
	cor039.setBounds(cor038.getX() + 42, cor038.getY(), cor038.getWidth(), cor038.getHeight());
	cor039.setOpaque(true);
	cor039.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor039.setBackground(new Color(0, 255, 127));
	
	cor040.setBounds(cor039.getX() + 42, cor039.getY(), cor039.getWidth(), cor039.getHeight());
	cor040.setOpaque(true);
	cor040.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor040.setBackground(new Color(46, 139, 87));
	
	cor041.setBounds(cor001.getX(), cor040.getY() + cor040.getHeight() + 2, cor040.getWidth(), cor040.getHeight());
	cor041.setOpaque(true);
	cor041.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor041.setBackground(new Color(102, 205, 170));
	
	cor042.setBounds(cor041.getX() + 42, cor041.getY(), cor041.getWidth(), cor041.getHeight());
	cor042.setOpaque(true);
	cor042.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor042.setBackground(new Color(60, 179, 113));
	
	cor043.setBounds(cor042.getX() + 42, cor042.getY(), cor042.getWidth(), cor042.getHeight());
	cor043.setOpaque(true);
	cor043.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor043.setBackground(new Color(32, 178, 170));
	
	cor044.setBounds(cor043.getX() + 42, cor043.getY(), cor043.getWidth(), cor043.getHeight());
	cor044.setOpaque(true);
	cor044.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor044.setBackground(new Color(47, 79, 79));
	
	cor045.setBounds(cor044.getX() + 42, cor044.getY(), cor044.getWidth(), cor044.getHeight());
	cor045.setOpaque(true);
	cor045.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor045.setBackground(new Color(0, 128, 128));
	
	cor046.setBounds(cor045.getX() + 42, cor045.getY(), cor045.getWidth(), cor045.getHeight());
	cor046.setOpaque(true);
	cor046.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor046.setBackground(new Color(0, 139, 139));
	
	cor047.setBounds(cor046.getX() + 42, cor046.getY(), cor046.getWidth(), cor046.getHeight());
	cor047.setOpaque(true);
	cor047.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor047.setBackground(new Color(0, 255, 255));
	
	cor048.setBounds(cor047.getX() + 42, cor047.getY(), cor047.getWidth(), cor047.getHeight());
	cor048.setOpaque(true);
	cor048.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor048.setBackground(new Color(0, 255, 255));
	
	cor049.setBounds(cor048.getX() + 42, cor048.getY(), cor048.getWidth(), cor048.getHeight());
	cor049.setOpaque(true);
	cor049.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor049.setBackground(new Color(224, 255, 255));
	
	cor050.setBounds(cor049.getX() + 42, cor049.getY(), cor049.getWidth(), cor049.getHeight());
	cor050.setOpaque(true);
	cor050.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor050.setBackground(new Color(0, 206, 209));
	
	cor051.setBounds(cor001.getX(), cor050.getY() + cor050.getHeight() + 2, cor050.getWidth(), cor050.getHeight());
	cor051.setOpaque(true);
	cor051.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor051.setBackground(new Color(64, 224, 208));
	
	cor052.setBounds(cor051.getX() + 42, cor051.getY(), cor051.getWidth(), cor051.getHeight());
	cor052.setOpaque(true);
	cor052.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor052.setBackground(new Color(72, 209, 204));
	
	cor053.setBounds(cor052.getX() + 42, cor052.getY(), cor052.getWidth(), cor052.getHeight());
	cor053.setOpaque(true);
	cor053.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor053.setBackground(new Color(175, 238, 238));
	
	cor054.setBounds(cor053.getX() + 42, cor053.getY(), cor053.getWidth(), cor053.getHeight());
	cor054.setOpaque(true);
	cor054.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor054.setBackground(new Color(127, 255, 212));
	
	cor055.setBounds(cor054.getX() + 42, cor054.getY(), cor054.getWidth(), cor054.getHeight());
	cor055.setOpaque(true);
	cor055.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor055.setBackground(new Color(176, 224, 230));
	
	cor056.setBounds(cor055.getX() + 42, cor055.getY(), cor055.getWidth(), cor055.getHeight());
	cor056.setOpaque(true);
	cor056.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor056.setBackground(new Color(95, 158, 160));
	
	cor057.setBounds(cor056.getX() + 42, cor056.getY(), cor056.getWidth(), cor056.getHeight());
	cor057.setOpaque(true);
	cor057.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor057.setBackground(new Color(70, 130, 180));
	
	cor058.setBounds(cor057.getX() + 42, cor057.getY(), cor057.getWidth(), cor057.getHeight());
	cor058.setOpaque(true);
	cor058.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor058.setBackground(new Color(100, 149, 237));
	
	cor059.setBounds(cor058.getX() + 42, cor058.getY(), cor058.getWidth(), cor058.getHeight());
	cor059.setOpaque(true);
	cor059.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor059.setBackground(new Color(0, 191, 255));
	
	cor060.setBounds(cor059.getX() + 42, cor059.getY(), cor059.getWidth(), cor059.getHeight());
	cor060.setOpaque(true);
	cor060.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor060.setBackground(new Color(30, 144, 255));
	
	cor061.setBounds(cor001.getX(), cor060.getY() + cor060.getHeight() + 2, cor060.getWidth(), cor060.getHeight());
	cor061.setOpaque(true);
	cor061.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor061.setBackground(new Color(173, 216, 230));
	
	cor062.setBounds(cor061.getX() + 42, cor061.getY(), cor061.getWidth(), cor061.getHeight());
	cor062.setOpaque(true);
	cor062.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor062.setBackground(new Color(135, 206, 235));
	
	cor063.setBounds(cor062.getX() + 42, cor062.getY(), cor062.getWidth(), cor062.getHeight());
	cor063.setOpaque(true);
	cor063.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor063.setBackground(new Color(135, 206, 250));
	
	cor064.setBounds(cor063.getX() + 42, cor063.getY(), cor063.getWidth(), cor063.getHeight());
	cor064.setOpaque(true);
	cor064.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor064.setBackground(new Color(25, 25, 112));
	
	cor065.setBounds(cor064.getX() + 42, cor064.getY(), cor064.getWidth(), cor064.getHeight());
	cor065.setOpaque(true);
	cor065.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor065.setBackground(new Color(0, 0, 128));
	
	cor066.setBounds(cor065.getX() + 42, cor065.getY(), cor065.getWidth(), cor065.getHeight());
	cor066.setOpaque(true);
	cor066.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor066.setBackground(new Color(0, 0, 139));
	
	cor067.setBounds(cor066.getX() + 42, cor066.getY(), cor066.getWidth(), cor066.getHeight());
	cor067.setOpaque(true);
	cor067.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor067.setBackground(new Color(0, 0, 205));
	
	cor068.setBounds(cor067.getX() + 42, cor067.getY(), cor067.getWidth(), cor067.getHeight());
	cor068.setOpaque(true);
	cor068.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor068.setBackground(new Color(0, 0, 255));
	
	cor069.setBounds(cor068.getX() + 42, cor068.getY(), cor068.getWidth(), cor068.getHeight());
	cor069.setOpaque(true);
	cor069.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor069.setBackground(new Color(65, 105, 225));
	
	cor070.setBounds(cor069.getX() + 42, cor069.getY(), cor069.getWidth(), cor069.getHeight());
	cor070.setOpaque(true);
	cor070.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor070.setBackground(new Color(138, 43, 226));
	
	cor071.setBounds(cor001.getX(), cor070.getY() + cor070.getHeight() + 2, cor070.getWidth(), cor070.getHeight());
	cor071.setOpaque(true);
	cor071.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor071.setBackground(new Color(75, 0, 130));
	
	cor072.setBounds(cor071.getX() + 42, cor071.getY(), cor071.getWidth(), cor071.getHeight());
	cor072.setOpaque(true);
	cor072.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor072.setBackground(new Color(72, 61, 139));
	
	cor073.setBounds(cor072.getX() + 42, cor072.getY(), cor072.getWidth(), cor072.getHeight());
	cor073.setOpaque(true);
	cor073.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor073.setBackground(new Color(106, 90, 205));
	
	cor074.setBounds(cor073.getX() + 42, cor073.getY(), cor073.getWidth(), cor073.getHeight());
	cor074.setOpaque(true);
	cor074.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor074.setBackground(new Color(123, 104, 238));
	
	cor075.setBounds(cor074.getX() + 42, cor074.getY(), cor074.getWidth(), cor074.getHeight());
	cor075.setOpaque(true);
	cor075.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor075.setBackground(new Color(147, 112, 219));
	
	cor076.setBounds(cor075.getX() + 42, cor075.getY(), cor075.getWidth(), cor075.getHeight());
	cor076.setOpaque(true);
	cor076.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor076.setBackground(new Color(139, 0, 139));
	
	cor077.setBounds(cor076.getX() + 42, cor076.getY(), cor076.getWidth(), cor076.getHeight());
	cor077.setOpaque(true);
	cor077.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor077.setBackground(new Color(148, 0, 211));
	
	cor078.setBounds(cor077.getX() + 42, cor077.getY(), cor077.getWidth(), cor077.getHeight());
	cor078.setOpaque(true);
	cor078.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor078.setBackground(new Color(153, 50, 204));
	
	cor079.setBounds(cor078.getX() + 42, cor078.getY(), cor078.getWidth(), cor078.getHeight());
	cor079.setOpaque(true);
	cor079.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor079.setBackground(new Color(186, 85, 211));
	
	cor080.setBounds(cor079.getX() + 42, cor079.getY(), cor079.getWidth(), cor079.getHeight());
	cor080.setOpaque(true);
	cor080.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor080.setBackground(new Color(128, 0, 128));
	
	cor081.setBounds(cor001.getX(), cor080.getY() + cor080.getHeight() + 2, cor080.getWidth(), cor080.getHeight());
	cor081.setOpaque(true);
	cor081.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor081.setBackground(new Color(216, 191, 216));
	
	cor082.setBounds(cor081.getX() + 42, cor081.getY(), cor081.getWidth(), cor081.getHeight());
	cor082.setOpaque(true);
	cor082.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor082.setBackground(new Color(221, 160, 221));
	
	cor083.setBounds(cor082.getX() + 42, cor082.getY(), cor082.getWidth(), cor082.getHeight());
	cor083.setOpaque(true);
	cor083.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor083.setBackground(new Color(238, 130, 238));
	
	cor084.setBounds(cor083.getX() + 42, cor083.getY(), cor083.getWidth(), cor083.getHeight());
	cor084.setOpaque(true);
	cor084.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor084.setBackground(new Color(255, 0, 255));
	
	cor085.setBounds(cor084.getX() + 42, cor084.getY(), cor084.getWidth(), cor084.getHeight());
	cor085.setOpaque(true);
	cor085.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor085.setBackground(new Color(218, 112, 214));
	
	cor086.setBounds(cor085.getX() + 42, cor085.getY(), cor085.getWidth(), cor085.getHeight());
	cor086.setOpaque(true);
	cor086.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor086.setBackground(new Color(199, 21, 133));
	
	cor087.setBounds(cor086.getX() + 42, cor086.getY(), cor086.getWidth(), cor086.getHeight());
	cor087.setOpaque(true);
	cor087.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor087.setBackground(new Color(219, 112, 147));
	
	cor088.setBounds(cor087.getX() + 42, cor087.getY(), cor087.getWidth(), cor087.getHeight());
	cor088.setOpaque(true);
	cor088.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor088.setBackground(new Color(255, 20, 147));
	
	cor089.setBounds(cor088.getX() + 42, cor088.getY(), cor088.getWidth(), cor088.getHeight());
	cor089.setOpaque(true);
	cor089.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor089.setBackground(new Color(255, 105, 180));
	
	cor090.setBounds(cor089.getX() + 42, cor089.getY(), cor089.getWidth(), cor089.getHeight());
	cor090.setOpaque(true);
	cor090.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor090.setBackground(new Color(255, 182, 193));
	
	cor091.setBounds(cor001.getX(), cor090.getY() + cor090.getHeight() + 2, cor090.getWidth(), cor090.getHeight());
	cor091.setOpaque(true);
	cor091.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor091.setBackground(new Color(255, 192, 203));
	
	cor092.setBounds(cor091.getX() + 42, cor091.getY(), cor091.getWidth(), cor091.getHeight());
	cor092.setOpaque(true);
	cor092.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor092.setBackground(new Color(250, 235, 215));
	
	cor093.setBounds(cor092.getX() + 42, cor092.getY(), cor092.getWidth(), cor092.getHeight());
	cor093.setOpaque(true);
	cor093.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor093.setBackground(new Color(245, 245, 220));
	
	cor094.setBounds(cor093.getX() + 42, cor093.getY(), cor093.getWidth(), cor093.getHeight());
	cor094.setOpaque(true);
	cor094.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor094.setBackground(new Color(255, 228, 196));
	
	cor095.setBounds(cor094.getX() + 42, cor094.getY(), cor094.getWidth(), cor094.getHeight());
	cor095.setOpaque(true);
	cor095.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor095.setBackground(new Color(255, 235, 205));
	
	cor096.setBounds(cor095.getX() + 42, cor095.getY(), cor095.getWidth(), cor095.getHeight());
	cor096.setOpaque(true);
	cor096.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor096.setBackground(new Color(245, 222, 179));
	
	cor097.setBounds(cor096.getX() + 42, cor096.getY(), cor096.getWidth(), cor096.getHeight());
	cor097.setOpaque(true);
	cor097.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor097.setBackground(new Color(255, 248, 220));
	
	cor098.setBounds(cor097.getX() + 42, cor097.getY(), cor097.getWidth(), cor097.getHeight());
	cor098.setOpaque(true);
	cor098.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor098.setBackground(new Color(255, 250, 205));
	
	cor099.setBounds(cor098.getX() + 42, cor098.getY(), cor098.getWidth(), cor098.getHeight());
	cor099.setOpaque(true);
	cor099.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor099.setBackground(new Color(250, 250, 210));
	
	cor100.setBounds(cor099.getX() + 42, cor099.getY(), cor099.getWidth(), cor099.getHeight());
	cor100.setOpaque(true);
	cor100.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor100.setBackground(new Color(255, 255, 224));
	
	cor101.setBounds(cor001.getX(), cor100.getY() + cor100.getHeight() + 2, cor100.getWidth(), cor100.getHeight());
	cor101.setOpaque(true);
	cor101.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor101.setBackground(new Color(139, 69, 19));
	
	cor102.setBounds(cor101.getX() + 42, cor101.getY(), cor101.getWidth(), cor101.getHeight());
	cor102.setOpaque(true);
	cor102.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor102.setBackground(new Color(160, 82, 45));
	
	cor103.setBounds(cor102.getX() + 42, cor102.getY(), cor102.getWidth(), cor102.getHeight());
	cor103.setOpaque(true);
	cor103.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor103.setBackground(new Color(210, 105, 30));
	
	cor104.setBounds(cor103.getX() + 42, cor103.getY(), cor103.getWidth(), cor103.getHeight());
	cor104.setOpaque(true);
	cor104.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor104.setBackground(new Color(205, 133, 63));
	
	cor105.setBounds(cor104.getX() + 42, cor104.getY(), cor104.getWidth(), cor104.getHeight());
	cor105.setOpaque(true);
	cor105.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor105.setBackground(new Color(244, 164, 96));
	
	cor106.setBounds(cor105.getX() + 42, cor105.getY(), cor105.getWidth(), cor105.getHeight());
	cor106.setOpaque(true);
	cor106.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor106.setBackground(new Color(222, 184, 135));
	
	cor107.setBounds(cor106.getX() + 42, cor106.getY(), cor106.getWidth(), cor106.getHeight());
	cor107.setOpaque(true);
	cor107.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor107.setBackground(new Color(210, 180, 140));
	
	cor108.setBounds(cor107.getX() + 42, cor107.getY(), cor107.getWidth(), cor107.getHeight());
	cor108.setOpaque(true);
	cor108.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor108.setBackground(new Color(188, 143, 143));
	
	cor109.setBounds(cor108.getX() + 42, cor108.getY(), cor108.getWidth(), cor108.getHeight());
	cor109.setOpaque(true);
	cor109.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor109.setBackground(new Color(255, 228, 181));
	
	cor110.setBounds(cor109.getX() + 42, cor109.getY(), cor109.getWidth(), cor109.getHeight());
	cor110.setOpaque(true);
	cor110.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor110.setBackground(new Color(255, 222, 173));
	
	cor111.setBounds(cor001.getX(), cor110.getY() + cor110.getHeight() + 2, cor110.getWidth(), cor110.getHeight());
	cor111.setOpaque(true);
	cor111.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor111.setBackground(new Color(255, 218, 185));
	
	cor112.setBounds(cor111.getX() + 42, cor111.getY(), cor111.getWidth(), cor111.getHeight());
	cor112.setOpaque(true);
	cor112.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor112.setBackground(new Color(255, 228, 225));
	
	cor113.setBounds(cor112.getX() + 42, cor112.getY(), cor112.getWidth(), cor112.getHeight());
	cor113.setOpaque(true);
	cor113.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor113.setBackground(new Color(255, 240, 245));
	
	cor114.setBounds(cor113.getX() + 42, cor113.getY(), cor113.getWidth(), cor113.getHeight());
	cor114.setOpaque(true);
	cor114.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor114.setBackground(new Color(250, 240, 230));
	
	cor115.setBounds(cor114.getX() + 42, cor114.getY(), cor114.getWidth(), cor114.getHeight());
	cor115.setOpaque(true);
	cor115.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor115.setBackground(new Color(253, 245, 230));
	
	cor116.setBounds(cor115.getX() + 42, cor115.getY(), cor115.getWidth(), cor115.getHeight());
	cor116.setOpaque(true);
	cor116.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor116.setBackground(new Color(255, 239, 213));
	
	cor117.setBounds(cor116.getX() + 42, cor116.getY(), cor116.getWidth(), cor116.getHeight());
	cor117.setOpaque(true);
	cor117.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor117.setBackground(new Color(255, 245, 238));
	
	cor118.setBounds(cor117.getX() + 42, cor117.getY(), cor117.getWidth(), cor117.getHeight());
	cor118.setOpaque(true);
	cor118.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor118.setBackground(new Color(245, 255, 250));
	
	cor119.setBounds(cor118.getX() + 42, cor118.getY(), cor118.getWidth(), cor118.getHeight());
	cor119.setOpaque(true);
	cor119.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor119.setBackground(new Color(112, 128, 144));
	
	cor120.setBounds(cor119.getX() + 42, cor119.getY(), cor119.getWidth(), cor119.getHeight());
	cor120.setOpaque(true);
	cor120.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor120.setBackground(new Color(119, 136, 153));
	
	cor121.setBounds(cor001.getX(), cor120.getY() + cor120.getHeight() + 2, cor120.getWidth(), cor120.getHeight());
	cor121.setOpaque(true);
	cor121.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor121.setBackground(new Color(176, 196, 222));
	
	cor122.setBounds(cor121.getX() + 42, cor121.getY(), cor121.getWidth(), cor121.getHeight());
	cor122.setOpaque(true);
	cor122.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor122.setBackground(new Color(230, 230, 250));
	
	cor123.setBounds(cor122.getX() + 42, cor122.getY(), cor122.getWidth(), cor122.getHeight());
	cor123.setOpaque(true);
	cor123.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor123.setBackground(new Color(255, 250, 240));
	
	cor124.setBounds(cor123.getX() + 42, cor123.getY(), cor123.getWidth(), cor123.getHeight());
	cor124.setOpaque(true);
	cor124.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor124.setBackground(new Color(240, 248, 255));
	
	cor125.setBounds(cor124.getX() + 42, cor124.getY(), cor124.getWidth(), cor124.getHeight());
	cor125.setOpaque(true);
	cor125.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor125.setBackground(new Color(248, 248, 255));
	
	cor126.setBounds(cor125.getX() + 42, cor125.getY(), cor125.getWidth(), cor125.getHeight());
	cor126.setOpaque(true);
	cor126.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor126.setBackground(new Color(240, 255, 240));
	
	cor127.setBounds(cor126.getX() + 42, cor126.getY(), cor126.getWidth(), cor126.getHeight());
	cor127.setOpaque(true);
	cor127.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor127.setBackground(new Color(255, 255, 240));
	
	cor128.setBounds(cor127.getX() + 42, cor127.getY(), cor127.getWidth(), cor127.getHeight());
	cor128.setOpaque(true);
	cor128.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor128.setBackground(new Color(240, 255, 255));
	
	cor129.setBounds(cor128.getX() + 42, cor128.getY(), cor128.getWidth(), cor128.getHeight());
	cor129.setOpaque(true);
	cor129.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor129.setBackground(new Color(255, 250, 250));
	
	cor130.setBounds(cor129.getX() + 42, cor129.getY(), cor129.getWidth(), cor129.getHeight());
	cor130.setOpaque(true);
	cor130.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor130.setBackground(new Color(0, 0, 0));
	
	cor131.setBounds(cor001.getX(), cor130.getY() + cor130.getHeight() + 2, cor130.getWidth(), cor130.getHeight());
	cor131.setOpaque(true);
	cor131.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor131.setBackground(new Color(105, 105, 105));
	
	cor132.setBounds(cor131.getX() + 42, cor131.getY(), cor131.getWidth(), cor131.getHeight());
	cor132.setOpaque(true);
	cor132.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor132.setBackground(new Color(128, 128, 128));
	
	cor133.setBounds(cor132.getX() + 42, cor132.getY(), cor132.getWidth(), cor132.getHeight());
	cor133.setOpaque(true);
	cor133.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor133.setBackground(new Color(169, 169, 169));
	
	cor134.setBounds(cor133.getX() + 42, cor133.getY(), cor133.getWidth(), cor133.getHeight());
	cor134.setOpaque(true);
	cor134.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor134.setBackground(new Color(192, 192, 192));
	
	cor135.setBounds(cor134.getX() + 42, cor134.getY(), cor134.getWidth(), cor134.getHeight());
	cor135.setOpaque(true);
	cor135.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor135.setBackground(new Color(211, 211, 211));
	
	cor136.setBounds(cor135.getX() + 42, cor135.getY(), cor135.getWidth(), cor135.getHeight());
	cor136.setOpaque(true);
	cor136.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor136.setBackground(new Color(220, 220, 220));
	
	cor137.setBounds(cor136.getX() + 42, cor136.getY(), cor136.getWidth(), cor136.getHeight());
	cor137.setOpaque(true);
	cor137.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor137.setBackground(new Color(245, 245, 245));
	
	cor138.setBounds(cor137.getX() + 42, cor137.getY(), cor137.getWidth(), cor137.getHeight());
	cor138.setOpaque(true);
	cor138.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	cor138.setBackground(new Color(255, 255, 255));
	
	//Itens do painel de Configuração
	lblIdiomas.setBounds(10, cor138.getY() + 30, 400, 24);
	portugues.setBounds(10, lblIdiomas.getY() + 32, 140, 35);
	ingles.setBounds(portugues.getX() + 150, lblIdiomas.getY() + 32, 140, 35);
	
	horasim.setBounds(hora.getX(), hora.getY() + 32, 140, 35);
	horanao.setBounds(hora.getX() + 150, horasim.getY(), 140, 35);
	
	somsim.setBounds(som.getX(), som.getY() + 32, 140, 35);
	somnao.setBounds(som.getX() + 150, somsim.getY(), 140, 35);
	
	//Ação que aplica a cor que o usuário escolheu para todos os elementos que precisam ser ajustados para a cor escolhida.
	cor001.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor001.getBackground());
			painelInicio.setBackground(cor001.getBackground());
			painel.setBackground(cor001.getBackground());
			questao.setBackground(cor001.getBackground());
			btn01.setBackground(cor001.getBackground());
			btn02.setBackground(cor001.getBackground());
			btn03.setBackground(cor001.getBackground());
			btn04.setBackground(cor001.getBackground());
			btn05.setBackground(cor001.getBackground());
			painelConfiguracoes.setBackground(cor001.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor001.getBackground());
			auxiliarRespostas.setBackground(cor001.getBackground());
			auxiliarAvaliar.setBackground(cor001.getBackground());
			auxiliarConfiguracoes.setBackground(cor001.getBackground());
			auxiliarFinal.setBackground(cor001.getBackground());
		}
	});
	cor002.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor002.getBackground());
			painelInicio.setBackground(cor002.getBackground());
			painel.setBackground(cor002.getBackground());
			questao.setBackground(cor002.getBackground());
			btn01.setBackground(cor002.getBackground());
			btn02.setBackground(cor002.getBackground());
			btn03.setBackground(cor002.getBackground());
			btn04.setBackground(cor002.getBackground());
			btn05.setBackground(cor002.getBackground());
			painelConfiguracoes.setBackground(cor002.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor002.getBackground());
			auxiliarRespostas.setBackground(cor002.getBackground());
			auxiliarAvaliar.setBackground(cor002.getBackground());
			auxiliarConfiguracoes.setBackground(cor002.getBackground());
			auxiliarFinal.setBackground(cor002.getBackground());
		}
	});
	cor003.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor003.getBackground());
			painelInicio.setBackground(cor003.getBackground());
			painelInicio.setBackground(cor003.getBackground());
			painelInicio.setBackground(cor003.getBackground());
			painel.setBackground(cor003.getBackground());
			questao.setBackground(cor003.getBackground());
			btn01.setBackground(cor003.getBackground());
			btn02.setBackground(cor003.getBackground());
			btn03.setBackground(cor003.getBackground());
			btn04.setBackground(cor003.getBackground());
			btn05.setBackground(cor003.getBackground());
			painelConfiguracoes.setBackground(cor003.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor003.getBackground());
			auxiliarRespostas.setBackground(cor003.getBackground());
			auxiliarAvaliar.setBackground(cor003.getBackground());
			auxiliarConfiguracoes.setBackground(cor003.getBackground());
			auxiliarFinal.setBackground(cor003.getBackground());
		}
	});
	cor004.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor004.getBackground());
			painelInicio.setBackground(cor004.getBackground());
			painel.setBackground(cor004.getBackground());
			questao.setBackground(cor004.getBackground());
			btn01.setBackground(cor004.getBackground());
			btn02.setBackground(cor004.getBackground());
			btn03.setBackground(cor004.getBackground());
			btn04.setBackground(cor004.getBackground());
			btn05.setBackground(cor004.getBackground());
			painelConfiguracoes.setBackground(cor004.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor004.getBackground());
			auxiliarRespostas.setBackground(cor004.getBackground());
			auxiliarAvaliar.setBackground(cor004.getBackground());
			auxiliarConfiguracoes.setBackground(cor004.getBackground());
			auxiliarFinal.setBackground(cor004.getBackground());
		}
	});
	cor005.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor005.getBackground());
			painelInicio.setBackground(cor005.getBackground());
			painel.setBackground(cor005.getBackground());
			questao.setBackground(cor005.getBackground());
			btn01.setBackground(cor005.getBackground());
			btn02.setBackground(cor005.getBackground());
			btn03.setBackground(cor005.getBackground());
			btn04.setBackground(cor005.getBackground());
			btn05.setBackground(cor005.getBackground());
			painelConfiguracoes.setBackground(cor005.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor005.getBackground());
			auxiliarRespostas.setBackground(cor005.getBackground());
			auxiliarAvaliar.setBackground(cor005.getBackground());
			auxiliarConfiguracoes.setBackground(cor005.getBackground());
			auxiliarFinal.setBackground(cor005.getBackground());
		}
	});
	cor006.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor006.getBackground());
			painelInicio.setBackground(cor006.getBackground());
			painel.setBackground(cor006.getBackground());
			questao.setBackground(cor006.getBackground());
			btn01.setBackground(cor006.getBackground());
			btn02.setBackground(cor006.getBackground());
			btn03.setBackground(cor006.getBackground());
			btn04.setBackground(cor006.getBackground());
			btn05.setBackground(cor006.getBackground());
			painelConfiguracoes.setBackground(cor006.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor006.getBackground());
			auxiliarRespostas.setBackground(cor006.getBackground());
			auxiliarAvaliar.setBackground(cor006.getBackground());
			auxiliarConfiguracoes.setBackground(cor006.getBackground());
			auxiliarFinal.setBackground(cor006.getBackground());
		}
	});
	cor007.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor007.getBackground());
			painelInicio.setBackground(cor007.getBackground());
			painel.setBackground(cor007.getBackground());
			questao.setBackground(cor007.getBackground());
			btn01.setBackground(cor007.getBackground());
			btn02.setBackground(cor007.getBackground());
			btn03.setBackground(cor007.getBackground());
			btn04.setBackground(cor007.getBackground());
			btn05.setBackground(cor007.getBackground());
			painelConfiguracoes.setBackground(cor007.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor007.getBackground());
			auxiliarRespostas.setBackground(cor007.getBackground());
			auxiliarAvaliar.setBackground(cor007.getBackground());
			auxiliarConfiguracoes.setBackground(cor007.getBackground());
			auxiliarFinal.setBackground(cor007.getBackground());
		}
	});
	cor008.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor008.getBackground());
			painelInicio.setBackground(cor008.getBackground());
			painel.setBackground(cor008.getBackground());
			questao.setBackground(cor008.getBackground());
			btn01.setBackground(cor008.getBackground());
			btn02.setBackground(cor008.getBackground());
			btn03.setBackground(cor008.getBackground());
			btn04.setBackground(cor008.getBackground());
			btn05.setBackground(cor008.getBackground());
			painelConfiguracoes.setBackground(cor008.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor008.getBackground());
			auxiliarRespostas.setBackground(cor008.getBackground());
			auxiliarAvaliar.setBackground(cor008.getBackground());
			auxiliarConfiguracoes.setBackground(cor008.getBackground());
			auxiliarFinal.setBackground(cor008.getBackground());
		}
	});
	cor009.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor009.getBackground());
			painelInicio.setBackground(cor009.getBackground());
			painel.setBackground(cor009.getBackground());
			questao.setBackground(cor009.getBackground());
			btn01.setBackground(cor009.getBackground());
			btn02.setBackground(cor009.getBackground());
			btn03.setBackground(cor009.getBackground());
			btn04.setBackground(cor009.getBackground());
			btn05.setBackground(cor009.getBackground());
			painelConfiguracoes.setBackground(cor009.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor009.getBackground());
			auxiliarRespostas.setBackground(cor009.getBackground());
			auxiliarAvaliar.setBackground(cor009.getBackground());
			auxiliarConfiguracoes.setBackground(cor009.getBackground());
			auxiliarFinal.setBackground(cor009.getBackground());
		}
	});
	cor010.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor010.getBackground());
			painelInicio.setBackground(cor010.getBackground());
			painel.setBackground(cor010.getBackground());
			questao.setBackground(cor010.getBackground());
			btn01.setBackground(cor010.getBackground());
			btn02.setBackground(cor010.getBackground());
			btn03.setBackground(cor010.getBackground());
			btn04.setBackground(cor010.getBackground());
			btn05.setBackground(cor010.getBackground());
			painelConfiguracoes.setBackground(cor010.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor010.getBackground());
			auxiliarRespostas.setBackground(cor010.getBackground());
			auxiliarAvaliar.setBackground(cor010.getBackground());
			auxiliarConfiguracoes.setBackground(cor010.getBackground());
			auxiliarFinal.setBackground(cor010.getBackground());
		}
	});
	cor011.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor011.getBackground());
			painelInicio.setBackground(cor011.getBackground());
			painel.setBackground(cor011.getBackground());
			questao.setBackground(cor011.getBackground());
			btn01.setBackground(cor011.getBackground());
			btn02.setBackground(cor011.getBackground());
			btn03.setBackground(cor011.getBackground());
			btn04.setBackground(cor011.getBackground());
			btn05.setBackground(cor011.getBackground());
			painelConfiguracoes.setBackground(cor011.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor011.getBackground());
			auxiliarRespostas.setBackground(cor011.getBackground());
			auxiliarAvaliar.setBackground(cor011.getBackground());
			auxiliarConfiguracoes.setBackground(cor011.getBackground());
			auxiliarFinal.setBackground(cor011.getBackground());
		}
	});
	cor012.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor012.getBackground());
			painelInicio.setBackground(cor012.getBackground());
			painel.setBackground(cor012.getBackground());
			questao.setBackground(cor012.getBackground());
			btn01.setBackground(cor012.getBackground());
			btn02.setBackground(cor012.getBackground());
			btn03.setBackground(cor012.getBackground());
			btn04.setBackground(cor012.getBackground());
			btn05.setBackground(cor012.getBackground());
			painelConfiguracoes.setBackground(cor012.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor012.getBackground());
			auxiliarRespostas.setBackground(cor012.getBackground());
			auxiliarAvaliar.setBackground(cor012.getBackground());
			auxiliarConfiguracoes.setBackground(cor012.getBackground());
			auxiliarFinal.setBackground(cor012.getBackground());
		}
	});
	cor013.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor013.getBackground());
			painelInicio.setBackground(cor013.getBackground());
			painel.setBackground(cor013.getBackground());
			questao.setBackground(cor013.getBackground());
			btn01.setBackground(cor013.getBackground());
			btn02.setBackground(cor013.getBackground());
			btn03.setBackground(cor013.getBackground());
			btn04.setBackground(cor013.getBackground());
			btn05.setBackground(cor013.getBackground());
			painelConfiguracoes.setBackground(cor013.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor013.getBackground());
			auxiliarRespostas.setBackground(cor013.getBackground());
			auxiliarAvaliar.setBackground(cor013.getBackground());
			auxiliarConfiguracoes.setBackground(cor013.getBackground());
			auxiliarFinal.setBackground(cor013.getBackground());
		}
	});
	cor014.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor014.getBackground());
			painelInicio.setBackground(cor014.getBackground());
			painel.setBackground(cor014.getBackground());
			questao.setBackground(cor014.getBackground());
			btn01.setBackground(cor014.getBackground());
			btn02.setBackground(cor014.getBackground());
			btn03.setBackground(cor014.getBackground());
			btn04.setBackground(cor014.getBackground());
			btn05.setBackground(cor014.getBackground());
			painelConfiguracoes.setBackground(cor014.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor014.getBackground());
			auxiliarRespostas.setBackground(cor014.getBackground());
			auxiliarAvaliar.setBackground(cor014.getBackground());
			auxiliarConfiguracoes.setBackground(cor014.getBackground());
			auxiliarFinal.setBackground(cor014.getBackground());
		}
	});
	cor015.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor015.getBackground());
			painelInicio.setBackground(cor015.getBackground());
			painel.setBackground(cor015.getBackground());
			questao.setBackground(cor015.getBackground());
			btn01.setBackground(cor015.getBackground());
			btn02.setBackground(cor015.getBackground());
			btn03.setBackground(cor015.getBackground());
			btn04.setBackground(cor015.getBackground());
			btn05.setBackground(cor015.getBackground());
			painelConfiguracoes.setBackground(cor015.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor015.getBackground());
			auxiliarRespostas.setBackground(cor015.getBackground());
			auxiliarAvaliar.setBackground(cor015.getBackground());
			auxiliarConfiguracoes.setBackground(cor015.getBackground());
			auxiliarFinal.setBackground(cor015.getBackground());
		}
	});
	cor016.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor016.getBackground());
			painelInicio.setBackground(cor016.getBackground());
			painel.setBackground(cor016.getBackground());
			questao.setBackground(cor016.getBackground());
			btn01.setBackground(cor016.getBackground());
			btn02.setBackground(cor016.getBackground());
			btn03.setBackground(cor016.getBackground());
			btn04.setBackground(cor016.getBackground());
			btn05.setBackground(cor016.getBackground());
			painelConfiguracoes.setBackground(cor016.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor016.getBackground());
			auxiliarRespostas.setBackground(cor016.getBackground());
			auxiliarAvaliar.setBackground(cor016.getBackground());
			auxiliarConfiguracoes.setBackground(cor016.getBackground());
			auxiliarFinal.setBackground(cor016.getBackground());
		}
	});
	cor017.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor017.getBackground());
			painelInicio.setBackground(cor017.getBackground());
			painel.setBackground(cor017.getBackground());
			questao.setBackground(cor017.getBackground());
			btn01.setBackground(cor017.getBackground());
			btn02.setBackground(cor017.getBackground());
			btn03.setBackground(cor017.getBackground());
			btn04.setBackground(cor017.getBackground());
			btn05.setBackground(cor017.getBackground());
			painelConfiguracoes.setBackground(cor017.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor017.getBackground());
			auxiliarRespostas.setBackground(cor017.getBackground());
			auxiliarAvaliar.setBackground(cor017.getBackground());
			auxiliarConfiguracoes.setBackground(cor017.getBackground());
			auxiliarFinal.setBackground(cor017.getBackground());
		}
	});
	cor018.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor018.getBackground());
			painelInicio.setBackground(cor018.getBackground());
			painel.setBackground(cor018.getBackground());
			questao.setBackground(cor018.getBackground());
			btn01.setBackground(cor018.getBackground());
			btn02.setBackground(cor018.getBackground());
			btn03.setBackground(cor018.getBackground());
			btn04.setBackground(cor018.getBackground());
			btn05.setBackground(cor018.getBackground());
			painelConfiguracoes.setBackground(cor018.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor018.getBackground());
			auxiliarRespostas.setBackground(cor018.getBackground());
			auxiliarAvaliar.setBackground(cor018.getBackground());
			auxiliarConfiguracoes.setBackground(cor018.getBackground());
			auxiliarFinal.setBackground(cor018.getBackground());
		}
	});
	cor019.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor019.getBackground());
			painelInicio.setBackground(cor019.getBackground());
			painel.setBackground(cor019.getBackground());
			questao.setBackground(cor019.getBackground());
			btn01.setBackground(cor019.getBackground());
			btn02.setBackground(cor019.getBackground());
			btn03.setBackground(cor019.getBackground());
			btn04.setBackground(cor019.getBackground());
			btn05.setBackground(cor019.getBackground());
			painelConfiguracoes.setBackground(cor019.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor019.getBackground());
			auxiliarRespostas.setBackground(cor019.getBackground());
			auxiliarAvaliar.setBackground(cor019.getBackground());
			auxiliarConfiguracoes.setBackground(cor019.getBackground());
			auxiliarFinal.setBackground(cor019.getBackground());
		}
	});
	cor020.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor020.getBackground());
			painelInicio.setBackground(cor020.getBackground());
			painel.setBackground(cor020.getBackground());
			questao.setBackground(cor020.getBackground());
			btn01.setBackground(cor020.getBackground());
			btn02.setBackground(cor020.getBackground());
			btn03.setBackground(cor020.getBackground());
			btn04.setBackground(cor020.getBackground());
			btn05.setBackground(cor020.getBackground());
			painelConfiguracoes.setBackground(cor020.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor020.getBackground());
			auxiliarRespostas.setBackground(cor020.getBackground());
			auxiliarAvaliar.setBackground(cor020.getBackground());
			auxiliarConfiguracoes.setBackground(cor020.getBackground());
			auxiliarFinal.setBackground(cor020.getBackground());
		}
	});
	cor021.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor021.getBackground());
			painelInicio.setBackground(cor021.getBackground());
			painel.setBackground(cor021.getBackground());
			questao.setBackground(cor021.getBackground());
			btn01.setBackground(cor021.getBackground());
			btn02.setBackground(cor021.getBackground());
			btn03.setBackground(cor021.getBackground());
			btn04.setBackground(cor021.getBackground());
			btn05.setBackground(cor021.getBackground());
			painelConfiguracoes.setBackground(cor021.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor021.getBackground());
			auxiliarRespostas.setBackground(cor021.getBackground());
			auxiliarAvaliar.setBackground(cor021.getBackground());
			auxiliarConfiguracoes.setBackground(cor021.getBackground());
			auxiliarFinal.setBackground(cor021.getBackground());
		}
	});
	cor022.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor022.getBackground());
			painelInicio.setBackground(cor022.getBackground());
			painel.setBackground(cor022.getBackground());
			questao.setBackground(cor022.getBackground());
			btn01.setBackground(cor022.getBackground());
			btn02.setBackground(cor022.getBackground());
			btn03.setBackground(cor022.getBackground());
			btn04.setBackground(cor022.getBackground());
			btn05.setBackground(cor022.getBackground());
			painelConfiguracoes.setBackground(cor022.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor022.getBackground());
			auxiliarRespostas.setBackground(cor022.getBackground());
			auxiliarAvaliar.setBackground(cor022.getBackground());
			auxiliarConfiguracoes.setBackground(cor022.getBackground());
			auxiliarFinal.setBackground(cor022.getBackground());
		}
	});
	cor023.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor023.getBackground());
			painelInicio.setBackground(cor023.getBackground());
			painel.setBackground(cor023.getBackground());
			questao.setBackground(cor023.getBackground());
			btn01.setBackground(cor023.getBackground());
			btn02.setBackground(cor023.getBackground());
			btn03.setBackground(cor023.getBackground());
			btn04.setBackground(cor023.getBackground());
			btn05.setBackground(cor023.getBackground());
			painelConfiguracoes.setBackground(cor023.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor023.getBackground());
			auxiliarRespostas.setBackground(cor023.getBackground());
			auxiliarAvaliar.setBackground(cor023.getBackground());
			auxiliarConfiguracoes.setBackground(cor023.getBackground());
			auxiliarFinal.setBackground(cor023.getBackground());
		}
	});
	cor024.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor024.getBackground());
			painelInicio.setBackground(cor024.getBackground());
			painel.setBackground(cor024.getBackground());
			questao.setBackground(cor024.getBackground());
			btn01.setBackground(cor024.getBackground());
			btn02.setBackground(cor024.getBackground());
			btn03.setBackground(cor024.getBackground());
			btn04.setBackground(cor024.getBackground());
			btn05.setBackground(cor024.getBackground());
			painelConfiguracoes.setBackground(cor024.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor024.getBackground());
			auxiliarRespostas.setBackground(cor024.getBackground());
			auxiliarAvaliar.setBackground(cor024.getBackground());
			auxiliarConfiguracoes.setBackground(cor024.getBackground());
			auxiliarFinal.setBackground(cor024.getBackground());
		}
	});
	cor025.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor025.getBackground());
			painelInicio.setBackground(cor025.getBackground());
			painel.setBackground(cor025.getBackground());
			questao.setBackground(cor025.getBackground());
			btn01.setBackground(cor025.getBackground());
			btn02.setBackground(cor025.getBackground());
			btn03.setBackground(cor025.getBackground());
			btn04.setBackground(cor025.getBackground());
			btn05.setBackground(cor025.getBackground());
			painelConfiguracoes.setBackground(cor025.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor025.getBackground());
			auxiliarRespostas.setBackground(cor025.getBackground());
			auxiliarAvaliar.setBackground(cor025.getBackground());
			auxiliarConfiguracoes.setBackground(cor025.getBackground());
			auxiliarFinal.setBackground(cor025.getBackground());
		}
	});
	cor026.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor026.getBackground());
			painelInicio.setBackground(cor026.getBackground());
			painel.setBackground(cor026.getBackground());
			questao.setBackground(cor026.getBackground());
			btn01.setBackground(cor026.getBackground());
			btn02.setBackground(cor026.getBackground());
			btn03.setBackground(cor026.getBackground());
			btn04.setBackground(cor026.getBackground());
			btn05.setBackground(cor026.getBackground());
			painelConfiguracoes.setBackground(cor026.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor026.getBackground());
			auxiliarRespostas.setBackground(cor026.getBackground());
			auxiliarAvaliar.setBackground(cor026.getBackground());
			auxiliarConfiguracoes.setBackground(cor026.getBackground());
			auxiliarFinal.setBackground(cor026.getBackground());
		}
	});
	cor027.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor027.getBackground());
			painelInicio.setBackground(cor027.getBackground());
			painel.setBackground(cor027.getBackground());
			questao.setBackground(cor027.getBackground());
			btn01.setBackground(cor027.getBackground());
			btn02.setBackground(cor027.getBackground());
			btn03.setBackground(cor027.getBackground());
			btn04.setBackground(cor027.getBackground());
			btn05.setBackground(cor027.getBackground());
			painelConfiguracoes.setBackground(cor027.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor027.getBackground());
			auxiliarRespostas.setBackground(cor027.getBackground());
			auxiliarAvaliar.setBackground(cor027.getBackground());
			auxiliarConfiguracoes.setBackground(cor027.getBackground());
			auxiliarFinal.setBackground(cor027.getBackground());
		}
	});
	cor028.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor028.getBackground());
			painelInicio.setBackground(cor028.getBackground());
			painel.setBackground(cor028.getBackground());
			questao.setBackground(cor028.getBackground());
			btn01.setBackground(cor028.getBackground());
			btn02.setBackground(cor028.getBackground());
			btn03.setBackground(cor028.getBackground());
			btn04.setBackground(cor028.getBackground());
			btn05.setBackground(cor028.getBackground());
			painelConfiguracoes.setBackground(cor028.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor028.getBackground());
			auxiliarRespostas.setBackground(cor028.getBackground());
			auxiliarAvaliar.setBackground(cor028.getBackground());
			auxiliarConfiguracoes.setBackground(cor028.getBackground());
			auxiliarFinal.setBackground(cor028.getBackground());
		}
	});
	cor029.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor029.getBackground());
			painelInicio.setBackground(cor029.getBackground());
			painel.setBackground(cor029.getBackground());
			questao.setBackground(cor029.getBackground());
			btn01.setBackground(cor029.getBackground());
			btn02.setBackground(cor029.getBackground());
			btn03.setBackground(cor029.getBackground());
			btn04.setBackground(cor029.getBackground());
			btn05.setBackground(cor029.getBackground());
			painelConfiguracoes.setBackground(cor029.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor029.getBackground());
			auxiliarRespostas.setBackground(cor029.getBackground());
			auxiliarAvaliar.setBackground(cor029.getBackground());
			auxiliarConfiguracoes.setBackground(cor029.getBackground());
			auxiliarFinal.setBackground(cor029.getBackground());
		}
	});
	cor030.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor030.getBackground());
			painelInicio.setBackground(cor030.getBackground());
			painel.setBackground(cor030.getBackground());
			questao.setBackground(cor030.getBackground());
			btn01.setBackground(cor030.getBackground());
			btn02.setBackground(cor030.getBackground());
			btn03.setBackground(cor030.getBackground());
			btn04.setBackground(cor030.getBackground());
			btn05.setBackground(cor030.getBackground());
			painelConfiguracoes.setBackground(cor030.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor030.getBackground());
			auxiliarRespostas.setBackground(cor030.getBackground());
			auxiliarAvaliar.setBackground(cor030.getBackground());
			auxiliarConfiguracoes.setBackground(cor030.getBackground());
			auxiliarFinal.setBackground(cor030.getBackground());
		}
	});
	cor031.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor031.getBackground());
			painelInicio.setBackground(cor031.getBackground());
			painel.setBackground(cor031.getBackground());
			questao.setBackground(cor031.getBackground());
			btn01.setBackground(cor031.getBackground());
			btn02.setBackground(cor031.getBackground());
			btn03.setBackground(cor031.getBackground());
			btn04.setBackground(cor031.getBackground());
			btn05.setBackground(cor031.getBackground());
			painelConfiguracoes.setBackground(cor031.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor031.getBackground());
			auxiliarRespostas.setBackground(cor031.getBackground());
			auxiliarAvaliar.setBackground(cor031.getBackground());
			auxiliarConfiguracoes.setBackground(cor031.getBackground());
			auxiliarFinal.setBackground(cor031.getBackground());
		}
	});
	cor032.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor032.getBackground());
			painelInicio.setBackground(cor032.getBackground());
			painel.setBackground(cor032.getBackground());
			questao.setBackground(cor032.getBackground());
			btn01.setBackground(cor032.getBackground());
			btn02.setBackground(cor032.getBackground());
			btn03.setBackground(cor032.getBackground());
			btn04.setBackground(cor032.getBackground());
			btn05.setBackground(cor032.getBackground());
			painelConfiguracoes.setBackground(cor032.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor032.getBackground());
			auxiliarRespostas.setBackground(cor032.getBackground());
			auxiliarAvaliar.setBackground(cor032.getBackground());
			auxiliarConfiguracoes.setBackground(cor032.getBackground());
			auxiliarFinal.setBackground(cor032.getBackground());
		}
	});
	cor033.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor033.getBackground());
			painelInicio.setBackground(cor033.getBackground());
			painel.setBackground(cor033.getBackground());
			questao.setBackground(cor033.getBackground());
			btn01.setBackground(cor033.getBackground());
			btn02.setBackground(cor033.getBackground());
			btn03.setBackground(cor033.getBackground());
			btn04.setBackground(cor033.getBackground());
			btn05.setBackground(cor033.getBackground());
			painelConfiguracoes.setBackground(cor033.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor033.getBackground());
			auxiliarRespostas.setBackground(cor033.getBackground());
			auxiliarAvaliar.setBackground(cor033.getBackground());
			auxiliarConfiguracoes.setBackground(cor033.getBackground());
			auxiliarFinal.setBackground(cor033.getBackground());
		}
	});
	cor034.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor034.getBackground());
			painelInicio.setBackground(cor034.getBackground());
			painel.setBackground(cor034.getBackground());
			questao.setBackground(cor034.getBackground());
			btn01.setBackground(cor034.getBackground());
			btn02.setBackground(cor034.getBackground());
			btn03.setBackground(cor034.getBackground());
			btn04.setBackground(cor034.getBackground());
			btn05.setBackground(cor034.getBackground());
			painelConfiguracoes.setBackground(cor034.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor034.getBackground());
			auxiliarRespostas.setBackground(cor034.getBackground());
			auxiliarAvaliar.setBackground(cor034.getBackground());
			auxiliarConfiguracoes.setBackground(cor034.getBackground());
			auxiliarFinal.setBackground(cor034.getBackground());
		}
	});
	cor035.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor035.getBackground());
			painelInicio.setBackground(cor035.getBackground());
			painel.setBackground(cor035.getBackground());
			questao.setBackground(cor035.getBackground());
			btn01.setBackground(cor035.getBackground());
			btn02.setBackground(cor035.getBackground());
			btn03.setBackground(cor035.getBackground());
			btn04.setBackground(cor035.getBackground());
			btn05.setBackground(cor035.getBackground());
			painelConfiguracoes.setBackground(cor035.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor035.getBackground());
			auxiliarRespostas.setBackground(cor035.getBackground());
			auxiliarAvaliar.setBackground(cor035.getBackground());
			auxiliarConfiguracoes.setBackground(cor035.getBackground());
			auxiliarFinal.setBackground(cor035.getBackground());
		}
	});
	cor036.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor036.getBackground());
			painelInicio.setBackground(cor036.getBackground());
			painel.setBackground(cor036.getBackground());
			questao.setBackground(cor036.getBackground());
			btn01.setBackground(cor036.getBackground());
			btn02.setBackground(cor036.getBackground());
			btn03.setBackground(cor036.getBackground());
			btn04.setBackground(cor036.getBackground());
			btn05.setBackground(cor036.getBackground());
			painelConfiguracoes.setBackground(cor036.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor036.getBackground());
			auxiliarRespostas.setBackground(cor036.getBackground());
			auxiliarAvaliar.setBackground(cor036.getBackground());
			auxiliarConfiguracoes.setBackground(cor036.getBackground());
			auxiliarFinal.setBackground(cor036.getBackground());
		}
	});
	cor037.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor037.getBackground());
			painelInicio.setBackground(cor037.getBackground());
			painel.setBackground(cor037.getBackground());
			questao.setBackground(cor037.getBackground());
			btn01.setBackground(cor037.getBackground());
			btn02.setBackground(cor037.getBackground());
			btn03.setBackground(cor037.getBackground());
			btn04.setBackground(cor037.getBackground());
			btn05.setBackground(cor037.getBackground());
			painelConfiguracoes.setBackground(cor037.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor037.getBackground());
			auxiliarRespostas.setBackground(cor037.getBackground());
			auxiliarAvaliar.setBackground(cor037.getBackground());
			auxiliarConfiguracoes.setBackground(cor037.getBackground());
			auxiliarFinal.setBackground(cor037.getBackground());
		}
	});
	cor038.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor038.getBackground());
			painelInicio.setBackground(cor038.getBackground());
			painel.setBackground(cor038.getBackground());
			questao.setBackground(cor038.getBackground());
			btn01.setBackground(cor038.getBackground());
			btn02.setBackground(cor038.getBackground());
			btn03.setBackground(cor038.getBackground());
			btn04.setBackground(cor038.getBackground());
			btn05.setBackground(cor038.getBackground());
			painelConfiguracoes.setBackground(cor038.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor038.getBackground());
			auxiliarRespostas.setBackground(cor038.getBackground());
			auxiliarAvaliar.setBackground(cor038.getBackground());
			auxiliarConfiguracoes.setBackground(cor038.getBackground());
			auxiliarFinal.setBackground(cor038.getBackground());
		}
	});
	cor039.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor039.getBackground());
			painelInicio.setBackground(cor039.getBackground());
			painel.setBackground(cor039.getBackground());
			questao.setBackground(cor039.getBackground());
			btn01.setBackground(cor039.getBackground());
			btn02.setBackground(cor039.getBackground());
			btn03.setBackground(cor039.getBackground());
			btn04.setBackground(cor039.getBackground());
			btn05.setBackground(cor039.getBackground());
			painelConfiguracoes.setBackground(cor039.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor039.getBackground());
			auxiliarRespostas.setBackground(cor039.getBackground());
			auxiliarAvaliar.setBackground(cor039.getBackground());
			auxiliarConfiguracoes.setBackground(cor039.getBackground());
			auxiliarFinal.setBackground(cor039.getBackground());
		}
	});
	cor040.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor040.getBackground());
			painelInicio.setBackground(cor040.getBackground());
			painel.setBackground(cor040.getBackground());
			questao.setBackground(cor040.getBackground());
			btn01.setBackground(cor040.getBackground());
			btn02.setBackground(cor040.getBackground());
			btn03.setBackground(cor040.getBackground());
			btn04.setBackground(cor040.getBackground());
			btn05.setBackground(cor040.getBackground());
			painelConfiguracoes.setBackground(cor040.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor040.getBackground());
			auxiliarRespostas.setBackground(cor040.getBackground());
			auxiliarAvaliar.setBackground(cor040.getBackground());
			auxiliarConfiguracoes.setBackground(cor040.getBackground());
			auxiliarFinal.setBackground(cor040.getBackground());
		}
	});
	cor041.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor041.getBackground());
			painelInicio.setBackground(cor041.getBackground());
			painel.setBackground(cor041.getBackground());
			questao.setBackground(cor041.getBackground());
			btn01.setBackground(cor041.getBackground());
			btn02.setBackground(cor041.getBackground());
			btn03.setBackground(cor041.getBackground());
			btn04.setBackground(cor041.getBackground());
			btn05.setBackground(cor041.getBackground());
			painelConfiguracoes.setBackground(cor041.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor041.getBackground());
			auxiliarRespostas.setBackground(cor041.getBackground());
			auxiliarAvaliar.setBackground(cor041.getBackground());
			auxiliarConfiguracoes.setBackground(cor041.getBackground());
			auxiliarFinal.setBackground(cor041.getBackground());
		}
	});
	cor042.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor042.getBackground());
			painelInicio.setBackground(cor042.getBackground());
			painel.setBackground(cor042.getBackground());
			questao.setBackground(cor042.getBackground());
			btn01.setBackground(cor042.getBackground());
			btn02.setBackground(cor042.getBackground());
			btn03.setBackground(cor042.getBackground());
			btn04.setBackground(cor042.getBackground());
			btn05.setBackground(cor042.getBackground());
			painelConfiguracoes.setBackground(cor042.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor042.getBackground());
			auxiliarRespostas.setBackground(cor042.getBackground());
			auxiliarAvaliar.setBackground(cor042.getBackground());
			auxiliarConfiguracoes.setBackground(cor042.getBackground());
			auxiliarFinal.setBackground(cor042.getBackground());
		}
	});
	cor043.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor043.getBackground());
			painelInicio.setBackground(cor043.getBackground());
			painel.setBackground(cor043.getBackground());
			questao.setBackground(cor043.getBackground());
			btn01.setBackground(cor043.getBackground());
			btn02.setBackground(cor043.getBackground());
			btn03.setBackground(cor043.getBackground());
			btn04.setBackground(cor043.getBackground());
			btn05.setBackground(cor043.getBackground());
			painelConfiguracoes.setBackground(cor043.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor043.getBackground());
			auxiliarRespostas.setBackground(cor043.getBackground());
			auxiliarAvaliar.setBackground(cor043.getBackground());
			auxiliarConfiguracoes.setBackground(cor043.getBackground());
			auxiliarFinal.setBackground(cor043.getBackground());
		}
	});
	cor044.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor044.getBackground());
			painelInicio.setBackground(cor044.getBackground());
			painel.setBackground(cor044.getBackground());
			questao.setBackground(cor044.getBackground());
			btn01.setBackground(cor044.getBackground());
			btn02.setBackground(cor044.getBackground());
			btn03.setBackground(cor044.getBackground());
			btn04.setBackground(cor044.getBackground());
			btn05.setBackground(cor044.getBackground());
			painelConfiguracoes.setBackground(cor044.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor044.getBackground());
			auxiliarRespostas.setBackground(cor044.getBackground());
			auxiliarAvaliar.setBackground(cor044.getBackground());
			auxiliarConfiguracoes.setBackground(cor044.getBackground());
			auxiliarFinal.setBackground(cor044.getBackground());
		}
	});
	cor045.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor045.getBackground());
			painelInicio.setBackground(cor045.getBackground());
			painel.setBackground(cor045.getBackground());
			questao.setBackground(cor045.getBackground());
			btn01.setBackground(cor045.getBackground());
			btn02.setBackground(cor045.getBackground());
			btn03.setBackground(cor045.getBackground());
			btn04.setBackground(cor045.getBackground());
			btn05.setBackground(cor045.getBackground());
			painelConfiguracoes.setBackground(cor045.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor045.getBackground());
			auxiliarRespostas.setBackground(cor045.getBackground());
			auxiliarAvaliar.setBackground(cor045.getBackground());
			auxiliarConfiguracoes.setBackground(cor045.getBackground());
			auxiliarFinal.setBackground(cor045.getBackground());
		}
	});
	cor046.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor046.getBackground());
			painelInicio.setBackground(cor046.getBackground());
			painel.setBackground(cor046.getBackground());
			questao.setBackground(cor046.getBackground());
			btn01.setBackground(cor046.getBackground());
			btn02.setBackground(cor046.getBackground());
			btn03.setBackground(cor046.getBackground());
			btn04.setBackground(cor046.getBackground());
			btn05.setBackground(cor046.getBackground());
			painelConfiguracoes.setBackground(cor046.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor046.getBackground());
			auxiliarRespostas.setBackground(cor046.getBackground());
			auxiliarAvaliar.setBackground(cor046.getBackground());
			auxiliarConfiguracoes.setBackground(cor046.getBackground());
			auxiliarFinal.setBackground(cor046.getBackground());
		}
	});
	cor047.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor047.getBackground());
			painelInicio.setBackground(cor047.getBackground());
			painel.setBackground(cor047.getBackground());
			questao.setBackground(cor047.getBackground());
			btn01.setBackground(cor047.getBackground());
			btn02.setBackground(cor047.getBackground());
			btn03.setBackground(cor047.getBackground());
			btn04.setBackground(cor047.getBackground());
			btn05.setBackground(cor047.getBackground());
			painelConfiguracoes.setBackground(cor047.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor047.getBackground());
			auxiliarRespostas.setBackground(cor047.getBackground());
			auxiliarAvaliar.setBackground(cor047.getBackground());
			auxiliarConfiguracoes.setBackground(cor047.getBackground());
			auxiliarFinal.setBackground(cor047.getBackground());
		}
	});
	cor048.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor048.getBackground());
			painelInicio.setBackground(cor048.getBackground());
			painel.setBackground(cor048.getBackground());
			questao.setBackground(cor048.getBackground());
			btn01.setBackground(cor048.getBackground());
			btn02.setBackground(cor048.getBackground());
			btn03.setBackground(cor048.getBackground());
			btn04.setBackground(cor048.getBackground());
			btn05.setBackground(cor048.getBackground());
			painelConfiguracoes.setBackground(cor048.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor048.getBackground());
			auxiliarRespostas.setBackground(cor048.getBackground());
			auxiliarAvaliar.setBackground(cor048.getBackground());
			auxiliarConfiguracoes.setBackground(cor048.getBackground());
			auxiliarFinal.setBackground(cor048.getBackground());
		}
	});
	cor049.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor049.getBackground());
			painelInicio.setBackground(cor049.getBackground());
			painel.setBackground(cor049.getBackground());
			questao.setBackground(cor049.getBackground());
			btn01.setBackground(cor049.getBackground());
			btn02.setBackground(cor049.getBackground());
			btn03.setBackground(cor049.getBackground());
			btn04.setBackground(cor049.getBackground());
			btn05.setBackground(cor049.getBackground());
			painelConfiguracoes.setBackground(cor049.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor049.getBackground());
			auxiliarRespostas.setBackground(cor049.getBackground());
			auxiliarAvaliar.setBackground(cor049.getBackground());
			auxiliarConfiguracoes.setBackground(cor049.getBackground());
			auxiliarFinal.setBackground(cor049.getBackground());
		}
	});
	cor050.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor050.getBackground());
			painelInicio.setBackground(cor050.getBackground());
			painel.setBackground(cor050.getBackground());
			questao.setBackground(cor050.getBackground());
			btn01.setBackground(cor050.getBackground());
			btn02.setBackground(cor050.getBackground());
			btn03.setBackground(cor050.getBackground());
			btn04.setBackground(cor050.getBackground());
			btn05.setBackground(cor050.getBackground());
			painelConfiguracoes.setBackground(cor050.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor050.getBackground());
			auxiliarRespostas.setBackground(cor050.getBackground());
			auxiliarAvaliar.setBackground(cor050.getBackground());
			auxiliarConfiguracoes.setBackground(cor050.getBackground());
			auxiliarFinal.setBackground(cor050.getBackground());
		}
	});
	cor051.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor051.getBackground());
			painelInicio.setBackground(cor051.getBackground());
			painel.setBackground(cor051.getBackground());
			questao.setBackground(cor051.getBackground());
			btn01.setBackground(cor051.getBackground());
			btn02.setBackground(cor051.getBackground());
			btn03.setBackground(cor051.getBackground());
			btn04.setBackground(cor051.getBackground());
			btn05.setBackground(cor051.getBackground());
			painelConfiguracoes.setBackground(cor051.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor051.getBackground());
			auxiliarRespostas.setBackground(cor051.getBackground());
			auxiliarAvaliar.setBackground(cor051.getBackground());
			auxiliarConfiguracoes.setBackground(cor051.getBackground());
			auxiliarFinal.setBackground(cor051.getBackground());
		}
	});
	cor052.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor052.getBackground());
			painelInicio.setBackground(cor052.getBackground());
			painel.setBackground(cor052.getBackground());
			questao.setBackground(cor052.getBackground());
			btn01.setBackground(cor052.getBackground());
			btn02.setBackground(cor052.getBackground());
			btn03.setBackground(cor052.getBackground());
			btn04.setBackground(cor052.getBackground());
			btn05.setBackground(cor052.getBackground());
			painelConfiguracoes.setBackground(cor052.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor052.getBackground());
			auxiliarRespostas.setBackground(cor052.getBackground());
			auxiliarAvaliar.setBackground(cor052.getBackground());
			auxiliarConfiguracoes.setBackground(cor052.getBackground());
			auxiliarFinal.setBackground(cor052.getBackground());
		}
	});
	cor053.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor053.getBackground());
			painelInicio.setBackground(cor053.getBackground());
			painel.setBackground(cor053.getBackground());
			questao.setBackground(cor053.getBackground());
			btn01.setBackground(cor053.getBackground());
			btn02.setBackground(cor053.getBackground());
			btn03.setBackground(cor053.getBackground());
			btn04.setBackground(cor053.getBackground());
			btn05.setBackground(cor053.getBackground());
			painelConfiguracoes.setBackground(cor053.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor053.getBackground());
			auxiliarRespostas.setBackground(cor053.getBackground());
			auxiliarAvaliar.setBackground(cor053.getBackground());
			auxiliarConfiguracoes.setBackground(cor053.getBackground());
			auxiliarFinal.setBackground(cor053.getBackground());
		}
	});
	cor054.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor054.getBackground());
			painelInicio.setBackground(cor054.getBackground());
			painel.setBackground(cor054.getBackground());
			questao.setBackground(cor054.getBackground());
			btn01.setBackground(cor054.getBackground());
			btn02.setBackground(cor054.getBackground());
			btn03.setBackground(cor054.getBackground());
			btn04.setBackground(cor054.getBackground());
			btn05.setBackground(cor054.getBackground());
			painelConfiguracoes.setBackground(cor054.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor054.getBackground());
			auxiliarRespostas.setBackground(cor054.getBackground());
			auxiliarAvaliar.setBackground(cor054.getBackground());
			auxiliarConfiguracoes.setBackground(cor054.getBackground());
			auxiliarFinal.setBackground(cor054.getBackground());
		}
	});
	cor055.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor055.getBackground());
			painelInicio.setBackground(cor055.getBackground());
			painel.setBackground(cor055.getBackground());
			questao.setBackground(cor055.getBackground());
			btn01.setBackground(cor055.getBackground());
			btn02.setBackground(cor055.getBackground());
			btn03.setBackground(cor055.getBackground());
			btn04.setBackground(cor055.getBackground());
			btn05.setBackground(cor055.getBackground());
			painelConfiguracoes.setBackground(cor055.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor055.getBackground());
			auxiliarRespostas.setBackground(cor055.getBackground());
			auxiliarAvaliar.setBackground(cor055.getBackground());
			auxiliarConfiguracoes.setBackground(cor055.getBackground());
			auxiliarFinal.setBackground(cor055.getBackground());
		}
	});
	cor056.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor056.getBackground());
			painelInicio.setBackground(cor056.getBackground());
			painel.setBackground(cor056.getBackground());
			questao.setBackground(cor056.getBackground());
			btn01.setBackground(cor056.getBackground());
			btn02.setBackground(cor056.getBackground());
			btn03.setBackground(cor056.getBackground());
			btn04.setBackground(cor056.getBackground());
			btn05.setBackground(cor056.getBackground());
			painelConfiguracoes.setBackground(cor056.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor056.getBackground());
			auxiliarRespostas.setBackground(cor056.getBackground());
			auxiliarAvaliar.setBackground(cor056.getBackground());
			auxiliarConfiguracoes.setBackground(cor056.getBackground());
			auxiliarFinal.setBackground(cor056.getBackground());
		}
	});
	cor057.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor057.getBackground());
			painelInicio.setBackground(cor057.getBackground());
			painel.setBackground(cor057.getBackground());
			questao.setBackground(cor057.getBackground());
			btn01.setBackground(cor057.getBackground());
			btn02.setBackground(cor057.getBackground());
			btn03.setBackground(cor057.getBackground());
			btn04.setBackground(cor057.getBackground());
			btn05.setBackground(cor057.getBackground());
			painelConfiguracoes.setBackground(cor057.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor057.getBackground());
			auxiliarRespostas.setBackground(cor057.getBackground());
			auxiliarAvaliar.setBackground(cor057.getBackground());
			auxiliarConfiguracoes.setBackground(cor057.getBackground());
			auxiliarFinal.setBackground(cor057.getBackground());
		}
	});
	cor058.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor058.getBackground());
			painelInicio.setBackground(cor058.getBackground());
			painel.setBackground(cor058.getBackground());
			questao.setBackground(cor058.getBackground());
			btn01.setBackground(cor058.getBackground());
			btn02.setBackground(cor058.getBackground());
			btn03.setBackground(cor058.getBackground());
			btn04.setBackground(cor058.getBackground());
			btn05.setBackground(cor058.getBackground());
			painelConfiguracoes.setBackground(cor058.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor058.getBackground());
			auxiliarRespostas.setBackground(cor058.getBackground());
			auxiliarAvaliar.setBackground(cor058.getBackground());
			auxiliarConfiguracoes.setBackground(cor058.getBackground());
			auxiliarFinal.setBackground(cor058.getBackground());
		}
	});
	cor059.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor059.getBackground());
			painelInicio.setBackground(cor059.getBackground());
			painel.setBackground(cor059.getBackground());
			questao.setBackground(cor059.getBackground());
			btn01.setBackground(cor059.getBackground());
			btn02.setBackground(cor059.getBackground());
			btn03.setBackground(cor059.getBackground());
			btn04.setBackground(cor059.getBackground());
			btn05.setBackground(cor059.getBackground());
			painelConfiguracoes.setBackground(cor059.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor059.getBackground());
			auxiliarRespostas.setBackground(cor059.getBackground());
			auxiliarAvaliar.setBackground(cor059.getBackground());
			auxiliarConfiguracoes.setBackground(cor059.getBackground());
			auxiliarFinal.setBackground(cor059.getBackground());
		}
	});
	cor060.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor060.getBackground());
			painelInicio.setBackground(cor060.getBackground());
			painel.setBackground(cor060.getBackground());
			questao.setBackground(cor060.getBackground());
			btn01.setBackground(cor060.getBackground());
			btn02.setBackground(cor060.getBackground());
			btn03.setBackground(cor060.getBackground());
			btn04.setBackground(cor060.getBackground());
			btn05.setBackground(cor060.getBackground());
			painelConfiguracoes.setBackground(cor060.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor060.getBackground());
			auxiliarRespostas.setBackground(cor060.getBackground());
			auxiliarAvaliar.setBackground(cor060.getBackground());
			auxiliarConfiguracoes.setBackground(cor060.getBackground());
			auxiliarFinal.setBackground(cor060.getBackground());
		}
	});
	cor061.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor061.getBackground());
			painelInicio.setBackground(cor061.getBackground());
			painel.setBackground(cor061.getBackground());
			questao.setBackground(cor061.getBackground());
			btn01.setBackground(cor061.getBackground());
			btn02.setBackground(cor061.getBackground());
			btn03.setBackground(cor061.getBackground());
			btn04.setBackground(cor061.getBackground());
			btn05.setBackground(cor061.getBackground());
			painelConfiguracoes.setBackground(cor061.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor061.getBackground());
			auxiliarRespostas.setBackground(cor061.getBackground());
			auxiliarAvaliar.setBackground(cor061.getBackground());
			auxiliarConfiguracoes.setBackground(cor061.getBackground());
			auxiliarFinal.setBackground(cor061.getBackground());
		}
	});
	cor062.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor062.getBackground());
			painelInicio.setBackground(cor062.getBackground());
			painel.setBackground(cor062.getBackground());
			questao.setBackground(cor062.getBackground());
			btn01.setBackground(cor062.getBackground());
			btn02.setBackground(cor062.getBackground());
			btn03.setBackground(cor062.getBackground());
			btn04.setBackground(cor062.getBackground());
			btn05.setBackground(cor062.getBackground());
			painelConfiguracoes.setBackground(cor062.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor062.getBackground());
			auxiliarRespostas.setBackground(cor062.getBackground());
			auxiliarAvaliar.setBackground(cor062.getBackground());
			auxiliarConfiguracoes.setBackground(cor062.getBackground());
			auxiliarFinal.setBackground(cor062.getBackground());
		}
	});
	cor063.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor063.getBackground());
			painelInicio.setBackground(cor063.getBackground());
			painel.setBackground(cor063.getBackground());
			questao.setBackground(cor063.getBackground());
			btn01.setBackground(cor063.getBackground());
			btn02.setBackground(cor063.getBackground());
			btn03.setBackground(cor063.getBackground());
			btn04.setBackground(cor063.getBackground());
			btn05.setBackground(cor063.getBackground());
			painelConfiguracoes.setBackground(cor063.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor063.getBackground());
			auxiliarRespostas.setBackground(cor063.getBackground());
			auxiliarAvaliar.setBackground(cor063.getBackground());
			auxiliarConfiguracoes.setBackground(cor063.getBackground());
			auxiliarFinal.setBackground(cor063.getBackground());
		}
	});
	cor064.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor064.getBackground());
			painelInicio.setBackground(cor064.getBackground());
			painel.setBackground(cor064.getBackground());
			questao.setBackground(cor064.getBackground());
			btn01.setBackground(cor064.getBackground());
			btn02.setBackground(cor064.getBackground());
			btn03.setBackground(cor064.getBackground());
			btn04.setBackground(cor064.getBackground());
			btn05.setBackground(cor064.getBackground());
			painelConfiguracoes.setBackground(cor064.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor064.getBackground());
			auxiliarRespostas.setBackground(cor064.getBackground());
			auxiliarAvaliar.setBackground(cor064.getBackground());
			auxiliarConfiguracoes.setBackground(cor064.getBackground());
			auxiliarFinal.setBackground(cor064.getBackground());
		}
	});
	cor065.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor065.getBackground());
			painelInicio.setBackground(cor065.getBackground());
			painel.setBackground(cor065.getBackground());
			questao.setBackground(cor065.getBackground());
			btn01.setBackground(cor065.getBackground());
			btn02.setBackground(cor065.getBackground());
			btn03.setBackground(cor065.getBackground());
			btn04.setBackground(cor065.getBackground());
			btn05.setBackground(cor065.getBackground());
			painelConfiguracoes.setBackground(cor065.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor065.getBackground());
			auxiliarRespostas.setBackground(cor065.getBackground());
			auxiliarAvaliar.setBackground(cor065.getBackground());
			auxiliarConfiguracoes.setBackground(cor065.getBackground());
			auxiliarFinal.setBackground(cor065.getBackground());
		}
	});
	cor066.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor066.getBackground());
			painelInicio.setBackground(cor066.getBackground());
			painel.setBackground(cor066.getBackground());
			questao.setBackground(cor066.getBackground());
			btn01.setBackground(cor066.getBackground());
			btn02.setBackground(cor066.getBackground());
			btn03.setBackground(cor066.getBackground());
			btn04.setBackground(cor066.getBackground());
			btn05.setBackground(cor066.getBackground());
			painelConfiguracoes.setBackground(cor066.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor066.getBackground());
			auxiliarRespostas.setBackground(cor066.getBackground());
			auxiliarAvaliar.setBackground(cor066.getBackground());
			auxiliarConfiguracoes.setBackground(cor066.getBackground());
			auxiliarFinal.setBackground(cor066.getBackground());
		}
	});
	cor067.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor067.getBackground());
			painelInicio.setBackground(cor067.getBackground());
			painel.setBackground(cor067.getBackground());
			questao.setBackground(cor067.getBackground());
			btn01.setBackground(cor067.getBackground());
			btn02.setBackground(cor067.getBackground());
			btn03.setBackground(cor067.getBackground());
			btn04.setBackground(cor067.getBackground());
			btn05.setBackground(cor067.getBackground());
			painelConfiguracoes.setBackground(cor067.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor067.getBackground());
			auxiliarRespostas.setBackground(cor067.getBackground());
			auxiliarAvaliar.setBackground(cor067.getBackground());
			auxiliarConfiguracoes.setBackground(cor067.getBackground());
			auxiliarFinal.setBackground(cor067.getBackground());
		}
	});
	cor068.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor068.getBackground());
			painelInicio.setBackground(cor068.getBackground());
			painel.setBackground(cor068.getBackground());
			questao.setBackground(cor068.getBackground());
			btn01.setBackground(cor068.getBackground());
			btn02.setBackground(cor068.getBackground());
			btn03.setBackground(cor068.getBackground());
			btn04.setBackground(cor068.getBackground());
			btn05.setBackground(cor068.getBackground());
			painelConfiguracoes.setBackground(cor068.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor068.getBackground());
			auxiliarRespostas.setBackground(cor068.getBackground());
			auxiliarAvaliar.setBackground(cor068.getBackground());
			auxiliarConfiguracoes.setBackground(cor068.getBackground());
			auxiliarFinal.setBackground(cor068.getBackground());
		}
	});
	cor069.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor069.getBackground());
			painelInicio.setBackground(cor069.getBackground());
			painel.setBackground(cor069.getBackground());
			questao.setBackground(cor069.getBackground());
			btn01.setBackground(cor069.getBackground());
			btn02.setBackground(cor069.getBackground());
			btn03.setBackground(cor069.getBackground());
			btn04.setBackground(cor069.getBackground());
			btn05.setBackground(cor069.getBackground());
			painelConfiguracoes.setBackground(cor069.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor069.getBackground());
			auxiliarRespostas.setBackground(cor069.getBackground());
			auxiliarAvaliar.setBackground(cor069.getBackground());
			auxiliarConfiguracoes.setBackground(cor069.getBackground());
			auxiliarFinal.setBackground(cor069.getBackground());
		}
	});
	cor070.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor070.getBackground());
			painelInicio.setBackground(cor070.getBackground());
			painel.setBackground(cor070.getBackground());
			questao.setBackground(cor070.getBackground());
			btn01.setBackground(cor070.getBackground());
			btn02.setBackground(cor070.getBackground());
			btn03.setBackground(cor070.getBackground());
			btn04.setBackground(cor070.getBackground());
			btn05.setBackground(cor070.getBackground());
			painelConfiguracoes.setBackground(cor070.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor070.getBackground());
			auxiliarRespostas.setBackground(cor070.getBackground());
			auxiliarAvaliar.setBackground(cor070.getBackground());
			auxiliarConfiguracoes.setBackground(cor070.getBackground());
			auxiliarFinal.setBackground(cor070.getBackground());
		}
	});
	cor071.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor071.getBackground());
			painelInicio.setBackground(cor071.getBackground());
			painel.setBackground(cor071.getBackground());
			questao.setBackground(cor071.getBackground());
			btn01.setBackground(cor071.getBackground());
			btn02.setBackground(cor071.getBackground());
			btn03.setBackground(cor071.getBackground());
			btn04.setBackground(cor071.getBackground());
			btn05.setBackground(cor071.getBackground());
			painelConfiguracoes.setBackground(cor071.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor071.getBackground());
			auxiliarRespostas.setBackground(cor071.getBackground());
			auxiliarAvaliar.setBackground(cor071.getBackground());
			auxiliarConfiguracoes.setBackground(cor071.getBackground());
			auxiliarFinal.setBackground(cor071.getBackground());
		}
	});
	cor072.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor072.getBackground());
			painelInicio.setBackground(cor072.getBackground());
			painel.setBackground(cor072.getBackground());
			questao.setBackground(cor072.getBackground());
			btn01.setBackground(cor072.getBackground());
			btn02.setBackground(cor072.getBackground());
			btn03.setBackground(cor072.getBackground());
			btn04.setBackground(cor072.getBackground());
			btn05.setBackground(cor072.getBackground());
			painelConfiguracoes.setBackground(cor072.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor072.getBackground());
			auxiliarRespostas.setBackground(cor072.getBackground());
			auxiliarAvaliar.setBackground(cor072.getBackground());
			auxiliarConfiguracoes.setBackground(cor072.getBackground());
			auxiliarFinal.setBackground(cor072.getBackground());
		}
	});
	cor073.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor073.getBackground());
			painelInicio.setBackground(cor073.getBackground());
			painel.setBackground(cor073.getBackground());
			questao.setBackground(cor073.getBackground());
			btn01.setBackground(cor073.getBackground());
			btn02.setBackground(cor073.getBackground());
			btn03.setBackground(cor073.getBackground());
			btn04.setBackground(cor073.getBackground());
			btn05.setBackground(cor073.getBackground());
			painelConfiguracoes.setBackground(cor073.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor073.getBackground());
			auxiliarRespostas.setBackground(cor073.getBackground());
			auxiliarAvaliar.setBackground(cor073.getBackground());
			auxiliarConfiguracoes.setBackground(cor073.getBackground());
			auxiliarFinal.setBackground(cor073.getBackground());
		}
	});
	cor074.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor074.getBackground());
			painelInicio.setBackground(cor074.getBackground());
			painel.setBackground(cor074.getBackground());
			questao.setBackground(cor074.getBackground());
			btn01.setBackground(cor074.getBackground());
			btn02.setBackground(cor074.getBackground());
			btn03.setBackground(cor074.getBackground());
			btn04.setBackground(cor074.getBackground());
			btn05.setBackground(cor074.getBackground());
			painelConfiguracoes.setBackground(cor074.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor074.getBackground());
			auxiliarRespostas.setBackground(cor074.getBackground());
			auxiliarAvaliar.setBackground(cor074.getBackground());
			auxiliarConfiguracoes.setBackground(cor074.getBackground());
			auxiliarFinal.setBackground(cor074.getBackground());
		}
	});
	cor075.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor075.getBackground());
			painelInicio.setBackground(cor075.getBackground());
			painel.setBackground(cor075.getBackground());
			questao.setBackground(cor075.getBackground());
			btn01.setBackground(cor075.getBackground());
			btn02.setBackground(cor075.getBackground());
			btn03.setBackground(cor075.getBackground());
			btn04.setBackground(cor075.getBackground());
			btn05.setBackground(cor075.getBackground());
			painelConfiguracoes.setBackground(cor075.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor075.getBackground());
			auxiliarRespostas.setBackground(cor075.getBackground());
			auxiliarAvaliar.setBackground(cor075.getBackground());
			auxiliarConfiguracoes.setBackground(cor075.getBackground());
			auxiliarFinal.setBackground(cor075.getBackground());
		}
	});
	cor076.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor076.getBackground());
			painelInicio.setBackground(cor076.getBackground());
			painel.setBackground(cor076.getBackground());
			questao.setBackground(cor076.getBackground());
			btn01.setBackground(cor076.getBackground());
			btn02.setBackground(cor076.getBackground());
			btn03.setBackground(cor076.getBackground());
			btn04.setBackground(cor076.getBackground());
			btn05.setBackground(cor076.getBackground());
			painelConfiguracoes.setBackground(cor076.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor076.getBackground());
			auxiliarRespostas.setBackground(cor076.getBackground());
			auxiliarAvaliar.setBackground(cor076.getBackground());
			auxiliarConfiguracoes.setBackground(cor076.getBackground());
			auxiliarFinal.setBackground(cor076.getBackground());
		}
	});
	cor077.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor077.getBackground());
			painelInicio.setBackground(cor077.getBackground());
			painel.setBackground(cor077.getBackground());
			questao.setBackground(cor077.getBackground());
			btn01.setBackground(cor077.getBackground());
			btn02.setBackground(cor077.getBackground());
			btn03.setBackground(cor077.getBackground());
			btn04.setBackground(cor077.getBackground());
			btn05.setBackground(cor077.getBackground());
			painelConfiguracoes.setBackground(cor077.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor077.getBackground());
			auxiliarRespostas.setBackground(cor077.getBackground());
			auxiliarAvaliar.setBackground(cor077.getBackground());
			auxiliarConfiguracoes.setBackground(cor077.getBackground());
			auxiliarFinal.setBackground(cor077.getBackground());
		}
	});
	cor078.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor078.getBackground());
			painelInicio.setBackground(cor078.getBackground());
			painel.setBackground(cor078.getBackground());
			questao.setBackground(cor078.getBackground());
			btn01.setBackground(cor078.getBackground());
			btn02.setBackground(cor078.getBackground());
			btn03.setBackground(cor078.getBackground());
			btn04.setBackground(cor078.getBackground());
			btn05.setBackground(cor078.getBackground());
			painelConfiguracoes.setBackground(cor078.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor078.getBackground());
			auxiliarRespostas.setBackground(cor078.getBackground());
			auxiliarAvaliar.setBackground(cor078.getBackground());
			auxiliarConfiguracoes.setBackground(cor078.getBackground());
			auxiliarFinal.setBackground(cor078.getBackground());
		}
	});
	cor079.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor079.getBackground());
			painelInicio.setBackground(cor079.getBackground());
			painel.setBackground(cor079.getBackground());
			questao.setBackground(cor079.getBackground());
			btn01.setBackground(cor079.getBackground());
			btn02.setBackground(cor079.getBackground());
			btn03.setBackground(cor079.getBackground());
			btn04.setBackground(cor079.getBackground());
			btn05.setBackground(cor079.getBackground());
			painelConfiguracoes.setBackground(cor079.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor079.getBackground());
			auxiliarRespostas.setBackground(cor079.getBackground());
			auxiliarAvaliar.setBackground(cor079.getBackground());
			auxiliarConfiguracoes.setBackground(cor079.getBackground());
			auxiliarFinal.setBackground(cor079.getBackground());
		}
	});
	cor080.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor080.getBackground());
			painelInicio.setBackground(cor080.getBackground());
			painel.setBackground(cor080.getBackground());
			questao.setBackground(cor080.getBackground());
			btn01.setBackground(cor080.getBackground());
			btn02.setBackground(cor080.getBackground());
			btn03.setBackground(cor080.getBackground());
			btn04.setBackground(cor080.getBackground());
			btn05.setBackground(cor080.getBackground());
			painelConfiguracoes.setBackground(cor080.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor080.getBackground());
			auxiliarRespostas.setBackground(cor080.getBackground());
			auxiliarAvaliar.setBackground(cor080.getBackground());
			auxiliarConfiguracoes.setBackground(cor080.getBackground());
			auxiliarFinal.setBackground(cor080.getBackground());
		}
	});
	cor081.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor081.getBackground());
			painelInicio.setBackground(cor081.getBackground());
			painel.setBackground(cor081.getBackground());
			questao.setBackground(cor081.getBackground());
			btn01.setBackground(cor081.getBackground());
			btn02.setBackground(cor081.getBackground());
			btn03.setBackground(cor081.getBackground());
			btn04.setBackground(cor081.getBackground());
			btn05.setBackground(cor081.getBackground());
			painelConfiguracoes.setBackground(cor081.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor081.getBackground());
			auxiliarRespostas.setBackground(cor081.getBackground());
			auxiliarAvaliar.setBackground(cor081.getBackground());
			auxiliarConfiguracoes.setBackground(cor081.getBackground());
			auxiliarFinal.setBackground(cor081.getBackground());
		}
	});
	cor082.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor082.getBackground());
			painelInicio.setBackground(cor082.getBackground());
			painel.setBackground(cor082.getBackground());
			questao.setBackground(cor082.getBackground());
			btn01.setBackground(cor082.getBackground());
			btn02.setBackground(cor082.getBackground());
			btn03.setBackground(cor082.getBackground());
			btn04.setBackground(cor082.getBackground());
			btn05.setBackground(cor082.getBackground());
			painelConfiguracoes.setBackground(cor082.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor082.getBackground());
			auxiliarRespostas.setBackground(cor082.getBackground());
			auxiliarAvaliar.setBackground(cor082.getBackground());
			auxiliarConfiguracoes.setBackground(cor082.getBackground());
			auxiliarFinal.setBackground(cor082.getBackground());
		}
	});
	cor083.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor083.getBackground());
			painelInicio.setBackground(cor083.getBackground());
			painel.setBackground(cor083.getBackground());
			questao.setBackground(cor083.getBackground());
			btn01.setBackground(cor083.getBackground());
			btn02.setBackground(cor083.getBackground());
			btn03.setBackground(cor083.getBackground());
			btn04.setBackground(cor083.getBackground());
			btn05.setBackground(cor083.getBackground());
			painelConfiguracoes.setBackground(cor083.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor083.getBackground());
			auxiliarRespostas.setBackground(cor083.getBackground());
			auxiliarAvaliar.setBackground(cor083.getBackground());
			auxiliarConfiguracoes.setBackground(cor083.getBackground());
			auxiliarFinal.setBackground(cor083.getBackground());
		}
	});
	cor084.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor084.getBackground());
			painelInicio.setBackground(cor084.getBackground());
			painel.setBackground(cor084.getBackground());
			questao.setBackground(cor084.getBackground());
			btn01.setBackground(cor084.getBackground());
			btn02.setBackground(cor084.getBackground());
			btn03.setBackground(cor084.getBackground());
			btn04.setBackground(cor084.getBackground());
			btn05.setBackground(cor084.getBackground());
			painelConfiguracoes.setBackground(cor084.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor084.getBackground());
			auxiliarRespostas.setBackground(cor084.getBackground());
			auxiliarAvaliar.setBackground(cor084.getBackground());
			auxiliarConfiguracoes.setBackground(cor084.getBackground());
			auxiliarFinal.setBackground(cor084.getBackground());
		}
	});
	cor085.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor085.getBackground());
			painelInicio.setBackground(cor085.getBackground());
			painel.setBackground(cor085.getBackground());
			questao.setBackground(cor085.getBackground());
			btn01.setBackground(cor085.getBackground());
			btn02.setBackground(cor085.getBackground());
			btn03.setBackground(cor085.getBackground());
			btn04.setBackground(cor085.getBackground());
			btn05.setBackground(cor085.getBackground());
			painelConfiguracoes.setBackground(cor085.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor085.getBackground());
			auxiliarRespostas.setBackground(cor085.getBackground());
			auxiliarAvaliar.setBackground(cor085.getBackground());
			auxiliarConfiguracoes.setBackground(cor085.getBackground());
			auxiliarFinal.setBackground(cor085.getBackground());
		}
	});
	cor086.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor086.getBackground());
			painelInicio.setBackground(cor086.getBackground());
			painel.setBackground(cor086.getBackground());
			questao.setBackground(cor086.getBackground());
			btn01.setBackground(cor086.getBackground());
			btn02.setBackground(cor086.getBackground());
			btn03.setBackground(cor086.getBackground());
			btn04.setBackground(cor086.getBackground());
			btn05.setBackground(cor086.getBackground());
			painelConfiguracoes.setBackground(cor086.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor086.getBackground());
			auxiliarRespostas.setBackground(cor086.getBackground());
			auxiliarAvaliar.setBackground(cor086.getBackground());
			auxiliarConfiguracoes.setBackground(cor086.getBackground());
			auxiliarFinal.setBackground(cor086.getBackground());
		}
	});
	cor087.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor087.getBackground());
			painelInicio.setBackground(cor087.getBackground());
			painel.setBackground(cor087.getBackground());
			questao.setBackground(cor087.getBackground());
			btn01.setBackground(cor087.getBackground());
			btn02.setBackground(cor087.getBackground());
			btn03.setBackground(cor087.getBackground());
			btn04.setBackground(cor087.getBackground());
			btn05.setBackground(cor087.getBackground());
			painelConfiguracoes.setBackground(cor087.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor087.getBackground());
			auxiliarRespostas.setBackground(cor087.getBackground());
			auxiliarAvaliar.setBackground(cor087.getBackground());
			auxiliarConfiguracoes.setBackground(cor087.getBackground());
			auxiliarFinal.setBackground(cor087.getBackground());
		}
	});
	cor088.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor088.getBackground());
			painelInicio.setBackground(cor088.getBackground());
			painel.setBackground(cor088.getBackground());
			questao.setBackground(cor088.getBackground());
			btn01.setBackground(cor088.getBackground());
			btn02.setBackground(cor088.getBackground());
			btn03.setBackground(cor088.getBackground());
			btn04.setBackground(cor088.getBackground());
			btn05.setBackground(cor088.getBackground());
			painelConfiguracoes.setBackground(cor088.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor088.getBackground());
			auxiliarRespostas.setBackground(cor088.getBackground());
			auxiliarAvaliar.setBackground(cor088.getBackground());
			auxiliarConfiguracoes.setBackground(cor088.getBackground());
			auxiliarFinal.setBackground(cor088.getBackground());
		}
	});
	cor089.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor089.getBackground());
			painelInicio.setBackground(cor089.getBackground());
			painel.setBackground(cor089.getBackground());
			questao.setBackground(cor089.getBackground());
			btn01.setBackground(cor089.getBackground());
			btn02.setBackground(cor089.getBackground());
			btn03.setBackground(cor089.getBackground());
			btn04.setBackground(cor089.getBackground());
			btn05.setBackground(cor089.getBackground());
			painelConfiguracoes.setBackground(cor089.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor089.getBackground());
			auxiliarRespostas.setBackground(cor089.getBackground());
			auxiliarAvaliar.setBackground(cor089.getBackground());
			auxiliarConfiguracoes.setBackground(cor089.getBackground());
			auxiliarFinal.setBackground(cor089.getBackground());
		}
	});
	cor090.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor090.getBackground());
			painelInicio.setBackground(cor090.getBackground());
			painel.setBackground(cor090.getBackground());
			questao.setBackground(cor090.getBackground());
			btn01.setBackground(cor090.getBackground());
			btn02.setBackground(cor090.getBackground());
			btn03.setBackground(cor090.getBackground());
			btn04.setBackground(cor090.getBackground());
			btn05.setBackground(cor090.getBackground());
			painelConfiguracoes.setBackground(cor090.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor090.getBackground());
			auxiliarRespostas.setBackground(cor090.getBackground());
			auxiliarAvaliar.setBackground(cor090.getBackground());
			auxiliarConfiguracoes.setBackground(cor090.getBackground());
			auxiliarFinal.setBackground(cor090.getBackground());
		}
	});
	cor091.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor091.getBackground());
			painelInicio.setBackground(cor091.getBackground());
			painel.setBackground(cor091.getBackground());
			questao.setBackground(cor091.getBackground());
			btn01.setBackground(cor091.getBackground());
			btn02.setBackground(cor091.getBackground());
			btn03.setBackground(cor091.getBackground());
			btn04.setBackground(cor091.getBackground());
			btn05.setBackground(cor091.getBackground());
			painelConfiguracoes.setBackground(cor091.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor091.getBackground());
			auxiliarRespostas.setBackground(cor091.getBackground());
			auxiliarAvaliar.setBackground(cor091.getBackground());
			auxiliarConfiguracoes.setBackground(cor091.getBackground());
			auxiliarFinal.setBackground(cor091.getBackground());
		}
	});
	cor092.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor092.getBackground());
			painelInicio.setBackground(cor092.getBackground());
			painel.setBackground(cor092.getBackground());
			questao.setBackground(cor092.getBackground());
			btn01.setBackground(cor092.getBackground());
			btn02.setBackground(cor092.getBackground());
			btn03.setBackground(cor092.getBackground());
			btn04.setBackground(cor092.getBackground());
			btn05.setBackground(cor092.getBackground());
			painelConfiguracoes.setBackground(cor092.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor092.getBackground());
			auxiliarRespostas.setBackground(cor092.getBackground());
			auxiliarAvaliar.setBackground(cor092.getBackground());
			auxiliarConfiguracoes.setBackground(cor092.getBackground());
			auxiliarFinal.setBackground(cor092.getBackground());
		}
	});
	cor093.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor093.getBackground());
			painelInicio.setBackground(cor093.getBackground());
			painel.setBackground(cor093.getBackground());
			questao.setBackground(cor093.getBackground());
			btn01.setBackground(cor093.getBackground());
			btn02.setBackground(cor093.getBackground());
			btn03.setBackground(cor093.getBackground());
			btn04.setBackground(cor093.getBackground());
			btn05.setBackground(cor093.getBackground());
			painelConfiguracoes.setBackground(cor093.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor093.getBackground());
			auxiliarRespostas.setBackground(cor093.getBackground());
			auxiliarAvaliar.setBackground(cor093.getBackground());
			auxiliarConfiguracoes.setBackground(cor093.getBackground());
			auxiliarFinal.setBackground(cor093.getBackground());
		}
	});
	cor094.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor094.getBackground());
			painelInicio.setBackground(cor094.getBackground());
			painel.setBackground(cor094.getBackground());
			questao.setBackground(cor094.getBackground());
			btn01.setBackground(cor094.getBackground());
			btn02.setBackground(cor094.getBackground());
			btn03.setBackground(cor094.getBackground());
			btn04.setBackground(cor094.getBackground());
			btn05.setBackground(cor094.getBackground());
			painelConfiguracoes.setBackground(cor094.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor094.getBackground());
			auxiliarRespostas.setBackground(cor094.getBackground());
			auxiliarAvaliar.setBackground(cor094.getBackground());
			auxiliarConfiguracoes.setBackground(cor094.getBackground());
			auxiliarFinal.setBackground(cor094.getBackground());
		}
	});
	cor095.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor095.getBackground());
			painelInicio.setBackground(cor095.getBackground());
			painel.setBackground(cor095.getBackground());
			questao.setBackground(cor095.getBackground());
			btn01.setBackground(cor095.getBackground());
			btn02.setBackground(cor095.getBackground());
			btn03.setBackground(cor095.getBackground());
			btn04.setBackground(cor095.getBackground());
			btn05.setBackground(cor095.getBackground());
			painelConfiguracoes.setBackground(cor095.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor095.getBackground());
			auxiliarRespostas.setBackground(cor095.getBackground());
			auxiliarAvaliar.setBackground(cor095.getBackground());
			auxiliarConfiguracoes.setBackground(cor095.getBackground());
			auxiliarFinal.setBackground(cor095.getBackground());
		}
	});
	cor096.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor096.getBackground());
			painelInicio.setBackground(cor096.getBackground());
			painel.setBackground(cor096.getBackground());
			questao.setBackground(cor096.getBackground());
			btn01.setBackground(cor096.getBackground());
			btn02.setBackground(cor096.getBackground());
			btn03.setBackground(cor096.getBackground());
			btn04.setBackground(cor096.getBackground());
			btn05.setBackground(cor096.getBackground());
			painelConfiguracoes.setBackground(cor096.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor096.getBackground());
			auxiliarRespostas.setBackground(cor096.getBackground());
			auxiliarAvaliar.setBackground(cor096.getBackground());
			auxiliarConfiguracoes.setBackground(cor096.getBackground());
			auxiliarFinal.setBackground(cor096.getBackground());
		}
	});
	cor097.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor097.getBackground());
			painelInicio.setBackground(cor097.getBackground());
			painel.setBackground(cor097.getBackground());
			questao.setBackground(cor097.getBackground());
			btn01.setBackground(cor097.getBackground());
			btn02.setBackground(cor097.getBackground());
			btn03.setBackground(cor097.getBackground());
			btn04.setBackground(cor097.getBackground());
			btn05.setBackground(cor097.getBackground());
			painelConfiguracoes.setBackground(cor097.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor097.getBackground());
			auxiliarRespostas.setBackground(cor097.getBackground());
			auxiliarAvaliar.setBackground(cor097.getBackground());
			auxiliarConfiguracoes.setBackground(cor097.getBackground());
			auxiliarFinal.setBackground(cor097.getBackground());
		}
	});
	cor098.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor098.getBackground());
			painelInicio.setBackground(cor098.getBackground());
			painel.setBackground(cor098.getBackground());
			questao.setBackground(cor098.getBackground());
			btn01.setBackground(cor098.getBackground());
			btn02.setBackground(cor098.getBackground());
			btn03.setBackground(cor098.getBackground());
			btn04.setBackground(cor098.getBackground());
			btn05.setBackground(cor098.getBackground());
			painelConfiguracoes.setBackground(cor098.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor098.getBackground());
			auxiliarRespostas.setBackground(cor098.getBackground());
			auxiliarAvaliar.setBackground(cor098.getBackground());
			auxiliarConfiguracoes.setBackground(cor098.getBackground());
			auxiliarFinal.setBackground(cor098.getBackground());
		}
	});
	cor099.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor099.getBackground());
			painelInicio.setBackground(cor099.getBackground());
			painel.setBackground(cor099.getBackground());
			questao.setBackground(cor099.getBackground());
			btn01.setBackground(cor099.getBackground());
			btn02.setBackground(cor099.getBackground());
			btn03.setBackground(cor099.getBackground());
			btn04.setBackground(cor099.getBackground());
			btn05.setBackground(cor099.getBackground());
			painelConfiguracoes.setBackground(cor099.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor099.getBackground());
			auxiliarRespostas.setBackground(cor099.getBackground());
			auxiliarAvaliar.setBackground(cor099.getBackground());
			auxiliarConfiguracoes.setBackground(cor099.getBackground());
			auxiliarFinal.setBackground(cor099.getBackground());
		}
	});
	cor100.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor100.getBackground());
			painelInicio.setBackground(cor100.getBackground());
			painel.setBackground(cor100.getBackground());
			questao.setBackground(cor100.getBackground());
			btn01.setBackground(cor100.getBackground());
			btn02.setBackground(cor100.getBackground());
			btn03.setBackground(cor100.getBackground());
			btn04.setBackground(cor100.getBackground());
			btn05.setBackground(cor100.getBackground());
			painelConfiguracoes.setBackground(cor100.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor100.getBackground());
			auxiliarRespostas.setBackground(cor100.getBackground());
			auxiliarAvaliar.setBackground(cor100.getBackground());
			auxiliarConfiguracoes.setBackground(cor100.getBackground());
			auxiliarFinal.setBackground(cor100.getBackground());
		}
	});
	cor101.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor101.getBackground());
			painelInicio.setBackground(cor101.getBackground());
			painel.setBackground(cor101.getBackground());
			questao.setBackground(cor101.getBackground());
			btn01.setBackground(cor101.getBackground());
			btn02.setBackground(cor101.getBackground());
			btn03.setBackground(cor101.getBackground());
			btn04.setBackground(cor101.getBackground());
			btn05.setBackground(cor101.getBackground());
			painelConfiguracoes.setBackground(cor101.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor101.getBackground());
			auxiliarRespostas.setBackground(cor101.getBackground());
			auxiliarAvaliar.setBackground(cor101.getBackground());
			auxiliarConfiguracoes.setBackground(cor101.getBackground());
			auxiliarFinal.setBackground(cor101.getBackground());
		}
	});
	cor102.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor102.getBackground());
			painelInicio.setBackground(cor102.getBackground());
			painel.setBackground(cor102.getBackground());
			questao.setBackground(cor102.getBackground());
			btn01.setBackground(cor102.getBackground());
			btn02.setBackground(cor102.getBackground());
			btn03.setBackground(cor102.getBackground());
			btn04.setBackground(cor102.getBackground());
			btn05.setBackground(cor102.getBackground());
			painelConfiguracoes.setBackground(cor102.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor102.getBackground());
			auxiliarRespostas.setBackground(cor102.getBackground());
			auxiliarAvaliar.setBackground(cor102.getBackground());
			auxiliarConfiguracoes.setBackground(cor102.getBackground());
			auxiliarFinal.setBackground(cor102.getBackground());
		}
	});
	cor103.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor103.getBackground());
			painelInicio.setBackground(cor103.getBackground());
			painel.setBackground(cor103.getBackground());
			questao.setBackground(cor103.getBackground());
			btn01.setBackground(cor103.getBackground());
			btn02.setBackground(cor103.getBackground());
			btn03.setBackground(cor103.getBackground());
			btn04.setBackground(cor103.getBackground());
			btn05.setBackground(cor103.getBackground());
			painelConfiguracoes.setBackground(cor103.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor103.getBackground());
			auxiliarRespostas.setBackground(cor103.getBackground());
			auxiliarAvaliar.setBackground(cor103.getBackground());
			auxiliarConfiguracoes.setBackground(cor103.getBackground());
			auxiliarFinal.setBackground(cor103.getBackground());
		}
	});
	cor104.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor104.getBackground());
			painelInicio.setBackground(cor104.getBackground());
			painel.setBackground(cor104.getBackground());
			questao.setBackground(cor104.getBackground());
			btn01.setBackground(cor104.getBackground());
			btn02.setBackground(cor104.getBackground());
			btn03.setBackground(cor104.getBackground());
			btn04.setBackground(cor104.getBackground());
			btn05.setBackground(cor104.getBackground());
			painelConfiguracoes.setBackground(cor104.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor104.getBackground());
			auxiliarRespostas.setBackground(cor104.getBackground());
			auxiliarAvaliar.setBackground(cor104.getBackground());
			auxiliarConfiguracoes.setBackground(cor104.getBackground());
			auxiliarFinal.setBackground(cor104.getBackground());
		}
	});
	cor105.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor105.getBackground());
			painelInicio.setBackground(cor105.getBackground());
			painel.setBackground(cor105.getBackground());
			questao.setBackground(cor105.getBackground());
			btn01.setBackground(cor105.getBackground());
			btn02.setBackground(cor105.getBackground());
			btn03.setBackground(cor105.getBackground());
			btn04.setBackground(cor105.getBackground());
			btn05.setBackground(cor105.getBackground());
			painelConfiguracoes.setBackground(cor105.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor105.getBackground());
			auxiliarRespostas.setBackground(cor105.getBackground());
			auxiliarAvaliar.setBackground(cor105.getBackground());
			auxiliarConfiguracoes.setBackground(cor105.getBackground());
			auxiliarFinal.setBackground(cor105.getBackground());
		}
	});
	cor106.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor106.getBackground());
			painelInicio.setBackground(cor106.getBackground());
			painel.setBackground(cor106.getBackground());
			questao.setBackground(cor106.getBackground());
			btn01.setBackground(cor106.getBackground());
			btn02.setBackground(cor106.getBackground());
			btn03.setBackground(cor106.getBackground());
			btn04.setBackground(cor106.getBackground());
			btn05.setBackground(cor106.getBackground());
			painelConfiguracoes.setBackground(cor106.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor106.getBackground());
			auxiliarRespostas.setBackground(cor106.getBackground());
			auxiliarAvaliar.setBackground(cor106.getBackground());
			auxiliarConfiguracoes.setBackground(cor106.getBackground());
			auxiliarFinal.setBackground(cor106.getBackground());
		}
	});
	cor107.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor107.getBackground());
			painelInicio.setBackground(cor107.getBackground());
			painel.setBackground(cor107.getBackground());
			questao.setBackground(cor107.getBackground());
			btn01.setBackground(cor107.getBackground());
			btn02.setBackground(cor107.getBackground());
			btn03.setBackground(cor107.getBackground());
			btn04.setBackground(cor107.getBackground());
			btn05.setBackground(cor107.getBackground());
			painelConfiguracoes.setBackground(cor107.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor107.getBackground());
			auxiliarRespostas.setBackground(cor107.getBackground());
			auxiliarAvaliar.setBackground(cor107.getBackground());
			auxiliarConfiguracoes.setBackground(cor107.getBackground());
			auxiliarFinal.setBackground(cor107.getBackground());
		}
	});
	cor108.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor108.getBackground());
			painelInicio.setBackground(cor108.getBackground());
			painel.setBackground(cor108.getBackground());
			questao.setBackground(cor108.getBackground());
			btn01.setBackground(cor108.getBackground());
			btn02.setBackground(cor108.getBackground());
			btn03.setBackground(cor108.getBackground());
			btn04.setBackground(cor108.getBackground());
			btn05.setBackground(cor108.getBackground());
			painelConfiguracoes.setBackground(cor108.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor108.getBackground());
			auxiliarRespostas.setBackground(cor108.getBackground());
			auxiliarAvaliar.setBackground(cor108.getBackground());
			auxiliarConfiguracoes.setBackground(cor108.getBackground());
			auxiliarFinal.setBackground(cor108.getBackground());
		}
	});
	cor109.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor109.getBackground());
			painelInicio.setBackground(cor109.getBackground());
			painel.setBackground(cor109.getBackground());
			questao.setBackground(cor109.getBackground());
			btn01.setBackground(cor109.getBackground());
			btn02.setBackground(cor109.getBackground());
			btn03.setBackground(cor109.getBackground());
			btn04.setBackground(cor109.getBackground());
			btn05.setBackground(cor109.getBackground());
			painelConfiguracoes.setBackground(cor109.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor109.getBackground());
			auxiliarRespostas.setBackground(cor109.getBackground());
			auxiliarAvaliar.setBackground(cor109.getBackground());
			auxiliarConfiguracoes.setBackground(cor109.getBackground());
			auxiliarFinal.setBackground(cor109.getBackground());
		}
	});
	cor110.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor110.getBackground());
			painelInicio.setBackground(cor110.getBackground());
			painel.setBackground(cor110.getBackground());
			questao.setBackground(cor110.getBackground());
			btn01.setBackground(cor110.getBackground());
			btn02.setBackground(cor110.getBackground());
			btn03.setBackground(cor110.getBackground());
			btn04.setBackground(cor110.getBackground());
			btn05.setBackground(cor110.getBackground());
			painelConfiguracoes.setBackground(cor110.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor110.getBackground());
			auxiliarRespostas.setBackground(cor110.getBackground());
			auxiliarAvaliar.setBackground(cor110.getBackground());
			auxiliarConfiguracoes.setBackground(cor110.getBackground());
			auxiliarFinal.setBackground(cor110.getBackground());
		}
	});
	cor111.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor111.getBackground());
			painelInicio.setBackground(cor111.getBackground());
			painel.setBackground(cor111.getBackground());
			questao.setBackground(cor111.getBackground());
			btn01.setBackground(cor111.getBackground());
			btn02.setBackground(cor111.getBackground());
			btn03.setBackground(cor111.getBackground());
			btn04.setBackground(cor111.getBackground());
			btn05.setBackground(cor111.getBackground());
			painelConfiguracoes.setBackground(cor111.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor111.getBackground());
			auxiliarRespostas.setBackground(cor111.getBackground());
			auxiliarAvaliar.setBackground(cor111.getBackground());
			auxiliarConfiguracoes.setBackground(cor111.getBackground());
			auxiliarFinal.setBackground(cor111.getBackground());
		}
	});
	cor112.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor112.getBackground());
			painelInicio.setBackground(cor112.getBackground());
			painel.setBackground(cor112.getBackground());
			questao.setBackground(cor112.getBackground());
			btn01.setBackground(cor112.getBackground());
			btn02.setBackground(cor112.getBackground());
			btn03.setBackground(cor112.getBackground());
			btn04.setBackground(cor112.getBackground());
			btn05.setBackground(cor112.getBackground());
			painelConfiguracoes.setBackground(cor112.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor112.getBackground());
			auxiliarRespostas.setBackground(cor112.getBackground());
			auxiliarAvaliar.setBackground(cor112.getBackground());
			auxiliarConfiguracoes.setBackground(cor112.getBackground());
			auxiliarFinal.setBackground(cor112.getBackground());
		}
	});
	cor113.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor113.getBackground());
			painelInicio.setBackground(cor113.getBackground());
			painel.setBackground(cor113.getBackground());
			questao.setBackground(cor113.getBackground());
			btn01.setBackground(cor113.getBackground());
			btn02.setBackground(cor113.getBackground());
			btn03.setBackground(cor113.getBackground());
			btn04.setBackground(cor113.getBackground());
			btn05.setBackground(cor113.getBackground());
			painelConfiguracoes.setBackground(cor113.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor113.getBackground());
			auxiliarRespostas.setBackground(cor113.getBackground());
			auxiliarAvaliar.setBackground(cor113.getBackground());
			auxiliarConfiguracoes.setBackground(cor113.getBackground());
			auxiliarFinal.setBackground(cor113.getBackground());
		}
	});
	cor114.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor114.getBackground());
			painelInicio.setBackground(cor114.getBackground());
			painel.setBackground(cor114.getBackground());
			questao.setBackground(cor114.getBackground());
			btn01.setBackground(cor114.getBackground());
			btn02.setBackground(cor114.getBackground());
			btn03.setBackground(cor114.getBackground());
			btn04.setBackground(cor114.getBackground());
			btn05.setBackground(cor114.getBackground());
			painelConfiguracoes.setBackground(cor114.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor114.getBackground());
			auxiliarRespostas.setBackground(cor114.getBackground());
			auxiliarAvaliar.setBackground(cor114.getBackground());
			auxiliarConfiguracoes.setBackground(cor114.getBackground());
			auxiliarFinal.setBackground(cor114.getBackground());
		}
	});
	cor115.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor115.getBackground());
			painelInicio.setBackground(cor115.getBackground());
			painel.setBackground(cor115.getBackground());
			questao.setBackground(cor115.getBackground());
			btn01.setBackground(cor115.getBackground());
			btn02.setBackground(cor115.getBackground());
			btn03.setBackground(cor115.getBackground());
			btn04.setBackground(cor115.getBackground());
			btn05.setBackground(cor115.getBackground());
			painelConfiguracoes.setBackground(cor115.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor115.getBackground());
			auxiliarRespostas.setBackground(cor115.getBackground());
			auxiliarAvaliar.setBackground(cor115.getBackground());
			auxiliarConfiguracoes.setBackground(cor115.getBackground());
			auxiliarFinal.setBackground(cor115.getBackground());
		}
	});
	cor116.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor116.getBackground());
			painelInicio.setBackground(cor116.getBackground());
			painel.setBackground(cor116.getBackground());
			questao.setBackground(cor116.getBackground());
			btn01.setBackground(cor116.getBackground());
			btn02.setBackground(cor116.getBackground());
			btn03.setBackground(cor116.getBackground());
			btn04.setBackground(cor116.getBackground());
			btn05.setBackground(cor116.getBackground());
			painelConfiguracoes.setBackground(cor116.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor116.getBackground());
			auxiliarRespostas.setBackground(cor116.getBackground());
			auxiliarAvaliar.setBackground(cor116.getBackground());
			auxiliarConfiguracoes.setBackground(cor116.getBackground());
			auxiliarFinal.setBackground(cor116.getBackground());
		}
	});
	cor117.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor117.getBackground());
			painelInicio.setBackground(cor117.getBackground());
			painel.setBackground(cor117.getBackground());
			questao.setBackground(cor117.getBackground());
			btn01.setBackground(cor117.getBackground());
			btn02.setBackground(cor117.getBackground());
			btn03.setBackground(cor117.getBackground());
			btn04.setBackground(cor117.getBackground());
			btn05.setBackground(cor117.getBackground());
			painelConfiguracoes.setBackground(cor117.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor117.getBackground());
			auxiliarRespostas.setBackground(cor117.getBackground());
			auxiliarAvaliar.setBackground(cor117.getBackground());
			auxiliarConfiguracoes.setBackground(cor117.getBackground());
			auxiliarFinal.setBackground(cor117.getBackground());
		}
	});
	cor118.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor118.getBackground());
			painelInicio.setBackground(cor118.getBackground());
			painel.setBackground(cor118.getBackground());
			questao.setBackground(cor118.getBackground());
			btn01.setBackground(cor118.getBackground());
			btn02.setBackground(cor118.getBackground());
			btn03.setBackground(cor118.getBackground());
			btn04.setBackground(cor118.getBackground());
			btn05.setBackground(cor118.getBackground());
			painelConfiguracoes.setBackground(cor118.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor118.getBackground());
			auxiliarRespostas.setBackground(cor118.getBackground());
			auxiliarAvaliar.setBackground(cor118.getBackground());
			auxiliarConfiguracoes.setBackground(cor118.getBackground());
			auxiliarFinal.setBackground(cor118.getBackground());
		}
	});
	cor119.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor119.getBackground());
			painelInicio.setBackground(cor119.getBackground());
			painel.setBackground(cor119.getBackground());
			questao.setBackground(cor119.getBackground());
			btn01.setBackground(cor119.getBackground());
			btn02.setBackground(cor119.getBackground());
			btn03.setBackground(cor119.getBackground());
			btn04.setBackground(cor119.getBackground());
			btn05.setBackground(cor119.getBackground());
			painelConfiguracoes.setBackground(cor119.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor119.getBackground());
			auxiliarRespostas.setBackground(cor119.getBackground());
			auxiliarAvaliar.setBackground(cor119.getBackground());
			auxiliarConfiguracoes.setBackground(cor119.getBackground());
			auxiliarFinal.setBackground(cor119.getBackground());
		}
	});
	cor120.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor120.getBackground());
			painelInicio.setBackground(cor120.getBackground());
			painel.setBackground(cor120.getBackground());
			questao.setBackground(cor120.getBackground());
			btn01.setBackground(cor120.getBackground());
			btn02.setBackground(cor120.getBackground());
			btn03.setBackground(cor120.getBackground());
			btn04.setBackground(cor120.getBackground());
			btn05.setBackground(cor120.getBackground());
			painelConfiguracoes.setBackground(cor120.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor120.getBackground());
			auxiliarRespostas.setBackground(cor120.getBackground());
			auxiliarAvaliar.setBackground(cor120.getBackground());
			auxiliarConfiguracoes.setBackground(cor120.getBackground());
			auxiliarFinal.setBackground(cor120.getBackground());
		}
	});
	cor121.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor121.getBackground());
			painelInicio.setBackground(cor121.getBackground());
			painel.setBackground(cor121.getBackground());
			questao.setBackground(cor121.getBackground());
			btn01.setBackground(cor121.getBackground());
			btn02.setBackground(cor121.getBackground());
			btn03.setBackground(cor121.getBackground());
			btn04.setBackground(cor121.getBackground());
			btn05.setBackground(cor121.getBackground());
			painelConfiguracoes.setBackground(cor121.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor121.getBackground());
			auxiliarRespostas.setBackground(cor121.getBackground());
			auxiliarAvaliar.setBackground(cor121.getBackground());
			auxiliarConfiguracoes.setBackground(cor121.getBackground());
			auxiliarFinal.setBackground(cor121.getBackground());
		}
	});
	cor122.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor122.getBackground());
			painelInicio.setBackground(cor122.getBackground());
			painel.setBackground(cor122.getBackground());
			questao.setBackground(cor122.getBackground());
			btn01.setBackground(cor122.getBackground());
			btn02.setBackground(cor122.getBackground());
			btn03.setBackground(cor122.getBackground());
			btn04.setBackground(cor122.getBackground());
			btn05.setBackground(cor122.getBackground());
			painelConfiguracoes.setBackground(cor122.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor122.getBackground());
			auxiliarRespostas.setBackground(cor122.getBackground());
			auxiliarAvaliar.setBackground(cor122.getBackground());
			auxiliarConfiguracoes.setBackground(cor122.getBackground());
			auxiliarFinal.setBackground(cor122.getBackground());
		}
	});
	cor123.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor123.getBackground());
			painelInicio.setBackground(cor123.getBackground());
			painel.setBackground(cor123.getBackground());
			questao.setBackground(cor123.getBackground());
			btn01.setBackground(cor123.getBackground());
			btn02.setBackground(cor123.getBackground());
			btn03.setBackground(cor123.getBackground());
			btn04.setBackground(cor123.getBackground());
			btn05.setBackground(cor123.getBackground());
			painelConfiguracoes.setBackground(cor123.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor123.getBackground());
			auxiliarRespostas.setBackground(cor123.getBackground());
			auxiliarAvaliar.setBackground(cor123.getBackground());
			auxiliarConfiguracoes.setBackground(cor123.getBackground());
			auxiliarFinal.setBackground(cor123.getBackground());
		}
	});
	cor124.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor124.getBackground());
			painelInicio.setBackground(cor124.getBackground());
			painel.setBackground(cor124.getBackground());
			questao.setBackground(cor124.getBackground());
			btn01.setBackground(cor124.getBackground());
			btn02.setBackground(cor124.getBackground());
			btn03.setBackground(cor124.getBackground());
			btn04.setBackground(cor124.getBackground());
			btn05.setBackground(cor124.getBackground());
			painelConfiguracoes.setBackground(cor124.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor124.getBackground());
			auxiliarRespostas.setBackground(cor124.getBackground());
			auxiliarAvaliar.setBackground(cor124.getBackground());
			auxiliarConfiguracoes.setBackground(cor124.getBackground());
			auxiliarFinal.setBackground(cor124.getBackground());
		}
	});
	cor125.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor125.getBackground());
			painelInicio.setBackground(cor125.getBackground());
			painel.setBackground(cor125.getBackground());
			questao.setBackground(cor125.getBackground());
			btn01.setBackground(cor125.getBackground());
			btn02.setBackground(cor125.getBackground());
			btn03.setBackground(cor125.getBackground());
			btn04.setBackground(cor125.getBackground());
			btn05.setBackground(cor125.getBackground());
			painelConfiguracoes.setBackground(cor125.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor125.getBackground());
			auxiliarRespostas.setBackground(cor125.getBackground());
			auxiliarAvaliar.setBackground(cor125.getBackground());
			auxiliarConfiguracoes.setBackground(cor125.getBackground());
			auxiliarFinal.setBackground(cor125.getBackground());
		}
	});
	cor126.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor126.getBackground());
			painelInicio.setBackground(cor126.getBackground());
			painel.setBackground(cor126.getBackground());
			questao.setBackground(cor126.getBackground());
			btn01.setBackground(cor126.getBackground());
			btn02.setBackground(cor126.getBackground());
			btn03.setBackground(cor126.getBackground());
			btn04.setBackground(cor126.getBackground());
			btn05.setBackground(cor126.getBackground());
			painelConfiguracoes.setBackground(cor126.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor126.getBackground());
			auxiliarRespostas.setBackground(cor126.getBackground());
			auxiliarAvaliar.setBackground(cor126.getBackground());
			auxiliarConfiguracoes.setBackground(cor126.getBackground());
			auxiliarFinal.setBackground(cor126.getBackground());
		}
	});
	cor127.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor127.getBackground());
			painelInicio.setBackground(cor127.getBackground());
			painel.setBackground(cor127.getBackground());
			questao.setBackground(cor127.getBackground());
			btn01.setBackground(cor127.getBackground());
			btn02.setBackground(cor127.getBackground());
			btn03.setBackground(cor127.getBackground());
			btn04.setBackground(cor127.getBackground());
			btn05.setBackground(cor127.getBackground());
			painelConfiguracoes.setBackground(cor127.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor127.getBackground());
			auxiliarRespostas.setBackground(cor127.getBackground());
			auxiliarAvaliar.setBackground(cor127.getBackground());
			auxiliarConfiguracoes.setBackground(cor127.getBackground());
			auxiliarFinal.setBackground(cor127.getBackground());
		}
	});
	cor128.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor128.getBackground());
			painelInicio.setBackground(cor128.getBackground());
			painel.setBackground(cor128.getBackground());
			questao.setBackground(cor128.getBackground());
			btn01.setBackground(cor128.getBackground());
			btn02.setBackground(cor128.getBackground());
			btn03.setBackground(cor128.getBackground());
			btn04.setBackground(cor128.getBackground());
			btn05.setBackground(cor128.getBackground());
			painelConfiguracoes.setBackground(cor128.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor128.getBackground());
			auxiliarRespostas.setBackground(cor128.getBackground());
			auxiliarAvaliar.setBackground(cor128.getBackground());
			auxiliarConfiguracoes.setBackground(cor128.getBackground());
			auxiliarFinal.setBackground(cor128.getBackground());
		}
	});
	cor129.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor129.getBackground());
			painelInicio.setBackground(cor129.getBackground());
			painel.setBackground(cor129.getBackground());
			questao.setBackground(cor129.getBackground());
			btn01.setBackground(cor129.getBackground());
			btn02.setBackground(cor129.getBackground());
			btn03.setBackground(cor129.getBackground());
			btn04.setBackground(cor129.getBackground());
			btn05.setBackground(cor129.getBackground());
			painelConfiguracoes.setBackground(cor129.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor129.getBackground());
			auxiliarRespostas.setBackground(cor129.getBackground());
			auxiliarAvaliar.setBackground(cor129.getBackground());
			auxiliarConfiguracoes.setBackground(cor129.getBackground());
			auxiliarFinal.setBackground(cor129.getBackground());
		}
	});
	cor130.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor130.getBackground());
			painelInicio.setBackground(cor130.getBackground());
			painel.setBackground(cor130.getBackground());
			questao.setBackground(cor130.getBackground());
			btn01.setBackground(cor130.getBackground());
			btn02.setBackground(cor130.getBackground());
			btn03.setBackground(cor130.getBackground());
			btn04.setBackground(cor130.getBackground());
			btn05.setBackground(cor130.getBackground());
			painelConfiguracoes.setBackground(cor130.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor130.getBackground());
			auxiliarRespostas.setBackground(cor130.getBackground());
			auxiliarAvaliar.setBackground(cor130.getBackground());
			auxiliarConfiguracoes.setBackground(cor130.getBackground());
			auxiliarFinal.setBackground(cor130.getBackground());
		}
	});
	cor131.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor131.getBackground());
			painelInicio.setBackground(cor131.getBackground());
			painel.setBackground(cor131.getBackground());
			questao.setBackground(cor131.getBackground());
			btn01.setBackground(cor131.getBackground());
			btn02.setBackground(cor131.getBackground());
			btn03.setBackground(cor131.getBackground());
			btn04.setBackground(cor131.getBackground());
			btn05.setBackground(cor131.getBackground());
			painelConfiguracoes.setBackground(cor131.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor131.getBackground());
			auxiliarRespostas.setBackground(cor131.getBackground());
			auxiliarAvaliar.setBackground(cor131.getBackground());
			auxiliarConfiguracoes.setBackground(cor131.getBackground());
			auxiliarFinal.setBackground(cor131.getBackground());
		}
	});
	cor132.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor132.getBackground());
			painelInicio.setBackground(cor132.getBackground());
			painel.setBackground(cor132.getBackground());
			questao.setBackground(cor132.getBackground());
			btn01.setBackground(cor132.getBackground());
			btn02.setBackground(cor132.getBackground());
			btn03.setBackground(cor132.getBackground());
			btn04.setBackground(cor132.getBackground());
			btn05.setBackground(cor132.getBackground());
			painelConfiguracoes.setBackground(cor132.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor132.getBackground());
			auxiliarRespostas.setBackground(cor132.getBackground());
			auxiliarAvaliar.setBackground(cor132.getBackground());
			auxiliarConfiguracoes.setBackground(cor132.getBackground());
			auxiliarFinal.setBackground(cor132.getBackground());
		}
	});
	cor133.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor133.getBackground());
			painelInicio.setBackground(cor133.getBackground());
			painel.setBackground(cor133.getBackground());
			questao.setBackground(cor133.getBackground());
			btn01.setBackground(cor133.getBackground());
			btn02.setBackground(cor133.getBackground());
			btn03.setBackground(cor133.getBackground());
			btn04.setBackground(cor133.getBackground());
			btn05.setBackground(cor133.getBackground());
			painelConfiguracoes.setBackground(cor133.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor133.getBackground());
			auxiliarRespostas.setBackground(cor133.getBackground());
			auxiliarAvaliar.setBackground(cor133.getBackground());
			auxiliarConfiguracoes.setBackground(cor133.getBackground());
			auxiliarFinal.setBackground(cor133.getBackground());
		}
	});
	cor134.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor134.getBackground());
			painelInicio.setBackground(cor134.getBackground());
			painel.setBackground(cor134.getBackground());
			questao.setBackground(cor134.getBackground());
			btn01.setBackground(cor134.getBackground());
			btn02.setBackground(cor134.getBackground());
			btn03.setBackground(cor134.getBackground());
			btn04.setBackground(cor134.getBackground());
			btn05.setBackground(cor134.getBackground());
			painelConfiguracoes.setBackground(cor134.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor134.getBackground());
			auxiliarRespostas.setBackground(cor134.getBackground());
			auxiliarAvaliar.setBackground(cor134.getBackground());
			auxiliarConfiguracoes.setBackground(cor134.getBackground());
			auxiliarFinal.setBackground(cor134.getBackground());
		}
	});
	cor135.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor135.getBackground());
			painelInicio.setBackground(cor135.getBackground());
			painel.setBackground(cor135.getBackground());
			questao.setBackground(cor135.getBackground());
			btn01.setBackground(cor135.getBackground());
			btn02.setBackground(cor135.getBackground());
			btn03.setBackground(cor135.getBackground());
			btn04.setBackground(cor135.getBackground());
			btn05.setBackground(cor135.getBackground());
			painelConfiguracoes.setBackground(cor135.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor135.getBackground());
			auxiliarRespostas.setBackground(cor135.getBackground());
			auxiliarAvaliar.setBackground(cor135.getBackground());
			auxiliarConfiguracoes.setBackground(cor135.getBackground());
			auxiliarFinal.setBackground(cor135.getBackground());
		}
	});
	cor136.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor136.getBackground());
			painelInicio.setBackground(cor136.getBackground());
			painel.setBackground(cor136.getBackground());
			questao.setBackground(cor136.getBackground());
			btn01.setBackground(cor136.getBackground());
			btn02.setBackground(cor136.getBackground());
			btn03.setBackground(cor136.getBackground());
			btn04.setBackground(cor136.getBackground());
			btn05.setBackground(cor136.getBackground());
			painelConfiguracoes.setBackground(cor136.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor136.getBackground());
			auxiliarRespostas.setBackground(cor136.getBackground());
			auxiliarAvaliar.setBackground(cor136.getBackground());
			auxiliarConfiguracoes.setBackground(cor136.getBackground());
			auxiliarFinal.setBackground(cor136.getBackground());
		}
	});
	cor137.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor137.getBackground());
			painelInicio.setBackground(cor137.getBackground());
			painel.setBackground(cor137.getBackground());
			questao.setBackground(cor137.getBackground());
			btn01.setBackground(cor137.getBackground());
			btn02.setBackground(cor137.getBackground());
			btn03.setBackground(cor137.getBackground());
			btn04.setBackground(cor137.getBackground());
			btn05.setBackground(cor137.getBackground());
			painelConfiguracoes.setBackground(cor137.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor137.getBackground());
			auxiliarRespostas.setBackground(cor137.getBackground());
			auxiliarAvaliar.setBackground(cor137.getBackground());
			auxiliarConfiguracoes.setBackground(cor137.getBackground());
			auxiliarFinal.setBackground(cor137.getBackground());
		}
	});
	cor138.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			painelLogin.setBackground(cor138.getBackground());
			painelInicio.setBackground(cor138.getBackground());
			painel.setBackground(cor138.getBackground());
			questao.setBackground(cor138.getBackground());
			btn01.setBackground(cor138.getBackground());
			btn02.setBackground(cor138.getBackground());
			btn03.setBackground(cor138.getBackground());
			btn04.setBackground(cor138.getBackground());
			btn05.setBackground(cor138.getBackground());
			painelConfiguracoes.setBackground(cor138.getBackground());
			painelConfiguracoes.setVisible(false);
			painelConfiguracoes.setVisible(true);
			auxiliarPrincipal.setBackground(cor138.getBackground());
			auxiliarRespostas.setBackground(cor138.getBackground());
			auxiliarAvaliar.setBackground(cor138.getBackground());
			auxiliarConfiguracoes.setBackground(cor138.getBackground());
			auxiliarFinal.setBackground(cor138.getBackground());
		}
	});
	
	// Opção que usuário tem de mostrar a hora no painel das perguntas e na tela final.
	horanao.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			horanao.setBackground(new Color(0, 255, 0));
			horasim.setBackground(null);
		}
	});
	
	horasim.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			horasim.setBackground(new Color(0, 255, 0));
			horanao.setBackground(null);
		}
	});
	
	// Ativar a opção das perguntas em inglês
	ingles.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ingles.setBackground(new Color(0, 255, 0));
			portugues.setBackground(null);
		}
	});
	
	// Botão que retorna da tela de configuração para tela principal do programa.
	ok.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			iniciar.setVisible(true);
			configuracoes.setVisible(true);
			avaliar.setVisible(true);
			painelInicio.setVisible(true);
			painelConfiguracoes.setVisible(false);
			lblCores.setVisible(false);
		}
	});
	
	// Ativar a opção das perguntas em português
	portugues.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			portugues.setBackground(new Color(0, 255, 0));
			ingles.setBackground(null);
		}
	});
	// Opção que usuário tem de ouvir as perguntas e som da tela final.
	somnao.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			somnao.setBackground(new Color(0, 255, 0));
			somsim.setBackground(null);
		}
	});
	
	somsim.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			somsim.setBackground(new Color(0, 255, 0));
			somnao.setBackground(null);
		}
	});
	
	//Botões que navegam no Guia de avaliação do meu trabalho.
	anterior.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			auxiliarPrincipal.setVisible(true);
			auxiliarConfiguracoes.setVisible(false);
			auxiliarAvaliar.setVisible(false);
			auxiliarRespostas.setVisible(false);
			auxiliarFinal.setVisible(false);
		}
	});
	
	anterior2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			auxiliarPrincipal.setVisible(false);
			auxiliarConfiguracoes.setVisible(true);
			auxiliarAvaliar.setVisible(false);
			auxiliarRespostas.setVisible(false);
			auxiliarFinal.setVisible(false);
		}
	});
	
	anterior3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			auxiliarPrincipal.setVisible(false);
			auxiliarConfiguracoes.setVisible(false);
			auxiliarAvaliar.setVisible(true);
			auxiliarRespostas.setVisible(false);
			auxiliarFinal.setVisible(false);
		}
	});
	
	anterior4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			auxiliarPrincipal.setVisible(false);
			auxiliarConfiguracoes.setVisible(false);
			auxiliarAvaliar.setVisible(false);
			auxiliarRespostas.setVisible(true);
			auxiliarFinal.setVisible(false);
		}
	});
	
	proximo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			auxiliarPrincipal.setVisible(false);
			auxiliarConfiguracoes.setVisible(true);
			auxiliarAvaliar.setVisible(false);
			auxiliarRespostas.setVisible(false);
			auxiliarFinal.setVisible(false);
		}
	});
	
	proximo2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			auxiliarPrincipal.setVisible(false);
			auxiliarConfiguracoes.setVisible(false);
			auxiliarAvaliar.setVisible(true);
			auxiliarRespostas.setVisible(false);
			auxiliarFinal.setVisible(false);
		}
	});
	
	proximo3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			auxiliarPrincipal.setVisible(false);
			auxiliarConfiguracoes.setVisible(false);
			auxiliarAvaliar.setVisible(false);
			auxiliarRespostas.setVisible(true);
			auxiliarFinal.setVisible(false);
		}
	});
	
	proximo4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			auxiliarPrincipal.setVisible(false);
			auxiliarConfiguracoes.setVisible(false);
			auxiliarAvaliar.setVisible(false);
			auxiliarRespostas.setVisible(false);
			auxiliarFinal.setVisible(true);
		}
	});
	
	// Botão que inicia o jogo de perguntas e respostas com as configurações que o usuário determinou na tela principal.
	// Caso nenhuma opção tenha sido escolhida na tela de configurações, a opação padrão é:
	// Perguntas: Português
	// Hora: Sim
	// Som: Sim
	iniciar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			painel.setVisible(true);
			painelInicio.setVisible(false);
			JButton verificacao = new JButton();
			ImageIcon caminho = null;
			Image img = null;
			verificacao.setBackground(new Color(0, 255, 0));
			avaliar.setVisible(false);
			if (portugues.getBackground().equals(verificacao.getBackground())) {
				caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + questoesBR[resposta[obterIndice]][7]);
 				if (somsim.getBackground().equals(verificacao.getBackground())) {
					try {
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "\\src\\Sons\\" + questoesBR[resposta[obterIndice]][8])));
						clip.start();
					} catch (LineUnavailableException e1) {
						e1.printStackTrace();
					} catch (UnsupportedAudioFileException | IOException e2) {
						e2.printStackTrace();
					}
				}
			}
			if (ingles.getBackground().equals(verificacao.getBackground())) {
				caminho = new ImageIcon(System.getProperty("user.dir") + "\\src\\Imagens\\" + questoesEN[resposta[obterIndice]][7]);
				if (somsim.getBackground().equals(verificacao.getBackground())) {
					try {
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "\\src\\Sons\\" + questoesEN[resposta[obterIndice]][8])));
						clip.start();
					} catch (LineUnavailableException e1) {
						e1.printStackTrace();
					} catch (UnsupportedAudioFileException | IOException e2) {
						e2.printStackTrace();
					}
				}
			}
			img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(), Image.SCALE_SMOOTH);
			imagem.setIcon(new ImageIcon(img));
			imagem.setOpaque(true);
			painel.add(imagem);
			quiz.setVisible(false);
			iniciar.setVisible(false);
			configuracoes.setVisible(false);
			questao.setVisible(true);
			linha.setVisible(true);
			btn01.setVisible(true);
			btn02.setVisible(true);
			btn03.setVisible(true);
			btn04.setVisible(true);
			btn05.setVisible(true);
			proximaQuestao.setVisible(true);
			painel.setVisible(true);
			imagem.setVisible(false);
			if (horasim.getBackground().equals(verificacao.getBackground())) {
				tempoNaTela.setVisible(true);
				Timer timer2 = new Timer(1000, new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
						String str = fmt.format(new Date());
						tempoNaTela.setText(str);
					}
				});
				timer2.setRepeats(true);
				timer2.setCoalesce(true);
				timer2.setInitialDelay(0);
				timer2.start();
			}
			if (portugues.getBackground().equals(painelConfiguracoes.getBackground())) {
				questao.setText(questoesEN[resposta[obterIndice]][0]);
				btn01.setText(questoesEN[resposta[obterIndice]][1]);
				btn01.setActionCommand(questoesEN[resposta[obterIndice]][1]);
				btn02.setText(questoesEN[resposta[obterIndice]][2]);
				btn02.setActionCommand(questoesEN[resposta[obterIndice]][2]);
				btn03.setText(questoesEN[resposta[obterIndice]][3]);
				btn03.setActionCommand(questoesEN[resposta[obterIndice]][3]);
				btn04.setText(questoesEN[resposta[obterIndice]][4]);
				btn04.setActionCommand(questoesEN[resposta[obterIndice]][4]);
				btn05.setText(questoesEN[resposta[obterIndice]][5]);
				btn05.setActionCommand(questoesEN[resposta[obterIndice]][5]);
			} else {
				questao.setText(questoesBR[resposta[obterIndice]][0]);
				btn01.setText(questoesBR[resposta[obterIndice]][1]);
				btn01.setActionCommand(questoesBR[resposta[obterIndice]][1]);
				btn02.setText(questoesBR[resposta[obterIndice]][2]);
				btn02.setActionCommand(questoesBR[resposta[obterIndice]][2]);
				btn03.setText(questoesBR[resposta[obterIndice]][3]);
				btn03.setActionCommand(questoesBR[resposta[obterIndice]][3]);
				btn04.setText(questoesBR[resposta[obterIndice]][4]);
				btn04.setActionCommand(questoesBR[resposta[obterIndice]][4]);
				btn05.setText(questoesBR[resposta[obterIndice]][5]);
				btn05.setActionCommand(questoesBR[resposta[obterIndice]][5]);
			}
			imagem.setVisible(true);
		}
	});
	}
}