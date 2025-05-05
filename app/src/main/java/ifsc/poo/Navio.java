package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Navio {

    private int tamanho; //Tamanho do navio
    private int x; //Posição x de origem
    private int y; //Poisção y de origem
    private String orientacao; //Orientação do barco na grade
    private final int tam_cel = 40; //Tamanho de cada célula da grade

    public Navio(int tamanho, int x, int y, String orientacao){
        if(!setTamanho(tamanho) || !setX(x) || !setY(y) || !setOrientacao(orientacao)){ //Se não conseguir cria um navio válido, cria um navio inutilizável
            this.tamanho = 0;
            this.x = -1;
            this.y = -1;
            this.orientacao = "";
        }
    }

    public boolean setTamanho(int tamanho){
        if(tamanho <= 0){ //Não aceita tamnhos não positivos
            return false;
        }
        this.tamanho = tamanho;
        return true;
    }

    public boolean setX(int x){
        if(x <= 0){ //Não aceita numeros não positivos
            return false;
        }
        this.x = x;
        return true;
    }

    public boolean setY(int y){
        if(y <= 0){ //Não aceita numeros não positivos
            return false;
        }
        this.y = y;
        return true;
    }

    public boolean setOrientacao(String orientacao){
        orientacao = orientacao.toLowerCase();
        if(!orientacao.equals("vertical") && !orientacao.equals("horizontal")){ //Se não for nem na vertical, nem na horizontal, retorna falso
            return false;
        }
        this.orientacao = orientacao;
        return true;
    }

    public void desenhar(Draw draw){
        draw.setPenColor(Draw.BOOK_RED);
        if(orientacao.equals("horizontal")){
            for (int i = 1; i - 2 <= this.tamanho ; i += 2) { //Desenha o navio na horizontal
                draw.filledSquare((this.x * tam_cel) + ((tam_cel / 2.0) * i), this.y * tam_cel + tam_cel / 2.0, tam_cel / 2.0);
            }
        }

        if(orientacao.equals("vertical")){ //Desenha o navio na vertical
            for (int i = 1; i - 2 <= this.tamanho ; i += 2) {
                draw.filledSquare(this.x * tam_cel + tam_cel / 2.0, (this.y * tam_cel) + ((tam_cel / 2.0) * i), tam_cel / 2.0);
            }
        }
    }
}
