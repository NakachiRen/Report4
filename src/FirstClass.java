public class FirstClass {
    public static void main(String[] args) {
    try{
        String str = null;
        str.length();
    }catch (NullPointerException e){
        System.out.println(e + "が発生");
        System.out.println(e.getMessage());
    }
    }
}