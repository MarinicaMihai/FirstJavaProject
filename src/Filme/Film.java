package Filme;

public class Film {
    private String titlu;
    private String gen;
    private int anLansare;
    private String actorPrincipal;

    public String getGen() {
        return gen;
    }

    public Film(String gen, String actorPrincipal, String titlu, int anLansare) {
        this.gen = gen;
        this.actorPrincipal = actorPrincipal;
        this.titlu = titlu;
        this.anLansare = anLansare;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitu(String titlu) {
        this.titlu = titlu;
    }

    public int getAnLansare() {
        return anLansare;
    }

    public void setAnLansare(int anLansare) {
        this.anLansare = anLansare;
    }


    public static void afiseazaDupaGen(Film[] filme, String gen) {
        for (int i = 0; i < filme.length; i++) {
            if (filme[i].getGen().equals(gen)) {
                System.out.println(filme[i].getTitlu());
            }
        }
    }

    public static void afiseazaDupaActor(Film[] filme, String actorPrincipal) {

        for (int i = 0; i < filme.length; i++) {

            if (filme[i].getActorPrincipal().equals(actorPrincipal)) {

                System.out.println(filme[i].getTitlu() + " cu actorul Principal " + filme[i].getActorPrincipal());
            }
        }
    }

    public static void afiseazaDupaAni(Film[] filme, int anInceput, int anFinal) {
        for (int i = 0; i < filme.length; i++) {
            if (filme[i].getAnLansare() > anInceput && filme[i].getAnLansare() < anFinal) {
                System.out.println(filme[i]);
            }
        }
    }
}

