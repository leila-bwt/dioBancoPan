
public class Comentarios {

    public static void main(String[] args) {
        // Olá, eu sou um comentário em uma unica linha

        /*
         * Olá
         * Eu sou um comentario
         * que posso ser mais detalhado
         * quando necessario
         */
    }

    /**
     * estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentario
     * a nivel de documentação.
     * Que incrivel !!!
     */

    public void metodo() {

    }

    /*
     * Este método foi elaborado as pressas
     * por isso eu abreviei o nome das variaveis
     * mas olha, ele tem a finalidade somar ou multiplicar
     * dois numeros
     */
    public int somaMultiplica(int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        if (m == "M") { // M= multiplicação
            r = n * x;
        } else {
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }

}
