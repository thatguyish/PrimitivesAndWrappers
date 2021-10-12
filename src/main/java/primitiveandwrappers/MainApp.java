package primitiveandwrappers;

public class MainApp {
    public static void main(String[] args) {
        PrimitivesAndWrappers.arrayListContaintingCharacters.add('a');
        PrimitivesAndWrappers.arrayListContaintingCharacters.add('b');
        PrimitivesAndWrappers.arrayListContaintingCharacters.add('c');
        PrimitivesAndWrappers.arrayListContaintingCharacters.add('d');

        //retrieves and prints all characters in arraylist
        for (char letter : PrimitivesAndWrappers.arrayListContaintingCharacters){
            System.out.println(letter);
        }
    }
}
