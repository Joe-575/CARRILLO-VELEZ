package CJ;

public class CJAutomata {
    public void destruir(String frase){
        int e = -1, estado = 0;
        char [] letras = frase.toCharArray();
        for (int c : letras) {
            switch (estado) {
                case 0:
                    switch (c) {
                        case 'a': estado = 1; break;
                        default: estado = e; break;
                    }
                    break;
                case 1:
                    switch (c) {
                        case 'b': estado = 2; break;
                        default: estado = e; break;
                    }
                    break;
                case 2:
                    switch (c) {
                        case 'c': estado = 3; break;
                        default: estado = e; break;
                    }
                    break;
                case 3:
                    switch (c) {
                        case 'd': estado = 4; break;
                        default: estado = e; break;
                    }
                    break;
                case 4:
                    switch (c) {
                        case 't': estado = 5; break;
                        default: estado = e; break;
                    }
                    break;
                case 5:
                    switch (c) {
                        case 't': estado = 5; break;
                        default: estado = e; break;
                    }
                    break;
            
                default: estado = e; break;
            }
        }
        if (estado == 3 || estado == 5) {
            System.out.print("\n\t Enemigo derribado...!");
        }else{
            System.out.print("\n\t Enemigo en pie...!");

        }
    }
}
