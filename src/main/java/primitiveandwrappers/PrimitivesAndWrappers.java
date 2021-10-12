package primitiveandwrappers;

import java.util.ArrayList;

public class PrimitivesAndWrappers {

    public static byte numberFromNegative128To127 = 5;
    public static short numberFromNegative32768To32767 = 10000;
    public static int numberFromNegative2147483648To2147483647 = 1000000000;
    public static long numberFromNegative9223372036854775808To9223372036854775807 = 100000000000000000L;
    public static float numberWithUpTo7DecimalDigits = 1.1111111f;
    public static double numberWithUpTo15DecimalDigits = 1.000000000000000d;
    public static boolean trueOrFalseValues = true;
    public static char singleChar = 'c';

    //Can be used as objects for example: ArrayList<T>
    //Where T would equal a type below
    public static Byte wrappedNumberFromNegative128To127 = 5;
    public static Short wrappedNumberFromNegative32768To32767 = 10000;
    public static Integer wrappedNumberFromNegative2147483648To2147483647 = 1000000000;
    public static Long wrappedNumberFromNegative9223372036854775808To9223372036854775807 = 100000000000000000L;
    public static Float wrappedNumberWith6To7DecimalDigits = 1.1111111f;
    public static Double wrappedNumberWith15DecimalDigits = 1.000000000000000d;
    public static Boolean wrappedTueOrFalseValues = true;
    public static Character wrappedSingleChar = 'c';

    public static void methodWithNoReturnType(){
        //Do Stuff
    }

    public static int methodThatReturnsAnInteger(){
        return 0;
    }

    public static char methodThatReturnsTheLastCharacterOfAStringParameter(String word){
        return word.charAt(word.length());
    }

    public static ArrayList<Character> arrayListContaintingCharacters = new ArrayList<Character>();



}
