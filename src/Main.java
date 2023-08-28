public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("cat", 3, false);


        Car bmw = new Car(1234, "bmw", "12000 km/saat", "Zamii", "100000 usd");

            System.out.println(bmw);


      Insan zami=new Insan("Zami",160,48,21);

            System.out.println(zami);


        Telebe adl= new Telebe(1234,"adl","adl",318,4);
        System.out.println(adl);

        Cashier gunes= new Cashier(1234,"Gunes", "Gunesova", "5 ayliq tecrube", 130000) ;
        System.out.println(gunes);

        City california=new City("California", "bilmirem ki acigi maraqli deyil", "USA", 163696, true);
        System.out.println(california);


        Hotel elit=new Hotel("Elit", "hamburg", "Almaniya", 5,"5 ulduz",true);
        System.out.println(elit);

        Subject riyaziyyat=new Subject(1234,"Riyaziyyat", 2,2,"1 saat",false);
        System.out.println(riyaziyyat);
    }

}
