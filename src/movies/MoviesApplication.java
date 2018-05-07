package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args){
        Movie[] moviesArray = MoviesArray.findAll();
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in animated category");
        System.out.println("3 - view movies in drama category");
        System.out.println("4 - view movies in horror category");
        System.out.println("5 - view movies in scifi category");
        System.out.println("Enter your choice: ");
        int input = Input.getInt();
        System.out.println("You selected " + input);
        switch(input){
            case 0:
                break;
            case 1:
                Movie.showMovies(moviesArray, "all");
                break;
            case 2:
                Movie.showMovies(moviesArray, "animated");
                break;
            case 3:
                Movie.showMovies(moviesArray, "drama");
                break;
            case 4:
                Movie.showMovies(moviesArray, "horror");
                break;
            case 5:
                Movie.showMovies(moviesArray, "scifi");
        }
        System.out.println("Search again by title.  Enter a title: ");
        String title = Input.getString();
        Movie.searchTitle(moviesArray, title);
        System.out.println("Add a movie!");
        System.out.println("Input a title");
        String newtitle = Input.getString();
        System.out.println("Input a category");
        String newCategory = Input.getString();
        Movie newMovie = new Movie(newtitle, newCategory);
        int length = moviesArray.length;
        int newLength = length + 1;
        Movie[] movies = new Movie[newLength];
        for(int i = 0; i < moviesArray.length; i++){
            movies[i] = moviesArray[i];
        }
        movies[newLength-1] = newMovie;

        System.out.println("Here is your new movie in the list: ");
        Movie.showMovies(movies, "all");
        System.out.println("All movies in the same category: ");
        Movie.showMovies(movies, newCategory);
    }
}
