package nLayeredDemo;


import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
//import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
//import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		//Todo: Spring AudioClip ileAudioClip ��z�lecek
		
		//ProductService productService = new ProductManager(new HibernateProductDao());
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		/*new JLoggerManager() i�in; ba�kas�n�n yazd��� servisler dahil edilemez.
		 *  new JLoggerManagerAdapter() Bunun i�in adaptasyon yap�l�r Core i�erisinde.
		 */
		
		Product product= new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
