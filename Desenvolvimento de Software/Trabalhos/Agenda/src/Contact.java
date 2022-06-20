
import java.util.Date;
import java.util.HashMap;

public class Contact extends Address{
    
    // Definição das variáveis.
    String nm; // Nome
    String rg; // RG
    Date doB; // Data de Nascimento 
    HashMap<String, String> email; 
    HashMap<String, String> phNo; // Número de Telefone
    HashMap<String, Address> addr; // Endereço
    
    public Contact(String log, int num, String cmp, String brr, String cep, String cdd, String nm, String rg, Date doB, HashMap<String, String> email, HashMap<String, String> phNo, HashMap<String, Address> addr) {
        super(log, num, cmp, brr, cep, cdd);
        this.nm = nm;
        this.rg = rg;
        this.doB = doB;
        this.email = email;
        this.phNo = phNo;
        this.addr = addr;
    }

    // Getters e Setters Geral
    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDoB() {
        return doB;
    }

    public void setDoB(Date doB) {
        this.doB = doB;
    }

    public HashMap<String, String> getEmail() {
        return email;
    }

    public void setEmail(HashMap<String, String> email) {
        this.email = email;
    }

    public HashMap<String, String> getPhNo() {
        return phNo;
    }

    public void setPhNo(HashMap<String, String> phNo) {
        this.phNo = phNo;
    }

    public HashMap<String, Address> getAddr() {
        return addr;
    }

    public void setAddr(HashMap<String, Address> addr) {
        this.addr = addr;
    }
}
