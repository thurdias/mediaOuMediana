# Media ou Mediana
##Olímpiada Brasileira de Informática - 2021 - Fase 2 - Java - Media ou Mediana 
																				
##Principais pontos a serem levado em consideração:

###Método principal de execução com o bufferedreader/inputstreamreader
###Foi utilizado o bufferedreader por conta dele ser mais rápido, pois ele simplesmente lê a sequência de caracteres, enquanto o scanner faz a análise dos dados de entrada 
###IOException é utilizado para evitar erros no sistema de leitura                                                                                                        ###Integer.parseInt é utilizado para converter uma string em um int
###A mediana sempre será determinada pelo menor número (A/B) para atender o menor inteiro possível para C

##Explicação matemática: 
###((a+b+c)/3)=a) {caso A seja menor que b}
###Igualando os dois lados da equação fica (a=(1/2)*b+(1/2)*c)
###Como queremos descobrir a variável c, e não podemos declarar meia variavel como na expressão anterior
###Multiplicamos a igualdade por 2 e isolamos o c, ficando (c=(2*a)-b)

