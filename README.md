# Repositório do desafio de projeto sobre Git/Github da DIO

Github básico bootcamp DIO / Banco Pan.
 
Java Básico
*Nome da classe em camelCase
*Nome do arquivo deve ter o mesmo nome da classe.
*Toda variavel deve iniciar com letra minuscula, utilizando camelCase em palavras compostas.
*quando usamos 'final' em uma variavel e a mesma está escrita inteira em upercase / letra maiuscula, não se deve ter nenhum tipo de alteração.
*variavel não contem espaços, caracteres especiais e tb não deve iniciar com numeral.

-----------------------------------------------------------------

Variáveis e Métodos

Estrutura
Variavel: Tipo NomeBemDefinido = Atribuição;
Metodo:  TipoRetorno NomeObjetivoNoInfinitivo Parametro(s);

------------------------------------------------------------------

Identação
Escrever código de forma hierárquica, facilitando a visualiação e o entendimento do programa.

--------------------------------------------------------

Organização de arquivos.
Criação de pacotes / packages para organização de arquivos (código fonte) na estrutura do projeto.
Empresas contem seguitos: comercial: com, organizacional : org, opensource, aplicação: app, modelo: model, utilidades: util, serviços: service, educação: edu

Exemplo - com.nomeDaEmpresa.nomeDaAplicação 
          edu.leila.tema.controlefluxo

--------------------------------------------------------

A linguagem Java sugere, através de convenções, formas de escrita universal para classes, atributos, métodos e pacotes.

Variaveis: nomenclatura deve ser clara, sem abreviações ou definição sem sentido;
Variável é sempre chamda no cingular, exceto quando se referir a um array ou coleção;
Defina um idioma único.

Métodos: deverão ser nomeados como verbos, através de uma mistura de letras minusculas e maiusculas - camelCase (somar, abrirConexao, concluirProcessamento, findById).

---------------------------------------------------------------

TIPOS E VARIÁVEIS

Tipo de de dados são palavras reservadas para a construção de programas e seus tipos de dados são conhecidos como tipos primitimos. São eles: int, byte, short, long, double, boolean e char.

Variável é uma identificação de um espaço de memória utilizado pelo nosso programa. É composta por:
tipo de dados + identificação + valor atribuído
>>Java é fortemente tipado<<

Constantes: 
São valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada 'final', seguidao do tipo.
Por convernção, Constantes são sempre escritas em CAIXA ALTA. 

---------------------------------------

OPERADORES
Símbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações.
Operadores realizam operações com a finalidade de um determinado resultado.

Classificando os Operadores

Atribuição (=) Define valor inicial ou subscreve valor de uma variável.

Cada tipo de dado tem uma forma de declarar seus respectivo valor a essa variável:
Strinh nome = "Leila";
int idade = 37;
double peso = 53.7;
char sexo = 'F';
boolean doadorOrgao = true;
Data dataNscimento = new Date();

15/03
Unário: São aplicados juntamente com um outro operador artimético realizando alguns trabalhos básicos como incrementar, decrementar, inverter valores numériocos e booleanos.
(+) Operador unário de valor positivo - números são positivos sem esse operador explicitamente;
(-) Operador unário de valor negativo - nega um numero ou expressão aritmética;
(++) Operador unário de incremento de valor - incrementa o valor em 1 unidade;
(--) Operador unário de decremento de valor - decrementa o valor em 1 unidade;
(!) Operador uário lógico de negação - nega o valor de uma expressão booleana;

Ternário: Condição ternária é uma forma resumida para definir uma condição e escolher dentre dois valores. Deve-se pensar como se fosse uma condição IF normal, porém de uma forma em que toda a sua entrutura estará escrita numa única linha.
É representado pelos símbolos ?:
<Expressao Condicional> ? <Casocondição seja true> : <Caso condição seja false>


Relacionais: Avaliam a relação entre duas variáveias ou expressões. Neste caso, mais precisamente, definem se o operando À esquerda é igual, diferente, menor, menor ou igual, maior ou maior ou igual aos da diretia, retornando um valor booleano como resultado.

== Verificar se varivável é IGUAL a outra;
!= Verificar se variável é DIFERENTE da outra;
> Verificar se variável é MAIOR QUE a outra;
>= Verificar se variável é MAIOR OU IGUAL a outra;
< Verificar se variável é MENOR que outra;
<= Verificar se variável é MENOR OU IGUAL a outra. 

Os operadores relacionais são usados para verificarconteúdo numerico.
No Java, numeros e objetos são guardados em diferentes espaços de memória, então para comparação de objetos é utilizado a palavra reservada 'equals' para comparar conteúdos.