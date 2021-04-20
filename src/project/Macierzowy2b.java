package project;

public class Macierzowy2b {
    private String text, key;

    public Macierzowy2b(String text, String key){
        this.text = text;
        this.key = key;
    }

    public String encrypt(){
        char[] tab = text.toCharArray();
        char[] ktab = key.toCharArray();
        int[] ltab = new int[ktab.length];
        int[] stab = new int[ktab.length];
        String result = "";
        int pom=0;

        for(int i=48;i<123;i++){
            for(int j=0;j<ktab.length;j++){
                if(ktab[j]==i)
                    ltab[j]=pom++;
            }
        }

        for(int i=0;i<ltab.length;i++){
            for(int j=0;j<ltab.length;j++){
                if(ltab[j]==i){
                    stab[i]=j;
                }
            }
        }

        for(int i=0;i<stab.length;i++){
            for(int j=0;j<stab.length;j++){
                if(((stab.length*j)+stab[i])<tab.length)
                    result += tab[(stab.length*j)+stab[i]];
            }
        }
        return result;
    }

    public String decrypt(){
        char[] tab = text.toCharArray();
        char[] ktab = key.toCharArray();
        int[] ltab = new int[ktab.length];
        int[] stab = new int[ktab.length];
        int pom=0;

        for(int i=48;i<123;i++){
            for(int j=0;j<ktab.length;j++){
                if(ktab[j]==i)
                    ltab[j]=pom++;
            }
        }

        for(int i=0;i<ltab.length;i++){
            for(int j=0;j<ltab.length;j++){
                if(ltab[j]==i){
                    stab[i]=j;
                }
            }
        }

        char[] tab2 = new char[tab.length];
        int val = tab.length / stab.length;
        int num = tab.length % stab.length;
        int numadd = 0;
        int pom2;

        for(int i=0;i<stab.length;i++){
            pom2 = val;
            if(num>0){
                pom2++;
            }
            for(int j=0;j<pom2;j++){
                tab2[stab.length*j+stab[i]]=tab[i*val+j+numadd];
            }
            if(num>0){
                numadd++;
                num--;
            }
        }
        return String.valueOf(tab2);
    }
}
