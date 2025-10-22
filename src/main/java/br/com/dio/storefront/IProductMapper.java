package br.com.dio.storefront;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

import java.math.BigDecimal;

import org.mapstruct.Mapper;

import br.com.dio.storefront.dto.ProductInfoDTO;
import br.com.dio.storefront.entity.ProductEntity;


@Mapper(componentModel = SPRING)
public interface IProductMapper {

	ProductInfoDTO toDTO(final ProductEntity entity, final BigDecimal price);
	
	
	
}
