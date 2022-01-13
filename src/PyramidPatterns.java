public class PyramidPatterns {
    public static void main(String[] args) {

        System.out.println("""
                            +--------------+
                            | Half Pyramid |
                            +--------------+""");
        halfPyramid(5);

    }

    public static void halfPyramid(int length) {
        for(int i=1; i<=length; i++){
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
