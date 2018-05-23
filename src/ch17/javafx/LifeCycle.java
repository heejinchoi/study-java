package ch17.javafx;

import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

public class LifeCycle extends Application {
	public LifeCycle() {
		System.out.println(Thread.currentThread().getName() + " : LifeCycle() 호출");
	}
	
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : init() 호출");
		
		Parameters params = getParameters();
		List<String> list = params.getRaw();
		Map<String, String> map = params.getNamed();
		System.out.println(list);
		System.out.println(map);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + " : start() 호출");
		primaryStage.show();
	}
	
	@Override
	public void stop() throws Exception{
		System.out.println(Thread.currentThread().getName() + " : stop() 호출");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : main() 호출");
		launch(args);
		
	}
}
