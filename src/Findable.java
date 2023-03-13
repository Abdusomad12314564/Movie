import java.util.List;

public interface Findable {
    List<Movie> getAllMovies(List<Movie> movies);

    void findMovieByName(String n, List<Movie> movies);

    void findMovieByActorName(String act, List<Movie> movies);

    void findMovieByYear(int num, List<Movie> movies);

    void findMovieByDirector(String dir, List<Movie> movies);

    void findMovieByDescription(String des, List<Movie> movies);

    void findMovieByRole(String rol, List<Movie> movies);
}
