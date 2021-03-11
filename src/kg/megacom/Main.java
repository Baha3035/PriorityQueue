package kg.megacom;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Comparator<PeopleInDisaster> whoNeedsHelp = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                PeopleInDisaster first = (PeopleInDisaster) o1;
                PeopleInDisaster second = (PeopleInDisaster) o2;
                if (first.getAge() - second.getAge() < 0) {
                    return -1;
                } else if (first.getAge() - second.getAge() > 0) {
                    return 1;
                } else {
                    return first.getHealth().compareTo(second.getHealth());
                }
            }
            };

        PriorityQueue<PeopleInDisaster> whoNeedsHelpFirst = new PriorityQueue<>(whoNeedsHelp);
        PeopleInDisaster anthony = new PeopleInDisaster(48, "healthy", "Anthony");
        PeopleInDisaster malfoy = new PeopleInDisaster(15, "not healthy", "Malfoy");
        PeopleInDisaster fred = new PeopleInDisaster(60, "not healthy", "Fred");
        PeopleInDisaster john = new PeopleInDisaster(12, "healthy", "Johnny");
        PeopleInDisaster scarlett = new PeopleInDisaster(20, "healthy", "Scarlett");
        PeopleInDisaster kirill = new PeopleInDisaster(12, "not healthy", "Kirill");
        PeopleInDisaster ash = new PeopleInDisaster(23, "not healthy", "Ashley");
        PeopleInDisaster kiba = new PeopleInDisaster(48, "not healthy", "Kiba");
        PeopleInDisaster levi = new PeopleInDisaster(56, "not healthy", "Levi");
        PeopleInDisaster mikasa = new PeopleInDisaster(56, "healthy", "Mikasa");
        PeopleInDisaster lamelo = new PeopleInDisaster(23, "healthy", "Lamelo");



        whoNeedsHelpFirst.add(anthony);
        whoNeedsHelpFirst.add(malfoy);
        whoNeedsHelpFirst.add(fred);
        whoNeedsHelpFirst.add(john);
        whoNeedsHelpFirst.add(scarlett);
        whoNeedsHelpFirst.add(kirill);
        whoNeedsHelpFirst.add(ash);
        whoNeedsHelpFirst.add(kiba);
        whoNeedsHelpFirst.add(levi);
        whoNeedsHelpFirst.add(lamelo);
        whoNeedsHelpFirst.add(mikasa);

        System.out.println("Priority queue sorted by age and health");

        while(!(whoNeedsHelpFirst.isEmpty())){
            System.out.println(whoNeedsHelpFirst.poll());
        }

    }
}
