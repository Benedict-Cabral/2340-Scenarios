import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class AuthenticationProxy {
    private GTSSO authSystem;  
    private Queue<String> requestQueue; 
    private int maxRequests;  

    public AuthenticationProxy(int maxRequests) {
        this.authSystem = new GTSSO();  
        this.requestQueue = new LinkedList<>();  
        this.maxRequests = maxRequests; 
    }

    public synchronized boolean authenticateUser(GTProfile profile, List<GTProfile> validProfiles) {
        
        if (requestQueue.size() >= maxRequests) {
            System.out.println("Too many login attempts. Please try again later.");
            return false; 
        }

        requestQueue.add(profile.getUsername());

        //Implementation of the Proxy Design Pattern
        boolean authenticated = authSystem.authenticateUser(profile, validProfiles); 
        
        if (authenticated) {
            System.out.println(profile.getUsername() + " authenticated successfully.");
        } else {
            System.out.println("Authentication failed for " + profile.getUsername());
        }
        return authenticated;  
    }
}