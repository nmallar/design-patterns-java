package splitwise.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter

public class UserGroup {

    private int id;
    private String name;
    private List<User> users;
}
