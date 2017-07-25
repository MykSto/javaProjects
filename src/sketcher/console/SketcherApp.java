
package sketcher.console;

import java.util.Scanner;

import sketcher.domain.Sketcher;

public class SketcherApp {
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		CommandFactory factory = new CommandFactory(new Sketcher());
		AbstractCommand command = new DefaultCommand(AbstractCommand.HELP);
		command.execute();
		while (! command.evaluate(AbstractCommand.EXIT)) {
			command = factory.createCommand(scanner.nextLine());
			command.execute();
		}
		scanner.close();
		
	}

}
