import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class HelloWorld {

	public static void main(String[] args) throws IOException {

		File inputFile = new File("1.txt");
		File tempFile = new File("3.txt");

		LineNumberReader reader = new LineNumberReader(
				new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String currentLine;

		try {
			//command s r h z
			if (args[0].equals("s") && args[1].equals("r") && args[2].equals("h") && args[3].equals("z")) {
				while ((currentLine = reader.readLine()) != null) {
					if (currentLine.indexOf(args[2]) != -1) {
						String newtxt = currentLine
								.replaceAll(args[2], args[3]);
						writer.write(newtxt
								+ System.getProperty("line.separator"));
					} else {
						writer.write(currentLine
								+ System.getProperty("line.separator"));
					}
				}
				writer.close();
				reader.close();
			}
			//command s r a n 20
			else if (args[0].equals("s") && args[1].equals("r") && args[2].equals("a") && args[3].equals("n") && args[4].equals("20")) {
				while ((currentLine = reader.readLine()) != null) {
					if (reader.getLineNumber() == Integer.parseInt(args[4]))
						continue;
					writer.write(currentLine
							+ System.getProperty("line.separator"));
				}
				writer.close();
				reader.close();
			} 
			//command i 15 hello
			else if (args[0].equals("i") && args[1].equals("15") && args[2].equals("hello")) {
				while ((currentLine = reader.readLine()) != null) {
					if (reader.getLineNumber() == Integer.parseInt(args[1]))
						writer.write("hello this is a test line"
								+ System.getProperty("line.separator"));
					writer.write(currentLine
							+ System.getProperty("line.separator"));
				}
				writer.close();
				reader.close();
			} 
			//command s r a n 55
			else if (args[0].equals("s") && args[1].equals("r") && args[2].equals("a") && args[3].equals("n") && args[4].equals("55")) {
				while ((currentLine = reader.readLine()) != null) {
					if (reader.getLineNumber() == Integer.parseInt(args[4])) {
						if (currentLine.indexOf(args[2]) != -1) {
							String newtxt = currentLine.replaceAll(args[2],
									args[3]);
							writer.write(newtxt
									+ System.getProperty("line.separator"));
						}
					} else
						writer.write(currentLine
								+ System.getProperty("line.separator"));
				}
				writer.close();
				reader.close();
			} 
			//command s r and dna
			else if (args[0].equals("s") && args[1].equals("r") && args[2].equals("and") && args[3].equals("dna")) {

				while ((currentLine = reader.readLine()) != null) {
					if (currentLine.indexOf(args[2]) != -1) {
						String newtxt = currentLine
								.replaceAll(args[2], args[3]);
						writer.write(newtxt
								+ System.getProperty("line.separator"));
					} else {
						writer.write(currentLine
								+ System.getProperty("line.separator"));
					}
				}
				writer.close();
				reader.close();
			} 
			//command rev 45
			else if (args[0].equals("rev") && args[1].equals("45")) {

				while ((currentLine = reader.readLine()) != null) {
					if (reader.getLineNumber() == Integer.parseInt(args[1])) {
						StringBuffer newtxt = new StringBuffer(currentLine);
						writer.write(newtxt.reverse()
								+ System.getProperty("line.separator"));
					} else {
						writer.write(currentLine
								+ System.getProperty("line.separator"));
					}
				}
				writer.close();
				reader.close();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter right command. " + e);
		}
	}
}
