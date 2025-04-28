package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Navio {

    private int tamanho;
    private int x;
    private int y;
    private String orientacao;
    private final int tam_cel = 40;

    public Navio(int tamanho, int x, int y, String orientacao){
        if(!setTamanho(tamanho) || !setX(x) || !setY(y) || !setOrientacao(orientacao)){
            this.tamanho = 0;
            this.x = -1;
            this.y = -1;
            this.orientacao = "";
        }
    }

    public boolean setTamanho(int tamanho){
        if(tamanho < 0){
            return false;
        }
        this.tamanho = tamanho;
        return true;
    }

    public boolean setX(int x){
        if(x < 0){
            return false;
        }
        this.x = x;
        return true;
    }

    public boolean setY(int y){
        if(y < 0){
            return false;
        }
        this.y = y;
        return true;
    }

    public boolean setOrientacao(String orientacao){
        orientacao = orientacao.toLowerCase();
        if(!orientacao.equals("vertical") && !orientacao.equals("horizontal")){
            return false;
        }
        this.orientacao = orientacao;
        return true;
    }

    public void desenhar(Draw draw){
        draw.setPenColor(Draw.BOOK_RED);
        if(orientacao.equals("horizontal")){
            for (int i = 1; i - 2 <= this.tamanho ; i += 2) {
                draw.filledSquare((this.x * tam_cel) + ((tam_cel / 2.0) * i), this.y * tam_cel + tam_cel / 2.0, tam_cel / 2.0);
            }
        }

        if(orientacao.equals("vertical")){
            for (int i = 1; i - 2 <= this.tamanho ; i += 2) {
                draw.filledSquare(this.x * tam_cel + tam_cel / 2.0, (this.y * tam_cel) + ((tam_cel / 2.0) * i), tam_cel / 2.0);
            }
        }
    }
}
