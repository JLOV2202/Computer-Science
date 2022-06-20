public class Address {
    
    // Em português, porque ingles só complicou.
    String log; // Logradouro
    int num; // Número
    String cmp; // Complemento
    String brr; // Bairro
    String cep; // CEP
    String cdd; // Cidade
    
    protected Address(String log, int num, String cmp, String brr, String cep, String cdd) {
        this.log = log;
        this.num = num;
        this.cmp = cmp;
        this.brr = brr;
        this.cep = cep;
        this.cdd = cdd;
    }

    // Getters e Setters Geral
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }

    public String getBrr() {
        return brr;
    }

    public void setBrr(String brr) {
        this.brr = brr;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCdd() {
        return cdd;
    }

    public void setCdd(String cdd) {
        this.cdd = cdd;
    }
}
