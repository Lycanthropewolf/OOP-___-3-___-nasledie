import java.util.Objects;

public class Flightless extends Birds {

    String movementType;

    public Flightless(String animalName, int age, String livingEnvironment, String movementType) {
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
        System.out.println(" передвигать лапками");


    }

    @Override
    public void hunt() {
        System.out.println(" ловить добычу и растения используя клюв");

    }
    public void walk(){
        System.out.println(" либо ходить, либо плавать");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "Flightless{" +
                "movementType='" + movementType + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                '}';
    }
}
