package escola.dominio.aluno;

public interface CriptografiaSenha {


    String criptSenha (String senha);

    boolean validarSenha (String senhaCript, String senha);

}
