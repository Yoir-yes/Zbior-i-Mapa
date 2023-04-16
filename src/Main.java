import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        zbior();
        mapa();
    }
    public static void zbior(){
        String imie;
        Set<String> imiona = new HashSet<>();
        do{
            System.out.println("Podaj imie: ");
            imie = in.next();
            if (imie.equals("-")){
                break;
            }
            imiona.add(imie);
        }while(!imie.equals("-"));
        System.out.println("Wprowadzono "+imiona.size()+ " unikalnych imion");
    }
    public static void mapa(){
        Map<String ,String> pary = new HashMap<>();
        String imie1, imie2, imie3;
        while(true){
            System.out.println("Podaj imie partnera: ");
            imie1 = in.next();
            System.out.println("Podaj imie partnerki: ");
            imie2 = in.next();
            if(imie1.equals("-") && imie2.equals("-")){
                break;
            }
            pary.put(imie1,imie2);
        }
        System.out.println("Podaj imie do sprawdzenia: ");
        imie3 = in.next();
        System.out.println("Partner dla "+imie3+" to "+ pary.get(imie3));
    }
}