package project;

public class Macierzowy2c {
    private String text, key;

    public Macierzowy2c(String text, String key){
        this.text = text;
        this.key = key;
    }

    public String encrypt() {
        char[] tab = text.toCharArray();
        char[] ktab = key.toCharArray();
        int[] ltab = new int[ktab.length];
        int[] stab = new int[ktab.length];
        String result = "";
        int pom = 0;

        for (int i = 48; i < 123; i++) {
            for (int j = 0; j < ktab.length; j++) {
                if (ktab[j] == i)
                    ltab[j] = pom++;
            }
        }

        for (int i = 0; i < ltab.length; i++) {
            for (int j = 0; j < ltab.length; j++) {
                if (ltab[j] == i) {
                    stab[i] = j;
                }
            }
        }

        for (int i = 0; i < ktab.length; i++) {
            int v = 0;
            for (int j = 0; j < tab.length; j++) {
                if (v < tab.length) {
                    if (stab[i] <= stab[j] && (v+stab[i]< tab.length)) {
                        result += tab[v + stab[i]];
                    }
                    v += stab[j] + 1;
                } else {
                    break;
                }
            }
        }
        return result;
    }

    public String decrypt(){
        char[] tab = text.toCharArray();
        char[] ktab = key.toCharArray();
        int[] ltab = new int[ktab.length];
        int[] stab = new int[ktab.length];
        int pom = 0;

        for (int i = 48; i < 123; i++) {
            for (int j = 0; j < ktab.length; j++) {
                if (ktab[j] == i)
                    ltab[j] = pom++;
            }
        }

        for (int i = 0; i < ltab.length; i++) {
            for (int j = 0; j < ltab.length; j++) {
                if (ltab[j] == i) {
                    stab[i] = j;
                }
            }
        }

        char[] tab2 = new char[tab.length];
        int num = 0;

        for (int i = 0; i < ktab.length; i++) {
            int v = 0;
            for (int j = 0; j < tab.length; j++) {
                if (v < tab.length) {
                    if (stab[i] <= stab[j] && (v+stab[i]< tab.length)) {
                        tab2[v + stab[i]] = tab[num++];
                    }
                    v += stab[j] + 1;
                } else {
                    break;
                }
            }
        }
        return String.valueOf(tab2);
    }
}
