package pe.edu.upeu.pppmanager.entity;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Data
@Table(name = "estudiante")
@CrossOrigin
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Long idPersona;
    @Column(name = "codigo", length = 9, nullable = false, unique = true)
    private char codigo;
    @Column(name = "estado", length = 1, nullable = false)
    private char estado;
    
	@ManyToOne
	@JoinColumn(name="id_persona", nullable = false)
	private Persona persona;
}
