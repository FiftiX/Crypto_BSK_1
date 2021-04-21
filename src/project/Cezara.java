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
        char[] tab = text.toCharArray();
        int[] pomtab = new int[tab.length];
        String result = "";

        for(int i=0;i<tab.length;i++){
            pomtab[i] = ((((tab[i]-65)*a)+b) % 26)+65;
        }
        for(int v : pomtab){
            result += (char)v;
        }
        return result;
    }

    public String decrypt(){
        char[] tab = text.toCharArray();
        double[] pomtab = new double[tab.length];
        String result = "";

        for(int i=0;i<tab.length;i++){
           pomtab[i] = ((((tab[i]-65)+(26-b))*Math.pow(a,11)) % 26)+65;
        }
        for(double v : pomtab){
            result += (char)v;
        }
        return result;
    }
}
