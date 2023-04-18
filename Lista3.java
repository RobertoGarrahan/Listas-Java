package programa;
import java.util.Scanner;

/*Programa 1: Faça um programa que leia o código, a quantidade, o preço unitário e a 
forma de pagamento (1 - Dinheiro,  2  -  Cheque,  3  -  Cartão  débito,  4  -  Cartão
crédito)  de  um  produto.  Pagamentos  em dinheiro  recebem  um  desconto  de  10%,  
em  cartão  5%  e  em  cheque  2%.  O  programa  deve informar o valor do desconto e 
o valor final a pagar. */

/*public class Lista3 {
    private int codigo;
    private int quantidade;
    private double precoUnitario;
    private int formaPagamento;

    public Venda(int codigo, int quantidade, double precoUnitario, int formaPagamento) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.formaPagamento = formaPagamento;
    }

    public double calcularDesconto() {
        double desconto = 0;

        switch (formaPagamento) {
            case 1:
                desconto = precoUnitario * quantidade * 0.1;
                break;
            case 2:
                desconto = precoUnitario * quantidade * 0.02;
                break;
            case 3:
                desconto = precoUnitario * quantidade * 0.05;
                break;
        }

        return desconto;
    }

    public double calcularTotal() {
        double desconto = calcularDesconto();
        double total = precoUnitario * quantidade - desconto;

        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = input.nextInt();

        System.out.print("Digite a quantidade vendida: ");
        int quantidade = input.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = input.nextDouble();

        System.out.print("Digite a forma de pagamento (1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito): ");
        int formaPagamento = input.nextInt();

        Venda venda = new Venda(codigo, quantidade, precoUnitario, formaPagamento);

        double desconto = venda.calcularDesconto();
        double total = venda.calcularTotal();

        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Total a pagar: R$ %.2f\n", total);
    }
}*/



/*Programa 2: Dado três valores X,Y,Z, verificar se eles podem ser o comprimento dos
lados de um triângulo e, se  forem,  verificar  e  informar  se  é  um  triângulo,  
equilátero,  isósceles  ou  escaleno.  Se  eles  não formarem  um  triângulo,  o
programa  deve  informar  isso.  O comprimento  de  cada  lado  de  um triângulo  
é  menor  do  que  a  soma  do comprimento  dos  outros  dois  lados;  chama-se  
triângulo equilátero  ao  triângulo  que  tem  os  comprimentos  dos  três  lados  
iguais;  chama-se  triângulo isósceles ao triângulo que tem os comprimentos de dois 
lados iguais. chama-se triângulo escaleno ao triângulo que tem os comprimentos dos 
três lados diferentes */

/*public class Triangulo {
    private double x;
    private double y;
    private double z;

    public Triangulo(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean verificaTriangulo() {
        return (x < y + z) && (y < x + z) && (z < x + y);
    }

    public String tipoTriangulo() {
        if (x == y && y == z) {
            return "Equilátero";
        } else if (x == y || x == z || y == z) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}

public class Lista3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = input.nextDouble();

        System.out.print("Digite o valor de y: ");
        double y = input.nextDouble();

        System.out.print("Digite o valor de z: ");
        double z = input.nextDouble();

        Triangulo triangulo = new Triangulo(x, y, z);

        if (triangulo.verificaTriangulo()) {
            System.out.println("Os valores formam um triângulo " + triangulo.tipoTriangulo());
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }
}*/



/*Programa 3: Certo aço é classificado de acordo com o resultado de três testes,
que devem verificar se o mesmo satisfaz as seguintes especificações: Teste 1- 
conteúdo de carbono abaixo de 7%;Teste 2- dureza Rokwell maior que 50;Teste 3- 
resistência à tração maior do que 80.000 psi. Ao aço é atribuído o grau 10, se passa 
pelos três testes;9, se passa apenas nos testes 1 e 2; 8 , se passa no teste 1; e 7, 
para  as  outras  alternativas.  Supondo  que  sejam  lidos  de  uma  unidade  de  
entrada  o  número  de amostra, conteúdo de carbono, a dureza Rokwell e a resistência
a tração fará um programa que leia os dados de uma amostra de aço, escrevendo para 
ela o grau obtido */

