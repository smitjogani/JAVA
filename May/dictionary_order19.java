// Program to Sort Strings in Dictionary Order

public class dictionary_order19 {

  public static void main(String[] args) {
    String[] words = {
      "Ruby",
      "C",
      "Python",
      "Java",
      "C++",
      "JavaScript",
      "HTML",
      "CSS",
    };

    for (int i = 0; i < words.length - 1; ++i) {
      for (int j = i + 1; j < words.length; ++j) {
        if (words[i].compareTo(words[j]) > 0) {
          // swap words[i] with words[j]

          String temp = words[i];
          words[i] = words[j];
          words[j] = temp;
        }
      }
    }

    System.out.println("In Lexicographical order (Dictonary order):");

    for (int i = 0; i < words.length; i++) 
    {
        System.out.println(words[i]);
    }
  }
}
