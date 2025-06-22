package pe.edu.vallegrande.user_service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserCreateDto {
    private String name;
    private String lastName;
    private String documentType;
    private String documentNumber;
    private String cellPhone;
    private String email;
    private String password;
    private List<String> role;
    private String profileImage;
}
