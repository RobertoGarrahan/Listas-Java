package programa;
import java.util.Scanner;

/*Programa 1: construir um programa em Java que leia 2 
números inteiros e imprima o maior número lido.*/

/*public class Lista2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
            
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
            
        if (num1 > num2) {
            System.out.println("O maior número é " + num1);
         } else {
            System.out.println("O maior número é " + num2);
        }
            
        sc.close();
    }
}*/
    


/*Programa 2: construir  um  programa  em  Java  que  leia um 
número inteiro e imprima “PAR”, se o número for par e imprima “ÍMPAR”, 
se o número for ímpar.*/

/*public class Lista2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
        
        sc.close();
    }
}*/



/*Programa 3: construir um programa em Java que leia um número inteiro e imprima 
“Positivo”, se o número lido for maior que 0, imprima “Negativo”, se o número lido 
for menor que 0 e imprima “Nulo”, se o número lido for igual a 0.*/

/*public class Lista2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Nulo");
        }
        
        sc.close();
    }
}*/



/*Programa 4: construir um programa em Java que leia as 2 notas de um aluno e que
calcule, armazene e imprima a média. Se a média for maior ou igual a 7, imprimir 
“Aprovado”, caso contrário, realizar a leitura de uma terceira nota, que terá peso 2 
e calcular, armazenar e imprimir uma nova média. Se a nova média for maior ou igual a 
6, imprimir “Aprovado”, caso contrário, imprimir “Reprovado”. */

/*public class Lista2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.print("Digite a terceira nota: ");
            double nota3 = sc.nextDouble();
            
            media = (nota1 + nota2 + nota3*2) / 4;
            
            if (media >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
        
        sc.close();
    }
}*/



/*Programa 5: construir um programa em Java que leia um número inteiro entre 1 e 7 
e imprima o nome do dia da semana correspondente ao número, caso o número esteja fora
do intervalo entre 1 e 7, imprimir “Dia Inválido”.*/

/*public class Lista2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 1 e 7: ");
        int num = sc.nextInt();

        String dia;

        switch (num) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Dia Inválido";
        }

        System.out.println(dia);

        sc.close();
    }
}*/



/*Programa 6: construir um programa em Java que leia 10 números inteiros
e que calcule, armazene e imprima o somatório de todos os números lidos.*/

/*public class Lista2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somatorio = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int num = sc.nextInt();
            somatorio += num;
        }

        System.out.printf("O somatório dos números é: %d\n", somatorio);

        sc.close();
    }
}*/



/*Programa 7: construir  um  programa  em  Java  que  leia  a  idade
de  15  pessoas  e  calcule,  armazene  e imprima a média das idades lidas.*/

/*public class Lista2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, somaIdades = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = input.nextInt();
            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / 15;
        System.out.printf("A média das idades é: %.2f", mediaIdades);
    }
}*/



/*Programa 8: construir um programa em Java que leia 10 números e imprima
o maior número lido.*/

/*public class Lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalNumeros = 10;
        int maiorNumero = Integer.MIN_VALUE;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = input.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + maiorNumero);
    }
}*/



/*Programa 9: construir um programa em Java que leia 10 notas e imprima a maior
e a menor nota lidas.*/

/*public class Lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalNotas = 10;
        double menorNota = Double.MAX_VALUE;
        double maiorNota = Double.MIN_VALUE;

        for (int i = 1; i <= totalNotas; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            double nota = input.nextDouble();

            if (nota < menorNota) {
                menorNota = nota;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }
        }

        System.out.println("A menor nota digitada foi: " + menorNota);
        System.out.println("A maior nota digitada foi: " + maiorNota);
    }
}*/



/*Programa 10: construir um programa em Java que leia o sexo de 30 alunos e turma e
calcule, armazene e imprima a porcentagem de alunos do sexo masculino e a porcentagem
do sexo feminino.*/

/*public class Lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalAlunos = 30;
        int contadorMasculino = 0;
        int contadorFeminino = 0;

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.print("Digite o sexo do " + i + "º aluno (M/F): ");
            char sexo = input.next().charAt(0);

            if (sexo == 'M' || sexo == 'm') {
                contadorMasculino++;
            } else if (sexo == 'F' || sexo == 'f') {
                contadorFeminino++;
            } else {
                System.out.println("Sexo inválido! Digite M ou F.");
                i--; // Desconta do contador de alunos para pedir o sexo novamente
            }
        }

        double porcentagemMasculino = (double) contadorMasculino / totalAlunos * 100;
        double porcentagemFeminino = (double) contadorFeminino / totalAlunos * 100;

        System.out.printf("Porcentagem de alunos do sexo masculino: %.2f%%\n", porcentagemMasculino);
        System.out.printf("Porcentagem de alunos do sexo feminino: %.2f%%\n", porcentagemFeminino);
    }
}*/

