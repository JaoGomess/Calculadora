package pack;

public class main {
	public static void main(String[] args) {
		System.out.println("Cheguei");
		
        soma cal = new soma();
        divisao div = new divisao();
        multiplicacao mult = new multiplicacao();
        subtracao sub = new subtracao();
        
	    /*
	        Cenário de Teste (SOMA)
	    */
	   
	    //Cenário de teste 1: Soma de dois valores       
	    float soma = cal.somar(3, 7);
	    System.out.println("[SOMA] Cenario de teste 1 " + soma);
	    //Cenário de teste 2: Soma de dois valores sendo um zero    
	    soma = cal.somar(3,0);
	    System.out.println("[SOMA] Cenario de teste 2  " + soma);
	    //Cenário de teste 3: Soma de dois valores sendo que ambos são zero
	    soma = cal.somar(0,0);
	    System.out.println("[SOMA] Cenario de teste 3  " + soma);
	    //Cenário de teste 4: Soma de dois valores sendo um negativo
	    soma = cal.somar(3, -1);
	    System.out.println("[SOMA] Cenario de teste 4  " + soma);
	    
	    /*
	        Cenário de Teste (SUBTRACAO)
	    */
	    
	    //Cenário de teste 1: subtração de dois valores
	    float subResult = sub.subtrair(2, 1);
	    System.out.println("[SUBTRACAO] Cenario de teste 1  " + subResult);
	    //Cenário de teste 2: subtração de dois valores sendo um zero  
	    subResult = sub.subtrair(1, 0);
	    System.out.println("[SUBTRACAO] Cenario de teste 2  " + subResult);
	    //Cenário de teste 3: subtração de dois valores sendo que ambos são zero  
	    subResult = sub.subtrair(0, 0);
	    System.out.println("[SUBTRACAO] Cenario de teste 3 " + subResult);
	    //Cenário de teste 4: subtração de dois valores sendo um negativo  
	    subResult = sub.subtrair(1, -1);
	    System.out.println("[SUBTRACAO] Cenario de teste 4 " + subResult);
	    
	    /*
	        Cenário de Teste (DIVISAO)
	    */
	    
	    // BUGs:
	    // 1 - Dividir algum número por 0. Caso isso ocorrá retornar uma mensagem que não é possível realizar essa operação.
	    // 2 - Dividir algum número e o resultado voltar com vírgula ou fraçao. Caso isso ocorrá tem que fazer a tratativa para a correção desse problema.
	    // 3 - Dividir zero por zero não é possível. Caso isso ocorrá retornar uma mensagem como "Resultado Indefinido".
	    // 4 - Dividir um número pelo dividendo e ele tendo vígula. Casso isso corrá retornar o resultado.
	    
	           
	    //Cenário de teste 1: divisão de dois valores
	    float divResult = div.dividir(3, 7);
	    System.out.println("[DIVISAO] Cenario de teste 1 " + divResult);
	    //Cenário de teste 2: divisão de dois valores sendo um zero
	    divResult = div.dividir(2, 0);
	    System.out.println("[DIVISAO] Cenario de teste 2 " + divResult);
	    //Cenário de teste 3: divisão de dois valores sendo que ambos são zero
	    divResult = div.dividir(0,0);
	    System.out.println("[DIVISAO] Cenario de teste 3 " + divResult);
	    //Cenário de teste 4: divisão de dois valores sendo um negativo
	    divResult = div.dividir(2, -2);
	    System.out.println("[DIVISAO] Cenario de teste 4 " + divResult);
	    //Cenário de teste 5: divisão de dois valores sendo um zero sendo o primeiro o zero.
	    divResult = div.dividir(0, 2);
	    System.out.println("[DIVISAO] Cenario de teste 5 " + divResult);
	    //Cenário de teste 6: divisão de dois valores negativos
	    divResult = div.dividir(-2, -2);
	    System.out.println("[DIVISAO] Cenario de teste 6 " + divResult);
	    //Cenário de teste 7: divisão de dois um sendo inteiro e outro com virgula
	    divResult = div.dividir(2, 3);
	    System.out.println("[DIVISAO] Cenario de teste 7 " + divResult);
	            
	    /*
	        Cenário de Teste (MULTIPLICACAO)
	    */
	    
	    //Cenário de teste 1: multiplicação de dois valores
	    float multResult = mult.multiplicar(2, 2);
	    System.out.println("[MULTIPLICACAO] Cenario de teste 1 " + multResult);
	    //Cenário de teste 2: multiplicação de dois valores sendo um zero
	    multResult = mult.multiplicar(2, 0);
	    System.out.println("[MULTIPLICACAO] Cenario de teste 2 " + multResult);
	    //Cenário de teste 3: multiplicação de dois valores sendo que ambos são zero
	    multResult = mult.multiplicar(0,0);
	    System.out.println("[MULTIPLICACAO] Cenario de teste 3 " + multResult);
	    //Cenário de teste 4: multiplicação de dois valores sendo um negativo
	    multResult = mult.multiplicar(-2, 2);
	    System.out.println("[MULTIPLICACAO] Cenario de teste 4 " + multResult);
	}
}
