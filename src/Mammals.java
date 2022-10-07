import java.util.Objects;

public abstract class Mammals extends Animals {


    String livingEnvironment;
    double travelSpeed;


    public Mammals(String animalName, int age, String livingEnvironment, double travelSpeed) {
        super(animalName, age);
        this.livingEnvironment = livingEnvironment;
        this.travelSpeed = travelSpeed;
    }

    public abstract void walk();

    public String getLivingEnvironment() {
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            livingEnvironment = "некорректные данные о среде обитания";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
        return livingEnvironment;
    }


    public double getTravelSpeed() {
        if (travelSpeed <= 0) {
            this.travelSpeed = Math.abs(travelSpeed);
        } else {
            this.travelSpeed = travelSpeed;
        }
        return travelSpeed;
    }

    public void setTravelSpeed(double travelSpeed) {
        this.travelSpeed = travelSpeed;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Double.compare(mammals.travelSpeed, travelSpeed) == 0 && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, travelSpeed);
    }
}
