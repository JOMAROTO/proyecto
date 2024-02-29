package co.edu.uniquindio.proyecto.modelo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.List;

import lombok.*;
@Document("negocios")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Negocio {
    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private Ubicacion ubicacion;
    private String nombre;
    private String descripcion;
    private List<Horario> horarios;
    private EstadoRegistro estado;
    private List<String> imagenes;
    private String codigoCliente;
    private TipoNegocio tipoNegocio;
    private List<String> telefonos;
    private List<HistorialRevision> historialRevisiones;
}
