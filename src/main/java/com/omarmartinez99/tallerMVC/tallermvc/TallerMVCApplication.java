package com.omarmartinez99.tallerMVC.tallermvc;

import com.omarmartinez99.tallerMVC.tallermvc.mapper.CarMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The type Taller mvc application.
 */
@SpringBootApplication
public class TallerMVCApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(TallerMVCApplication.class, args);
	}

	/**
	 * Las etiquetas controller, mapper, etc crean este tipo de metodos
	 * Bean en tiempo de ejecucion
	 * para instanciarlos al lanzar la app
	 * spring es una bolsa de bean
	@Bean
	public CarMapper getCarMapper()  {
		return Mappers.getMapper(CarMapper.class);
	}
	**/

}
