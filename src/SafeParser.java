//todo: Краще так класи не називати, оскільки зявляються питання,
// чому саме він Save і що саме він парсить. краще StringUtil
public class SafeParser {
    //todo: логічніше назвати parseAndSum
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
