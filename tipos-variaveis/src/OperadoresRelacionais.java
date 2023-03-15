public class OperadoresRelacionais {

    public static void main(String[] args){
         String nomeUm = "LEILA";
         String nomeDois = "LEILA";

         System.out.println(nomeUm == nomeDois);
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 > numero2){
            System.out.println("Essa condição é verdadeira");
        } else {
            System.out.println("Essa condição é falsa");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);
   
        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);   
       
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);   
    
    
    }
}
