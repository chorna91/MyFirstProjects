public class SafeParser {
    public static int parseAndAdd(String a, String b){
        try{
            int first = Integer.parseInt(a.trim());
            //trim відаляє пробіли з початку і кінця рядка
            int second = Integer.parseInt(b.trim());
            return first + second;
        } catch (NumberFormatException e){
           return 0;
        } finally {
            System.out.println("Done parsing");
        }
    }
}
