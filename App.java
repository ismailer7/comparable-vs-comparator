import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class App {


    public static void main(String[] args) {
        
        List<Hobbit> hobbits = Arrays.asList(
            new Hobbit("Fordo", 25, 0.45),
            new Hobbit("Sam", 27, 0.49),
            new Hobbit("pippin", 25, 0.44)
        );

        Collections.sort(hobbits); // only oe comparation type.

        for (Hobbit hobbit : hobbits) {
            System.out.println(hobbit);
        }

        // with comparator we can compare our objects with differents types (name, age or height in our case)

        Comparator<Hobbit> nameComparator = new Comparator<Hobbit>() {
            @Override
            public int compare(Hobbit h1, Hobbit h2) {
                return h1.getName().compareTo(h2.getName());
            }
        };


        Comparator<Hobbit> ageComparator = new Comparator<Hobbit>() {
            @Override
            public int compare(Hobbit h1, Hobbit h2) {
                if(h1.getAge() >= h2.getAge()) return 1;
                else if (h1.getAge() < h2.getAge()) return -1;
                else return 1;
            }
        };

        Comparator<Hobbit> heightComparator = new Comparator<Hobbit>() {
            @Override
            public int compare(Hobbit h1, Hobbit h2) {
                if(h1.getHeight() >= h2.getHeight()) return 1;
                else if (h1.getHeight() < h2.getHeight()) return -1;
                else return 1;
            }
        };


        System.out.println("--------------------------------------------------------");
        Collections.sort(hobbits, nameComparator);


        for (Hobbit hobbit : hobbits) {
            System.out.println(hobbit);
        }

    }


}