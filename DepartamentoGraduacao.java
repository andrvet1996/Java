package Conjuntos;

public class DepartamentoGraduacao {
    private int cadastro;//RA
    private String nome;//aluno

    public DepartamentoGraduacao(int cadastro, String nome) {
        this.cadastro = cadastro;
        this.nome = nome;
    }

    public int getCadastro() {
        return cadastro;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "cadastro=" + cadastro + ", nome=" + nome + '}';
    }

    @Override// aqui é um comando que garante que não imprima dois alunos com o mesmo RA
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.cadastro;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DepartamentoGraduacao other = (DepartamentoGraduacao) obj;
        if (this.cadastro != other.cadastro) {
            return false;
        }
        return true;
    }
}
