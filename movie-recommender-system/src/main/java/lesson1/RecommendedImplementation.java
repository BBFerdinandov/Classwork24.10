package lesson1;

public class RecommendedImplementation {
    public String[] recommendMovies (String movie) {
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        //return new String[] {"M1", "M2", "M3"};
        return results;
    }
}
