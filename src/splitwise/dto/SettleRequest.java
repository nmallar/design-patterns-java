package splitwise.dto;

import lombok.Getter;
import lombok.Setter;
import splitwise.models.User;
import splitwise.models.UserGroup;

@Getter
@Setter
public class SettleRequest {

    private String name;
    private UserGroup userGroup;
    private User user;

}
