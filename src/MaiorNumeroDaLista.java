public class MaiorNumeroDaLista {
    public Integer maiorNumero(int[] lista){
        //procurar o maior numero numero da lista
        int maior = 0;
        for(int i = 0; i< lista.length; i++){
            if(lista[i] > maior){
                maior = lista[i];
            }
        }
        return maior;

    }
}
