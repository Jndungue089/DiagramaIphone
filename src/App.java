import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a operação que deseja realizar no seu iPhone 2G: ");
        String opcao = scanner.next();
        switch (opcao) {
            case "tocar":
                tocar();
                break;
            case "pausar":
                pausar();
                break;
            case "selecionar":
                System.out.println("Que música deseja selecionar? ");
                String musica = scanner.next();
                selecionarMusica(musica);
                break;
            case "ligar":
                System.out.println("Que número deseja ligar? ");
                int numero = scanner.nextInt();
                ligar(numero);
                break;
            case "correio":
                System.out.println("Que número deseja deixar mensagem no correio de voz? ");
                numero = scanner.nextInt();
                ligar(numero);
                break;
            case "navegador":
                abrirNavegador();
                break;
            case "pagina":
                System.out.println("Url da página: ");
                String url = scanner.next();
                exibirPagina(url);
                break;
            case "aba":
                adicionarNovaAba();
                break;

            case "atualizar":
                atualizarPagina();
                break;

            case "mensagem":
                System.out.println("Centéudo da mensagem: ");
                String mensagem = scanner.next();
                System.out.println("Digite o número: ");
                numero = scanner.nextInt();
                enviarMensagem(numero, mensagem);
                break;
                
            default:
                System.out.println("Selecione novamente a opção que deseja!");
                break;
        }
    }

    public static void tocar() {
        System.out.println("Estou tocando música");
    }

    public static void pausar() {
        System.out.println("Estou pausando a música");
    }

    public static void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada");
    }

    public static void ligar(int numero) {
        System.out.println("Estou ligando para o número " + numero);
    }

    public static void iniciarCorreioVoz(int numero) {
        System.out.println("Iniciando correio de voz para o número " + numero);
    }

    public static void abrirNavegador() {
        System.out.println("Abrindo navegador");
    }

    public static void exibirPagina(String url) {
        System.out.println("Abrindo a página " + url);
    }

    public static void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public static void atualizarPagina() {
        System.out.println("Atualizando a página ");
    }

    public static void enviarMensagem(int numero, String mensagem) {
        System.out.println("Enviando mensagem para o número " + numero + " com a mensagem: " + mensagem);
    }
}
