package br.ufms.maratona;

/**
 *
 * @author rafaelgov
 */
public class Main {

    /**
     *
     * Métado principal por onde o programa é inicializado.
     *
     * @param args parâmetros de entrada.
     */
    public static void main(String[] args) {
//      new ConcursoContos().executar();
        ExercicioMaratona exercicio = new JogosLeonardo();
        exercicio.executar();
    }

}
