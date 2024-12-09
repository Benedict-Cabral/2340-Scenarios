import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        /* 
         * AUTHORS:
         * Amiti Arunmozhi
         * Benedict Cabral
         * Padmanaban Saravanan
         * Romir Varshney
         * Alan Zhu
         * 
         * Proxy Pattern Implemented
         * Authentication is connected through a proxy
         *
         */
    
        AuthenticationProxy authProxy = new AuthenticationProxy(3);

        List<GTProfile> validProfiles = new ArrayList<>();

        GTProfile student1 = new GTProfile("student1", "password", "John Doe", "CM Major");
        GTProfile student2 = new GTProfile("student2", "password", "John Doe", "CS Major");
        GTProfile student3 = new GTProfile("student3", "password", "John Doe", "ME Major");
        GTProfile student4 = new GTProfile("student4", "password", "John Doe", "EE Major");

        validProfiles.add(student1);
        validProfiles.add(student2);
        validProfiles.add(student3);
        // student4 will NOT be a valid profile and therefore result in a failure

       //Testing logins
        authProxy.authenticateUser(student1, validProfiles);  // Succeed
        authProxy.authenticateUser(student2, validProfiles);  // Succeed
        authProxy.authenticateUser(student4, validProfiles);  // Fail since it is not a vaild profile
        authProxy.authenticateUser(student3, validProfiles);  // Too Many attempts

        student4.resetPassword("NewPassword2024"); 
        student1.updateProfile("New Info!");

    }
}




