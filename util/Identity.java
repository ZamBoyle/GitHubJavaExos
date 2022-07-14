package util;
public class Identity {

    public static String GetName() {
        String name = Input.AskStr("Quel est votre nom ?");
        return name;
    }
    public static int GetAge(){
        Int age = Input.AskInt("Quel est votre âge ?");
        return age; 
    }
}