package com.sb.training;

import com.sb.training.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);

		/*List<Person> personList = new ArrayList<>();
		Person p = new Person();
		Bike b = new Bike();
		List<BankAccount> baList = new ArrayList<>();
		BankAccount ba = new BankAccount();
		BankAccount ba1 = new BankAccount();
		Fingerprint f = new Fingerprint();
		List<House> hList = new ArrayList<>();
		House h= new House();
		House h1= new House();


		p.setId(1);
		p.setName("Raju");


		b.setBikeBrand("Royal Enfield");
		b.setId(1);

		ba.setAccountHolderName("Raju");
		ba.setAccountNumber(123456);
		ba.setId(1);
		ba.setPerson(p);
		ba1.setAccountHolderName("Raj");
		ba1.setAccountNumber(12345);
		ba1.setId(2);
		baList.add(ba);
		baList.add(ba1);

		f.setId(1);

		h.setCity("Hyderabad");
		h.setColony("Gachibowli");
		h.setId(1);
		h1.setCity("Hyderabad");
		h1.setColony("Kukatpally");
		h1.setId(2);
		hList.add(h);

		p.setBike(b);
		p.setFingerprint(f);
		p.setBankAccountList(baList);
		p.setHouseList(hList);

		personList.add(p);
		System.out.print(personList);*/
	}
}
