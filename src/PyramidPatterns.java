public class PyramidPatterns {
    public static void main(String[] args) {
        int length = 6;

        System.out.println("""
                            +----------------------+
                            |     Half Pyramid     |
                            +----------------------+""");
        halfPyramid(length);

        System.out.println("""
                            +-----------------------+
                            | Inverted Half Pyramid |
                            +-----------------------+""");
        invertedHalfPyramid(length);

    }

    public static void halfPyramid(int length) {
        for(int i=1; i<=length; i++){
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int length) {
        for(int i=length; i>=1; i--){
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
