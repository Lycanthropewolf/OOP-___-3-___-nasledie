public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель", 6, " Саванна", 50.00, " свежая трава");
        System.out.println(gazelle.toString());
        gazelle.eat();
        gazelle.sleep();
        gazelle.move();
        gazelle.walk();
        gazelle.graze();
        Herbivores giraffe = new Herbivores("Жираф", 5, " Саванна", 22.00, " листва на верхушках деревьев");
        System.out.println(giraffe.toString());
        giraffe.eat();
        giraffe.sleep();
        giraffe.move();
        giraffe.walk();
        giraffe.graze();
        Herbivores horse = new Herbivores("Лошадь", 7, " Саванна", 45.00, " трава либо листва");
        System.out.println(horse.toString());
        horse.eat();
        horse.sleep();
        horse.move();
        horse.walk();
        horse.graze();
        Predators hyena = new Predators(" Гиена", 10, "Саванна", 35.00, " мясом животных разной степени свежести");
        System.out.println(hyena.toString());
        hyena.eat();
        hyena.sleep();
        hyena.move();
        hyena.walk();
        hyena.hunt();
        Predators tiger = new Predators(" Тигр", 9, "Джунгли", 45.00, " свежим мясом животных");
        System.out.println(tiger.toString());
        tiger.eat();
        tiger.sleep();
        tiger.move();
        tiger.walk();
        tiger.hunt();
        Predators bear = new Predators(" Медведь", 12, "Тайга", 25.00, " мясом животных и плодами растений");
        System.out.println(bear.toString());
        bear.eat();
        bear.sleep();
        bear.move();
        bear.walk();
        bear.hunt();
        Amphibians frog = new Amphibians(" Лягушка", 1, "болото");
        System.out.println(frog.toString());
        frog.eat();
        frog.sleep();
        frog.move();
        frog.hunt();
        Amphibians snake = new Amphibians(" Уж пресноводный", 2, "болото");
        System.out.println(snake.toString());
        snake.eat();
        snake.sleep();
        snake.move();
        snake.hunt();
        Flightless peacock = new Flightless(" Павлин", 4, " джунгли", " ходит лапами");
        System.out.println(peacock.toString());
        peacock.eat();
        peacock.sleep();
        peacock.move();
        peacock.hunt();
        peacock.walk();

        Flightless penguin = new Flightless(" Пингвин", 3, " арктика", " ходит лапами и плавает в воде");
        System.out.println(penguin.toString());
        penguin.eat();
        penguin.sleep();
        penguin.move();
        penguin.hunt();
        penguin.walk();
        Flightless dodoBird = new Flightless(" птица додо", 6, " джунгли", " ходит лапами");
        System.out.println(dodoBird.toString());
        dodoBird.eat();
        dodoBird.sleep();
        dodoBird.move();
        dodoBird.hunt();
        dodoBird.walk();

        Flying gull = new Flying(" Чайка", 3, " Прибрежные зоны", " летает и ходит лапками");
        System.out.println(gull.toString());
        gull.eat();gull.sleep();gull.move();gull.hunt();gull.fly();



        Flying albatross = new Flying(" Альбатросс", 3, " Прибрежные зоны", " летает и ходит лапками");
        System.out.println(albatross.toString());
        albatross.eat();albatross.sleep();albatross.move();albatross.hunt();albatross.fly();



        Flying falcon = new Flying(" Сокол", 7, " Степи", " летает и ходит лапками");
        System.out.println(falcon.toString());
        falcon.eat();falcon.sleep();falcon.move();falcon.hunt();falcon.fly();

    }
}