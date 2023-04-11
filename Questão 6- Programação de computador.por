programa
{
	
	funcao inicio()
	{
	cadeia nomeDoProduto, produtoMaisCaro
	caracter resp
	inteiro valorDoProduto, valorNovo = 0
	escreva("Digite o nome do seu produto: \n")
	leia(nomeDoProduto)
  produtoMaisCaro = nomeDoProduto
	escreva("Digite o valor do seu produto: \n")
	leia(valorDoProduto)
	escreva("Você quer registrar um novo produto? 'S' para Sim e 'N' para Não \n")
	leia(resp)
	enquanto (resp=='S'){
	escreva("Digite o nome do seu produto: \n")
	leia(nomeDoProduto)
	escreva("Digite o valor do seu produto: \n")
	leia(valorNovo)
  se (valorNovo > valorDoProduto)
  {
    produtoMaisCaro = nomeDoProduto
  }
	escreva("Você quer registrar um novo produto? 'S' para Sim e 'N' para Não \n")
	leia(resp)
	}
  escreva("Produto mais caro: ", produtoMaisCaro)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 767; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */