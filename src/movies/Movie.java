package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public static void showMovies(Movie[] movies, String category){
        for(Movie movie: movies){
            if(category.equals("all")){
                System.out.println(movie.getName() + " " + movie.getCategory());
            }else if(movie.getCategory().equals(category)){
                System.out.println(movie.getName() + " " + movie.getCategory());
            }
        }

    }

    public static void searchTitle(Movie[] movies, String title){
        for(Movie movie: movies){
            if(movie.getName().contains(title)){
                System.out.println(movie.getName() + " " + movie.getCategory());
            }
        }
    }
}
