package br.com.dio.storefront.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.dio.storefront.dto.ProductInfoDTO;
import br.com.dio.storefront.entity.ProductEntity;
import br.com.dio.storefront.repository.ProductRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IProductService{

	
	private final ProductRepository repository = null;
	
	@Override
	public ProductEntity save(ProductEntity entity) {
		
		return repository.save(entity);
	}

	@Override
	public void changeActivated(UUID id, boolean active) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductEntity> findAllActive() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductInfoDTO findInfo(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void purchase(UUID id) {
		// TODO Auto-generated method stub
		
	}

}
