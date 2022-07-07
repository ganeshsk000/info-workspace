package com.project.tester;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import com.project.dao.FoodDAO;
import com.project.dao.FoodDaoImpl;
import com.project.dto.FoodsDTO;

public class Tester {
	public static void main(String[] args) {
		Set<FoodsDTO> set=new HashSet<FoodsDTO>();
		set.add(new FoodsDTO(1, "Biriyani", 120.00));
		set.add(new FoodsDTO(2, "Dosa", 50.0));
		set.add(new FoodsDTO(3, "Meals", 100.00));
		set.add(new FoodsDTO(4, "Idli", 100.00));
		System.out.println("Fetching set through an method interfce,,,,,,,,,,,,,,,");
		set.forEach(System.out::println);
		System.out.println("fetching set through Lambda expression,,,,,,,,,,,");
		Consumer<Set<FoodsDTO>>consumer=(f)->System.out.println(set);
		consumer.accept(set);
		System.out.println("Using method reference,,,,,,,,,,,,,");
		FoodDAO food=FoodDaoImpl::delicious;
		food.delicious();
		System.out.println("using lambda expresion,,,,,,,,");
		FoodDAO food1=()->System.out.println("Foods are very delicious");
		food1.delicious();
	}

}
