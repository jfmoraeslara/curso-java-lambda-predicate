package util;

import java.util.function.Consumer;

import entities.Product;

public class PriceUpdate implements Consumer<Product> {

	//consumer accept - taxa de 10%
	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);	
	}

}
