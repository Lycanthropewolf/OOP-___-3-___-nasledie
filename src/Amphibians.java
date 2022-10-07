import java.util.Objects;

public class Amphibians extends Animals {
    String livingEnvironment;


    public Amphibians(String animalName, int age, String livingEnvironment) {
        super(animalName, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            livingEnvironment = "некорректные данные о среде обитания";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public void eat() {
        System.out.println("кушать насекомых");

    }

    @Override
    public void sleep() {
        System.out.println(" спать после еды");

    }

    @Override
    public void move() {
        System.out.println(" двигаться для поиска жуков");

    }
    public void hunt(){
        System.out.println(" ловить жуков при любой возможности");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                '}';
    }
}
