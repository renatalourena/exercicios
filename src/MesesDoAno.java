public class MesesDoAno {
    public String mesDoAno(int numero){
        // deve retornar janeiro se numero for igual 1
        // deve retornar fevereiro se numero for igual 2
        // deve retornar marco se numero for igual 3
        // deve retornar abril se numero for igual 4
        // deve retornar maio se numero for igual 5
        // deve retornar junho se numero for igual 6
        String mes = "";
        switch (numero){
            case 1:
                mes = "janeiro";
                break;
            case 2:
                mes = "fevereiro";
                break;
            case 3:
                mes = "marco";
                break;
            case 4:
                mes = "abril";
                break;
            case 5:
                mes = "maio";
                break;
            case 6:
                mes = "junho";
                break;
        }

        return  mes;
    }
}
