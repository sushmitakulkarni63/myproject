package org.simplilearn;

public class MyFile {
	 private int id;
	 private String fileName;
	 public MyFile() {

	 }
	 public MyFile(int id, String fileName){
		 super();
		 this.id=id;
		 this.fileName=fileName;
	 }
	 public int getId(){
		 return id;
	 }
	public void setId(int id){
		this.id=id;

	}
	public String getFileName() {
	return fileName;
	}
	public void setFilename(String fileName) {
		this.fileName=fileName;
	}
}
		 