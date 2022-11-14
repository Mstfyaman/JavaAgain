package a_3_Constructor;

public class Okul {

        String renk;
        int kapasite;
        int sinifAdedi;



        public void kontrolKapasite(int kapasite){
            this.kapasite=kapasite;

            if (kapasite>500){
                System.out.println("\"kapasite asilmistir\" = " + "kapasite asilmistir");
            }
            else {
                System.out.println("kapasite asilmasina " + ( 500 - this.kapasite )+ " kalmistir");
            }
        }

    public Okul() {
    }

    public Okul(String renk) {
        this.renk = renk;
    }

    public Okul(String renk, int kapasite) {
        this.renk = renk;
        this.kapasite = kapasite;
    }

    public Okul(String renk, int kapasite, int sinifAdedi) {
        this.renk = renk;
        this.kapasite = kapasite;
        this.sinifAdedi = sinifAdedi;
    }
}
