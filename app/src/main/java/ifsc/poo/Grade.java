package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {
    private int linhas;
    private int colunas;
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
        for (int i = 0; i <= this.getColunas(); i++) {
            draw.line(i * tam_cel + tam_cel, tam_cel, i* tam_cel + tam_cel, (this.getLinhas() + 1) * tam_cel);
        }
        for (int i = 0; i <= this.getLinhas(); i++) {
            draw.line(tam_cel, i * tam_cel + tam_cel, (this.getColunas() + 1) * tam_cel, i* tam_cel + tam_cel);
        }
        desenhaCoordenadas(draw);
    }

    private void desenhaCoordenadas(Draw draw){
        char letra = 'A';
        draw.setPenColor(Draw.BOOK_RED);
        for (int i = 0; i < this.getLinhas(); i++) {
            draw.text(20, (tam_cel * i) + tam_cel + 20, Character.toString(letra));
            letra++;
        }
        for (int i = 0; i < this.getColunas(); i++) {
            draw.text((tam_cel * i) + tam_cel + 20, 20, Integer.toString(i));
        }
    }

}
