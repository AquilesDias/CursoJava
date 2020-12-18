package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumForaIntervaloException extends RuntimeException {

    private String nomeAtributo;

    public NumForaIntervaloException(String nomeAtributo) {
	this.nomeAtributo = nomeAtributo;
    }

    public String getMessage() {
	return String.format("ERRO: O atributo '%s' está fora do intervalo", nomeAtributo);

    }
}
