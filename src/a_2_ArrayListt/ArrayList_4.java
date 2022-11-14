package a_2_ArrayListt;

import java.util.ArrayList;

public class ArrayList_4 {
    public static void main(String[] args) {

        // addAll(), removeAll()

        ArrayList <String> position = new ArrayList<>();
        position.add("QA");
        position.add("DEVELOPER");
        position.add("UXDESIGNER");
        position.add("DEVOPS ENGINEER");
        position.add("SCRUM MASTER");


        ArrayList <String> tools = new ArrayList<>();
        tools.add("SELENIUM");
        tools.add("JAVA");
        tools.add("FIGMA");
        tools.add("AZURE");
        tools.add("JIRA");

        position.addAll(tools);  // position a tools u ekledik.
        System.out.println("position = " + position);

        tools.addAll(position);
        System.out.println("tools = " + tools);

        tools.removeAll(position);
        System.out.println("tools = " + tools);

    }
}
