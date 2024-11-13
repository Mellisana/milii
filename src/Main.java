import java.security.spec.RSAOtherPrimeInfo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 43641; // стоимость билета

        int rublePerMiles = 20; // количество рубелй, необходимых для начисления одной бонусной мили
        int  earnedMiles = ticketPrice/rublePerMiles;// расчет количества бонусных миль для начисления

        System.out.println("За билет начислено " + earnedMiles + " миль(ей).");
    }
}