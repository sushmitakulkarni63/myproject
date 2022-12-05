package org.simplilearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Test {
	public static void main(String[]args)throws IOException{
		FileUtil util=new FileUtil();
		int ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1.Add File");
			System.out.println("2.Delete File");
			System.out.println("3.Display Files");
			System.out.println("4.search");
			System.out.println("5.Exit");
			System.out.println("Enter the Choice");
			ch = Integer.parseInt(br.readLine());
			
			switch (ch) {
		 case 1: 
			String fileName;
			System.out.println("Enter the Filename");
			fileName= br.readLine();
			util.addFile(fileName);
			break;
		 case 2:
				String fileName1;
			System.out.println("Enter the Filename");
			fileName1= br.readLine();
			util.deleteFile(fileName1);
			break;
		 case 3:
			List<MyFile> files=util.getFiles();
			for(MyFile f: files)
				System.out.println(f.getId()+"\t"+f.getFileName());
			break;
		 case 4:
				String fileName2;
			System.out.println("Enter the Filename");
			fileName2= br.readLine();
			if (util.search(fileName2))
				System.out.println("File is Existing");
			else
				System.out.println("File Does not Exists");
			break;
			}
		} while(ch<5);
	}
}
