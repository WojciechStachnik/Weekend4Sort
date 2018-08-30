package Folder;

public class Main {
    public static void main(String[] args) {
        ReadUtil.readNumbersFromFile();
        System.out.println(Data.numberList);
        Sorter.sortList();
        System.out.println(Data.sortNumberList);
    }
}
