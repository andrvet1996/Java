//set é uma noçaode conjunto
package Conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<DepartamentoGraduacao>discentes = new LinkedHashSet<>();//imprimi os elementos da ordem de inserçao
        //alunos = new HashSet<>();
        //HashSet não garante a ordem de inserção
        //colocar elementos no conjunto
        discentes.add(new DepartamentoGraduacao(1, "Luizao"));
        discentes.add(new DepartamentoGraduacao(2, "Douglas"));
        discentes.add(new DepartamentoGraduacao(3, "Dabio"));
        discentes.add(new DepartamentoGraduacao(4, "Fernando"));
        discentes.add(new DepartamentoGraduacao(5, "Fernando"));
        discentes.add(new DepartamentoGraduacao(2, "Fernando"));//não aceita, pois conflita o cadastro
        System.out.println(discentes); 
        System.out.println(discentes.size());         
    }   
}
