package project;

public class RailFence {
    private int n;
    private String text;

    public RailFence(String text, int n){
        this.text = text;
        this.n = n;
    }

    public String encrypt(){
        char[] tab = text.toCharArray();
        char[][] tab2 = new char[tab.length][tab.length];
        String result = "";
        int j=0;
        boolean pom=false;

        for(int i=0;i<tab.length;i++){
            tab2[j][i] = tab[i];
            if(j==n-1){
                pom=true;
            }
            else if(j==0)
                pom=false;

            j = pom == false ? j+1 : j-1;
        }

        for(int i=0;i<n;i++){
            for(j=0;j<tab.length;j++){
                if(tab2[i][j]!=' ')
                    result +=tab2[i][j];
            }
        }
        return result;
    }

    public String decrypt(){
        char[] tab = text.toCharArray();
        char[][] tab2 = new char[tab.length][tab.length];
        String result = "";
        int j=0;
        boolean pom=false;

        for(int i=0;i<tab.length;i++){
            tab2[j][i] = '0';
            if(j==n-1)
                pom=true;

            else if(j==0)
                pom=false;

            j = pom == false ? j+1 : j-1;

        }
        int temp =0;
        for(int i=0;i<n;i++){
            for(j=0;j<tab.length;j++){
                if(tab2[i][j]=='0')
                    tab2[i][j]= tab[temp++];
            }
        }
        pom=false;
        j=0;

        for(int i=0;i<tab.length;i++){
            result += tab2[j][i];
            if(j==n-1)
                pom=true;

            else if(j==0)
                pom=false;

            j = pom == false ? j+1 : j-1;
        }

        return result;
    }
}
