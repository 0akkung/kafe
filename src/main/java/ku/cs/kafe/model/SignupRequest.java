package ku.cs.kafe.model;

import lombok.Data;

/**
 * @author Pawat Puttimit 6410406827
 */
@Data
public class SignupRequest {
    private String username;
    private String password;
    private String name;
}
