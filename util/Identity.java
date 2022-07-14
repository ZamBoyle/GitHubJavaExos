package util;
public class Identity {

    public static String GetName() {
        String name = UserInput.AskStr("Comment t'appelles-tu ?");
        return name;
    }
    public static int GetAge(){
        //A  compléter en appelant Input.AskInt
        return 10000; 
    }
}