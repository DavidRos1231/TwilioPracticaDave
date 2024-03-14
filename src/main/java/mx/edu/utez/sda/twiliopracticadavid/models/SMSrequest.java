package mx.edu.utez.sda.twiliopracticadavid.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SMSrequest {
   
    private String numero;
    private String mensaje;
}
