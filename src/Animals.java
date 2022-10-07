import java.util.Objects;

public abstract class Animals {


    String animalName;
    int age;

    public Animals(String animalName, int age) {
        this.animalName = animalName;
        this.age = age;
    }

    public String getAnimalName() {
        if (animalName == null || animalName.isEmpty() || animalName.isBlank()) {
            System.out.println("неверно введеное имя животного");
        } else {
            this.animalName = animalName;
        }
        return animalName;
    }


    public int getAge() {
        if (age <= 0) {
            this.age = Math.abs(age);
        } else {
            this.age = age;
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(animalName, animals.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, age);
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();



}
