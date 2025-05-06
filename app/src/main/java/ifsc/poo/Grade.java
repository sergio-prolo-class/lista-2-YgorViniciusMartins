package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {
    private int linhas; //Quantidade de linhas
    private int colunas; //Quantidade de colunas
    private int x_orig; //Posição x de referêmcia que a grade será criada
    private int y_orig; //Posição y de referêmcia que a grade será criada
    private final int tam_cel = 40; //Tamnho de cada célula na grade

    public Grade (int linhas, int colunas, int x_orig, int y_orig){
        if(!setLinhas(linhas) || !setColunas(colunas) || !setXOrig(x_orig) || !setYOrig(y_orig)){ //Se não conseguir criar a grade por conta de argumentos inválidos, cria uma grade 10x10
            this.linhas = 10;
            this.colunas = 10;
            this.x_orig = 0;
            this.y_orig = 0;
        }
    }

    private boolean setLinhas(int linhas){
        if(linhas <= 0){ //Não aceita linhas não positivas
            return false;
        }
        this.linhas = linhas;
        return true;
    }

    private boolean setColunas (int colunas){
        if(colunas <= 0){ //Não aceita linhas não positivas
            return false;
        }
        this.colunas = colunas;
        return true;
    }

    public boolean setXOrig(int x_orig){
        if(x_orig < 0){ //Não aceita um ponto x negativo
            return false;
        }
        this.x_orig = x_orig;
        return true;
    }

    public boolean setYOrig(int y_orig){
        if(y_orig < 0){ //Não aceita um ponto y negativo
            return false;
        }
        this.y_orig = y_orig;
        return true;
    }

    public int getLinhas(){
        return this.linhas;
    } //Retorna a quantidade de linhas da grade

    public int getColunas(){
        return this.colunas;
    } //Retorna a quantidade de colunas

    public int getX_orig(){
        return this.x_orig;
    } //Retorna a posição x de origem da grade

    public int getY_orig(){
        return this.y_orig;
    } //Retorna a posição y de origem da grade

    public void desenhar(Draw draw){
        desenhaCoordenadas(draw);
        draw.setPenColor(Draw.BLACK);
        for (int i = 0; i <= this.getColunas(); i++) { //Desenha as colunas da grade
            draw.line(i * tam_cel + tam_cel + getX_orig(), tam_cel + getY_orig(), i* tam_cel + tam_cel + getX_orig(), (this.getLinhas() + 1) * tam_cel + getY_orig());
        }
        for (int i = 0; i <= this.getLinhas(); i++) { //Desenha as linhas da grade
            draw.line(tam_cel + getX_orig(), i * tam_cel + tam_cel + getY_orig(), (this.getColunas() + 1) * tam_cel + getX_orig(), i* tam_cel + tam_cel + getY_orig());
        }
    }

    private void desenhaCoordenadas(Draw draw){
        draw.setPenColor(Draw.BOOK_RED);
        char letra = 'A';
        for (int i = 0; i < this.getLinhas(); i++) { //Desenha o label de letras na vertical
            draw.text(20 + getX_orig(), (tam_cel * i) + tam_cel + 20 + getY_orig(), Character.toString(letra));
            letra++;
        }
        for (int i = 0; i < this.getColunas(); i++) { //Desenha o label de números na horizontal
            draw.text((tam_cel * i) + tam_cel + 20 + getX_orig(), 20 + getY_orig(), Integer.toString(i));
        }
    }

}
