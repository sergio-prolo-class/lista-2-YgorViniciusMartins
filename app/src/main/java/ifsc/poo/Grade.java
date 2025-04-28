package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {
    private int linhas;
    private int colunas;
    private int x_orig;
    private int y_orig;
    private final int tam_cel = 40;

    public Grade (int linhas, int colunas, int x_orig, int y_orig){
        if(!setLinhas(linhas) || !setColunas(colunas) || !setXOrig(x_orig) || !setYOrig(y_orig)){
            this.linhas = 10;
            this.colunas = 10;
            this.x_orig = 0;
            this.y_orig = 0;
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

    public boolean setXOrig(int x_orig){
        if(x_orig < 0){
            return false;
        }
        this.x_orig = x_orig;
        return true;
    }

    public boolean setYOrig(int y_orig){
        if(y_orig < 0){
            return false;
        }
        this.y_orig = y_orig;
        return true;
    }

    public int getLinhas(){
        return this.linhas;
    }

    public int getColunas(){
        return this.colunas;
    }

    public int getX_orig(){
        return this.x_orig;
    }

    public int getY_orig(){
        return this.y_orig;
    }

    public void desenhar(Draw draw){
        desenhaCoordenadas(draw);
        draw.setPenColor(Draw.BLACK);
        char letra = 'A';
        for (int i = 0; i <= this.getColunas(); i++) {
            draw.line(i * tam_cel + tam_cel + getX_orig(), tam_cel + getY_orig(), i* tam_cel + tam_cel + getX_orig(), (this.getLinhas() + 1) * tam_cel + getY_orig());
        }
        for (int i = 0; i <= this.getLinhas(); i++) {
            draw.line(tam_cel + getX_orig(), i * tam_cel + tam_cel + getY_orig(), (this.getColunas() + 1) * tam_cel + getX_orig(), i* tam_cel + tam_cel + getY_orig());
        }
    }

    private void desenhaCoordenadas(Draw draw){
        draw.setPenColor(Draw.BOOK_RED);
        char letra = 'A';
        for (int i = 0; i < this.getLinhas(); i++) {
            draw.text(20 + getX_orig(), (tam_cel * i) + tam_cel + 20 + getY_orig(), Character.toString(letra));
            letra++;
        }
        for (int i = 0; i < this.getColunas(); i++) {
            draw.text((tam_cel * i) + tam_cel + 20 + getX_orig(), 20 + getY_orig(), Integer.toString(i));
        }
    }

}