/*public class AmostraDeAco {
    private int numero;
    private double conteudoCarbono;
    private int durezaRokwell;
    private int resistenciaTração;
    private int grau;

    public AmostraDeAco(int numero, double conteudoCarbono, int durezaRokwell, int resistenciaTração) {
        this.numero = numero;
        this.conteudoCarbono = conteudoCarbono;
        this.durezaRokwell = durezaRokwell;
        this.resistenciaTração = resistenciaTração;
        TesteDeAco teste = new TesteDeAco(this);
        this.grau = teste.realizarTestes();
    }

    public int getNumero() {
        return numero;
    }

    public double getConteudoCarbono() {
        return conteudoCarbono;
    }

    public int getDurezaRokwell() {
        return durezaRokwell;
    }

    public int getResistenciaTração() {
        return resistenciaTração;
    }

    public int getGrau() {
        return grau;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número da amostra: ");
        int numero = scanner.nextInt();

        System.out.print("Informe o conteúdo de carbono (%): ");
        double conteudoCarbono = scanner.nextDouble();

        System.out.print("Informe a dureza Rokwell: ");
        int durezaRokwell = scanner.nextInt();

        System.out.print("Informe a resistência à tração (psi): ");
        int resistenciaTração = scanner.nextInt();

        AmostraDeAco amostra = new AmostraDeAco(numero, conteudoCarbono, durezaRokwell, resistenciaTração);
        System.out.println("Grau da amostra: " + amostra.getGrau());

        scanner.close();
    }
}

class TesteDeAco {
    private AmostraDeAco amostra;

    public TesteDeAco(AmostraDeAco amostra) {
        this.amostra = amostra;
    }

    public int realizarTestes() {
        if (amostra.getConteudoCarbono() < 7.0 && amostra.getDurezaRokwell() > 50 && amostra.getResistenciaTração() > 80000) {
            return 10;
        } else if (amostra.getConteudoCarbono() < 7.0 && amostra.getDurezaRokwell() > 50) {
            return 9;
        } else if (amostra.getConteudoCarbono() < 7.0) {
            return 8;
        } else {
            return 7;
        }
    }
}*/



/*Programa 4: Escrever um programa que leia as medidas das arestas a, b e c de um 
paralelepípedo, calcule e escreva o valor de sua diagonal. L = Raiz(A*A + B*B)  
Diagonal = Raiz(L*L + C*C) */

/*public class Paralelepipedo {
    private double arestaA;
    private double arestaB;
    private double arestaC;
    
    public void setArestaA(double arestaA) {
        this.arestaA = arestaA;
    }
    
    public void setArestaB(double arestaB) {
        this.arestaB = arestaB;
    }
    
    public void setArestaC(double arestaC) {
        this.arestaC = arestaC;
    }
    
    public double calcularDiagonal() {
        double L = Math.sqrt(arestaA * arestaA + arestaB * arestaB);
        double diagonal = Math.sqrt(L * L + arestaC * arestaC);
        return diagonal;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a medida da aresta A: ");
        double arestaA = scanner.nextDouble();
        
        System.out.print("Digite a medida da aresta B: ");
        double arestaB = scanner.nextDouble();
        
        System.out.print("Digite a medida da aresta C: ");
        double arestaC = scanner.nextDouble();
        
        Paralelepipedo paralelepipedo = new Paralelepipedo();
        paralelepipedo.setArestaA(arestaA);
        paralelepipedo.setArestaB(arestaB);
        paralelepipedo.setArestaC(arestaC);
        
        double diagonal = paralelepipedo.calcularDiagonal();
        System.out.printf("A diagonal do paralelepípedo é: %.2f", diagonal);
    }
}*/



/*Programa 5: Um  determinado  material  radioativo  perde  metade  de  sua  massa  
a  cada  50  segundos.  Dada  a massa  inicial  em  gramas,  faça  um  programa  que
determine  o  tempo  necessário  para  que  essa massa se torne menor que 0,5 grama.
Escreva a massa inicial, a massa final e o tempo calculado em segundos. */

/*public class MaterialRadioativo {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Informe a massa inicial em gramas: ");
      double massaInicial = sc.nextDouble();
      double massaAtual = massaInicial;
      int segundos = 0;
      
      while (massaAtual >= 0.5) {
         massaAtual /= 2;
         segundos += 50;
      }
      
      System.out.println("Massa inicial: " + massaInicial + "g");
      System.out.println("Massa final: " + massaAtual + "g");
      System.out.println("Tempo necessário: " + segundos + " segundos");
   }
}*/



/*Programa 6: Escreva um programa que calcule a distância entre dois pontos de um plano
sendo fornecidas as coordenadas X1, X2, Y1 e Y2. Distância = Raiz ((X2 – X1) * 
(X2 – X1) + (Y2 – Y1) * (Y2 – Y1)) */

/*public class CalculadoraDistancia {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    
    public CalculadoraDistancia(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distancia;
    }
}

public class Main {
    public static void main(String[] args) {
        CalculadoraDistancia calculadora = new CalculadoraDistancia(1, 4, 2, 6);
        double distancia = calculadora.calcularDistancia();
        System.out.println("A distância entre os pontos é: " + distancia);
    }
}*/