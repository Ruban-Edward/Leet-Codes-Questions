public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String a = "AB";
        ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
        int sum = solution.titleToNumber(a);
        System.out.println(sum);
    }

        public int titleToNumber(String columnTitle) {
            int sum = 0;
            int len = columnTitle.length();
            for (int i = 0; i < columnTitle.length(); i++) {
                sum = sum + (columnTitle.charAt(i) - 'A' + 1) * (int) Math.pow(26, --len);
            }
            return sum;
    }
}
