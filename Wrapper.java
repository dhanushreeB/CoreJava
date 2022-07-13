//Wrapper classes
class Wrapper {
    public static void main(String[] args) {
        // wrapper classes are used to convert various datatypes to otherdatatypes
        String str = "27072001";
        int value = Integer.parseInt(str);
        System.out.println(value);

        // 1)
        int i = Integer.MAX_VALUE;
        System.out.println(i);
        // 2)int to binary string
        int dob = 27072001;
        String k = Integer.toBinaryString(dob);
        System.out.println(k);
        // 3)int to string
        String ky = Integer.toString(dob);
        System.out.println(ky + 1);
    }
}