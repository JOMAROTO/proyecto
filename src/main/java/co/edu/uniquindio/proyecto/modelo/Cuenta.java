package co.edu.uniquindio.proyecto.modelo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import lombok.*;

@Document("cuentas")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cuenta implements Serializable{
    @Id
    @EqualsAndHashCode.Include
    private String email;
    private String nombre;
    private String password;
    private EstadoRegistro estado;
}
