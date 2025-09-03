package uis.edu.entorno.backendVentas.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @NotNull(message = "Los nombres no pueden ser nulos")
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 3, max = 70, message = "El nombre debe ser mayor a 3 caracteres")
    @Column(name = "nombres", nullable = false, length = 70)
    private String nombres;

    @NotNull(message = "Los nombres no pueden ser nulos")
    @NotBlank(message = "Los apellidos son obligatorios")
    @Size(min = 3, max = 150, message = "Los apellidos deben ser mayor a 3 carateres")
    @Column(name = "apellidos", nullable = false, length = 150)
    private String apellidos;

    @Size(max = 150, message = "La dirección no debe superar los 150 caracteres")
    @Column(name = "direccion", nullable = true, length = 150)
    private String direccion;

    @Size(min = 8, max=10, message = "El teléfono debe tener al menos 8 digitos y no más de 10")
    @Column(name = "telefono", nullable = true, length = 10)
    private String telefono;

    @NotNull
    @NotBlank(message = "El email es obligatorio")
    @Size(min= 10, message = "El email debe tener 10 caracteres")
    @Email(message = "EL email enviado no es un formato válido")
    @Column(nullable = false, length = 150)
    private String email;

}