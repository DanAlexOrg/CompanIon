package org.danalex.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>Service for downloading and uploading of files.</p>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CompanionFileApplication {

	/**
	 * <p>Main method of service.</p>
	 *
	 * @param args Arguments of main method.
	 */
	public static void main(String[] args) {

		SpringApplication.run(CompanionFileApplication.class, args);
	}
}
