import java.util.Scanner;

public class DiasDoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome ou número do mês: ");
        String entrada = scanner.nextLine().toLowerCase();

        int mes = -1;

        switch (entrada) {
            case "1": case "janeiro":
                mes = 1;
                break;
            case "2": case "fevereiro":
                mes = 2;
                break;
            case "3": case "março": case "marco":
                mes = 3;
                break;
            case "4": case "abril":
                mes = 4;
                break;
            case "5": case "maio":
                mes = 5;
                break;
            case "6": case "junho":
                mes = 6;
                break;
            case "7": case "julho":
                mes = 7;
                break;
            case "8": case "agosto":
                mes = 8;
                break;
            case "9": case "setembro":
                mes = 9;
                break;
            case "10": case "outubro":
                mes = 10;
                break;
            case "11": case "novembro":
                mes = 11;
                break;
            case "12": case "dezembro":
                mes = 12;
                break;
            default:
                System.out.println("Mês inválido.");
                return;
        }

        int dias;
        switch (mes) {
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                System.out.print("Digite o ano: ");
                int ano = scanner.nextInt();
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    dias = 29; // ano bissexto
                } else {
                    dias = 28;
                }
                break;
            default:
                dias = 31;
        }

        System.out.println("O mês selecionado possui " + dias + " dias.");
        scanner.close();
    }
}
