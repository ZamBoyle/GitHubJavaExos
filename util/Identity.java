package util;
public class Identity {

    public static String GetName() {
        String name = UserInput.AskStr("Quel est votre nom ?");
        return name;
    }
    public static int GetAge(){
        int age = UserInput.AskInt("Quel est votre âge ?");
        return age; 
    }
}