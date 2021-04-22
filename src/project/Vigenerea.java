package project;

public class Vigenerea {
    private String text, key;

    public Vigenerea(String text, String key){
        this.text = text;
        this.key = key;
    }

    public String encrypt(){
        char[] tab = text.toCharArray();
        char[] ktab = key.toCharArray();
        char[] ltab = new char[tab.length];
        String result = "";
        int j=0;

        for(int i=0;i<tab.length;i++){
            ltab[i]=ktab[j];
            j = j == ktab.length-1 ? 0 : j+1;
        }

        for(int i=0;i<tab.length;i++){
            int pom = tab[i] + ltab[i];
            if(pom<=155){
                pom -= 65;
                result += (char)pom;
            }
            else{
                pom -= 91;
                result += (char)pom;
            }
        }
        return result;
    }

    public String decrypt(){
        char[] tab = text.toCharArray();
        char[] ktab = key.toCharArray();
        char[] ltab = new char[tab.length];
        String result = "";
        int j=0;

        for(int i=0;i<tab.length;i++){
            ltab[i]=ktab[j];
            j = j == ktab.length-1 ? 0 : j+1;
        }

        for(int i=0;i<tab.length;i++){
            int pom = ltab[i] - tab[i];
            if(pom<=0){
                pom *= (-1);
                pom += 65;
                result += (char)pom;
            }
            else{
                pom = 91 - pom;
                result += (char)pom;
            }
        }
        return result;
    }
}
