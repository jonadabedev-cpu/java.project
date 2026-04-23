package santader.aplicacao.domain.model;

import java.math.BigDecimal;

public class Card {
    
    private Long id;
    private String number;
    private BigDecimal limet;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public BigDecimal getLimet() {
        return limet;
    }
    public void setLimet(BigDecimal limet) {
        this.limet = limet;
    }
    
}
