package com.dev.filehandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileCommonsUtil {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/Text.txt");
		FileUtils.touch(file);

		if (file.exists()) {
			System.out.println("File Exits..");
		} else {
			System.out.println("Files does not Exits");
		}

		FileUtils.deleteQuietly(file);
		if (file.exists()) {
			System.out.println("File Exits..");
		} else {
			System.out.println("Files does not Exits");
		}

	}

}
