package imagerepo.auth.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * TODO: this should come as a maven dependency from Auth service
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticatedUser {

    private String username;
    private List<String> roles;
}
