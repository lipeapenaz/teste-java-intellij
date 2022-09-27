package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a= 5;
        int b= 3;
        System.out.println("Hello World! " + (a+b));*/

        Gato gato = new Gato();
        System.out.println(gato);
        int numPaginas;
        Livro livro1 = new Livro();
        System.out.println(livro1);
    }
}

class Livro {
    private String none;
    private Integer numPaginas;

    public Livro(String none, Integer numPaginas) {
        this.none = none;
        this.numPaginas = numPaginas;
    }

    public Livro(int i) {
    }

    public Livro() {

    }

    public String getNone() {
        return none;
    }

    public void setNone(String none) {
        this.none = none;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "none='" + none + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}