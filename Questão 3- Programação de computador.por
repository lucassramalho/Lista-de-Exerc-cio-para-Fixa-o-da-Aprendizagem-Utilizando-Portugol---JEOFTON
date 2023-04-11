programa
{
	
	funcao inicio()
	{
		real l1, l2, area
		escreva("Digite o valor de um lado do seu sólido: \n")
		leia (l1)
		escreva("Digite o valor de outro lado do seu sólido: \n")
		leia (l2)
		area= l1*l2
		escreva("A aréa do seu sólido é: \n",area, "\n")
		se (l1==l2)
		escreva("Seu sólido geométrico é um quadrado \n")
		senao
		escreva("Seu sólido geométrico é um retângulo \n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */