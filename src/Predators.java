import java.util.Objects;

public class Predators extends Mammals {


    String typeOfFood;


    public Predators(String animalName, int age, String livingEnvironment, double travelSpeed, String typeOfFood) {
        super(animalName, age, livingEnvironment, travelSpeed);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        if (typeOfFood==null||typeOfFood.isEmpty()||typeOfFood.isBlank()){
            typeOfFood=" некорректные данные о типе пищи";
        }else {
            this.typeOfFood=typeOfFood;
        }
        return typeOfFood;
    }

    @Override
    public void eat() {
        System.out.println("скушать добычу");
    }

    @Override
    public void sleep() {
        System.out.println("спать в любое время кроме охоты");

    }

    @Override
    public void move() {
        System.out.println("перемещаться только в поисках добычи");

    }

    @Override
    public void walk() {
        System.out.println("поменьше гулять, для экономия силы");
    }
    public void hunt(){
        System.out.println("охотиться на добычу, когда хочеться кушать");
    }

    @Override
    public String toString() {
        return "Хищники {" +
                "Тип пищи='" + typeOfFood + '\'' +
                ", Место обитания ='" + livingEnvironment + '\'' +
                ", Скорость движения =" + travelSpeed +
                ", название животного='" + animalName + '\'' +
                ", возраст =" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
