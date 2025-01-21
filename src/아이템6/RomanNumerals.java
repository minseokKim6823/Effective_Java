package 아이템6;

import java.util.regex.Pattern;

public class RomanNumerals {
        private static final Pattern ROMAN = Pattern.compile("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
        static boolean isRomanNumeral(String s) {
            return ROMAN.matcher(s).matches();
        }
}
/* 설명.
 * 1. Pattern은 class
 * 2. ROMAN은 static final을 통해 정규표현식 매칭 작업을 하는 Pattern의 객체로 만듦
 *    즉, 애플리케이션 시작 시 한 번만 초기화되며, 이후 재사용 됨.
 * 3. matcher는 Pattern의 메서드임;
 */