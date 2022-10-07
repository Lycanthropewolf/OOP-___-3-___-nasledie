import java.util.Objects;

public abstract class Birds extends Animals {


    String livingEnvironment;

    public Birds(String animalName, int age, String livingEnvironment) {
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
    public abstract void hunt();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
