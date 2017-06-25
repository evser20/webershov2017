import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dima on 09.05.2017.
 */

public class Html {
    public static void main(String[] args) {
        String text = "1. <HTML> <HEAD>\n" +
                "2. <TITLE>���������� �������� ����� </Title>\n" +
                "3. </HEAD>\n" +
                "4. <BODY>\n" +
                "5. <marquee>��� ��� ������� ��������.</marquee>\n" +
                "6. <H2>���� ����� <kbd>�����. </kbd></H2>\n" +
                "7. <H3 align=\"center\">� ���� �� <em>������������</em>.</H3>\n" +
                "8. <H4 align=\"right\">��� ��������� ������ - <font face=\"Academy\" color=\"Red\">�������</font>. </H4>\n" +
                "9. <H5 align=left>���, � ������� � �������.</H5>\n" +
                "10. <B>�����</B>\n" +
                "11. <I>������������������</I>\n" +
                "12. <Blink>���������</Blink>\n" +
                "13. <U> ������� </U>\n" +
                "14. <KBD>���������� </KBD>\n" +
                "15. <FONT SIZE=5 COLOR=FF80C0>�������</FONT> ���\n" +
                "16. <FONT SIZE=5 COLOR=FF00FF>������</FONT> �\n" +
                "17. <FONT SIZE=+3 COLOR=FF00FF>��������</FONT>\n" +
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
