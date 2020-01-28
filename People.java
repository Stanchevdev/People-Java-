
import java.util.ArrayList;

public class People {
    ArrayList<String> List = new ArrayList<>();

    public void setPerson(byte typeOfPerson, String name, String fam, short age) {
        Person person = new Person();
        if (typeOfPerson == 1) person.Type = "Student";
        if (typeOfPerson == 2) person.Type = "Rich Student";
        if (typeOfPerson == 3) person.Type = "Professor";
        person.Name = name;
        person.Fam = fam;
        person.Age = age;
        String Info = ("( " + person.Type + ", " + person.Name + ", " + person.Fam + ", " + person.Age + " )");
        System.out.println(person.Name + " " + person.Fam + " is a " + person.Type + " at age of " + person.Age);
        List.add(Info);
    }

    public void showStats(){
        System.out.println(List);
        System.out.println("There are " + List.size() + " people in this list");
    }

    public void showSpecs(byte spec){
        int count = 0;
        String typeOfSearchedPerson = "";
        if (spec == 1) typeOfSearchedPerson = "Student";
        if (spec == 2) typeOfSearchedPerson = "Rich Student";
        if (spec == 3) typeOfSearchedPerson = "Professor";
        for (String Match : List) {
            if (Match.contains(typeOfSearchedPerson)) {
                count++;
            }
        }
        System.out.println("There are " + count + " " + typeOfSearchedPerson + "s");
    }

}
