package project;

public class Cezara {
    private String text;
    private int a, b;

    public Cezara(String text, int a, int b){
        this.text = text;
        this.a = a;
        this.b = b;
    }

    public String encrypt(){
        return "Cezara code";
    }

    public String decrypt(){
        return "Cezara decode";
    }
}
