package programa;
import java.util.Scanner;

/*Programa 1: construir um programa em Java que leia
um número inteiro e calcule e escreva o seu dobro.*/

/*public class Lista1 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numeroint = leia.nextInt();
        leia.close();

        System.out.println("Numero inteiro: " + numeroint);
        System.out.println("Numero dobrado: " + numeroint * 2);
    }
}*/



/*Programa 2: construir um programa em Java que leia 
2  números  inteiros  e  calcule,  armazene  e  imprima  a 
média aritmética e a metade da diferença entre eles. */

/*public class Lista1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        double numeroint1 = leia.nextDouble();
        System.out.print("Digite outro numero inteiro: ");
        double numeroint2 = leia.nextDouble();
        leia.close();

        double media = (numeroint1 + numeroint2) / 2;
        double diferenca = (numeroint1 - numeroint2) / 2;

        System.out.println("Média aritmética: " + media);
        System.out.println("Metade da diferença: " + diferenca);
    }
}*/



/*Programa 3: construir um programa em Java que leia 
as 3 notas de um aluno e calcule, armazene e imprima 
a média final.*/

/*public class Lista1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a nota 1 do aluno: ");
        double nota1 = leia.nextDouble();
        System.out.print("Digite a nota 2 do aluno: ");
        double nota2 = leia.nextDouble();
        System.out.print("Digite a nota 3 do aluno: ");
        double nota3 = leia.nextDouble();
        leia.close();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("\nMédia final: %.1f",media);
    }
}*/



/*Programa 4: construir um programa em Java que leia 
o salário bruto de um funcionário e calcule, armazene 
e  imprima  o  salário  bruto,  um  desconto  de  8%  e  o 
salário líquido.*/

/*public class Lista1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o salario bruto: ");
        double salbruto = leia.nextDouble();
        leia.close();

        double salliq = salbruto - salbruto*0.08;

        System.out.println("\nSalario bruto: " + salbruto);
        System.out.printf("Salario liquido: %.1f",salliq);

    }
}*/



/*Programa 5: construir um programa em Java que leia 
os valores de A, B e C e calcule, armazene e imprima 
o valor do delta. D = B2 - 4*A*C.*/

/*public class Lista1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int a = leia.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = leia.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = leia.nextInt();
        leia.close();

        int d = (b*b) - (4 * a * c);

        System.out.println("Delta = " + d);
    }
}*/     



/*Programa 6: construir um programa em Java que leia 
uma  distância  em  quilômetros  e  calcule,  armazene  e 
imprima essa distância em metros.*/

/*public class Lista1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite uma distancia em KM: ");
        int km = leia.nextInt();
        leia.close();

        int m = km * 1000;

        System.out.println("Distancia em metros = " + m + "m");
    }
}*/



/*Programa 7: construir um programa em Java que leia 
a quilometragem inicial e final de um veículo em uma 
viagem e ao final informe a quilometragem percorrida.*/

/*public class Lista1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a quilometragem inicial: ");
        double inicialkm = leia.nextDouble();
        System.out.print("Digite a quilometragem final: ");
        double finalkm = leia.nextDouble();
        leia.close();

        double distancia = finalkm - inicialkm;

        System.out.println("Distancia percorrida = " + distancia + "KMs");
    }
}*/



/*Programa 8: construir um programa em Java que leia 
a  quantidade  de  alunos  do  sexo  masculino,  do  sexo 
feminino e a quantidade de alunos aprovados de uma 
turma e calcule, armazene e imprima o total de alunos 
e a porcentagem de alunos do sexo masculino, do sexo 
feminino e a porcentagem de alunos aprovados.*/

/*public class Lista1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos do sexo masculino: ");
        int alunos = leia.nextInt();
        System.out.print("Digite a quantidade de alunos do sexo feminino: ");
        int alunas = leia.nextInt();
        System.out.print("Digite a quantidade de alunos aprovados: ");
        int aprovados = leia.nextInt();
        int total = alunos + alunas ;
        leia.close();

        double perc_alunos = ((double) alunos / total) * 100;
        double perc_alunas = ((double) alunas / total) * 100;
        double perc_aprovados = ((double) aprovados / total) * 100;

        System.out.println("Total de alunos: " + total);
        System.out.println("Porcentagem de alunos do sexo masculino: " + perc_alunos + "%");
        System.out.println("Porcentagem de alunos do sexo feminino: " + perc_alunas + "%");
        System.out.println("Porcentagem de alunos aprovados: " + perc_aprovados + "%");
    }
}*/



/*Programa 9: construir um programa em Java que leia 
a  quantidade  de  mini-games,  calculadoras  e  canetas 
vendidas por um camelô ao fim de um dia e calcule, 
armazene e imprima o faturamento de cada produto e 
o faturamento total. Mini-games: R$ 6.95, 
calculadoras: R$ 3.50 e canetas: R$ 1.20.*/

/*public class Lista1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a quantidade de mini-games vendidos pelo camelô: ");
        int minigames = leia.nextInt();
        System.out.print("Digite a quantidade de calculadoras vendidas pelo camelô: ");
        int calculadoras = leia.nextInt();
        System.out.print("Digite a quantidade de canetas vendidas pelo camelô: ");
        int canetas = leia.nextInt();

        double faturamento_minigames = minigames * 6.95;
        double faturamento_calculadoras = calculadoras * 3.50;
        double faturamento_canetas = canetas * 1.20;

        double faturamento_total = faturamento_minigames + faturamento_calculadoras + faturamento_canetas;

        System.out.println("Faturamento dos mini-games: R$" + faturamento_minigames);
        System.out.println("Faturamento das calculadoras: R$" + faturamento_calculadoras);
        System.out.println("Faturamento das canetas: R$" + faturamento_canetas);
        System.out.println("Faturamento total: R$" + faturamento_total);

        leia.close();
    }
}*/



/*Programa  10:  construir  um  programa  em  Java  que 
leia a quantidade de vitórias, derrotas e empates de um 
time ao final de um campeonato e que calcule, 
armazene  e  imprima  a  quantidade  total  de  jogos,  a 
quantidade de pontos disputados, de pontos ganhos e 
pontos perdidos. Vitória: 3 pontos, empate: 1 ponto e 
derrota: 0 ponto.*/

/*public class Lista1 {
	public static void main(String[] arg) {
		Scanner leia = new Scanner(System.in);
		int vitorias, derrotas, empates;
		System.out.print("Digite a quantidade de vitórias: ");
		vitorias = leia.nextInt();
		System.out.print("Digite a quantidade de derrotas: ");
		derrotas = leia.nextInt();
		System.out.print("Digite a quantidade de empates: ");
		empates = leia.nextInt();
		leia.close();
		
		int jogos = vitorias + derrotas + empates;
		int pontos_disputados = jogos * 3;
		int pontos_vitorias = vitorias * 3;
		int pontos_derrotas = derrotas * 0;
		int pontos_empates = empates * 1;
		int pontos_ganhos = pontos_vitorias + pontos_derrotas + pontos_empates;
		int pontos_perdidos = pontos_disputados - pontos_ganhos;
		
		System.out.printf("Jogos: %d\nPontos Disputados: %d\nPontos Ganhos: %d\nPontos Perdidos: %d\n",jogos,pontos_disputados,pontos_ganhos,pontos_perdidos);
	}
}*/

