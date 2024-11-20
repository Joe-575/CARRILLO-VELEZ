package CJ;

import java.util.Scanner;

public class CJUsuarios {
    private String cjusuario,cjclave;
    public CJUsuarios(){
        setcjusuario("carrillo-vezlez-pacha");
        setcjclave("1234");
    }

    public String getcjusuario() {
        return cjusuario;
    }

    public void setcjusuario(String cjusuario) {
        if (cjusuario == null || cjusuario.isEmpty()) {
            cjusuario = "Anonimo";
        }
        this.cjusuario = cjusuario.toUpperCase();
    }

    public String getcjclave() {
        return cjclave;
    }

    public void setcjclave(String cjclave) {
        if (cjclave == null || cjclave.isEmpty()) {
            cjclave = "";
        }
        this.cjclave = cjclave;
    }
    public boolean cjingresar(){
        System.out.println("Ingresaste al juego");
        String cjusuario = "";
        String cjvarios_usuarios=" ";
        String cjclave = "";
        boolean cjsinLogear = true;
        do {
            System.out.print(" Ingrese el cjusuario: ");
            cjusuario = CJUtilitarios.entrada.nextLine();
            System.out.print(" Ingrese el cjclave: ");
            cjclave = CJUtilitarios.entrada.nextLine();
            Scanner cjseparador= new Scanner(this.cjusuario).useDelimiter("-");
            while(cjseparador.hasNext()){
                cjvarios_usuarios=cjseparador.next();
                if (cjvarios_usuarios.equalsIgnoreCase(cjusuario) && this.cjclave.equalsIgnoreCase(cjclave)) {
                    //metodo
                    break;
                } 
            }

            System.out.println(" Datos erroneos! ");
            System.out.print(" Para salir, ingrese (s): ");
            if (CJUtilitarios.entrada.nextLine().toUpperCase().equals("S")) {
                cjsinLogear = false;
            }
        } while (cjsinLogear);
        return true;
    }

}
