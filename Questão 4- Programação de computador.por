programa
{
	
	funcao inicio()
	{
	real m1
	inteiro n1,m2
	caracter a
	
	
     escreva ("Digite o valor da sua moeda:\n")
     leia (m1)
     escreva ("Escolha qual Moeda você quer.\n")
     escreva("01.Dolar\n")
     escreva("02.Euro\n")
     escreva("03.Real\n")
     leia (n1)

     escolha (n1)
	{
     caso 1:
     escreva ("Voce escolheu Dolar Americano!\n")
     escreva ("Qual moeda você deseja converter? \n")
     escreva("a.Euro\n")
     escreva("b.Real\n")
     leia(a)

     
      escolha(a)	
      {
      caso 'a':
       m2=m1*0.92
      escreva ("O valor em Euro é :",m2)
      pare
      
      caso 'b':
      m2=m1*5.07
      escreva ("O valor em Real é: ",m2)
      pare
      
      }
      pare

     caso 2:
     escreva ("Você escolheu o Euro.\n")
     escreva ("Qual moeda você quer converter?\n")
     escreva("a.Dolar\n")
     escreva("b.Real\n")
     leia(a)

     
      escolha(a)	
      {
      caso 'a':
       m2=m1*1.09
      escreva ("O valor em Dolar é: ",m2)
      pare
      
      caso 'b':
      m2=m1*5.54
      escreva ("O valor em Real é: ",m2)
      pare
      }
      pare

      caso 3:
     escreva ("Voce escolheu o Real.\n")
     escreva ("Qual moeda voce quer converter?\n")
     escreva("a.Dolar\n")
     escreva("b.Euro\n")
     leia(a)

     
      escolha(a)	
      {
      caso 'a':
       m2=m1*0.20
      escreva ("O valor em Dolar é :",m2)
      pare
      
      caso 'b':
      m2=m1*0.18
      escreva ("O valor em Euro é:",m2)
      pare
      }
      pare
      caso contrario:
   	escreva ("Erro")

	}
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */