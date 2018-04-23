package ru.itpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.itpark.entity.Lead;
import ru.itpark.repository.LeadRepository;

import java.util.ArrayList;

@SpringBootApplication
public class CrmApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(CrmApplication.class, args);

		// Генерируем тестовые данные, чтобы потестить

		/*
		generateDummyData(context);

		*/
	}

	/*
	private static void generateDummyData(ApplicationContext context) {
		LeadRepository repository = context.getBean(LeadRepository.class);
		{
			Lead petya = new Lead("Petya", "79270000001", "petya@mail.ru");
			repository.save(petya);
		}
		{
			Lead vasya = new Lead("Vasya", "79270000001", "vasya@mail.ru");
			repository.save(vasya);
		}
	}

	*/
}