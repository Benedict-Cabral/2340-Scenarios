import java.util.List;

public class GTProfile {
    private String username;
    private String password;
    private String name;
    private String profileInfo;

    public GTProfile(String username, String password, String name, String profileInfo) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.profileInfo = profileInfo;
    }

    public GTProfile(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getprofileInfo() {
        return profileInfo;
    }

    public static boolean authenticate(GTProfile profile, List<GTProfile> validProfiles) {
        for (GTProfile validProfile : validProfiles) {
            if (validProfile.getUsername().equals(profile.getUsername()) &&
                validProfile.getPassword().equals(profile.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password for " + username + " has been reset.");
    }

    public void updateProfile(String newProfileInfo) {
        this.profileInfo = newProfileInfo;
        System.out.println("Profile Info updated for " + username + ", Info - " + profileInfo);
    }
}
