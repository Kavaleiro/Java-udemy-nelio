package exemploList;

import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        
        list.add("Felipe");

        //Inserir um novo elemento(posicao, elemento)
        list.add(2,"Marco");

        //remover um elemento
        list.remove("Felipe");
        //por caractere;Predicato
        list.removeIf(x -> x.charAt(0)=='M');
        //Encontrar a posicao de um elemento
        list.indexOf("Felipe");
        //Deixar na lista apenas aqieles que comecam com M
        List<String> result = list.stream().filter(x-> x.charAt(0)=='M').collect(Collectors.toList());
        

    }
}
