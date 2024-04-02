package br.com.myskout.bottomnavigationbar;

public class Times {

    private String nome;
    private int image;
    private String titulos;

    public Times(String nome, int image, String titulos) {
        this.nome = nome;
        this.image = image;
        this.titulos = titulos;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public int getImage(){
        return image;
    }

    public void setImage(int image){
        this.image = image;
    }
    public String getTitulos(){
        return titulos;
    }

    public void setTitulos(String titulos){
        this.titulos = titulos;
    }
}
