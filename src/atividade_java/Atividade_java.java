
package atividade_java;
import java.util.Scanner;


class Atividade_java {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o seu nome para começar.");
        String nome = in.nextLine();
        System.out.println("Seja bem-vindo "+nome);
        int numeroDigitado;
        do{
            System.out.println("=== ATIVIDADE FINAL ===");
            System.out.println("Desenvolvido por Luiz Felipe");
            System.out.println("Digite uma das opções abaixo que desejar:");
            System.out.println("1 - Cálcule quanto ganha por hora");
            System.out.println("2 - Cálcule o seu IMC");
            System.out.println("3 - Desafio");
            System.out.println("0 - Sair");
            numeroDigitado = Integer.parseInt(in.nextLine());
            
        switch (numeroDigitado){
		case 1:
		    System.out.println("CÁLCULE QUANTO GANHA POR HORA");
                    System.out.println(nome+", Digite quanto você ganha");
                    double salario = Double.parseDouble(in.nextLine());
                    System.out.println(nome+" Digite quantas horas por dia, você trabalha");
                    double hora = Double.parseDouble(in.nextLine());
                    System.out.println(nome+" Digite quantos dias no mês, você trabalha");
                    double dia = Double.parseDouble(in.nextLine());
                    double salarioHora = (salario/hora)/dia;
                    System.out.println(nome+" você ganha "+salarioHora+" por horas trabalhadas");
			break;
		case 2:
                    System.out.println("CÁLCULE O SEU IMC");
                    System.out.println(nome+" Digite o seu peso");
                    double peso = Double.parseDouble(in.nextLine());
                    System.out.println(nome+" Digite a sua altura");
                    double altura = Double.parseDouble(in.nextLine());
                    double imc = peso/(altura*altura);
                    System.out.println("O seu IMC é: "+imc);
                    
                    if(imc<18.5)
                    System.out.println(nome+", você está abaixo do peso");
                    else if(imc>=18.5 && imc<24.9)
                    System.out.println(nome+", você está no peso normal");
                    else if(imc>=25 && imc<29.9)
                    System.out.println(nome+", você está em SOBREPESO");
                    else if(imc>=30 && imc<34.9)
                    System.out.println(nome+", você está em OBESIDADE de (Grau I)");
                    else if(imc>=35 && imc<39.9)
                    System.out.println(nome+", você está em OBESIDADE de (Grau II)");
                    else if(imc>=40)
                    System.out.println(nome+", você está em OBESIDADE de (Grau III)");
                    else
                    System.out.println("VALOR INCORRETO!");
			break;
		case 3:
                    System.out.println("=== DESAFIO ===");
                    System.out.println("Cálcule a velocidade média");
                    System.out.println(nome+" decidiu fazer uma corrida da sua "
                    + "casa, até o centro da cidade para conhecer os bairos. Ele "
                    + "gastou 2 horas percorrendo uma distância de 120 km até chegar ao centro."
                    + " A que velocidade "+nome+" estava em seu passeio?");
                    
                    System.out.println("85 Km/h");
                    System.out.println("60 Km/h");
                    System.out.println("42 Km/h");
                    System.out.println("50 Km/h");
                    System.out.println("Digite uma das alternativas");
                    double velocidade = Double.parseDouble(in.nextLine());
                    
                    if(velocidade==60)
                    System.out.println("Parabéns, você acertou!");
                    else
                    System.out.println("Opss! Você errou, tente novamente.");
			break;
		default:
                    System.out.println("=== SAIR ===");
                    System.out.println("Que pena "+nome+", volte sempre!");
                        break;
                }
        }while(numeroDigitado !=0);
    }
}