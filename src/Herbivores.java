import java.util.Objects;

public class Herbivores extends Mammals {
    String typeOfFood;

    public Herbivores(String animalName, int age, String livingEnvironment, double travelSpeed, String typeOfFood) {
        super(animalName, age, livingEnvironment, travelSpeed);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            typeOfFood = " некорректные данные о типе пищи";
        } else {
            this.typeOfFood = typeOfFood;
        }
        return typeOfFood;
    }

    @Override
    public void eat() {
        System.out.println(" медленно щипать свежую травку");
    }

    @Override
    public void sleep() {
        System.out.println(" спать ночью");

    }

    @Override
    public void move() {
        System.out.println(" двигаться в поисках свежей травки");

    }

    @Override
    public void walk() {
        System.out.println(" поменьше гулять, для экономия силы");
    }
    public void graze(){
        System.out.println(" пастись на лугах");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", travelSpeed=" + travelSpeed +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                '}';
    }
}
