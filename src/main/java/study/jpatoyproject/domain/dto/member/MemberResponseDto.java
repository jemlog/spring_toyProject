package study.jpatoyproject.domain.dto.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import study.jpatoyproject.domain.Address;
import study.jpatoyproject.domain.Gender;
import study.jpatoyproject.domain.Grade;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponseDto {

    private Long id;
    private String name;
    private int age;
    private Grade grade;
    private Gender gender;
    private Address address;
}
