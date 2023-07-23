package Filme;

import static Filme.Film.*;

public class MainFilm {
    public static void main(String[] args) {
        Film titanic = new Film("Titanic","DiCaprio","Titanic",1997);
        Film piratiiDinCaraibe = new Film("aventura","Jhony Deep","piratiiDinCaraibe",2000);
        Film revenant = new Film("Aventura","DiCaprio","revenant",2017);
        Film[] filme = new Film[]{titanic,piratiiDinCaraibe,revenant};
        //afiseazaDupaGen(filme,"Aventura");
        //afiseazaDupaActor(filme,"DiCaprio");
        afiseazaDupaAni(filme,2000,2018);
        

    }
}
