package com.gaurav.io.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    // File class cannot read or write a file, it only gives us metadata manipulation capability

    public static void main(String[] args) throws IOException {
        File file = new File("/home/gaurav/Desktop/COURSES/JAVA/file.txt");
        file.createNewFile(); // creates an empty file;
        //checkIfFileExists();
        //checkIfDirectoryExists();
        //createDirectory();
        //createDirectories();
        //fileLength();
        //deleteFile();
        //listFilesAsArrayOfFiles();
        listFilesAsString();
    }

    public static void checkIfFileExists(){
        File file = new File("/home/gaurav/Desktop/COURSES/JAVA/file.txt");
        System.out.println("Does File Exists ?::"+file.exists());
    }

    public static void checkIfDirectoryExists(){
        File file = new File("/home/gaurav/Desktop/COURSES/JAVA");
        System.out.println("Does Directory Exists ? ::"+file.exists());
    }

    // create single end directory
    public static void createDirectory(){
        File file = new File("/home/gaurav/Desktop/COURSES/JAVA/testdir");
        System.out.println("Create Directory if not present, True if creation is successful, False if not able to create/already present::"+ file.mkdir());
    }

    // create directories which are present in the path if they are not present
    public static void createDirectories(){
        File file = new File("/home/gaurav/Desktop/COURSES/JAVA/testdir/testdirchild/testdirgrandchild");
        System.out.println("Create Directories if not present, True if creation is successful, False if not able to create/already present::"+ file.mkdirs());
    }
    // file length in bytes
    public static void fileOrDirectoryLength(){
        File file = new File("/home/gaurav/Desktop/COURSES/JAVA/file.txt");
        System.out.println("File Length::"+ file.length());
        System.out.println("File Path::"+file.toString());
    }

    public static void deleteFileOrDirectory(){
        File file = new File("/home/gaurav/Desktop/COURSES/JAVA/file.txt");
        System.out.println("File Deleted::"+ file.delete());
    }

    public static void listFilesAsString(){
        File file = new File("/home/gaurav/Desktop/COURSES/JAVA");
        Arrays.stream(file.list()).forEach(System.out::println);
    }
    // objects of files in a directory
    public static void listFilesAsArrayOfFiles(){
        File file = new File("/home/gaurav/Desktop/COURSES/JAVA");
        Arrays.stream(file.listFiles()).forEach(x-> System.out.println(x.getName()));
    }


}
