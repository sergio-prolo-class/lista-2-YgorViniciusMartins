package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {
    private int linhas;
    private int colunas;
    private final int x = 40;
    private final int y = 40;
    private final int tam_cel = 40;

    public Grade (int linhas, int colunas){
        if(!setLinhas(linhas) || !setColunas(colunas)){
            this.linhas = 10;
            this.colunas = 10;
        }
    }

    private boolean setLinhas(int linhas){
        if(linhas < 0){
            return false;
        }
        this.linhas = linhas;
        return true;
    }

    private boolean setColunas (int colunas){
        if(colunas < 0){
            return false;
        }
        this.colunas = colunas;
        return true;
    }

    public int getLinhas(){
        return this.linhas;
    }

    public int getColunas(){
        return this.colunas;
    }

    public void desenhar(Draw draw){
        char letra = 'A';
        for (int i = 1; i < this.getLinhas(); i++) {
            draw.text(20, 46 * i, Character.toString(letra));
            for (int j = 1; j < this.getColunas(); j++) {
                draw.square(i * tam_cel + 40, j * tam_cel + 40, tam_cel);
            }
            letra++;
        }
    }

}
