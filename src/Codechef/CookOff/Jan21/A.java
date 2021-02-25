package Codechef.CookOff.Jan21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String s = reader.readLine();
            if(s.length()<10){
                System.out.println("NO");
            }else{
                if((s.contains("1")||s.contains("2")||s.contains("3")||s.contains("4")||s.contains("5")||s.contains("6")||s.contains("7")||s.contains("8")||s.contains("9"))
                &&(s.contains("a")||s.contains("b")||s.contains("c")||s.contains("d")||s.contains("e")||s.contains("f")||s.contains("g")||s.contains("h")||s.contains("i")||s.contains("j")||s.contains("k")||s.contains("l")||s.contains("m")||s.contains("n")||s.contains("o")||s.contains("p")||s.contains("q")||s.contains("r")||s.contains("s")||s.contains("t")||s.contains("u")||s.contains("v")||s.contains("w")||s.contains("x")||s.contains("y")||s.contains("z"))
                        &&(s.contains("A")||s.contains("B")||s.contains("C")||s.contains("D")||s.contains("E")||s.contains("F")||s.contains("G")||s.contains("H")||s.contains("I")||s.contains("J")||s.contains("K")||s.contains("L")||s.contains("M")||s.contains("N")||s.contains("O")||s.contains("P")||s.contains("Q")||s.contains("R")||s.contains("S")||s.contains("T")||s.contains("U")||s.contains("V")||s.contains("W")||s.contains("X")||s.contains("Y")||s.contains("Z"))
                        &&(s.contains("@")||s.contains("#")||s.contains("%")||s.contains("&")||s.contains("?"))){
                    System.out.println("YES");
                }
            }
        }
    }
}