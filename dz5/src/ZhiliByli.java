/**
 * Created by Dima on 09.05.2017.
 */

import java.util.*;

public class ZhiliByli {
    public static void main(String[] args) {
        String text = "����-���� ���� � ���������. ������� ���� � ��� ���� ����� ��������, ���� ���� �������. ��� ������ ����� � �������� ������ ������� � ���� ������ �� �������. ��������� ����, ���������� � ����� � �����: � ��������, ���������! ����������, ����������! ���� ���� ������ � ������ ��������; ����� ������ �� �������, �� ������� �� ���������, �� ��������� �� ���� �����! �������� ������� ����� � ������� ����. ��� �� ��������, ������ � ����� ����� � ���, �������� �������� ������-��������. ���� ���������, ��� ��� ����. ��� ��� ���� ����, ���� ������� � ������� � �������� ������� �������: � ��, �������! ��, ��������! ����������, ����������! ���� ���� ������, ������ ��������. ����� ������� ������!";
        String[] strs = text.split("[,;:.!?\\s]+");
        Map<String, Integer> hh = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            hh.put(strs[i].toLowerCase(), hh.getOrDefault(strs[i].toLowerCase(), 0) + 1);
        }
        System.out.println(hh);
    }
}
