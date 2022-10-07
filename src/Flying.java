import java.util.Objects;

public class Flying extends Birds{
    String movementType;


    public Flying(String animalName, int age, String livingEnvironment, String movementType) {
        super(animalName, age, livingEnvironment);
        this.movementType = movementType;
    }
    public String getMovementType() {
        if (movementType == null || movementType.isBlank() || movementType.isEmpty()) {
            movementType = " некорректный ввод данных о типе передвижения";
        } else {
            this.movementType = movementType;
        }
        return movementType;

    }

    @Override
    public void eat() {
        System.out.println(" кушать рыбу и разный корм");
    }

    @Override
    public void sleep() {
        System.out.println(" спать после еды");
    }

    @Override
    public void move() {
        System.out.println(" летать в поисках пищи");
    }

    @Override
    public void hunt() {
        System.out.println(" ловить добычу и растения используя клюв");
    }
    public void fly(){
        System.out.println(" размахивать крыльями");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "Flying{" +
                "movementType='" + movementType + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                '}';
    }
}
