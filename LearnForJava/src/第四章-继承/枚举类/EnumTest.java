package 枚举类;

import java.util.Scanner;

/**
 * Created by scric on 2017/3/29.
 * @since 介绍枚举类型的工作方式
 */
public class EnumTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size for your suit:(SMALL, MEDIUM, LARGE, EXTRA_LARGE )");

        String input = in.next().toUpperCase();

        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size = " + size);
        System.out.println("abbreviation = " + size.getAbbreviation());

        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job -- you paid attention to the _.");
        }
    }

    enum Size {
      SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

      private String abbreviation;

      private Size(String abbreviation) {
          this.abbreviation = abbreviation;
      }
      public String getAbbreviation() {
          return  abbreviation;
      }


    }

}
