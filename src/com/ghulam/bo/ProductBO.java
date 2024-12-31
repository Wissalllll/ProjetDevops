package com.ghulam.bo;

import java.util.ArrayList;

import com.ghulam.product.Product;

public class ProductBO {
	private ArrayList<Product> products;

	public ProductBO() {
		products = new ArrayList<>();
	}

	public ArrayList<Product> getAirConditioner() {
		products.clear();
		products.add(new Product("Daikin", 32999));
		products.add(new Product("LG", 41499));
		products.add(new Product("Samsung", 30999));
		products.add(new Product("Mitsubishi Electric ", 25999));
		return products;
	}

	public ArrayList<Product> getCamera() {
		products.clear();
		products.add(new Product("Canon", 16999));
		products.add(new Product("Nikon", 18999));
		products.add(new Product("Sony", 12999));
		products.add(new Product("Panasonic ", 3199));
		return products;
	}

	public ArrayList<Product> getHeadphones() {
		products.clear();
		products.add(new Product("Apple AirPods", 1700));
		products.add(new Product("Sony", 499));
		products.add(new Product("Bose", 299));
		products.add(new Product("Sennheiser", 499));
		return products;
	}

	public ArrayList<Product> getKurtas() {
		products.clear();
		products.add(new Product("Mango", 350));
		products.add(new Product("H&M", 500));
		products.add(new Product("Zara", 1000));
		products.add(new Product("Dolce & Gabbana ", 2000));
		return products;
	}

	public ArrayList<Product> getLaptops() {
		products.clear();
		products.add(new Product("Apple", 50000));
		products.add(new Product("HP", 45000));
		products.add(new Product("Dell", 38000));
		products.add(new Product("Lenovo", 40000));
		return products;
	}

	public ArrayList<Product> getLc() {
		products.clear();
		products.add(new Product("Nike", 999));
		products.add(new Product("Adidas", 1049));
		products.add(new Product("Puma", 1209));
		products.add(new Product("Reebok", 869));
		return products;
	}

	public ArrayList<Product> getMobiles() {
		products.clear();
		products.add(new Product("Apple", 45000));
		products.add(new Product("Samsung", 9999));
		products.add(new Product("Redmi", 12999));
		products.add(new Product("Nokia", 18999));
		products.add(new Product("Huawei", 14999));
		return products;
	}

	public ArrayList<Product> getFictionBooks() {
		products.clear();
		products.add(new Product("Around the Moon", 184));
		products.add(new Product("The Hunger Games", 326));
		products.add(new Product("The Alchemist", 396));
		return products;
	}

	public ArrayList<Product> getNovelBooks() {
		products.clear();
		products.add(new Product("The Silent Patient", 1005));
		products.add(new Product("Educated", 124));
		products.add(new Product("A Gentleman in Moscow", 129));
		products.add(new Product("The Martian", 135));
		return products;
	}

	public ArrayList<Product> getEBooks() {
		products.clear();
		products.add(new Product("The Girl on the Train!", 657));
		products.add(new Product("Akira", 2121));
		products.add(new Product("Becoming", 1039));
		products.add(new Product("Fight to Finish", 450));
		return products;
	}

	public ArrayList<Product> getRefrigerator() {
		products.clear();
		products.add(new Product("Whirlpool", 13249));
		products.add(new Product("Samsung", 16499));
		products.add(new Product("LG", 30458));
		products.add(new Product("Bosch ", 24499));
		return products;
	}

	public ArrayList<Product> getMicrowaves() {
		products.clear();
		products.add(new Product("LG", 5299));
		products.add(new Product("Samsung", 6299));
		products.add(new Product("Panasonic", 5399));
		products.add(new Product("Whirlpool", 4599));
		return products;
	}

	public ArrayList<Product> getSareeList() {
		products.clear();
		products.add(new Product("Elie Saab", 1299));
		products.add(new Product("Bouchra Filali ", 699));
		products.add(new Product("Fadila El Gadi ", 719));
		products.add(new Product("Kaftan 9 ", 551));
		return products;
	}

	public ArrayList<Product> getShirts() {
		products.clear();
		products.add(new Product("Arrow", 699));
		products.add(new Product("Raymond", 1234));
		products.add(new Product("Peter England", 799));
		products.add(new Product("Puma", 945));
		return products;
	}

	public ArrayList<Product> getSuits() {
		products.clear();
		products.add(new Product("Arrow", 699));
		products.add(new Product("Raymond", 1234));
		products.add(new Product("Peter England", 2999));
		products.add(new Product(" Zara", 3134));
		return products;
	}

	public ArrayList<Product> getTvs() {
		products.clear();
		products.add(new Product("Apple AirPods", 1700));
		products.add(new Product("Bolt", 499));
		products.add(new Product("Philips", 299));
		products.add(new Product("Samsung", 399499));
		return products;
	}

	public ArrayList<Product> getTshirts() {
		products.clear();
		products.add(new Product("ADIDAS", 584));
		products.add(new Product("Jack & Jones", 594));
		products.add(new Product("Roadster", 699));
		products.add(new Product("Allen Solly", 604));
		return products;
	}

	public ArrayList<Product> getwMachines() {
		products.clear();
		products.add(new Product("Samsung", 13400));
		products.add(new Product("Whirlpool", 16400));
		products.add(new Product("LG", 9499));
		products.add(new Product("Haier", 11699));
		return products;
	}
}