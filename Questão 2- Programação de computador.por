programa
{
	
	funcao inicio(){
     real n1, n2, soma, sub, mult, div
     inteiro n7
     escreva("Digite um número: \n")
     leia(n1)
     escreva("Digite outro número: \n")
     leia(n2) 
     escreva("Escolha a operação que você quer fazer \n")
     escreva("1. SOMA \n")
     escreva("2. SUBTRAÇÃO \n")
     escreva("3. MULTIPLICAÇÃO \n")
     escreva("4. DIVISÃO \n")
     escreva("Escolha 1,2,3 OU 4 para as respectivas operações básicas: \n")
     leia (n7)

     escolha (n7)
     {
     caso 1: 
     soma = n1+n2
     escreva("O resultado da soma entre esses números é: \n",soma, "\n")	
     pare
     
     caso 2:
     sub = n1-n2
     escreva("O resultado da subtração entre esses números é: \n",sub, "\n")
     pare
     
     caso 3:
     mult = n1*n2
     escreva("O resultado da multiplicação entre esses números é: \n",mult, "\n")
     pare
     
     caso 4: 
     div = n1/n2
     se (n2 > 0)
     escreva("O resultado da divisão entre esses números é: \n",div, "\n")
     senao 
     escreva("Não tem como dividir o número por 0")
     
     pare
     }
     
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */