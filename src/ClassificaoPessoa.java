public class ClassificaoPessoa {
    public String classifica(int idade){
        // se até os 12 anos é criança
        // se entre 13 e 17 anos é adolescente
        // se entre 18 e 59 é adulto
        // se maior ou igual que 60 é idoso

        if(idade <= 12){
            return "crianca";
        } else if (idade>=13 && idade <= 17){
            return "adolescente";
        } else if (idade >= 18 && idade <= 59){
            return "adulto";
        } else {
            return "idoso";
        }

    }
}
