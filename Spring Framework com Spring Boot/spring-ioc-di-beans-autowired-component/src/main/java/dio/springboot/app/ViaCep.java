package dio.springboot.app;

public class ViaCep {
    private String cep;
    private String logradouro;
    private String localidade;

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "{" +
            " cep='" + getCep() + "'" +
            ", logradouro='" + getLogradouro() + "'" +
            ", localidade='" + getLocalidade() + "'" +
            "}";
    }

}
