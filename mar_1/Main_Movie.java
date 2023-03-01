package Mar_01;

public class Main_Movie {
	public static void main(String[] args) {
		Movie m=new Movie();
		m.setMoviename( "John Wick");
		 m.setMovieStatingTime("4pm");
		 m.setMovieEndTime("7pm");
		 m.setMovieTicketPrice("400");
		 System.out.println("Movie name:"+m.moviename);
		 System.out.println("Movie time:"+m.movieStatingTime);
		 System.out.println("Movie EndTime:"+m.movieEndTime);
		 System.out.println("movie ticket price:"+m.MovieTicketPrice);
	}


}
