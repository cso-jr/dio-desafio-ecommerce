package br.com.dio.storefront.entity;

import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class ProductEntity {
	
	@Id
	private UUID id;
	private String name;
	private Boolean active;
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(active, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductEntity other = (ProductEntity) obj;
		return Objects.equals(active, other.active) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	
	
}
