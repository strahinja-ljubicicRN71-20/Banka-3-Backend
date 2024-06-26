package rs.edu.raf.userservice.domain.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import rs.edu.raf.userservice.domain.model.Role;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class EmployeeCreateDto {
    //kad kreiramo novog zaposlenog
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String username;
    @Email
    @NotBlank
    private String email;
    @NotNull
    private Long dateOfBirth;
    @NotBlank
    @Size(max = 1)
    private String gender;
    @NotBlank
    private String jmbg;
    @NotBlank
    private String address;
    @NotBlank
    @Size(min = 9, max = 10)
    private String phoneNumber;
    @NotNull
    private Role role;
}
