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
        initializeAppies();
        initializeSushiAndCombos();
        initializeRiceDishes();
        initializeNoodles();
        initializeBentos();
    }

    private void initializeAppies() {
        appies = new ArrayList<Appetizer>();

        Appetizer edamame = new Appetizer(4.50, "Edamame", "A1");
        Appetizer gomaae = new Appetizer(3.50, "Gomaae", "A2");
        Appetizer miso = new Appetizer(1.75, "Miso Soup", "A3");
        Appetizer sunomono = new Appetizer(3.00, "Sunomono", "A4");
        Appetizer swpTemp = new Appetizer(5.25, "Sweet Potato Tempura", "A5");
        Appetizer ebiTemp = new Appetizer(8.25, "Ebi Tempura", "A6");
        Appetizer ageTofu = new Appetizer(5.25, "Agedashi Tofu", "A7");
        Appetizer chickenKara = new Appetizer(7.75, "Chicken Karaage", "A8");
        Appetizer takoyaki = new Appetizer(5.25, "Takoyaki", "A9");
        Appetizer salSashimi = new Appetizer(12.75, "Salmon Sashimi", "A10");
        Appetizer tunaSashimi = new Appetizer(12.75, "Tuna Sashimi", "A11");

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
    }

    private void initializeSushiAndCombos() {
        sushi = new ArrayList<Sushi>();
        comboAndPartyTrays = new ArrayList<ComboAndPartyTray>();

        Sushi caliRoll = new Sushi(5.25, "California Roll", "S1");
        Sushi avoRoll = new Sushi(4.75, "Avocado Roll", "S");
        Sushi spyTunaRoll = new Sushi(6.50, "Spicy Tuna Roll", "S3");
        Sushi spySalRoll = new Sushi(6.50, "Spicy Salmon Roll", "S4");
        Sushi spyChopScalRoll = new Sushi(6.25, "Chopped Scallop Roll", "S5");
        Sushi dynaRoll = new Sushi(5.75, "Dynamite Roll", "S6");
        Sushi cucRoll = new Sushi(2.75, "Cucumber Roll", "S7");
        Sushi salRoll = new Sushi(3.25, "Salmon Roll", "S8");
        Sushi tunaRoll = new Sushi(3.25, "Tuna Roll", "S9");
        Sushi tamaRoll = new Sushi(2.75, "Tamago Roll", "S10");
        Sushi chickenTeriRoll = new Sushi(6.25, "Chicken Teriyaki Roll", "S11");

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


        ComboAndPartyTray comboA = new ComboAndPartyTray(12.75, "Combo A", "C1",
                caliRoll, dynaRoll, cucRoll);
        ComboAndPartyTray comboB = new ComboAndPartyTray(8.25, "Combo B", "C2",
                cucRoll, salRoll, tunaRoll);
        ComboAndPartyTray comboC = new ComboAndPartyTray(12.75, "Combo C", "C3",
                chickenTeriRoll, cucRoll, avoRoll);
        ComboAndPartyTray comboD = new ComboAndPartyTray(10.75, "Combo D", "C5",
                salRoll, tunaRoll, caliRoll);
        ComboAndPartyTray spicyCombo = new ComboAndPartyTray(18.25, "Spicy Lovers' Combo", "C6",
                spySalRoll, spyTunaRoll, spyChopScalRoll);
        ComboAndPartyTray partyTray = new ComboAndPartyTray(25.00, "Party Tray", "C7",
                caliRoll, dynaRoll, salRoll, tunaRoll, cucRoll, tamaRoll, chickenTeriRoll,
                spySalRoll, spyTunaRoll, spyChopScalRoll);

        comboAndPartyTrays.add(comboA);
        comboAndPartyTrays.add(comboB);
        comboAndPartyTrays.add(comboC);
        comboAndPartyTrays.add(comboD);
        comboAndPartyTrays.add(spicyCombo);
        comboAndPartyTrays.add(partyTray);
    }

    private void initializeRiceDishes() {
        riceDishes = new ArrayList<RiceDish>();

        RiceDish chickenTeriDon = new RiceDish(10.95, "Chicken Teriyaki Don", "R1");
        RiceDish beefTeriDon = new RiceDish(10.95, "Beef Teriyaki Don", "R2");
        RiceDish oyakoDon = new RiceDish(11.95, "Oyako Don", "R3");
        RiceDish tonkatsuDon = new RiceDish(11.95, "Tonkatsu Don", "R4");
        RiceDish tempDon = new RiceDish(14.25, "Tempura Don", "R5");
        RiceDish chirashiDon = new RiceDish(14.45, "Chirashi Don", "R6");
        RiceDish spyTunaDon = new RiceDish(14.45, "Spicy Tuna Don", "R7");
        RiceDish unagiDon = new RiceDish(19.95, "Unagi Don", "R8");
        RiceDish katsuCurry = new RiceDish(14.75, "Tonkatsu Curry", "R9");

        riceDishes.add(chickenTeriDon);
        riceDishes.add(beefTeriDon);
        riceDishes.add(oyakoDon);
        riceDishes.add(tonkatsuDon);
        riceDishes.add(tempDon);
        riceDishes.add(chirashiDon);
        riceDishes.add(spyTunaDon);
        riceDishes.add(unagiDon);
        riceDishes.add(katsuCurry);
    }

    private void initializeNoodles() {
        noodleDishes = new ArrayList<NoodleDish>();

        NoodleDish kitsuneUdon = new NoodleDish(9.75, "Kitsune Udon", "N1");
        NoodleDish kakiageUdon = new NoodleDish(9.75, "Kakiage Udon", "N2");
        NoodleDish chickenUdon = new NoodleDish(10.75, "Chicken Udon", "N3");
        NoodleDish beefUdon = new NoodleDish(10.75, "Beef Udon", "N4");
        NoodleDish ebiTempUdon = new NoodleDish(11.45, "Ebi Tempura Udon", "N5");
        NoodleDish nabeUdon = new NoodleDish(15.95, "Nabeyaki Udon", "N6");
        NoodleDish yakisoba = new NoodleDish(10.45, "Vegetable Yakisoba", "N7");
        NoodleDish yakiudon = new NoodleDish(9.45, "Vegetable Yakiudon", "N8");

        noodleDishes.add(kitsuneUdon);
        noodleDishes.add(kakiageUdon);
        noodleDishes.add(chickenUdon);
        noodleDishes.add(beefUdon);
        noodleDishes.add(ebiTempUdon);
        noodleDishes.add(nabeUdon);
        noodleDishes.add(yakisoba);
        noodleDishes.add(yakiudon);
    }


    private void initializeBentos() {
        bentoBoxes = new ArrayList<BentoBox>();

        BentoBox chickenTeriBen = new BentoBox(16.75, "Chicken Teriyaki Bento", "B1");
        BentoBox beefTeriBen = new BentoBox(16.75, "Beef Teriyaki Bento", "B2");
        BentoBox sashimiBen = new BentoBox(18.25, "Sashimi Bento", "B3");
        BentoBox vegeBen = new BentoBox(12.75, "Vegetable Bento", "B4");
        BentoBox sabaBen = new BentoBox(14.50, "Grilled Saba Bento", "B5");

        bentoBoxes.add(chickenTeriBen);
        bentoBoxes.add(beefTeriBen);
        bentoBoxes.add(sashimiBen);
        bentoBoxes.add(vegeBen);
        bentoBoxes.add(sabaBen);

    }

    // returns a list of appetizer items
    public ArrayList<Appetizer> getAppiesList() {
        return appies;
    }

    // returns a list of sushi items
    public ArrayList<Sushi> getSushiList() {
        return sushi;
    }

    // returns a list of combos and party tray items
    public ArrayList<ComboAndPartyTray> getComboAndTrayList() {
        return comboAndPartyTrays;
    }

    // returns a list of rice dish items
    public ArrayList<RiceDish> getRiceDishList() {
        return riceDishes;
    }

    // returns a list of noodle items
    public ArrayList<NoodleDish> getNoodleList() {
        return noodleDishes;
    }

    // returns a list of bento box items
    public ArrayList<BentoBox> getBentoBoxList() {
        return bentoBoxes;
    }
}
