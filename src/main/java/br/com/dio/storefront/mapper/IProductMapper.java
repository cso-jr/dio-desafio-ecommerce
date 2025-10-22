package br.com.dio.storefront.mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

import java.math.BigDecimal;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.dio.storefront.controller.request.ProductSaveRequest;
import br.com.dio.storefront.controller.response.ProductAvailableResponse;
import br.com.dio.storefront.controller.response.ProductDetailResponse;
import br.com.dio.storefront.controller.response.ProductSavedResponse;
import br.com.dio.storefront.dto.ProductInfoDTO;
import br.com.dio.storefront.entity.ProductEntity;


@Mapper(componentModel = SPRING)
public interface IProductMapper {

	ProductInfoDTO toDTO(final ProductEntity entity, final BigDecimal price);
	
	@Mapping(target = "active", constant = "false") // para que qualquer produto que entre no estoque, inicialmente fica indisponível
	ProductEntity toEntity(final ProductSaveRequest request);
	
	ProductSavedResponse toResponse(final ProductEntity entity);
	
	List<ProductAvailableResponse> toResponse(final List<ProductEntity> entities);
	
	ProductDetailResponse toResonse(final ProductInfoDTO dto);
	
	
	
	
	
}
