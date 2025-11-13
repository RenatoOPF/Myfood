package br.ufal.ic.p2.myfood.models;

public class DonoDeEmpresa extends Usuario {
    private String cpf;

    public DonoDeEmpresa(int id, String nome, String email, String senha, String endereco, String cpf) {
        super(id, nome, email, senha, endereco);
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }
}
