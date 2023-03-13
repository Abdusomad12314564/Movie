import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        List<Movie> movies = new LinkedList<>();
        movies.add(new Movie("Kurmanjan Datka", 2014, "Taryhty chagylrygan kyrgyz kinosu", new Director("Sadyk", "SherNiyaz"),
                List.of(new Cast("Aziz Muradaliev", "Alymbek Datka"),
                        new Cast("Elina Abai Kyzy", "Kurmanjan Datka"),
                        new Cast("Ulan Omuraliev", "Shabdan"))));
        movies.add(new Movie("Boz Salkyn", 2007, "Tagdyry bashka jigitke bailangan kyz tuuraluu", new Director("Ernest", "Abdyjaparov"),
                List.of(new Cast("Asem Toktobekova", "Asema"),
                        new Cast("Tynchtyk Abylkasymov", "Sagyn"),
                        new Cast("Siezdbek Iskenaliev", "Murat"))));
        movies.add(new Movie("Salam New York", 2013, "New Yorkko baryp ar kandai kyiynchylykka tush bolgon jigit tuuraluu", new Director("Ruslan", "Akun"),
                List.of(new Cast("Bektemir Mamayusupov", "Batyr"),
                        new Cast("Bakyt Mukul", "Akim"),
                        new Cast("Alex Galper", "Chess Player"))));
        movies.add(new Movie("Kok Boru", 2018, "Kyrgyzdyn uluttuk oiunu Kok Boru tuuraluu", new Director("Ruslan", "Akun"),
                List.of(new Cast("Emil Esenaliev", "Mairambek"),
                        new Cast("Asylkhan Tolypov", "Maksat"),
                        new Cast("Taalaikan Abazova", "Jarkyn"))));
        movies.add(new Movie("Do+Fa", 2012, "Muzyka suiuuchulor uchun jana suiuugo toibogondor uchun film", new Director("Ernest", "Abdyjaparov"),
                List.of(new Cast("Emil Esenaliev", "Emil"),
                        new Cast("Cholponai Kenjekulova", "Farida"),
                        new Cast("Samat Erkinbaev", "Dooron"))));



        while (true) {
        System.out.print("""
                
                0- Программаны токтотуу
                1- Баардык фильмдер
                2- Фильмдин аты менен издөө
                3- Актёрдун аты менен издөө
                4- Фильмдин жылы менен издөө
                5- Директордун аты менен издөө
                6- Описаниясы боюнча издөө
                7- Роль ойногондордун аты менен издөө
                8- Фильмдин аты менен иреттөө
                9- Фильмдин жылы менен иреттөө
                10- Фильмди директордун аты менен иреттөө
                №: """);
            int num = new Scanner(System.in).nextInt();
            if (num==0){
                System.err.println("Программа токтотулду!");
                break;
            }
            switch (num) {
                case 1 -> movie.getAllMovies(movies);
                case 2 ->{System.out.print("Фильмдин атын жаз: "); movie.findMovieByName(new Scanner(System.in).nextLine(), movies);}
                case 3 ->{System.out.print("Актёрдун атын жаз: ");movie.findMovieByActorName(new Scanner(System.in).nextLine(), movies);}
                case 4 ->{System.out.print("Фильмдин жылын жаз: "); movie.findMovieByYear(new Scanner(System.in).nextInt(), movies);}
                case 5 ->{System.out.print("Директордун атын жаз: ");movie.findMovieByDirector(new Scanner(System.in).nextLine(),movies);}
                case 6 ->{System.out.print("Фильмдеги описания боюнча изде: "); movie.findMovieByDescription(new Scanner(System.in).nextLine(), movies);}
                case 7 ->{System.out.print("Фильмдеги ролун жаз: ");movie.findMovieByRole(new Scanner(System.in).nextLine(),movies);}
                case 8 ->{System.err.println("\n========Фильмдин аты боюнча сорттоду========");movies.sort(Movie.sortByName); System.out.println(movies);}
                case 9 ->{System.err.println("\n========Фильмдин жылы боюнча сорттоду======="); movies.sort(Movie.sortByYear); System.out.println(movies);}
                case 10 ->{System.err.println("\n========Режисер боюнча сорттоду======");movies.sort(Movie.sortByDirector);System.out.println(movies);}
                default -> System.err.println("Мындай кино жок!");
            }
        }
    }
}