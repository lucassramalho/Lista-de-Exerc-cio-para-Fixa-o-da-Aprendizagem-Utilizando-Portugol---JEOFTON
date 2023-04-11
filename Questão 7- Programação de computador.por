programa{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	real raiz, valor, contadora=0, multiplicacao
	caracter operacao
	escreva("Digite um valor de 1 a 10: \n")
	leia(valor)
	escreva("Escolha a operação que você quer realizar: \n")
	escreva("1. Tabuada \n")
	escreva("2. Potenciação \n")
	escreva("3. Radiciação \n")	
	leia (operacao)

	escolha (operacao){
	caso '1':
	faca {multiplicacao=(valor*contadora)
	escreva(valor,"*",contadora,"=",multiplicacao,"\n")
	contadora++}
	enquanto (contadora<=10)
	pare
	caso '2':
	escreva(valor, "² = " ,(valor*valor))
	pare
	caso '3':
	raiz = mat.raiz(valor,2.0)
	escreva("O resultado da raiz quadrada de ", valor, " é: ",raiz)
	  }
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 581; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */