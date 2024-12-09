import java.util.List;

public class GTSSO {
    public boolean authenticateUser(GTProfile profile, List<GTProfile> validProfiles) {
        return GTProfile.authenticate(profile, validProfiles);
    }
}