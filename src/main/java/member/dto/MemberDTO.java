package member.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {
    private String email;
    private String password;
    private String name;

    public Member toMember() {return Member.builder().email(email).password(password).name(name).build();}
}
