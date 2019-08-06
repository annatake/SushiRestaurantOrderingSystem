package ui;

import model.*;
import java.util.ArrayList;

public class Menu {
    public ArrayList<Appetizer> appies;
    public ArrayList<Sushi> sushi;
    public ArrayList<ComboAndPartyTray> comboAndPartyTrays;
    public ArrayList<RiceDish> riceDishes;
    public ArrayList<NoodleDish> noodleDishes;
    public ArrayList<BentoBox> bentoBoxes;

    // initializes the menu by creating menu items
    // food is organized into its the list of its type (sushi, noodle, rice, appetizer)
    public Menu() {
        appies = new ArrayList<>();
        sushi = new ArrayList<>();
        comboAndPartyTrays = new ArrayList<>();
        riceDishes = new ArrayList<>();
        noodleDishes = new ArrayList<>();
        bentoBoxes = new ArrayList<>();

        Appetizer edamame = new Appetizer(4.50, "Edamame");
        Appetizer gomaae = new Appetizer(3.50, "Gomaae");
        Appetizer miso = new Appetizer(1.75, "Miso Soup");
        Appetizer sunomono = new Appetizer(3.00, "Sunomono");
        Appetizer swpTemp = new Appetizer(5.25, "Sweet Potato Tempura");
        Appetizer ebiTemp = new Appetizer(8.25, "Ebi Tempura");
        Appetizer ageTofu = new Appetizer(5.25, "Agedashi Tofu");
        Appetizer chickenKara = new Appetizer(7.75, "Chicken Karaage");
        Appetizer takoyaki = new Appetizer(5.25, "Takoyaki");
        Appetizer salSashimi = new Appetizer(12.75, "Salmon Sashimi");
        Appetizer tunaSashimi = new Appetizer(12.75, "Tuna Sashimi");

        appies.add(edamame);
        appies.add(gomaae);
        appies.add(miso);
        appies.add(sunomono);
        appies.add(swpTemp);
        appies.add(ebiTemp);
        appies.add(ageTofu);
        appies.add(chickenKara);
        appies.add(takoyaki);
        appies.add(salSashimi);
        appies.add(tunaSashimi);

        Sushi caliRoll = new Sushi(5.25, "California Roll");
        Sushi avoRoll = new Sushi(4.75, "Avocado Roll");
        Sushi spyTunaRoll = new Sushi(6.50, "Spicy Tuna Roll");
        Sushi spySalRoll = new Sushi(6.50, "Spicy Salmon Roll");
        Sushi spyChopScalRoll = new Sushi(6.25, "Chopped Scallop Roll");
        Sushi dynaRoll = new Sushi(5.75, "Dynamite Roll");
        Sushi cucRoll = new Sushi(2.75, "Cucumber Roll");
        Sushi salRoll = new Sushi(3.25, "Salmon Roll");
        Sushi tunaRoll = new Sushi(3.25, "Tuna Roll");
        Sushi tamaRoll = new Sushi(2.75, "Tamago Roll");
        Sushi chickenTeriRoll = new Sushi(6.25, "Chicken Teriyaki Roll");

        sushi.add(caliRoll);
        sushi.add(avoRoll);
        sushi.add(spyTunaRoll);
        sushi.add(spySalRoll);
        sushi.add(spyChopScalRoll);
        sushi.add(dynaRoll);
        sushi.add(cucRoll);
        sushi.add(salRoll);
        sushi.add(tunaRoll);
        sushi.add(tamaRoll);
        sushi.add(chickenTeriRoll);

        ComboAndPartyTray comboA = new ComboAndPartyTray(12.75, "Combo A",
                caliRoll, dynaRoll, cucRoll);
        ComboAndPartyTray comboB = new ComboAndPartyTray(8.25, "Combo B",
                cucRoll, salRoll, tunaRoll);
        ComboAndPartyTray comboC = new ComboAndPartyTray(12.75, "Combo C",
                chickenTeriRoll, cucRoll, avoRoll);
        ComboAndPartyTray comboD = new ComboAndPartyTray(10.75, "Combo D",
                salRoll, tunaRoll, caliRoll);
        ComboAndPartyTray spicyCombo = new ComboAndPartyTray(18.25, "Spicy Lovers' Combo",
                spySalRoll, spyTunaRoll, spyChopScalRoll);
        ComboAndPartyTray partyTray = new ComboAndPartyTray(25.00, "Party Tray",
                caliRoll, dynaRoll, salRoll, tunaRoll, cucRoll, tamaRoll, chickenTeriRoll,
                spySalRoll, spyTunaRoll, spyChopScalRoll);

        comboAndPartyTrays.add(comboA);
        comboAndPartyTrays.add(comboB);
        comboAndPartyTrays.add(comboC);
        comboAndPartyTrays.add(comboD);
        comboAndPartyTrays.add(spicyCombo);
        comboAndPartyTrays.add(partyTray);


        RiceDish chickenTeriDon = new RiceDish(10.95, "Chicken Teriyaki Don");
        RiceDish beefTeriDon = new RiceDish(10.95, "Beef Teriyaki Don");
        RiceDish oyakoDon = new RiceDish(11.95, "Oyako Don");
        RiceDish tonkatsuDon = new RiceDish(11.95, "Tonkatsu Don");
        RiceDish tempDon = new RiceDish(14.25, "Tempura Don");
        RiceDish chirashiDon = new RiceDish(14.45, "Chirashi Don");
        RiceDish spyTunaDon = new RiceDish(14.45, "Spicy Tuna Don");
        RiceDish unagiDon = new RiceDish(19.95, "Unagi Don");
        RiceDish katsuCurry = new RiceDish(14.75, "Tonkatsu Curry");

        riceDishes.add(chickenTeriDon);
        riceDishes.add(beefTeriDon);
        riceDishes.add(oyakoDon);
        riceDishes.add(tonkatsuDon);
        riceDishes.add(tempDon);
        riceDishes.add(chirashiDon);
        riceDishes.add(spyTunaDon);
        riceDishes.add(unagiDon);
        riceDishes.add(katsuCurry);

        NoodleDish kitsuneUdon = new NoodleDish(9.75, "Kitsune Udon");
        NoodleDish kakiageUdon = new NoodleDish(9.75, "Kakiage Udon");
        NoodleDish chickenUdon = new NoodleDish(10.75, "Chicken Udon");
        NoodleDish beefUdon = new NoodleDish(10.75, "Beef Udon");
        NoodleDish ebiTempUdon = new NoodleDish(11.45, "Ebi Tempura Udon");
        NoodleDish nabeUdon = new NoodleDish(15.95, "Nabeyaki Udon");
        NoodleDish yakisoba = new NoodleDish(10.45, "Vegetable Yakisoba");
        NoodleDish yakiudon = new NoodleDish(9.45, "Vegetable Yakiudon");

        noodleDishes.add(kitsuneUdon);
        noodleDishes.add(kakiageUdon);
        noodleDishes.add(chickenUdon);
        noodleDishes.add(beefUdon);
        noodleDishes.add(ebiTempUdon);
        noodleDishes.add(nabeUdon);
        noodleDishes.add(yakisoba);
        noodleDishes.add(yakiudon);

        BentoBox chickenTeriBen = new BentoBox(16.75, "Chicken Teriyaki Bento");
        BentoBox beefTeriBen = new BentoBox(16.75, "Beef Teriyaki Bento");
        BentoBox sashimiBen = new BentoBox(18.25, "Sashimi Bento");
        BentoBox vegeBen = new BentoBox(12.75, "Vegetable Bento");
        BentoBox sabaBen = new BentoBox(14.50, "Grilled Saba Bento");

        bentoBoxes.add(chickenTeriBen);
        bentoBoxes.add(beefTeriBen);
        bentoBoxes.add(sashimiBen);
        bentoBoxes.add(vegeBen);
        bentoBoxes.add(sabaBen);

    }

}
