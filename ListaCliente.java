public class ListaCliente {

Integer id;

String nr_telefone;
String nm_cliente;
String nm_email;
String nr_cep;
String nm_endereco;
String nm_bairro;
String nm_complemento;
String nm_cidade;


    public ListaCliente(Integer id,String nr_telefone, String nm_cliente, String nm_email, String nr_cep, String nm_endereco, String nm_bairro, String nm_complemento, String nm_cidade) {
        this.id = id;
        this.nr_telefone = nr_telefone;
        this.nm_cliente = nm_cliente;
        this.nm_email = nm_email;
        this.nr_cep = nr_cep;
        this.nm_endereco = nm_endereco;
        this.nm_bairro = nm_bairro;
        this.nm_complemento = nm_complemento;
        this.nm_cidade = nm_cidade;
    }

    public String getNr_telefone() {
        return nr_telefone;
    }

    public void setNr_telefone(String nr_telefone) {
        this.nr_telefone = nr_telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNm_cliente() {
        return nm_cliente;
    }

    public void setNm_cliente(String nm_cliente) {
        this.nm_cliente = nm_cliente;
    }

    public String getNm_email() {
        return nm_email;
    }

    public void setNm_email(String nm_email) {
        this.nm_email = nm_email;
    }

    public String getNr_cep() {
        return nr_cep;
    }

    public void setNr_cep(String nr_cep) {
        this.nr_cep = nr_cep;
    }

    public String getNm_endereco() {
        return nm_endereco;
    }

    public void setNm_endereco(String nm_endereco) {
        this.nm_endereco = nm_endereco;
    }

    public String getNm_bairro() {
        return nm_bairro;
    }

    public void setNm_bairro(String nm_bairro) {
        this.nm_bairro = nm_bairro;
    }

    public String getNm_complemento() {
        return nm_complemento;
    }

    public void setNm_complemento(String nm_complemento) {
        this.nm_complemento = nm_complemento;
    }

    public String getNm_cidade() {
        return nm_cidade;
    }

    public void setNm_cidade(String nm_cidade) {
        this.nm_cidade = nm_cidade;
    }

}
