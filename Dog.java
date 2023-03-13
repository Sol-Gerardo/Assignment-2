package Number_5;
import java.util.ArrayList;

public class Dog {
   private String breed;
   private String name;
   private ArrayList<Paw> paws;

   public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
        this.paws = new ArrayList<Paw>();
        for(int i = 0; i < 4; ++i) {
            this.paws.add(new Paw(i));
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Paw> getPaws() {
        return paws;
    }

    public void setPaws(ArrayList<Paw> paws) {
        this.paws = paws;
    }
}
