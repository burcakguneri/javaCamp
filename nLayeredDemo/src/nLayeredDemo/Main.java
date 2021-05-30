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
		
		//Todo: Spring AudioClip ileAudioClip çözülecek
		
		//ProductService productService = new ProductManager(new HibernateProductDao());
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		/*new JLoggerManager() için; baþkasýnýn yazdýðý servisler dahil edilemez.
		 *  new JLoggerManagerAdapter() Bunun için adaptasyon yapýlýr Core içerisinde.
		 */
		
		Product product= new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
