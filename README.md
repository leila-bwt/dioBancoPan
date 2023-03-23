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

------------------------------------------------------------------

MÉTODOS
Uma classe é definida por atributos e métodos. Métodos correspondem a funções ou sub-rotinas disponíveis dentro de nossa classe.

Critérios de nomeação: não são obrigatórios porém ao tulitizarmos, tornamos o código mais legivel para nós e tb para outros devs.
**Deve ser nomeado como verbo
**Seguir padrão camelCase.

ATENÇÃO!!! Não existe em Java o conceito de métodos globais. Todos os métodos devem SEMPRE  ser definidos dentro de uma classe.

Critérios de Deginição de Métodos
Qual a proposta principal do método? Se perguntar constantemente até compreender a real finalidade do mesmo.

Qual o tiupo de retorno esperado após a execução do método? Analisar se o método será responsável por retornar algum valor ou não.

Qual a visibilidade do método? O método deve ser visívek a toda a aplicação, somente em mesmo pacotes, através de herança ou somente a nível da própria classe.

VEJA OS EXEMPLOS A SEGUIR:

  somar(int n1, int n2){}

    abrirConexao(){}

    fingById(int id){}

    calcularImprimir(){} // o método deve ter apenas uma função.

    public double somar(int num1, int num2){
        //LOGICA - FINALIDADE DO METODOS
        return ...;
    }    

    public void imprimir(String texto){
        //NÃO PRECISA DO RETURN POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    
        public double dividir(int dividendo, int divisor) thows Exception{}
        //throws Exception: indica que o método ao ser utilizado poderá gerar uma exceção.

        public void metodoPrivado(){}
        //método não pode ser visto por outras classes no projeto
    
        public void validar(){}
        //este metodo deveria retornar algum valor
        //no caso boolean(true or false)

        public void gravarCliente(String nome, String CPF, Integer )
        //este metodo tem a finalidade de gravar
        //informações de um cliente, por que não criar um objeto cliente e passar como parametro?
    
        public void gravarCliente(Cliente cliente){}
        //ou
        public void gravar(Cliente cliente){}
    }
}
 ---------------------------------------------------------------

        ESCOPO
        Ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.

        A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução ao qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.

        Em uma Classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da Classe, sendo portanto acessíveis port todos os métodos.

        Caso você declare uma variável DENTRO DE UM MÉTODO, o esocpo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.

        Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização do código em questão. Sem um dominio sobre escopo de códigos seu projeto tende a conter falhas estruturais e comprometer a proposta principal da aplicação.

----------------------------------------------------------------

        PALAVRAS RESERVADAS: são identificadores de uma linguagem que já possuem uma finalidade especificas, portanto não podem ser utilizadas para nomear variáveis, metodos ou atributos.

        A lingiagem Java possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos e escritras com letra minuscula, sendo identificadas com uma cor especial pela maioria das IDE's. 

        Controle de pacotes:
        * import: importa pacotes ou classes para dentro do código

        * package: especifica a que pacote todas as classes de um arquivo pertencem 


        Modificadores de acesso:
        * public: acesso de qualquer classe

        * private: acesso apenas dentro da classe

        * protected: acesso por classes no mesmo pacote e subclasses


        Primitivos:
        * boolean: um valor indicado verdadeiro ou falso

        * byte: um inteiro de 8 bits (signed)

        * char: um caracter unicode (16-bit unsigned)

        * double: um numero de ponto flutuante de 64 bits (signed)

        * float: um numero de ponto flutuante de 32 bits (signed)

        * int: um inteiro de 32 bits (signed)

        * long: um inteiro de de 64 bits (signed)

        * short: um inteiro de 32 bits (signed)

        * void:  indica que o método não tem retorno de valor


        Modificadores de classes, variáveis ou métodos
        * abstract: classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata

        * class: especifica uma classe

        * extends: indica a superclasse que a bisclasse está estendendo

        * final: impossibilita que uma classe seja estendida, que um método seja subrescrito ou que uma variável seja reinicializada

        * implements: indica as interfaces que uma classe irá implementar

        * interface: especifica uma interface

        * native: indica que um método está escrito em uma linguagem dependenete de plataforma, como o C

        * new: instancia um novo objeto, chamando seu construtor

        * static: faz um método ou variável pertencer à classe ao invés de às instancias

        * strictfp: usado em frente a um método ou clase para indicar que os numeros de ponto flutuante seguirão as regras de ponto flutuante em todas as expressoes

        * sunchronized: indica que um método só pode ser acessado por uma thread de cada vez

        * transient: impede a serialização de campos

        * volatile: indica que uma variável pode ser alterada durante o uso de threads


        Controle de fluxo dentro de um bloco de código
        * brek: sai do bloco de codigo em que ele está

        * case: executa um bloco de código dependendo do teste do switch

        * continue: pula a execução do código que viria após essa linha e vai para a próxima passagem do loop


        Tratamento de erros
        * assert: testa uma expressão condicional para verificar uma suposição do programador

        * catch: declara o bloco de código usado para tratar uma exceção

        * finally: bloco de código, após um try-catch, que é executado independete do fluxo de programa seguido ao lidar com uma exceção

        * throw: usado para passar uma exceção para o método que o chamou

        * throws: indica que um étodo pode passar uma exceção para o método que o chamou

        * try: bloco de código que tentará ser executado, mas que pode causar uma exceção.


        Variáveis de referências:
        * super: refere-se a superclasse imediata

        *this: refere-se a instância atual do objeto


        De acordo com o Java anguage Specification, null, true e false são tecnicamente chamados de valores literias, e não keywords. Se você tentar criar algum identificador com estes valores, você também terá um erro de compilação.


        Uso correspondente:
        >> Arquivo: package, import, static

        >> Classe: public OU protected OU private + final OU abstract + extends OU implements

        >> Métodos: public OU protected OU private + static OU final OU abstract + void e return

        >> Atributo: public OU protected OU private + static OU final + tipo primitivo


        Palavras "opostas"
        Assim como nas classificações gramaticais da língua portuguesa, eistem algumas palabras que são completamente opostas (antônimas) na lingua Java:

        PACKAGE define o pacote da classe atual enquanto IMPORT são as classes dependeNtes que não estão no mesmo pacote que precisa ser importando

        Tem finalidade de usar a herança EXTENDS determina uma classe ou interface OU uma classe pode usar o IMPLEMENTS para implementaR outra INTERFACE
        

        FINAL determina a ultima lógica da aplicação  ou ultimo valor da variável. Para métodos determinanos ABSTRACT
        
        
        THROWS dispara uma exceção determina o método que pode gerar uma exceção já o THROW é a geração de uma exceção, disparta nova exceção na aplicação.

        --------------------------------------------------------

        DOCUMENTAÇÃO
        Uma das principais caracteristicas da linguagem Java é uma documentação rica e detaçhada dos recursos da linguagem. 

        Tags: java Documentation é composto por tags que representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos.
        @autor - Autor / Criador

        @version - Versão do recurso disponibilizado

        @since - Versão / Data de início da disponibilidade do recurso

        @param - Descrição dos parâmetros dos métodos criados

        @return - Definição do tipo de retorno de um método

        @throws - Se o método lança alguma exceção

        
        Javadoc é um gerador de documentação para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituido, basicamente, por algumas marcações muito cimples inseridas nos comentatios do programa.
        
        Este sistema é padrão de documentação de classes em Java, e muitas dos IDEs desta linguagem irão automaticamente gerar um Javadoc em HTML 

        No terminal execute o comando:
        javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*java
        







