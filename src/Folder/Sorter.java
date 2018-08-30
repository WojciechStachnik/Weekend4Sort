package Folder;

public class Sorter {
    public static void sortList(){
        Data.sortNumberList.add(Data.numberList.get(0));
        for (int i = 1; i < Data.numberList.size(); i++) {
            Integer numberInputToList = Data.numberList.get(i);
            int indexToInsert = findIndexToInsert(numberInputToList);
            Data.sortNumberList.add(indexToInsert, numberInputToList);
        }

    }

    public static int findIndexToInsert(Integer numberToInsert) {
        for (int i = 0; i < Data.sortNumberList.size(); i++) {
            if (numberToInsert < Data.sortNumberList.get(i)) {
                return i;
            }

        }
        return Data.sortNumberList.size();
    }
}

