package ch16.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:/git/repository/study-java/src");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName()));
		
	}
}
