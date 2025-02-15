package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {

    private String nomeAtributo;

    public StringVaziaException(String nomeAtributo) {
	this.nomeAtributo = nomeAtributo;
    }

    public String getMessage() {
	return String.format("ERRO: O atributo '%s' está vazia", nomeAtributo);

    }
}
