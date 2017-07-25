package files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileApp {

	public static void main(String[] args) {
		// 					 L 	   A 	 B     A 	 S
		int bufferData[] = {0x4c, 0x41, 0x42, 0x41, 0x53};//{140, 244, 162, 34, 111};
		String bufferName = "file1.bfr";
		try {
			writeByteFile(bufferName, bufferData);
		} catch (IOException e) {
			System.err.println("Failas tokiu pavadinimu '"+bufferName+"' nerastas arba trūksta teisių!");
		}
		
		try {
			readByteBuffer(bufferName);
		} catch (IOException e1){
			e1.printStackTrace();
		}
		
		String stringData = "Lithuanian text";
		String stringName = "file.txt";
		try {
			writeStringFile(stringName, stringData);
		} catch (IOException e){
			System.err.println("File was not found!");
			
		}
		
	}
	//Writing B in files
	public static void writeByteFile(String fileName, int[] data) throws IOException{
		FileOutputStream myFileStream = new FileOutputStream(fileName);
		BufferedOutputStream myBufferedStream = new BufferedOutputStream(myFileStream);
		for(int i = 0; i<data.length; i++){
			myBufferedStream.write(data[i]);
		}
		myBufferedStream.flush();
		myBufferedStream.close();
		myFileStream.close();
	}
	
	public static void writeStringFile(String fileName, String data) throws IOException{
		FileOutputStream myFileStream = new FileOutputStream(fileName);
		OutputStreamWriter myOutputWriter = new OutputStreamWriter(myFileStream, "UTF8");
		BufferedWriter myBufferedWriter = new BufferedWriter(myOutputWriter);
		myBufferedWriter.write(data);
		myBufferedWriter.flush();
		myBufferedWriter.close();
		myOutputWriter.close();
		myFileStream.close();
	}
	//Read the File
	public static void readByteBuffer(String fileName) throws IOException{
		FileInputStream myFileStream = new FileInputStream(fileName);
		BufferedInputStream myInputBuffer = new BufferedInputStream(myFileStream);
		int chunk = myInputBuffer.read();
		while (chunk!= -1) {
			System.out.println(chunk);
			chunk = myInputBuffer.read();
		}
		myInputBuffer.close();
		myFileStream.close();
	}
}
