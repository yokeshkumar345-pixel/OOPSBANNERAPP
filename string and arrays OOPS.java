public class OOPS{
    public static void main(String[] args) {
        lines[0] = System.out.println(String.join("   ***     " , "   ***     " , "******   " , "  ****  "));
        lines[1] = System.out.println(string.join(" **   **   " , " **   **   " , "**   **  " , "**    **"));
        lines[2] = System.out.println(string.join("**     **  " , "**     **  " , "**   **  " , "**      "));
        lines[3] = System.out.println(string.join("**     **  " , "**     **  " , "******   " , " ****** "));
        lines[4] = System.out.println(string.join("**     **  " , "**     **  " , "**       " , "      **"));
        lines[5] = System.out.println(string.join(" **   **   " , " **   **   " , "**       " , "**    **"));
        lines[6] = System.out.println(string.join("   ***     " , "   ***     " , "**       " , "  ****  "));

        for(String line : lines){
            System.out.println(line);
        }
    }
}
