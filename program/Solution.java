package program;
//create table MovieRatings(Movieid int,Ratings int);
//show tables;
import java.util.*;

public class Solution 
{
    public static class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {
        @Override
        public void putNewInnings(String player, int runs)
        {
            // YOUR CODE HERE
        	
        	if(runs>0)
        		return;
        	
        	
        }

	        @Override
	        public double getAverageRuns(String player)
	        {
	            // YOUR CODE HERE
	        	Scanner sc=new Scanner(System.in);
	    		int T=sc.nextInt();
	    		for(int i=0;i<T;i++){
	    		    int N=sc.nextInt();
	    		    int arr[]=new int[N];
	    		    String str[]=new String[N];
	    		    for(int j=0;j<N;j++){
	    		        arr[j]=sc.nextInt();
	    		        str[j]=sc.next();
	    		    }
	    		    int sum=0;
	    		    int out=0;
	    		    for(int j=0;j<N;j++){
	    		        sum+=arr[j];
	    		        //System.out.println(str[j]);
	    		        if(str[j].equals("out"))
	    		        out+=1;
	    		    }
	    		    if(out==0){
	    		        System.out.println(-1);
	    		    }
	    		    else
	    		    if(sum%out!=0)
	    		    System.out.println((sum/out)+1);
	    		    else
	    		    System.out.println(sum/out);
	    		}
				return T;
	        }

        @Override
        public int getInningsCount(String player)
        {
            // YOUR CODE HERE
        	Scanner sc = new Scanner(System.in);
            int count = 0;
            int num = sc.nextInt();
            while(num!=0)
            {
               num = num/10;
               count++;
            }
			return num;
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface PlayerStatisticsCollector 
    {
        // This is an input. Make note of this player inning.  Runs is a non negative integer.
        void putNewInnings(String player, int runs);

        // Get the runs average(mathematical average) for a player
        double getAverageRuns(String player);

        // Get the total number of innings for the player
        int getInningsCount(String player);
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
            final Set<String> players = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String player = tokens[0];
                players.add(player);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewInnings(player, runs);

            }

            for (String player : players) {
                System.out.println(
                        String.format("%s %.4f %d", player, stats.getAverageRuns(player), stats.getInningsCount(player)));
            }

        }
        scanner.close();

    }
}
