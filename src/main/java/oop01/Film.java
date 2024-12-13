package oop01;

public class Film {

    private Integer seriNo;
    private String filmAdı;
    private String tür;
    private Double süre;
    private String yönetmenAdı; //yönetmen isimli bir obje oluşturulacak,(pojo class),
    // burada kullandığımız repoyu orda da kullanalım ve databasee bağlayalım
    private String konu;
    private String yapımcı;

    public Film(Integer seriNo, String filmAdı, String tür, Double süre, String yönetmenAdı, String konu, String yapımcı) {
        this.seriNo = seriNo;
        this.filmAdı = filmAdı;
        this.tür = tür;
        this.süre = süre;
        this.yönetmenAdı = yönetmenAdı;
        this.konu = konu;
        this.yapımcı = yapımcı;
    }

    public Film() {
    }

    public Integer getSeriNo() {
        return seriNo;
    }

    public void setSeriNo(Integer seriNo) {
        this.seriNo = seriNo;
    }

    public String getFilmAdı() {
        return filmAdı;
    }

    public void setFilmAdı(String filmAdı) {
        this.filmAdı = filmAdı;
    }

    public String getTür() {
        return tür;
    }

    public void setTür(String tür) {
        this.tür = tür;
    }

    public Double getSüre() {
        return süre;
    }

    public void setSüre(Double süre) {
        this.süre = süre;
    }

    public String getYönetmenAdı() {
        return yönetmenAdı;
    }

    public void setYönetmenAdı(String yönetmenAdı) {
        this.yönetmenAdı = yönetmenAdı;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public String getYapımcı() {
        return yapımcı;
    }

    public void setYapımcı(String yapımcı) {
        this.yapımcı = yapımcı;
    }


}