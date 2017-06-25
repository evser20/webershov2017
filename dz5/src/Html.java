import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dima on 09.05.2017.
 */

public class Html {
    public static void main(String[] args) {
        String text = "1. <HTML> <HEAD>\n" +
                "2. <TITLE>Управление разрывом строк </Title>\n" +
                "3. </HEAD>\n" +
                "4. <BODY>\n" +
                "5. <marquee>Это моя учебная страница.</marquee>\n" +
                "6. <H2>Меня зовут <kbd>Ольга. </kbd></H2>\n" +
                "7. <H3 align=\"center\">Я живу во <em>Владивостоке</em>.</H3>\n" +
                "8. <H4 align=\"right\">Моя маленькая родина - <font face=\"Academy\" color=\"Red\">Сахалин</font>. </H4>\n" +
                "9. <H5 align=left>Вуз, в котором я работаю.</H5>\n" +
                "10. <B>Здесь</B>\n" +
                "11. <I>Продемонстрированы</I>\n" +
                "12. <Blink>Различные</Blink>\n" +
                "13. <U> Способы </U>\n" +
                "14. <KBD>Управления </KBD>\n" +
                "15. <FONT SIZE=5 COLOR=FF80C0>шрифтом</FONT> его\n" +
                "16. <FONT SIZE=5 COLOR=FF00FF>цветом</FONT> и\n" +
                "17. <FONT SIZE=+3 COLOR=FF00FF>размером</FONT>\n" +
                "18. </BODY> </HTML>";
        int number = text.split("<\\/([a-zA-z0-9])+>").length;
        System.out.println(number); 
        String str2 = text.split("<marquee>")[1].split("</marquee>")[0];
        System.out.println(str2); // <marquee>
        String str3 = text.toLowerCase().split("<kbd>")[1].split("</kbd>")[0];
        String str4 = text.toLowerCase().split("<kbd>")[2].split("</kbd>")[0];
        System.out.println(str3 + ", " + str4); // <kbd>
        String str5 = text.split("\\n")[15].split("COLOR=")[1].split(">")[0];
        System.out.println(str5); 
        String str6 = text.replaceAll("<\\/?([a-zA-z0-9 =+\"])+>", "");
        System.out.println(str6); 

        Pattern pat = Pattern.compile("(?<=(=))[+a-zA-Z0-9]+(?=(>| ))");
        Matcher matcher = pat.matcher(text);
        int last = 0;
        String edit = "";
        while (matcher.find()) {
            edit += text.substring(last, matcher.start()) + '"' + matcher.group() + '"';
            last = matcher.end();
        }
        edit += text.substring(last);
        System.out.println(edit);
    }
}
