public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int i = 1; i < 11 ; i++) {
           Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n"
            + "Plot: " + movie.plot() + "\n");

        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random Number Generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
               return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
            default:
                return null;
        }
    }
}

class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot () {
        return "No plot here";
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "Shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Boy runs through maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Space stuff";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    //no plot method
}
