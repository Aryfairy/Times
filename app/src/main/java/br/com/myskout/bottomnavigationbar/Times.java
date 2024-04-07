package br.com.myskout.bottomnavigationbar;

public class Times {

    private String nome;
    private int image;
    private int titulos;

    public Times(String nome, int image, int titulos) {
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
    public int getTitulos(){return titulos;}
    public void setTitulos(int titulos){
        this.titulos = titulos;
    }
}
