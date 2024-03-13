package com.aryan.inventoryservice;

import com.aryan.inventoryservice.model.Inventory;
import com.aryan.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return (args) -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("Iphone_15");
			inventory.setQuantity(100);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("Iphone_15_pro");
			inventory1.setQuantity(10);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}
}
