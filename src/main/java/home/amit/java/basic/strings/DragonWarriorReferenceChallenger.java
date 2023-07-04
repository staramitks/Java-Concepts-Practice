package home.amit.java.basic.strings;
/*
User :- AmitSingh
Date :- 6/14/2023
Time :- 10:54 AM
Year :- 2023
Month :- 06
Month Name Short :- Jun
*/

public class DragonWarriorReferenceChallenger {

    public static void main(String... doYourBest) {
        StringBuilder warriorProfession = new StringBuilder("Dragon ");
        String warriorWeapon = "Sword ";
        changeWarriorClass(warriorProfession, warriorWeapon);

        System.out.println("warriorProfession=" + warriorProfession + " Weapon=" + warriorWeapon);
    }

    static void changeWarriorClass(StringBuilder warriorProfession, String weapon) {
        warriorProfession.append("Knight");
        weapon = "Dragon " + weapon;

        weapon = null;
        warriorProfession = null;
    }

}