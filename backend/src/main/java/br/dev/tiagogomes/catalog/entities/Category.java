package br.dev.tiagogomes.catalog.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Category implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String name;
}
