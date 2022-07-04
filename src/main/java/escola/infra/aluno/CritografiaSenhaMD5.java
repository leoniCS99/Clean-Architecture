package escola.infra.aluno;

import escola.dominio.aluno.CriptografiaSenha;

public class CritografiaSenhaMD5 implements CriptografiaSenha {

    @Override
    public String criptSenha(String senha) {
        return null;
    }

    @Override
    public boolean validarSenha(String senhaCript, String senha) {
        return false;
    }
}
