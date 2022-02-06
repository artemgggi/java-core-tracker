package ru.job4j.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Search {
	public static void main(String[] args) throws IOException {
		Path start = Paths.get("C:\\Users\\Artem\\Desktop\\tracker\\data");
		List<String> resultList = new ArrayList<>();
		search(start, p -> p
				.toFile()
				.getName()
				.endsWith(".txt"))
				.forEach(System.out::println);
		try {
			Files.list(start).filter(p -> p
					.toString()
					.endsWith(".txt"))
					.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Path> search(Path root, Predicate<Path> condition)
			throws IOException {
		SearchFiles searcher = new SearchFiles(condition);
		Files.walkFileTree(root, searcher);
		return searcher.getPath();
	}
}
