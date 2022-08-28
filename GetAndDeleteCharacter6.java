public class GetAndDeleteCharacter6 {
    public static void main(String[] args) {
        String name="Weaam";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));
        StringBuilder SB = new StringBuilder("Weaam");
        System.out.println(SB.deleteCharAt(0));
        System.out.println(SB.deleteCharAt(3));


    }
}
