package patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hii, let´s get start whit default:Facebook):");

		SocialSpammer spammer = new SocialSpammer(new Facebook(createTestProfiles()));
		
	        spammer.sendSpamToFriends("anna.smith@bing.com",
	                "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?");
	        spammer.sendSpamToCoworkers("anna.smith@bing.com",
	                "Hey! This is Anna's boss Jason. Anna told me you would be interested in [link].");
		
	}
	
	 public static List<Profile> createTestProfiles() {
	        List<Profile> data = new ArrayList<Profile>();
	        data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
	        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
	        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
	        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
	        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
	        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
	        return data;
	    }

}
