package com.winterbe.java8.samples.stream;

import java.util.Optional;

/**
 * @author Benjamin Winterberg
 */
public class Optional1 {

  public static void main(String[] args) {
    Optional<String> optional = Optional.of("bam");

    optional.isPresent(); // true
    optional.get(); // "bam"
    optional.orElse("fallback"); // "bam"

    optional.ifPresent((s) -> System.out.println(s.charAt(0))); // "b"

    String str = null;
    Optional<String> optional2 = Optional.ofNullable(str);

    optional2.isPresent();  // false
    // optional2.get(); // NPE
    optional2.orElse("fallback");   // fallback
    optional2.ifPresent((s) -> System.out.println(s.charAt(0)));    // not excute
  }

}
