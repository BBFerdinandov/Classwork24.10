package lesson2;

import lesson1.ContentBasedFilter;

public class RecommendedImplementation {
    private Filter filter;
    public RecommendedImplementation(Filter filter) {
        super();
        this.filter = filter;
    }

    public String [] recommendedMovies (String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
