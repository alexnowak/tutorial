/**
 * Messing around with annotations
 */
package tutorial.annotation;

import java.lang.annotation.Documented;

@Documented
@interface ClassPreamble {
   String author();
   String date();
   int currentRevision() default 1;
   String lastModified() default "N/A";
   String lastModifiedBy() default "N/A";
   // Note use of array
   String[] reviewers();
}

@ClassPreamble (
   author = "John Doe",
   date = "3/17/2002",
   currentRevision = 6,
   lastModified = "4/12/2004",
   lastModifiedBy = "Jane Doe",
   // Note array notation
   reviewers = {"Alice", "Bob", "Cindy"}
)
public class MyAnnotation {
   /**
    *  This is a test.
    * @author Alex Nowak
    */
    public void foo() {
        System.out.println("This is a test");
    }
}


