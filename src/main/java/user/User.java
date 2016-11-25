import java.util.List;

/**
 * Created by pskrebnev on 25.11.2016.
 * Describes the "actor" of the Digital Library
 */
public class User {
    private int userUniqueID;
    private String userEncryptedPassword;
    private String userName;
    private List<Integer> userRoles;



    class Role {
        private int roleID;
        private String roleName;
    }
}
