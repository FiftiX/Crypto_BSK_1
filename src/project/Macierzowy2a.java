package project;

public class Macierzowy2a {
    private String text;

    public Macierzowy2a(String text)
    {
        this.text = text;
    }

    public String encrypt() {
        char[] tab = text.toCharArray();
        String result = "";
        int param = tab.length;

        for (int i=0;i<param;i++){
            for(int j=0;j<5;j++){
                if (j == 0 && 5*i + 2 < param) {
                    result += tab[5*i + 2];
                }
                if (j == 1 && 5*i + 3 < param) {
                    result += tab[5*i + 3];
                }
                if (j == 2 && 5*i < param) {
                    result += tab[5*i];
                }
                if (j == 3 && 5*i + 4 < param) {
                    result += tab[5*i + 4];
                }
                if (j == 4 && 5*i + 1 < param) {
                    result += tab[5*i + 1];
                }
            }
        }
        return result;
    }

    public String decrypt(){
        char[] tab = text.toCharArray();
        String result = "";
        int param = tab.length;

        for (int i=0;i<param;i++){
            for(int j=0;j<5;j++){
                if (j == 0 && 5*i + 2 < param) {
                    result += tab[5*i + 2];
                }
                if (j == 1 && 5*i + 4 < param) {
                    result += tab[5*i + 4];
                }
                if (j == 2 && 5*i < param) {
                    result += tab[5*i];
                }
                if (j == 3 && 5*i + 1 < param) {
                    result += tab[5*i + 1];
                }
                if (j == 4 && 5*i + 3 < param) {
                    result += tab[5*i + 3];
                }
            }
        }
        return result;
    }
}
